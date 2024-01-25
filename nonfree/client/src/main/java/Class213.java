import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public abstract class Class213 implements Interface2 {

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
	private int anInt10534;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
	private int anInt10538;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
	private int anInt10531 = 0;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
	private int anInt10529 = -1;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Lclient!mba;")
	protected final Class145_Sub1_Sub1 aClass145_Sub1_Sub1_12;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Z")
	private final boolean aBoolean909;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
	private final int anInt10528;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!mba;IZ)V")
	protected Class213(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass145_Sub1_Sub1_12 = arg0;
		this.aBoolean909 = arg2;
		this.anInt10528 = arg1;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public void method9218() {
		if (this.anInt10529 > 0) {
			this.aClass145_Sub1_Sub1_12.method5734(this.anInt10538, this.anInt10529);
			this.anInt10529 = -1;
		}
	}

	@OriginalMember(owner = "client!tb", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method9218();
		super.finalize();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I")
	@Override
	public int method9217() {
		return this.anInt10538;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
	public final void method9220() {
		if (this.aClass145_Sub1_Sub1_12.aBoolean533) {
			OpenGL.glBindBufferARB(this.anInt10528, this.anInt10529);
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)J")
	public final long method9221() {
		return this.anInt10529 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILclient!jaclib/memory/Source;)Z")
	protected final boolean method9222(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1) {
		if (arg0 <= this.anInt10534) {
			if (this.anInt10529 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt10528, this.anInt10529);
			OpenGL.glBufferSubDataARBa(this.anInt10528, 0, this.anInt10538, arg1.getAddress());
			this.aClass145_Sub1_Sub1_12.anInt11239 += arg0 - this.anInt10538;
		} else {
			this.method9226();
			if (this.anInt10529 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt10528, this.anInt10529);
			OpenGL.glBufferDataARBa(this.anInt10528, arg0, arg1.getAddress(), this.aBoolean909 ? 35040 : 35044);
			this.aClass145_Sub1_Sub1_12.anInt11239 += arg0 - this.anInt10538;
			this.anInt10534 = arg0;
		}
		this.anInt10538 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;Z)Z")
	protected final boolean method9223(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt10531 != 0) {
			if (this.anInt10529 > 0) {
				OpenGL.glBindBufferARB(this.anInt10528, this.anInt10529);
				if (this.anInt10531 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt10528, 0, this.anInt10534, this.aClass145_Sub1_Sub1_12.aNativeHeapBuffer8.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt10531 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V")
	public void method9224(@OriginalArg(0) int arg0) {
		if (this.anInt10534 < arg0) {
			this.method9226();
			if (this.anInt10529 <= 0) {
				this.aNativeHeapBuffer7 = this.aClass145_Sub1_Sub1_12.method9733(arg0, false);
			} else {
				OpenGL.glBindBufferARB(this.anInt10528, this.anInt10529);
				OpenGL.glBufferDataARBub(this.anInt10528, arg0, (byte[]) null, 0, this.aBoolean909 ? 35040 : 35044);
				this.aClass145_Sub1_Sub1_12.anInt11239 += arg0 - this.anInt10534;
			}
			this.anInt10534 = arg0;
		}
		this.anInt10538 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZLclient!jaggl/MapBuffer;)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method9225(@OriginalArg(2) MapBuffer arg0) {
		if (this.anInt10531 == 0) {
			this.method9226();
			if (this.anInt10529 <= 0) {
				this.anInt10531 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt10528, this.anInt10529);
			OpenGL.glBufferDataARBub(this.anInt10528, this.anInt10534, (byte[]) null, 0, this.aBoolean909 ? 35040 : 35044);
			if (this.anInt10538 <= this.aClass145_Sub1_Sub1_12.aNativeHeapBuffer8.c) {
				this.anInt10531 = 1;
				return this.aClass145_Sub1_Sub1_12.aNativeHeapBuffer8;
			}
			if (!arg0.a() && arg0.a(this.anInt10528, this.anInt10538, 35001)) {
				this.anInt10531 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
	private void method9226() {
		if (this.anInt10529 >= 0) {
			return;
		}
		if (this.aClass145_Sub1_Sub1_12.aBoolean533) {
			OpenGL.glGenBuffersARB(1, Static546.anIntArray608, 0);
			this.anInt10529 = Static546.anIntArray608[0];
			OpenGL.glBindBufferARB(this.anInt10528, this.anInt10529);
		} else {
			this.anInt10529 = 0;
		}
	}
}
