import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public abstract class Class116 implements Interface8 {

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
	private int anInt6550;

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
	private int anInt6558;

	@OriginalMember(owner = "client!iv", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
	private int anInt6546 = -1;

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
	private int anInt6545 = 0;

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "Z")
	private final boolean aBoolean428;

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
	private final int anInt6557;

	@OriginalMember(owner = "client!iv", name = "r", descriptor = "Lclient!tia;")
	protected final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_7;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!tia;IZ)V")
	protected Class116(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean428 = arg2;
		this.anInt6557 = arg1;
		this.aClass100_Sub1_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!jaclib/memory/Source;I)Z")
	protected final boolean method5723(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 <= this.anInt6550) {
			if (this.anInt6546 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt6557, this.anInt6546);
			OpenGL.glBufferSubDataARBa(this.anInt6557, 0, this.anInt6558, arg1.getAddress());
			this.aClass100_Sub1_Sub2_7.anInt9226 += arg0 - this.anInt6558;
		} else {
			this.method5731();
			if (this.anInt6546 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt6557, this.anInt6546);
			OpenGL.glBufferDataARBa(this.anInt6557, arg0, arg1.getAddress(), this.aBoolean428 ? 35040 : 35044);
			this.aClass100_Sub1_Sub2_7.anInt9226 += arg0 - this.anInt6558;
			this.anInt6550 = arg0;
		}
		this.anInt6558 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!iv", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7351();
		super.finalize();
	}

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "(B)V")
	public final void method5724() {
		if (this.aClass100_Sub1_Sub2_7.aBoolean634) {
			OpenGL.glBindBufferARB(this.anInt6557, this.anInt6546);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)I")
	@Override
	public int method7346() {
		return this.anInt6558;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!jaggl/MapBuffer;)Z")
	protected final boolean method5726(@OriginalArg(1) MapBuffer arg0) {
		@Pc(16) boolean local16 = true;
		if (this.anInt6545 != 0) {
			if (this.anInt6546 > 0) {
				OpenGL.glBindBufferARB(this.anInt6557, this.anInt6546);
				if (this.anInt6545 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt6557, 0, this.anInt6550, this.aClass100_Sub1_Sub2_7.aNativeHeapBuffer8.getAddress());
				} else {
					local16 = arg0.b();
				}
			}
			this.anInt6545 = 0;
		}
		return local16;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BZLclient!jaggl/MapBuffer;)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method5727(@OriginalArg(2) MapBuffer arg0) {
		if (this.anInt6545 == 0) {
			this.method5731();
			if (this.anInt6546 <= 0) {
				this.anInt6545 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt6557, this.anInt6546);
			OpenGL.glBufferDataARBub(this.anInt6557, this.anInt6550, (byte[]) null, 0, this.aBoolean428 ? 35040 : 35044);
			if (this.aClass100_Sub1_Sub2_7.aNativeHeapBuffer8.c >= this.anInt6558) {
				this.anInt6545 = 1;
				return this.aClass100_Sub1_Sub2_7.aNativeHeapBuffer8;
			}
			if (!arg0.a() && arg0.a(this.anInt6557, this.anInt6558, 35001)) {
				this.anInt6545 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)J")
	public final long method5728() {
		return this.anInt6546 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZ)V")
	public void method7350(@OriginalArg(0) int arg0) {
		if (arg0 > this.anInt6550) {
			this.method5731();
			if (this.anInt6546 <= 0) {
				this.aNativeHeapBuffer7 = this.aClass100_Sub1_Sub2_7.method7892(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt6557, this.anInt6546);
				OpenGL.glBufferDataARBub(this.anInt6557, arg0, (byte[]) null, 0, this.aBoolean428 ? 35040 : 35044);
				this.aClass100_Sub1_Sub2_7.anInt9226 += arg0 - this.anInt6550;
			}
			this.anInt6550 = arg0;
		}
		this.anInt6558 = arg0;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	public void method7351() {
		if (this.anInt6546 > 0) {
			this.aClass100_Sub1_Sub2_7.method8004(this.anInt6546, this.anInt6558);
			this.anInt6546 = -1;
		}
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(B)V")
	private void method5731() {
		if (this.anInt6546 >= 0) {
			return;
		}
		if (this.aClass100_Sub1_Sub2_7.aBoolean634) {
			OpenGL.glGenBuffersARB(1, Static397.anIntArray382, 0);
			this.anInt6546 = Static397.anIntArray382[0];
			OpenGL.glBindBufferARB(this.anInt6557, this.anInt6546);
		} else {
			this.anInt6546 = 0;
		}
	}
}
