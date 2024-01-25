import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public abstract class Class127 implements Interface26 {

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
	private int anInt7752;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
	private int anInt7757;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
	private int anInt7744 = 0;

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
	private int anInt7758 = -1;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	private final int anInt7749;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!tk;")
	protected final Class13_Sub3_Sub1 aClass13_Sub3_Sub1_9;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Z")
	private final boolean aBoolean555;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!tk;IZ)V")
	protected Class127(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt7749 = arg1;
		this.aClass13_Sub3_Sub1_9 = arg0;
		this.aBoolean555 = arg2;
	}

	@OriginalMember(owner = "client!mc", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8446();
		super.finalize();
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
	private void method6783() {
		if (this.anInt7758 >= 0) {
			return;
		}
		if (this.aClass13_Sub3_Sub1_9.aBoolean655) {
			OpenGL.glGenBuffersARB(1, Static583.anIntArray685, 0);
			this.anInt7758 = Static583.anIntArray685[0];
			OpenGL.glBindBufferARB(this.anInt7749, this.anInt7758);
		} else {
			this.anInt7758 = 0;
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)I")
	@Override
	public int method8445() {
		return this.anInt7752;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;B)Z")
	protected final boolean method6784(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt7744 != 0) {
			if (this.anInt7758 > 0) {
				OpenGL.glBindBufferARB(this.anInt7749, this.anInt7758);
				if (this.anInt7744 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt7749, 0, this.anInt7757, this.aClass13_Sub3_Sub1_9.aNativeHeapBuffer8.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt7744 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public void method8446() {
		if (this.anInt7758 > 0) {
			this.aClass13_Sub3_Sub1_9.method7817(this.anInt7758, this.anInt7752);
			this.anInt7758 = -1;
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V")
	public final void method6786() {
		if (this.aClass13_Sub3_Sub1_9.aBoolean655) {
			OpenGL.glBindBufferARB(this.anInt7749, this.anInt7758);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!jaclib/memory/Source;Z)Z")
	protected final boolean method6788(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 > this.anInt7757) {
			this.method6783();
			if (this.anInt7758 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt7749, this.anInt7758);
			OpenGL.glBufferDataARBa(this.anInt7749, arg0, arg1.getAddress(), this.aBoolean555 ? 35040 : 35044);
			this.aClass13_Sub3_Sub1_9.anInt9715 += arg0 - this.anInt7752;
			this.anInt7757 = arg0;
		} else if (this.anInt7758 > 0) {
			OpenGL.glBindBufferARB(this.anInt7749, this.anInt7758);
			OpenGL.glBufferSubDataARBa(this.anInt7749, 0, this.anInt7752, arg1.getAddress());
			this.aClass13_Sub3_Sub1_9.anInt9715 += arg0 - this.anInt7752;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt7752 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V")
	public void method7407(@OriginalArg(0) int arg0) {
		if (this.anInt7757 < arg0) {
			this.method6783();
			if (this.anInt7758 <= 0) {
				this.aNativeHeapBuffer6 = this.aClass13_Sub3_Sub1_9.method8175(arg0, false);
			} else {
				OpenGL.glBindBufferARB(this.anInt7749, this.anInt7758);
				OpenGL.glBufferDataARBub(this.anInt7749, arg0, (byte[]) null, 0, this.aBoolean555 ? 35040 : 35044);
				this.aClass13_Sub3_Sub1_9.anInt9715 += arg0 - this.anInt7757;
			}
			this.anInt7757 = arg0;
		}
		this.anInt7752 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLclient!jaggl/MapBuffer;B)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method6791(@OriginalArg(1) MapBuffer arg0) {
		if (this.anInt7744 == 0) {
			this.method6783();
			if (this.anInt7758 <= 0) {
				this.anInt7744 = 2;
				return this.aNativeHeapBuffer6;
			}
			OpenGL.glBindBufferARB(this.anInt7749, this.anInt7758);
			OpenGL.glBufferDataARBub(this.anInt7749, this.anInt7757, (byte[]) null, 0, this.aBoolean555 ? 35040 : 35044);
			if (this.anInt7752 <= this.aClass13_Sub3_Sub1_9.aNativeHeapBuffer8.a) {
				this.anInt7744 = 1;
				return this.aClass13_Sub3_Sub1_9.aNativeHeapBuffer8;
			}
			if (!arg0.a() && arg0.a(this.anInt7749, this.anInt7752, 35001)) {
				this.anInt7744 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)J")
	public final long method6792() {
		return this.anInt7758 == 0 ? this.aNativeHeapBuffer6.getAddress() : 0L;
	}
}
