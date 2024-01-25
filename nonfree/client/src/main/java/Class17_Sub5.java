import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class17_Sub5 extends Class17 {

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "Z")
	private boolean aBoolean414 = false;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!cb;)V")
	public Class17_Sub5(@OriginalArg(0) Class9_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6802(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface20 local8 = super.aClass9_Sub1_19.method7683();
		if (local8 == null || !arg0) {
			super.aClass9_Sub1_19.method7735(0, Static43.aClass122_1);
			return;
		}
		super.aClass9_Sub1_19.method7726(1);
		super.aClass9_Sub1_19.method7712(local8);
		super.aClass9_Sub1_19.method7731(Static49.aClass74_1);
		super.aClass9_Sub1_19.method7726(1);
		super.aClass9_Sub1_19.method7723(Static453.aClass295_5, Static269.aClass295_3);
		super.aClass9_Sub1_19.method7692(true, 2, false, Static426.aClass122_4);
		super.aClass9_Sub1_19.method7735(0, Static43.aClass122_1);
		@Pc(72) Class22_Sub3 local72 = super.aClass9_Sub1_19.method7733();
		local72.method5952(super.aClass9_Sub1_19.method7736());
		super.aClass9_Sub1_19.method7703(Static218.aClass171_5);
		super.aClass9_Sub1_19.method7726(0);
		this.aBoolean414 = true;
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6799() {
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
	@Override
	public void method6800() {
		if (this.aBoolean414) {
			super.aClass9_Sub1_19.method7726(1);
			super.aClass9_Sub1_19.method7731(Static264.aClass74_4);
			super.aClass9_Sub1_19.method7723(Static74.aClass295_2, Static74.aClass295_2);
			super.aClass9_Sub1_19.method7678(Static349.aClass122_3, 2);
			super.aClass9_Sub1_19.method7735(0, Static197.aClass122_2);
			super.aClass9_Sub1_19.method7744();
			super.aClass9_Sub1_19.method7712(null);
			super.aClass9_Sub1_19.method7726(0);
			this.aBoolean414 = false;
		} else {
			super.aClass9_Sub1_19.method7735(0, Static197.aClass122_2);
		}
		super.aClass9_Sub1_19.method7723(Static74.aClass295_2, Static74.aClass295_2);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
	@Override
	public void method6794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6805(@OriginalArg(0) boolean arg0) {
		super.aClass9_Sub1_19.method7723(Static453.aClass295_5, Static74.aClass295_2);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!pb;II)V")
	@Override
	public void method6796(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1) {
		super.aClass9_Sub1_19.method7712(arg0);
		super.aClass9_Sub1_19.method7778(arg1);
	}
}
