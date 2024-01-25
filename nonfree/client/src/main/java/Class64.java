import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public abstract class Class64 implements Interface2 {

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
	private int anInt5542;

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
	private int anInt5551;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
	private int anInt5539 = -1;

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
	private int anInt5546 = 0;

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "Lclient!jq;")
	protected final Class43_Sub1_Sub2 aClass43_Sub1_Sub2_5;

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
	private final int anInt5544;

	@OriginalMember(owner = "client!qk", name = "r", descriptor = "Z")
	private final boolean aBoolean454;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!jq;IZ)V")
	protected Class64(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass43_Sub1_Sub2_5 = arg0;
		this.anInt5544 = arg1;
		this.aBoolean454 = arg2;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;B)Z")
	protected final boolean method4789(@OriginalArg(0) MapBuffer arg0) {
		@Pc(11) boolean local11 = true;
		if (this.anInt5546 != 0) {
			if (this.anInt5539 > 0) {
				OpenGL.glBindBufferARB(this.anInt5544, this.anInt5539);
				if (this.anInt5546 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt5544, 0, this.anInt5551, this.aClass43_Sub1_Sub2_5.aNativeHeapBuffer6.getAddress());
				} else {
					local11 = arg0.b();
				}
			}
			this.anInt5546 = 0;
		}
		return local11;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)V")
	public void method6942(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt5551) {
			this.method4793();
			if (this.anInt5539 <= 0) {
				this.aNativeHeapBuffer7 = this.aClass43_Sub1_Sub2_5.method4271(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt5544, this.anInt5539);
				OpenGL.glBufferDataARBub(this.anInt5544, arg0, null, 0, this.aBoolean454 ? 35040 : 35044);
				this.aClass43_Sub1_Sub2_5.anInt4795 += arg0 - this.anInt5551;
			}
			this.anInt5551 = arg0;
		}
		this.anInt5542 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6939();
		super.finalize();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
	public void method6939() {
		if (this.anInt5539 > 0) {
			this.aClass43_Sub1_Sub2_5.method4306(this.anInt5542, this.anInt5539);
			this.anInt5539 = -1;
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	private void method4793() {
		if (this.anInt5539 >= 0) {
			return;
		}
		if (this.aClass43_Sub1_Sub2_5.aBoolean384) {
			OpenGL.glGenBuffersARB(1, Static506.anIntArray616, 0);
			this.anInt5539 = Static506.anIntArray616[0];
			OpenGL.glBindBufferARB(this.anInt5544, this.anInt5539);
		} else {
			this.anInt5539 = 0;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!jaclib/memory/Source;II)Z")
	protected final boolean method4795(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5551 < arg1) {
			this.method4793();
			if (this.anInt5539 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt5544, this.anInt5539);
			OpenGL.glBufferDataARBa(this.anInt5544, arg1, arg0.getAddress(), this.aBoolean454 ? 35040 : 35044);
			this.aClass43_Sub1_Sub2_5.anInt4795 += arg1 - this.anInt5542;
			this.anInt5551 = arg1;
		} else if (this.anInt5539 > 0) {
			OpenGL.glBindBufferARB(this.anInt5544, this.anInt5539);
			OpenGL.glBufferSubDataARBa(this.anInt5544, 0, this.anInt5542, arg0.getAddress());
			this.aClass43_Sub1_Sub2_5.anInt4795 += arg1 - this.anInt5542;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt5542 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)I")
	@Override
	public int method6937() {
		return this.anInt5542;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLclient!jaggl/MapBuffer;Z)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method4797(@OriginalArg(1) MapBuffer arg0) {
		if (this.anInt5546 == 0) {
			this.method4793();
			if (this.anInt5539 <= 0) {
				this.anInt5546 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt5544, this.anInt5539);
			OpenGL.glBufferDataARBub(this.anInt5544, this.anInt5551, null, 0, this.aBoolean454 ? 35040 : 35044);
			if (this.anInt5542 <= this.aClass43_Sub1_Sub2_5.aNativeHeapBuffer6.b) {
				this.anInt5546 = 1;
				return this.aClass43_Sub1_Sub2_5.aNativeHeapBuffer6;
			}
			if (!arg0.a() && arg0.a(this.anInt5544, this.anInt5542, 35001)) {
				this.anInt5546 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	public final void method4798() {
		if (this.aClass43_Sub1_Sub2_5.aBoolean384) {
			OpenGL.glBindBufferARB(this.anInt5544, this.anInt5539);
		}
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)J")
	public final long method4799() {
		return this.anInt5539 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}
}
