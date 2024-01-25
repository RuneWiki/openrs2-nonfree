import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public abstract class Class75 implements Interface11 {

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
	private int anInt9231;

	@OriginalMember(owner = "client!eda", name = "k", descriptor = "I")
	private int anInt9237;

	@OriginalMember(owner = "client!eda", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
	private int anInt9230 = -1;

	@OriginalMember(owner = "client!eda", name = "n", descriptor = "I")
	private int anInt9239 = 0;

	@OriginalMember(owner = "client!eda", name = "e", descriptor = "I")
	private final int anInt9233;

	@OriginalMember(owner = "client!eda", name = "u", descriptor = "Z")
	private final boolean aBoolean778;

	@OriginalMember(owner = "client!eda", name = "f", descriptor = "Lclient!ck;")
	protected final Class33_Sub1_Sub1 aClass33_Sub1_Sub1_11;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Lclient!ck;IZ)V")
	protected Class75(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt9233 = arg1;
		this.aBoolean778 = arg2;
		this.aClass33_Sub1_Sub1_11 = arg0;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IILclient!jaclib/memory/Source;)Z")
	protected final boolean method7622(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1) {
		if (arg0 > this.anInt9237) {
			this.method7630();
			if (this.anInt9230 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9233, this.anInt9230);
			OpenGL.glBufferDataARBa(this.anInt9233, arg0, arg1.getAddress(), this.aBoolean778 ? 35040 : 35044);
			this.aClass33_Sub1_Sub1_11.anInt2154 += arg0 - this.anInt9231;
			this.anInt9237 = arg0;
		} else if (this.anInt9230 > 0) {
			OpenGL.glBindBufferARB(this.anInt9233, this.anInt9230);
			OpenGL.glBufferSubDataARBa(this.anInt9233, 0, this.anInt9231, arg1.getAddress());
			this.aClass33_Sub1_Sub1_11.anInt2154 += arg0 - this.anInt9231;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt9231 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IB)V")
	public void method7624(@OriginalArg(0) int arg0) {
		if (this.anInt9237 < arg0) {
			this.method7630();
			if (this.anInt9230 <= 0) {
				this.aNativeHeapBuffer8 = this.aClass33_Sub1_Sub1_11.method2036(arg0, false);
			} else {
				OpenGL.glBindBufferARB(this.anInt9233, this.anInt9230);
				OpenGL.glBufferDataARBub(this.anInt9233, arg0, null, 0, this.aBoolean778 ? 35040 : 35044);
				this.aClass33_Sub1_Sub1_11.anInt2154 += arg0 - this.anInt9237;
			}
			this.anInt9237 = arg0;
		}
		this.anInt9231 = arg0;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)I")
	@Override
	public int method7621() {
		return this.anInt9231;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!jaggl/MapBuffer;)Z")
	protected final boolean method7625(@OriginalArg(1) MapBuffer arg0) {
		@Pc(14) boolean local14 = true;
		if (this.anInt9239 != 0) {
			if (this.anInt9230 > 0) {
				OpenGL.glBindBufferARB(this.anInt9233, this.anInt9230);
				if (this.anInt9239 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt9233, 0, this.anInt9237, this.aClass33_Sub1_Sub1_11.aNativeHeapBuffer3.getAddress());
				} else {
					local14 = arg0.b();
				}
			}
			this.anInt9239 = 0;
		}
		return local14;
	}

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "(I)J")
	public final long method7626() {
		return this.anInt9230 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V")
	public void method7627() {
		if (this.anInt9230 > 0) {
			this.aClass33_Sub1_Sub1_11.method1732(this.anInt9231, this.anInt9230);
			this.anInt9230 = -1;
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZLclient!jaggl/MapBuffer;B)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method7628(@OriginalArg(1) MapBuffer arg0) {
		if (this.anInt9239 == 0) {
			this.method7630();
			if (this.anInt9230 <= 0) {
				this.anInt9239 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt9233, this.anInt9230);
			OpenGL.glBufferDataARBub(this.anInt9233, this.anInt9237, null, 0, this.aBoolean778 ? 35040 : 35044);
			if (this.aClass33_Sub1_Sub1_11.aNativeHeapBuffer3.b >= this.anInt9231) {
				this.anInt9239 = 1;
				return this.aClass33_Sub1_Sub1_11.aNativeHeapBuffer3;
			}
			if (!arg0.a() && arg0.a(this.anInt9233, this.anInt9231, 35001)) {
				this.anInt9239 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!eda", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7627();
		super.finalize();
	}

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "(I)V")
	public final void method7629() {
		if (this.aClass33_Sub1_Sub1_11.aBoolean141) {
			OpenGL.glBindBufferARB(this.anInt9233, this.anInt9230);
		}
	}

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "(B)V")
	private void method7630() {
		if (this.anInt9230 >= 0) {
			return;
		}
		if (this.aClass33_Sub1_Sub1_11.aBoolean141) {
			OpenGL.glGenBuffersARB(1, Static158.anIntArray208, 0);
			this.anInt9230 = Static158.anIntArray208[0];
			OpenGL.glBindBufferARB(this.anInt9233, this.anInt9230);
		} else {
			this.anInt9230 = 0;
		}
	}
}
