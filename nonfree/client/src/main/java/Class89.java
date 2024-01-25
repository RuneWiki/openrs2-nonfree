import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public abstract class Class89 implements Interface22 {

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
	private int anInt7004;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
	private int anInt7008;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
	private int anInt6998 = -1;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
	private int anInt7009 = 0;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "Lclient!ko;")
	protected final Class137_Sub1_Sub1 aClass137_Sub1_Sub1_8;

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
	private final int anInt7001;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Z")
	private final boolean aBoolean499;

	static {
		new Class276("", 76);
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!ko;IZ)V")
	protected Class89(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass137_Sub1_Sub1_8 = arg0;
		this.anInt7001 = arg1;
		this.aBoolean499 = arg2;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
	public final void method5670() {
		if (this.aClass137_Sub1_Sub1_8.aBoolean402) {
			OpenGL.glBindBufferARB(this.anInt7001, this.anInt6998);
		}
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)J")
	public final long method5671() {
		return this.anInt6998 == 0 ? this.aNativeHeapBuffer6.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!jaclib/memory/Source;II)Z")
	protected final boolean method5672(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1) {
		if (arg1 > this.anInt7004) {
			this.method5677();
			if (this.anInt6998 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt7001, this.anInt6998);
			OpenGL.glBufferDataARBa(this.anInt7001, arg1, arg0.getAddress(), this.aBoolean499 ? 35040 : 35044);
			this.aClass137_Sub1_Sub1_8.anInt9702 += arg1 - this.anInt7008;
			this.anInt7004 = arg1;
		} else if (this.anInt6998 > 0) {
			OpenGL.glBindBufferARB(this.anInt7001, this.anInt6998);
			OpenGL.glBufferSubDataARBa(this.anInt7001, 0, this.anInt7008, arg0.getAddress());
			this.aClass137_Sub1_Sub1_8.anInt9702 += arg1 - this.anInt7008;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt7008 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5675();
		super.finalize();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLclient!jaggl/MapBuffer;)Z")
	protected final boolean method5674(@OriginalArg(1) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt7009 != 0) {
			if (this.anInt6998 > 0) {
				OpenGL.glBindBufferARB(this.anInt7001, this.anInt6998);
				if (this.anInt7009 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt7001, 0, this.anInt7004, this.aClass137_Sub1_Sub1_8.aNativeHeapBuffer8.getAddress());
				} else {
					local5 = arg0.a();
				}
			}
			this.anInt7009 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)I")
	@Override
	public int method5669() {
		return this.anInt7008;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
	public void method5675() {
		if (this.anInt6998 > 0) {
			this.aClass137_Sub1_Sub1_8.method4973(this.anInt6998, this.anInt7008);
			this.anInt6998 = -1;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLclient!jaggl/MapBuffer;B)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method5676(@OriginalArg(1) MapBuffer arg0) {
		if (this.anInt7009 == 0) {
			this.method5677();
			if (this.anInt6998 <= 0) {
				this.anInt7009 = 2;
				return this.aNativeHeapBuffer6;
			}
			OpenGL.glBindBufferARB(this.anInt7001, this.anInt6998);
			OpenGL.glBufferDataARBub(this.anInt7001, this.anInt7004, (byte[]) null, 0, this.aBoolean499 ? 35040 : 35044);
			if (this.anInt7008 <= this.aClass137_Sub1_Sub1_8.aNativeHeapBuffer8.a) {
				this.anInt7009 = 1;
				return this.aClass137_Sub1_Sub1_8.aNativeHeapBuffer8;
			}
			if (!arg0.b() && arg0.a(this.anInt7001, this.anInt7008, 35001)) {
				this.anInt7009 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
	private void method5677() {
		if (this.anInt6998 >= 0) {
			return;
		}
		if (this.aClass137_Sub1_Sub1_8.aBoolean402) {
			OpenGL.glGenBuffersARB(1, Static225.anIntArray330, 0);
			this.anInt6998 = Static225.anIntArray330[0];
			OpenGL.glBindBufferARB(this.anInt7001, this.anInt6998);
		} else {
			this.anInt6998 = 0;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
	public void method5678(@OriginalArg(0) int arg0) {
		if (this.anInt7004 < arg0) {
			this.method5677();
			if (this.anInt6998 > 0) {
				OpenGL.glBindBufferARB(this.anInt7001, this.anInt6998);
				OpenGL.glBufferDataARBub(this.anInt7001, arg0, (byte[]) null, 0, this.aBoolean499 ? 35040 : 35044);
				this.aClass137_Sub1_Sub1_8.anInt9702 += arg0 - this.anInt7004;
			} else {
				this.aNativeHeapBuffer6 = this.aClass137_Sub1_Sub1_8.method8043(false, arg0);
			}
			this.anInt7004 = arg0;
		}
		this.anInt7008 = arg0;
	}
}
