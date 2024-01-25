import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class188 implements Interface7 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Lclient!gi;")
	private final Class85 aClass85_7 = new Class85(256);

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Lclient!uu;")
	private final Class250 aClass250_77;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "Lclient!uu;")
	private final Class250 aClass250_78;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
	private final int anInt5355;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "[Lclient!ib;")
	private final Class105[] aClass105Array1;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!uu;Lclient!uu;Lclient!uu;)V")
	public Class188(@OriginalArg(0) Class250 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_77 = arg2;
		this.aClass250_78 = arg1;
		@Pc(24) Class3_Sub25 local24 = new Class3_Sub25(arg0.method5806(0, 0));
		this.anInt5355 = local24.method4083();
		this.aClass105Array1 = new Class105[this.anInt5355];
		for (@Pc(36) int local36 = 0; local36 < this.anInt5355; local36++) {
			if (local24.method4096() == 1) {
				this.aClass105Array1[local36] = new Class105();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt5355; local61++) {
			if (this.aClass105Array1[local61] != null) {
				this.aClass105Array1[local61].aBoolean231 = local24.method4096() == 0;
			}
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt5355; local94++) {
			if (this.aClass105Array1[local94] != null) {
				this.aClass105Array1[local94].aBoolean235 = local24.method4096() == 1;
			}
		}
		for (@Pc(123) int local123 = 0; local123 < this.anInt5355; local123++) {
			if (this.aClass105Array1[local123] != null) {
				this.aClass105Array1[local123].aBoolean232 = local24.method4096() == 1;
			}
		}
		for (@Pc(156) int local156 = 0; local156 < this.anInt5355; local156++) {
			if (this.aClass105Array1[local156] != null) {
				this.aClass105Array1[local156].aBoolean233 = local24.method4096() == 1;
			}
		}
		for (@Pc(189) int local189 = 0; local189 < this.anInt5355; local189++) {
			if (this.aClass105Array1[local189] != null) {
				this.aClass105Array1[local189].aByte36 = local24.method4097();
			}
		}
		for (@Pc(215) int local215 = 0; local215 < this.anInt5355; local215++) {
			if (this.aClass105Array1[local215] != null) {
				this.aClass105Array1[local215].aByte39 = local24.method4097();
			}
		}
		for (@Pc(237) int local237 = 0; local237 < this.anInt5355; local237++) {
			if (this.aClass105Array1[local237] != null) {
				this.aClass105Array1[local237].aByte37 = local24.method4097();
			}
		}
		for (@Pc(263) int local263 = 0; local263 < this.anInt5355; local263++) {
			if (this.aClass105Array1[local263] != null) {
				this.aClass105Array1[local263].aByte41 = local24.method4097();
			}
		}
		for (@Pc(289) int local289 = 0; local289 < this.anInt5355; local289++) {
			if (this.aClass105Array1[local289] != null) {
				this.aClass105Array1[local289].aShort40 = (short) local24.method4083();
			}
		}
		for (@Pc(316) int local316 = 0; local316 < this.anInt5355; local316++) {
			if (this.aClass105Array1[local316] != null) {
				this.aClass105Array1[local316].aByte40 = local24.method4097();
			}
		}
		for (@Pc(342) int local342 = 0; local342 < this.anInt5355; local342++) {
			if (this.aClass105Array1[local342] != null) {
				this.aClass105Array1[local342].aByte38 = local24.method4097();
			}
		}
		for (@Pc(364) int local364 = 0; local364 < this.anInt5355; local364++) {
			if (this.aClass105Array1[local364] != null) {
				this.aClass105Array1[local364].aBoolean227 = local24.method4096() == 1;
			}
		}
		for (@Pc(397) int local397 = 0; local397 < this.anInt5355; local397++) {
			if (this.aClass105Array1[local397] != null) {
				this.aClass105Array1[local397].aBoolean229 = local24.method4096() == 1;
			}
		}
		for (@Pc(424) int local424 = 0; local424 < this.anInt5355; local424++) {
			if (this.aClass105Array1[local424] != null) {
				this.aClass105Array1[local424].aByte35 = local24.method4097();
			}
		}
		for (@Pc(446) int local446 = 0; local446 < this.anInt5355; local446++) {
			if (this.aClass105Array1[local446] != null) {
				this.aClass105Array1[local446].aBoolean228 = local24.method4096() == 1;
			}
		}
		for (@Pc(475) int local475 = 0; local475 < this.anInt5355; local475++) {
			if (this.aClass105Array1[local475] != null) {
				this.aClass105Array1[local475].aBoolean230 = local24.method4096() == 1;
			}
		}
		for (@Pc(504) int local504 = 0; local504 < this.anInt5355; local504++) {
			if (this.aClass105Array1[local504] != null) {
				this.aClass105Array1[local504].aBoolean226 = local24.method4096() == 1;
			}
		}
		for (@Pc(535) int local535 = 0; local535 < this.anInt5355; local535++) {
			if (this.aClass105Array1[local535] != null) {
				this.aClass105Array1[local535].anInt3012 = local24.method4096();
			}
		}
		for (@Pc(557) int local557 = 0; local557 < this.anInt5355; local557++) {
			if (this.aClass105Array1[local557] != null) {
				this.aClass105Array1[local557].anInt3013 = local24.method4108();
			}
		}
		for (@Pc(583) int local583 = 0; local583 < this.anInt5355; local583++) {
			if (this.aClass105Array1[local583] != null) {
				this.aClass105Array1[local583].aBoolean234 = local24.method4096() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)Lclient!ib;")
	@Override
	public Class105 method4417(@OriginalArg(1) int arg0) {
		return this.aClass105Array1[arg0];
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(BI)Z")
	@Override
	public boolean method4420(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub3_Sub14 local13 = this.method4422(arg0);
		return local13 != null && local13.method3033(this.aClass250_77, this);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IFIZIB)[F")
	@Override
	public float[] method4419(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return this.method4422(arg2).method3031(this.aClass250_77, this.aClass105Array1[arg2].aBoolean229, arg0, this, arg3);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Lclient!jl;")
	private Class3_Sub3_Sub14 method4422(@OriginalArg(0) int arg0) {
		@Pc(22) Class3_Sub3 local22 = this.aClass85_7.method2040((long) arg0);
		if (local22 != null) {
			return (Class3_Sub3_Sub14) local22;
		}
		@Pc(33) byte[] local33 = this.aClass250_78.method5814(arg0);
		if (local33 == null) {
			return null;
		} else {
			@Pc(45) Class3_Sub3_Sub14 local45 = new Class3_Sub3_Sub14(new Class3_Sub25(local33));
			this.aClass85_7.method2039(local45, (long) arg0);
			return local45;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZIIFB)[I")
	@Override
	public int[] method4416(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		return this.method4422(arg0).method3034(this, arg1, this.aClass250_77, arg2, arg3, (double) arg4, this.aClass105Array1[arg0].aBoolean229);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIZIF)[I")
	@Override
	public int[] method4418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method4422(arg0).method3035(arg1, this, this.aClass250_77, arg2, this.aClass105Array1[arg0].aBoolean229, (double) arg3);
	}
}
