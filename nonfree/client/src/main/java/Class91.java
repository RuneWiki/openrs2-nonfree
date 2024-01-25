import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public abstract class Class91 implements Interface14 {

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!jca", name = "l", descriptor = "I")
	private int anInt5402;

	@OriginalMember(owner = "client!jca", name = "v", descriptor = "I")
	private int anInt5409;

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
	private int anInt5396 = 0;

	@OriginalMember(owner = "client!jca", name = "s", descriptor = "I")
	private int anInt5408 = -1;

	@OriginalMember(owner = "client!jca", name = "u", descriptor = "Lclient!nfa;")
	private final Class9_Sub3_Sub2 aClass9_Sub3_Sub2_6;

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "Z")
	private final boolean aBoolean406;

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
	private final int anInt5397;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lclient!nfa;IZ)V")
	protected Class91(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass9_Sub3_Sub2_6 = arg0;
		this.aBoolean406 = arg2;
		this.anInt5397 = arg1;
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(I)J")
	public final long method4626() {
		return this.anInt5408 == 0 ? this.aNativeHeapBuffer6.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "(I)V")
	public final void method4627() {
		if (this.aClass9_Sub3_Sub2_6.aBoolean498) {
			OpenGL.glBindBufferARB(this.anInt5397, this.anInt5408);
		}
	}

	@OriginalMember(owner = "client!jca", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6520();
		super.finalize();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	public Buffer method6521() {
		if (this.anInt5396 == 0) {
			this.method4634();
			if (this.anInt5408 <= 0) {
				this.anInt5396 = 2;
				return this.aNativeHeapBuffer6;
			}
			OpenGL.glBindBufferARB(this.anInt5397, this.anInt5408);
			OpenGL.glBufferDataARBub(this.anInt5397, this.anInt5409, null, 0, this.aBoolean406 ? 35040 : 35044);
			if (this.anInt5402 <= this.aClass9_Sub3_Sub2_6.aNativeHeapBuffer7.d) {
				this.anInt5396 = 1;
				return this.aClass9_Sub3_Sub2_6.aNativeHeapBuffer7;
			}
			@Pc(54) MapBuffer local54 = this.aClass9_Sub3_Sub2_6.aMapBuffer1;
			if (!local54.b() && local54.a(this.anInt5397, this.anInt5402, 35001)) {
				this.anInt5396 = 2;
				return local54;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)V")
	public void method6520() {
		if (this.anInt5408 > 0) {
			this.aClass9_Sub3_Sub2_6.method5607(this.anInt5402, this.anInt5408);
			this.anInt5408 = -1;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V")
	public void method5022(@OriginalArg(1) int arg0) {
		if (arg0 > this.anInt5409) {
			this.method4634();
			if (this.anInt5408 > 0) {
				OpenGL.glBindBufferARB(this.anInt5397, this.anInt5408);
				OpenGL.glBufferDataARBub(this.anInt5397, arg0, null, 0, this.aBoolean406 ? 35040 : 35044);
				this.aClass9_Sub3_Sub2_6.anInt6524 += arg0 - this.anInt5409;
			} else {
				this.aNativeHeapBuffer6 = this.aClass9_Sub3_Sub2_6.method5472(arg0, false);
			}
			this.anInt5409 = arg0;
		}
		this.anInt5402 = arg0;
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(B)V")
	private void method4634() {
		if (this.anInt5408 >= 0) {
			return;
		}
		if (this.aClass9_Sub3_Sub2_6.aBoolean498) {
			OpenGL.glGenBuffersARB(1, Static241.anIntArray320, 0);
			this.anInt5408 = Static241.anIntArray320[0];
			OpenGL.glBindBufferARB(this.anInt5397, this.anInt5408);
		} else {
			this.anInt5408 = 0;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)I")
	@Override
	public int method6519() {
		return this.anInt5402;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!jaclib/memory/Source;II)Z")
	protected final boolean method4636(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt5409) {
			this.method4634();
			if (this.anInt5408 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt5397, this.anInt5408);
			OpenGL.glBufferDataARBa(this.anInt5397, arg1, arg0.getAddress(), this.aBoolean406 ? 35040 : 35044);
			this.aClass9_Sub3_Sub2_6.anInt6524 += arg1 - this.anInt5402;
			this.anInt5409 = arg1;
		} else if (this.anInt5408 > 0) {
			OpenGL.glBindBufferARB(this.anInt5397, this.anInt5408);
			OpenGL.glBufferSubDataARBa(this.anInt5397, 0, this.anInt5402, arg0.getAddress());
			this.aClass9_Sub3_Sub2_6.anInt6524 += arg1 - this.anInt5402;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt5402 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)Z")
	public boolean method6524() {
		@Pc(10) boolean local10 = true;
		if (this.anInt5396 != 0) {
			if (this.anInt5408 > 0) {
				OpenGL.glBindBufferARB(this.anInt5397, this.anInt5408);
				if (this.anInt5396 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt5397, 0, this.anInt5409, this.aClass9_Sub3_Sub2_6.aNativeHeapBuffer7.getAddress());
				} else {
					local10 = this.aClass9_Sub3_Sub2_6.aMapBuffer1.a();
				}
			}
			this.anInt5396 = 0;
		}
		return local10;
	}
}
