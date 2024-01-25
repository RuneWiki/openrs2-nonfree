import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public abstract class Class107 implements Interface8 {

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "I")
	private int anInt9989;

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "I")
	private int anInt9997;

	@OriginalMember(owner = "client!uv", name = "q", descriptor = "I")
	private int anInt9994 = 0;

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
	private int anInt9996 = -1;

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "Lclient!no;")
	protected final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_12;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "Z")
	private final boolean aBoolean679;

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
	private final int anInt9995;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!no;IZ)V")
	protected Class107(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass100_Sub1_Sub2_12 = arg0;
		this.aBoolean679 = arg2;
		this.anInt9995 = arg1;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZBLclient!jaggl/MapBuffer;)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method8429(@OriginalArg(2) MapBuffer arg0) {
		if (this.anInt9994 == 0) {
			this.method8434();
			if (this.anInt9996 <= 0) {
				this.anInt9994 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt9995, this.anInt9996);
			OpenGL.glBufferDataARBub(this.anInt9995, this.anInt9989, (byte[]) null, 0, this.aBoolean679 ? 35040 : 35044);
			if (this.anInt9997 <= this.aClass100_Sub1_Sub2_12.aNativeHeapBuffer6.a) {
				this.anInt9994 = 1;
				return this.aClass100_Sub1_Sub2_12.aNativeHeapBuffer6;
			}
			if (!arg0.a() && arg0.a(this.anInt9995, this.anInt9997, 35001)) {
				this.anInt9994 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!jaclib/memory/Source;I)Z")
	protected final boolean method8430(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (this.anInt9989 >= arg0) {
			if (this.anInt9996 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9995, this.anInt9996);
			OpenGL.glBufferSubDataARBa(this.anInt9995, 0, this.anInt9997, arg1.getAddress());
			this.aClass100_Sub1_Sub2_12.anInt7123 += arg0 - this.anInt9997;
		} else {
			this.method8434();
			if (this.anInt9996 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9995, this.anInt9996);
			OpenGL.glBufferDataARBa(this.anInt9995, arg0, arg1.getAddress(), this.aBoolean679 ? 35040 : 35044);
			this.aClass100_Sub1_Sub2_12.anInt7123 += arg0 - this.anInt9997;
			this.anInt9989 = arg0;
		}
		this.anInt9997 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
	public void method8431() {
		if (this.anInt9996 > 0) {
			this.aClass100_Sub1_Sub2_12.method6167(this.anInt9996, this.anInt9997);
			this.anInt9996 = -1;
		}
	}

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)J")
	public final long method8432() {
		return this.anInt9996 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)V")
	public final void method8433() {
		if (this.aClass100_Sub1_Sub2_12.aBoolean490) {
			OpenGL.glBindBufferARB(this.anInt9995, this.anInt9996);
		}
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V")
	private void method8434() {
		if (this.anInt9996 >= 0) {
			return;
		}
		if (this.aClass100_Sub1_Sub2_12.aBoolean490) {
			OpenGL.glGenBuffersARB(1, Static139.anIntArray174, 0);
			this.anInt9996 = Static139.anIntArray174[0];
			OpenGL.glBindBufferARB(this.anInt9995, this.anInt9996);
		} else {
			this.anInt9996 = 0;
		}
	}

	@OriginalMember(owner = "client!uv", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8431();
		super.finalize();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)I")
	@Override
	public int method8428() {
		return this.anInt9997;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;Z)Z")
	protected final boolean method8436(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt9994 != 0) {
			if (this.anInt9996 > 0) {
				OpenGL.glBindBufferARB(this.anInt9995, this.anInt9996);
				if (this.anInt9994 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt9995, 0, this.anInt9989, this.aClass100_Sub1_Sub2_12.aNativeHeapBuffer6.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt9994 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BI)V")
	public void method8437(@OriginalArg(1) int arg0) {
		if (this.anInt9989 < arg0) {
			this.method8434();
			if (this.anInt9996 > 0) {
				OpenGL.glBindBufferARB(this.anInt9995, this.anInt9996);
				OpenGL.glBufferDataARBub(this.anInt9995, arg0, (byte[]) null, 0, this.aBoolean679 ? 35040 : 35044);
				this.aClass100_Sub1_Sub2_12.anInt7123 += arg0 - this.anInt9989;
			} else {
				this.aNativeHeapBuffer8 = this.aClass100_Sub1_Sub2_12.method6081(arg0, false);
			}
			this.anInt9989 = arg0;
		}
		this.anInt9997 = arg0;
	}
}
