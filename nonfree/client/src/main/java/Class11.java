import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public abstract class Class11 implements Interface16 {

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
	private int anInt9258;

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
	private int anInt9261;

	@OriginalMember(owner = "client!afa", name = "o", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!afa", name = "q", descriptor = "I")
	private int anInt9273 = -1;

	@OriginalMember(owner = "client!afa", name = "l", descriptor = "I")
	private int anInt9269 = 0;

	@OriginalMember(owner = "client!afa", name = "t", descriptor = "Z")
	private final boolean aBoolean624;

	@OriginalMember(owner = "client!afa", name = "n", descriptor = "I")
	private final int anInt9271;

	@OriginalMember(owner = "client!afa", name = "v", descriptor = "Lclient!bea;")
	protected final Class31_Sub1_Sub1 aClass31_Sub1_Sub1_12;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!bea;IZ)V")
	protected Class11(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean624 = arg2;
		this.anInt9271 = arg1;
		this.aClass31_Sub1_Sub1_12 = arg0;
	}

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "(I)V")
	public final void method7279() {
		if (this.aClass31_Sub1_Sub1_12.aBoolean92) {
			OpenGL.glBindBufferARB(this.anInt9271, this.anInt9273);
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BLclient!jaggl/MapBuffer;)Z")
	protected final boolean method7281(@OriginalArg(1) MapBuffer arg0) {
		@Pc(10) boolean local10 = true;
		if (this.anInt9269 != 0) {
			if (this.anInt9273 > 0) {
				OpenGL.glBindBufferARB(this.anInt9271, this.anInt9273);
				if (this.anInt9269 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt9271, 0, this.anInt9258, this.aClass31_Sub1_Sub1_12.aNativeHeapBuffer7.getAddress());
				} else {
					local10 = arg0.b();
				}
			}
			this.anInt9269 = 0;
		}
		return local10;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BI)V")
	public void method7282(@OriginalArg(1) int arg0) {
		if (arg0 > this.anInt9258) {
			this.method7284();
			if (this.anInt9273 > 0) {
				OpenGL.glBindBufferARB(this.anInt9271, this.anInt9273);
				OpenGL.glBufferDataARBub(this.anInt9271, arg0, null, 0, this.aBoolean624 ? 35040 : 35044);
				this.aClass31_Sub1_Sub1_12.anInt9103 += arg0 - this.anInt9258;
			} else {
				this.aNativeHeapBuffer8 = this.aClass31_Sub1_Sub1_12.method7150(false, arg0);
			}
			this.anInt9258 = arg0;
		}
		this.anInt9261 = arg0;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;ZB)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method7283(@OriginalArg(0) MapBuffer arg0) {
		if (this.anInt9269 == 0) {
			this.method7284();
			if (this.anInt9273 <= 0) {
				this.anInt9269 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt9271, this.anInt9273);
			OpenGL.glBufferDataARBub(this.anInt9271, this.anInt9258, null, 0, this.aBoolean624 ? 35040 : 35044);
			if (this.anInt9261 <= this.aClass31_Sub1_Sub1_12.aNativeHeapBuffer7.c) {
				this.anInt9269 = 1;
				return this.aClass31_Sub1_Sub1_12.aNativeHeapBuffer7;
			}
			if (!arg0.a() && arg0.a(this.anInt9271, this.anInt9261, 35001)) {
				this.anInt9269 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "(I)V")
	private void method7284() {
		if (this.anInt9273 >= 0) {
			return;
		}
		if (this.aClass31_Sub1_Sub1_12.aBoolean92) {
			OpenGL.glGenBuffersARB(1, Static253.anIntArray230, 0);
			this.anInt9273 = Static253.anIntArray230[0];
			OpenGL.glBindBufferARB(this.anInt9271, this.anInt9273);
		} else {
			this.anInt9273 = 0;
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
	public void method7285() {
		if (this.anInt9273 > 0) {
			this.aClass31_Sub1_Sub1_12.method1015(this.anInt9261, this.anInt9273);
			this.anInt9273 = -1;
		}
	}

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "(I)I")
	@Override
	public int method7278() {
		return this.anInt9261;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)J")
	public final long method7286() {
		return this.anInt9273 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BLclient!jaclib/memory/Source;I)Z")
	protected final boolean method7287(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1) {
		if (this.anInt9258 < arg1) {
			this.method7284();
			if (this.anInt9273 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9271, this.anInt9273);
			OpenGL.glBufferDataARBa(this.anInt9271, arg1, arg0.getAddress(), this.aBoolean624 ? 35040 : 35044);
			this.aClass31_Sub1_Sub1_12.anInt9103 += arg1 - this.anInt9261;
			this.anInt9258 = arg1;
		} else if (this.anInt9273 > 0) {
			OpenGL.glBindBufferARB(this.anInt9271, this.anInt9273);
			OpenGL.glBufferSubDataARBa(this.anInt9271, 0, this.anInt9261, arg0.getAddress());
			this.aClass31_Sub1_Sub1_12.anInt9103 += arg1 - this.anInt9261;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt9261 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!afa", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7285();
		super.finalize();
	}
}
