import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public abstract class Class20 implements Interface5 {

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
	private int anInt5321;

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
	private int anInt5325;

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
	private int anInt5317 = -1;

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
	private int anInt5322 = 0;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
	private final int anInt5326;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "Z")
	private final boolean aBoolean390;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "Lclient!mr;")
	protected final Class45_Sub2_Sub2 aClass45_Sub2_Sub2_9;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!mr;IZ)V")
	protected Class20(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt5326 = arg1;
		this.aBoolean390 = arg2;
		this.aClass45_Sub2_Sub2_9 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;I)Z")
	protected final boolean method4577(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt5322 != 0) {
			if (this.anInt5317 > 0) {
				OpenGL.glBindBufferARB(this.anInt5326, this.anInt5317);
				if (this.anInt5322 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt5326, 0, this.anInt5325, this.aClass45_Sub2_Sub2_9.aNativeHeapBuffer8.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt5322 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!jaclib/memory/Source;I)Z")
	protected final boolean method4578(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= this.anInt5325) {
			if (this.anInt5317 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt5326, this.anInt5317);
			OpenGL.glBufferSubDataARBa(this.anInt5326, 0, this.anInt5321, arg0.getAddress());
			this.aClass45_Sub2_Sub2_9.anInt5831 += arg1 - this.anInt5321;
		} else {
			this.method4579();
			if (this.anInt5317 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt5326, this.anInt5317);
			OpenGL.glBufferDataARBa(this.anInt5326, arg1, arg0.getAddress(), this.aBoolean390 ? 35040 : 35044);
			this.aClass45_Sub2_Sub2_9.anInt5831 += arg1 - this.anInt5321;
			this.anInt5325 = arg1;
		}
		this.anInt5321 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V")
	private void method4579() {
		if (this.anInt5317 >= 0) {
			return;
		}
		if (this.aClass45_Sub2_Sub2_9.aBoolean437) {
			OpenGL.glGenBuffersARB(1, Static292.anIntArray279, 0);
			this.anInt5317 = Static292.anIntArray279[0];
			OpenGL.glBindBufferARB(this.anInt5326, this.anInt5317);
		} else {
			this.anInt5317 = 0;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IB)V")
	public void method6435(@OriginalArg(0) int arg0) {
		if (this.anInt5325 < arg0) {
			this.method4579();
			if (this.anInt5317 <= 0) {
				this.aNativeHeapBuffer7 = this.aClass45_Sub2_Sub2_9.method4920(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt5326, this.anInt5317);
				OpenGL.glBufferDataARBub(this.anInt5326, arg0, null, 0, this.aBoolean390 ? 35040 : 35044);
				this.aClass45_Sub2_Sub2_9.anInt5831 += arg0 - this.anInt5325;
			}
			this.anInt5325 = arg0;
		}
		this.anInt5321 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!jaggl/MapBuffer;Z)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method4582(@OriginalArg(1) MapBuffer arg0) {
		if (this.anInt5322 == 0) {
			this.method4579();
			if (this.anInt5317 <= 0) {
				this.anInt5322 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt5326, this.anInt5317);
			OpenGL.glBufferDataARBub(this.anInt5326, this.anInt5325, null, 0, this.aBoolean390 ? 35040 : 35044);
			if (this.anInt5321 <= this.aClass45_Sub2_Sub2_9.aNativeHeapBuffer8.b) {
				this.anInt5322 = 1;
				return this.aClass45_Sub2_Sub2_9.aNativeHeapBuffer8;
			}
			if (!arg0.a() && arg0.a(this.anInt5326, this.anInt5321, 35001)) {
				this.anInt5322 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(B)J")
	public final long method4583() {
		return this.anInt5317 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(B)V")
	public final void method4584() {
		if (this.aClass45_Sub2_Sub2_9.aBoolean437) {
			OpenGL.glBindBufferARB(this.anInt5326, this.anInt5317);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)I")
	@Override
	public int method6432() {
		return this.anInt5321;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V")
	public void method6436() {
		if (this.anInt5317 > 0) {
			this.aClass45_Sub2_Sub2_9.method5038(this.anInt5321, this.anInt5317);
			this.anInt5317 = -1;
		}
	}

	@OriginalMember(owner = "client!hm", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6436();
		super.finalize();
	}
}
