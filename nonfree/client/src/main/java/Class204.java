import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class204 implements Interface7 {

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "Lclient!gd;")
	private final Class90 aClass90_3 = new Class90(256);

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "Lclient!vh;")
	private final Class250 aClass250_72;

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "Lclient!vh;")
	private final Class250 aClass250_73;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "[Lclient!lu;")
	private final Class151[] aClass151Array1;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!vh;Lclient!vh;Lclient!vh;)V")
	public Class204(@OriginalArg(0) Class250 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_72 = arg1;
		this.aClass250_73 = arg2;
		@Pc(24) Class1_Sub1 local24 = new Class1_Sub1(arg0.method5667(0, 0));
		@Pc(28) int local28 = local24.method4093();
		this.aClass151Array1 = new Class151[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method4130() == 1) {
				this.aClass151Array1[local34] = new Class151();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
			if (this.aClass151Array1[local58] != null) {
				this.aClass151Array1[local58].aBoolean291 = local24.method4130() == 0;
			}
		}
		for (@Pc(90) int local90 = 0; local90 < local28; local90++) {
			if (this.aClass151Array1[local90] != null) {
				this.aClass151Array1[local90].aBoolean296 = local24.method4130() == 1;
			}
		}
		for (@Pc(120) int local120 = 0; local120 < local28; local120++) {
			if (this.aClass151Array1[local120] != null) {
				this.aClass151Array1[local120].aBoolean295 = local24.method4130() == 1;
			}
		}
		for (@Pc(152) int local152 = 0; local152 < local28; local152++) {
			if (this.aClass151Array1[local152] != null) {
				this.aClass151Array1[local152].aBoolean289 = local24.method4130() == 1;
			}
		}
		for (@Pc(178) int local178 = 0; local178 < local28; local178++) {
			if (this.aClass151Array1[local178] != null) {
				this.aClass151Array1[local178].aByte51 = local24.method4112();
			}
		}
		for (@Pc(203) int local203 = 0; local203 < local28; local203++) {
			if (this.aClass151Array1[local203] != null) {
				this.aClass151Array1[local203].aByte53 = local24.method4112();
			}
		}
		for (@Pc(228) int local228 = 0; local228 < local28; local228++) {
			if (this.aClass151Array1[local228] != null) {
				this.aClass151Array1[local228].aByte52 = local24.method4112();
			}
		}
		for (@Pc(249) int local249 = 0; local249 < local28; local249++) {
			if (this.aClass151Array1[local249] != null) {
				this.aClass151Array1[local249].aByte56 = local24.method4112();
			}
		}
		for (@Pc(274) int local274 = 0; local274 < local28; local274++) {
			if (this.aClass151Array1[local274] != null) {
				this.aClass151Array1[local274].aShort49 = (short) local24.method4093();
			}
		}
		for (@Pc(300) int local300 = 0; local300 < local28; local300++) {
			if (this.aClass151Array1[local300] != null) {
				this.aClass151Array1[local300].aByte55 = local24.method4112();
			}
		}
		for (@Pc(321) int local321 = 0; local321 < local28; local321++) {
			if (this.aClass151Array1[local321] != null) {
				this.aClass151Array1[local321].aByte50 = local24.method4112();
			}
		}
		for (@Pc(342) int local342 = 0; local342 < local28; local342++) {
			if (this.aClass151Array1[local342] != null) {
				this.aClass151Array1[local342].aBoolean293 = local24.method4130() == 1;
			}
		}
		for (@Pc(372) int local372 = 0; local372 < local28; local372++) {
			if (this.aClass151Array1[local372] != null) {
				this.aClass151Array1[local372].aBoolean294 = local24.method4130() == 1;
			}
		}
		for (@Pc(402) int local402 = 0; local402 < local28; local402++) {
			if (this.aClass151Array1[local402] != null) {
				this.aClass151Array1[local402].aByte54 = local24.method4112();
			}
		}
		for (@Pc(427) int local427 = 0; local427 < local28; local427++) {
			if (this.aClass151Array1[local427] != null) {
				this.aClass151Array1[local427].aBoolean288 = local24.method4130() == 1;
			}
		}
		for (@Pc(453) int local453 = 0; local453 < local28; local453++) {
			if (this.aClass151Array1[local453] != null) {
				this.aClass151Array1[local453].aBoolean290 = local24.method4130() == 1;
			}
		}
		for (@Pc(485) int local485 = 0; local485 < local28; local485++) {
			if (this.aClass151Array1[local485] != null) {
				this.aClass151Array1[local485].aBoolean292 = local24.method4130() == 1;
			}
		}
		for (@Pc(513) int local513 = 0; local513 < local28; local513++) {
			if (this.aClass151Array1[local513] != null) {
				this.aClass151Array1[local513].anInt4297 = local24.method4130();
			}
		}
		for (@Pc(534) int local534 = 0; local534 < local28; local534++) {
			if (this.aClass151Array1[local534] != null) {
				this.aClass151Array1[local534].anInt4299 = local24.method4087();
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIFIII)[I")
	@Override
	public int[] method4839(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method4842(arg4).method5189(arg3, arg0, this.aClass250_73, this.aClass151Array1[arg4].aBoolean294, this, (double) arg2, arg1);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZZIFII)[F")
	@Override
	public float[] method4838(@OriginalArg(2) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method4842(arg3).method5193(this, this.aClass151Array1[arg3].aBoolean294, arg2, arg0, this.aClass250_73);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)Lclient!lu;")
	@Override
	public Class151 method4836(@OriginalArg(0) int arg0) {
		return this.aClass151Array1[arg0];
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method4837(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub2_Sub18 local16 = this.method4842(arg0);
		return local16 != null && local16.method5190(this, this.aClass250_73);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZFIIII)[I")
	@Override
	public int[] method4840(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method4842(arg1).method5188(arg3, this.aClass151Array1[arg1].aBoolean294, this, this.aClass250_73, (double) arg0, arg2);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)Lclient!ta;")
	private Class1_Sub2_Sub18 method4842(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2 local10 = this.aClass90_3.method1862((long) arg0);
		if (local10 != null) {
			return (Class1_Sub2_Sub18) local10;
		}
		@Pc(21) byte[] local21 = this.aClass250_72.method5644(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(38) Class1_Sub2_Sub18 local38 = new Class1_Sub2_Sub18(new Class1_Sub1(local21));
			this.aClass90_3.method1865((long) arg0, local38);
			return local38;
		}
	}
}
