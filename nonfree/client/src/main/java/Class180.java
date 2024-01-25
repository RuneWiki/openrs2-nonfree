import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public abstract class Class180 implements Interface15 {

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	private int anInt8770;

	@OriginalMember(owner = "client!q", name = "s", descriptor = "I")
	private int anInt8779;

	@OriginalMember(owner = "client!q", name = "u", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!q", name = "i", descriptor = "I")
	private int anInt8772 = -1;

	@OriginalMember(owner = "client!q", name = "r", descriptor = "I")
	private int anInt8778 = 0;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "Z")
	private final boolean aBoolean662;

	@OriginalMember(owner = "client!q", name = "v", descriptor = "Lclient!sb;")
	protected final Class95_Sub3_Sub2 aClass95_Sub3_Sub2_11;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "I")
	private final int anInt8774;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!sb;IZ)V")
	protected Class180(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean662 = arg2;
		this.aClass95_Sub3_Sub2_11 = arg0;
		this.anInt8774 = arg1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;Z)Z")
	protected final boolean method7375(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt8778 != 0) {
			if (this.anInt8772 > 0) {
				OpenGL.glBindBufferARB(this.anInt8774, this.anInt8772);
				if (this.anInt8778 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt8774, 0, this.anInt8779, this.aClass95_Sub3_Sub2_11.aNativeHeapBuffer6.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt8778 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)J")
	public final long method7376() {
		return this.anInt8772 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
	public final void method7377() {
		if (this.aClass95_Sub3_Sub2_11.aBoolean642) {
			OpenGL.glBindBufferARB(this.anInt8774, this.anInt8772);
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V")
	private void method7378() {
		if (this.anInt8772 >= 0) {
			return;
		}
		if (this.aClass95_Sub3_Sub2_11.aBoolean642) {
			OpenGL.glGenBuffersARB(1, Static15.anIntArray37, 0);
			this.anInt8772 = Static15.anIntArray37[0];
			OpenGL.glBindBufferARB(this.anInt8774, this.anInt8772);
		} else {
			this.anInt8772 = 0;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
	public void method7459() {
		if (this.anInt8772 > 0) {
			this.aClass95_Sub3_Sub2_11.method7153(this.anInt8772, this.anInt8770);
			this.anInt8772 = -1;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!jaclib/memory/Source;II)Z")
	protected final boolean method7381(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= this.anInt8779) {
			if (this.anInt8772 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt8774, this.anInt8772);
			OpenGL.glBufferSubDataARBa(this.anInt8774, 0, this.anInt8770, arg0.getAddress());
			this.aClass95_Sub3_Sub2_11.anInt8343 += arg1 - this.anInt8770;
		} else {
			this.method7378();
			if (this.anInt8772 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt8774, this.anInt8772);
			OpenGL.glBufferDataARBa(this.anInt8774, arg1, arg0.getAddress(), this.aBoolean662 ? 35040 : 35044);
			this.aClass95_Sub3_Sub2_11.anInt8343 += arg1 - this.anInt8770;
			this.anInt8779 = arg1;
		}
		this.anInt8770 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(Z)I")
	@Override
	public int method7455() {
		return this.anInt8770;
	}

	@OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7459();
		super.finalize();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)V")
	public void method7382(@OriginalArg(0) int arg0) {
		if (this.anInt8779 < arg0) {
			this.method7378();
			if (this.anInt8772 <= 0) {
				this.aNativeHeapBuffer7 = this.aClass95_Sub3_Sub2_11.method7097(arg0, false);
			} else {
				OpenGL.glBindBufferARB(this.anInt8774, this.anInt8772);
				OpenGL.glBufferDataARBub(this.anInt8774, arg0, null, 0, this.aBoolean662 ? 35040 : 35044);
				this.aClass95_Sub3_Sub2_11.anInt8343 += arg0 - this.anInt8779;
			}
			this.anInt8779 = arg0;
		}
		this.anInt8770 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;IZ)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method7383(@OriginalArg(0) MapBuffer arg0) {
		if (this.anInt8778 == 0) {
			this.method7378();
			if (this.anInt8772 <= 0) {
				this.anInt8778 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt8774, this.anInt8772);
			OpenGL.glBufferDataARBub(this.anInt8774, this.anInt8779, null, 0, this.aBoolean662 ? 35040 : 35044);
			if (this.aClass95_Sub3_Sub2_11.aNativeHeapBuffer6.a >= this.anInt8770) {
				this.anInt8778 = 1;
				return this.aClass95_Sub3_Sub2_11.aNativeHeapBuffer6;
			}
			if (!arg0.a() && arg0.a(this.anInt8774, this.anInt8770, 35001)) {
				this.anInt8778 = 2;
				return arg0;
			}
		}
		return null;
	}
}
