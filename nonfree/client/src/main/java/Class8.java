import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public abstract class Class8 implements Interface6 {

	@OriginalMember(owner = "client!od", name = "e", descriptor = "Z")
	private boolean aBoolean352 = false;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "Lclient!sq;")
	protected final Class46_Sub2 aClass46_Sub2_32;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "I")
	public final int anInt5318;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "I")
	protected final int anInt5319;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "Z")
	private boolean aBoolean351;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "I")
	private final int anInt5320;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "I")
	protected int anInt5317;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!sq;IIIZ)V")
	protected Class8(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass46_Sub2_32 = arg0;
		this.anInt5318 = arg1;
		this.anInt5319 = arg2;
		this.aBoolean351 = arg4;
		this.anInt5320 = arg3;
		this.aClass46_Sub2_32.anOpengl1.glGenTextures(1, Static225.anIntArray481, 0);
		this.anInt5317 = Static225.anIntArray481[0];
		this.method4733(0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	private void method4733(@OriginalArg(0) int arg0) {
		this.aClass46_Sub2_32.anInt5734 -= arg0;
		this.aClass46_Sub2_32.anInt5734 += this.method4734();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "()I")
	private int method4734() {
		@Pc(8) int local8 = this.aClass46_Sub2_32.method5202(this.anInt5319) * this.anInt5320;
		return this.aBoolean351 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!od", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4743();
		super.finalize();
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "()V")
	private void method4735() {
		@Pc(3) opengl local3 = this.aClass46_Sub2_32.anOpengl1;
		this.aClass46_Sub2_32.method5251(this);
		if (this.aBoolean352) {
			local3.glTexParameteri(this.anInt5318, 10241, this.aBoolean351 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt5318, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt5318, 10241, this.aBoolean351 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt5318, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "()I")
	public final int method4737() {
		return this.anInt5317;
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "()Z")
	public final boolean method4739() {
		@Pc(3) opengl local3 = this.aClass46_Sub2_32.anOpengl1;
		if (!this.aClass46_Sub2_32.lb) {
			return false;
		}
		@Pc(10) int local10 = this.method4734();
		this.aClass46_Sub2_32.method5251(this);
		local3.glGenerateMipmapEXT(this.anInt5318);
		this.aBoolean351 = true;
		this.method4735();
		this.method4733(local10);
		return true;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
	public final void method4741(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean352 != arg0) {
			this.aBoolean352 = arg0;
			this.method4735();
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V")
	protected final void method4742(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean351 != arg0) {
			@Pc(6) int local6 = this.method4734();
			this.aBoolean351 = true;
			this.method4735();
			this.method4733(local6);
		}
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "()V")
	public final void method4743() {
		if (this.anInt5317 > 0) {
			this.aClass46_Sub2_32.method5223(this.anInt5317, this.method4734());
			this.anInt5317 = 0;
		}
	}
}
