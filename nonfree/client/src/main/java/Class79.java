import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public abstract class Class79 implements Interface5 {

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
	private int anInt2779;

	@OriginalMember(owner = "client!ev", name = "s", descriptor = "I")
	private int anInt2783;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
	private int anInt2774 = 0;

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
	private int anInt2775 = -1;

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "Z")
	private final boolean aBoolean204;

	@OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
	private final int anInt2778;

	@OriginalMember(owner = "client!ev", name = "k", descriptor = "Lclient!gf;")
	private final Class5_Sub3_Sub1 aClass5_Sub3_Sub1_5;

	static {
		new Class67(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!gf;IZ)V")
	protected Class79(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean204 = arg2;
		this.anInt2778 = arg1;
		this.aClass5_Sub3_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)I")
	@Override
	public int method3133() {
		return this.anInt2779;
	}

	@OriginalMember(owner = "client!ev", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method3138();
		super.finalize();
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V")
	private void method2328() {
		if (this.anInt2775 >= 0) {
			return;
		}
		if (this.aClass5_Sub3_Sub1_5.aBoolean271) {
			OpenGL.glGenBuffersARB(1, Static431.anIntArray674, 0);
			this.anInt2775 = Static431.anIntArray674[0];
			OpenGL.glBindBufferARB(this.anInt2778, this.anInt2775);
		} else {
			this.anInt2775 = 0;
		}
	}

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "(I)V")
	public final void method2329() {
		if (this.aClass5_Sub3_Sub1_5.aBoolean271) {
			OpenGL.glBindBufferARB(this.anInt2778, this.anInt2775);
		}
	}

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "(I)J")
	public final long method2330() {
		return this.anInt2775 == 0 ? this.aNativeHeapBuffer4.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	public Buffer method3136() {
		if (this.anInt2774 == 0) {
			this.method2328();
			if (this.anInt2775 <= 0) {
				this.anInt2774 = 2;
				return this.aNativeHeapBuffer4;
			}
			OpenGL.glBindBufferARB(this.anInt2778, this.anInt2775);
			OpenGL.glBufferDataARBub(this.anInt2778, this.anInt2783, null, 0, this.aBoolean204 ? 35040 : 35044);
			if (this.anInt2779 <= this.aClass5_Sub3_Sub1_5.aNativeHeapBuffer8.c) {
				this.anInt2774 = 1;
				return this.aClass5_Sub3_Sub1_5.aNativeHeapBuffer8;
			}
			@Pc(65) MapBuffer local65 = this.aClass5_Sub3_Sub1_5.aMapBuffer1;
			if (!local65.a() && local65.a(this.anInt2778, this.anInt2779, 35001)) {
				this.anInt2774 = 2;
				return local65;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)Z")
	public boolean method3135() {
		@Pc(5) boolean local5 = true;
		if (this.anInt2774 != 0) {
			if (this.anInt2775 > 0) {
				OpenGL.glBindBufferARB(this.anInt2778, this.anInt2775);
				if (this.anInt2774 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt2778, 0, this.anInt2783, this.aClass5_Sub3_Sub1_5.aNativeHeapBuffer8.getAddress());
				} else {
					local5 = this.aClass5_Sub3_Sub1_5.aMapBuffer1.b();
				}
			}
			this.anInt2774 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(BLclient!jaclib/memory/Source;I)Z")
	protected final boolean method2334(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2783 >= arg1) {
			if (this.anInt2775 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt2778, this.anInt2775);
			OpenGL.glBufferSubDataARBa(this.anInt2778, 0, this.anInt2779, arg0.getAddress());
			this.aClass5_Sub3_Sub1_5.anInt7745 += arg1 - this.anInt2779;
		} else {
			this.method2328();
			if (this.anInt2775 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt2778, this.anInt2775);
			OpenGL.glBufferDataARBa(this.anInt2778, arg1, arg0.getAddress(), this.aBoolean204 ? 35040 : 35044);
			this.aClass5_Sub3_Sub1_5.anInt7745 += arg1 - this.anInt2779;
			this.anInt2783 = arg1;
		}
		this.anInt2779 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)V")
	public void method3137(@OriginalArg(0) int arg0) {
		if (this.anInt2783 < arg0) {
			this.method2328();
			if (this.anInt2775 > 0) {
				OpenGL.glBindBufferARB(this.anInt2778, this.anInt2775);
				OpenGL.glBufferDataARBub(this.anInt2778, arg0, null, 0, this.aBoolean204 ? 35040 : 35044);
				this.aClass5_Sub3_Sub1_5.anInt7745 += arg0 - this.anInt2783;
			} else {
				this.aNativeHeapBuffer4 = this.aClass5_Sub3_Sub1_5.method6421(false, arg0);
			}
			this.anInt2783 = arg0;
		}
		this.anInt2779 = arg0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)V")
	public void method3138() {
		if (this.anInt2775 > 0) {
			this.aClass5_Sub3_Sub1_5.method3094(this.anInt2775, this.anInt2779);
			this.anInt2775 = -1;
		}
	}
}
