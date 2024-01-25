import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class250 implements Interface4 {

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!oe;")
	private final Class181 aClass181_37 = new Class181(256);

	@OriginalMember(owner = "client!u", name = "h", descriptor = "Lclient!ci;")
	private final Class38 aClass38_87;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "Lclient!ci;")
	private final Class38 aClass38_86;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "I")
	private final int anInt7136;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "[Lclient!mk;")
	private final Class160[] aClass160Array1;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!ci;Lclient!ci;Lclient!ci;)V")
	public Class250(@OriginalArg(0) Class38 arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_87 = arg2;
		this.aClass38_86 = arg1;
		@Pc(24) Class4_Sub20 local24 = new Class4_Sub20(arg0.method1039(0, 0));
		this.anInt7136 = local24.method4560();
		this.aClass160Array1 = new Class160[this.anInt7136];
		for (@Pc(36) int local36 = 0; local36 < this.anInt7136; local36++) {
			if (local24.method4614() == 1) {
				this.aClass160Array1[local36] = new Class160();
			}
		}
		for (@Pc(59) int local59 = 0; local59 < this.anInt7136; local59++) {
			if (this.aClass160Array1[local59] != null) {
				this.aClass160Array1[local59].aBoolean319 = local24.method4614() == 0;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt7136; local92++) {
			if (this.aClass160Array1[local92] != null) {
				this.aClass160Array1[local92].aBoolean327 = local24.method4614() == 1;
			}
		}
		for (@Pc(123) int local123 = 0; local123 < this.anInt7136; local123++) {
			if (this.aClass160Array1[local123] != null) {
				this.aClass160Array1[local123].aBoolean322 = local24.method4614() == 1;
			}
		}
		for (@Pc(152) int local152 = 0; local152 < this.anInt7136; local152++) {
			if (this.aClass160Array1[local152] != null) {
				this.aClass160Array1[local152].aBoolean328 = local24.method4614() == 1;
			}
		}
		for (@Pc(179) int local179 = 0; local179 < this.anInt7136; local179++) {
			if (this.aClass160Array1[local179] != null) {
				this.aClass160Array1[local179].aByte53 = local24.method4576();
			}
		}
		for (@Pc(205) int local205 = 0; local205 < this.anInt7136; local205++) {
			if (this.aClass160Array1[local205] != null) {
				this.aClass160Array1[local205].aByte49 = local24.method4576();
			}
		}
		for (@Pc(227) int local227 = 0; local227 < this.anInt7136; local227++) {
			if (this.aClass160Array1[local227] != null) {
				this.aClass160Array1[local227].aByte51 = local24.method4576();
			}
		}
		for (@Pc(253) int local253 = 0; local253 < this.anInt7136; local253++) {
			if (this.aClass160Array1[local253] != null) {
				this.aClass160Array1[local253].aByte52 = local24.method4576();
			}
		}
		for (@Pc(279) int local279 = 0; local279 < this.anInt7136; local279++) {
			if (this.aClass160Array1[local279] != null) {
				this.aClass160Array1[local279].aShort51 = (short) local24.method4560();
			}
		}
		for (@Pc(302) int local302 = 0; local302 < this.anInt7136; local302++) {
			if (this.aClass160Array1[local302] != null) {
				this.aClass160Array1[local302].aByte55 = local24.method4576();
			}
		}
		for (@Pc(324) int local324 = 0; local324 < this.anInt7136; local324++) {
			if (this.aClass160Array1[local324] != null) {
				this.aClass160Array1[local324].aByte50 = local24.method4576();
			}
		}
		for (@Pc(350) int local350 = 0; local350 < this.anInt7136; local350++) {
			if (this.aClass160Array1[local350] != null) {
				this.aClass160Array1[local350].aBoolean326 = local24.method4614() == 1;
			}
		}
		for (@Pc(377) int local377 = 0; local377 < this.anInt7136; local377++) {
			if (this.aClass160Array1[local377] != null) {
				this.aClass160Array1[local377].aBoolean323 = local24.method4614() == 1;
			}
		}
		for (@Pc(410) int local410 = 0; local410 < this.anInt7136; local410++) {
			if (this.aClass160Array1[local410] != null) {
				this.aClass160Array1[local410].aByte54 = local24.method4576();
			}
		}
		for (@Pc(436) int local436 = 0; local436 < this.anInt7136; local436++) {
			if (this.aClass160Array1[local436] != null) {
				this.aClass160Array1[local436].aBoolean324 = local24.method4614() == 1;
			}
		}
		for (@Pc(465) int local465 = 0; local465 < this.anInt7136; local465++) {
			if (this.aClass160Array1[local465] != null) {
				this.aClass160Array1[local465].aBoolean321 = local24.method4614() == 1;
			}
		}
		for (@Pc(498) int local498 = 0; local498 < this.anInt7136; local498++) {
			if (this.aClass160Array1[local498] != null) {
				this.aClass160Array1[local498].aBoolean325 = local24.method4614() == 1;
			}
		}
		for (@Pc(529) int local529 = 0; local529 < this.anInt7136; local529++) {
			if (this.aClass160Array1[local529] != null) {
				this.aClass160Array1[local529].anInt4784 = local24.method4614();
			}
		}
		for (@Pc(555) int local555 = 0; local555 < this.anInt7136; local555++) {
			if (this.aClass160Array1[local555] != null) {
				this.aClass160Array1[local555].anInt4785 = local24.method4595();
			}
		}
		for (@Pc(581) int local581 = 0; local581 < this.anInt7136; local581++) {
			if (this.aClass160Array1[local581] != null) {
				this.aClass160Array1[local581].aBoolean320 = local24.method4614() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5684(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub1_Sub8 local13 = this.method5688(arg0);
		return local13 != null && local13.method1881(this, this.aClass38_87);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIFIZI)[F")
	@Override
	public float[] method5687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(5) int arg3) {
		return this.method5688(arg1).method1877(arg0, this.aClass160Array1[arg1].aBoolean323, this, arg3, this.aClass38_87);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)Lclient!et;")
	private Class4_Sub1_Sub8 method5688(@OriginalArg(1) int arg0) {
		@Pc(21) Class4_Sub1 local21 = this.aClass181_37.method4420((long) arg0);
		if (local21 != null) {
			return (Class4_Sub1_Sub8) local21;
		}
		@Pc(32) byte[] local32 = this.aClass38_86.method1031(arg0);
		if (local32 == null) {
			return null;
		} else {
			@Pc(44) Class4_Sub1_Sub8 local44 = new Class4_Sub1_Sub8(new Class4_Sub20(local32));
			this.aClass181_37.method4421((long) arg0, local44);
			return local44;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZIIFB)[I")
	@Override
	public int[] method5683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		return this.method5688(arg2).method1878(arg0, this, this.aClass38_87, (double) arg3, this.aClass160Array1[arg2].aBoolean323, arg1);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)Lclient!mk;")
	@Override
	public Class160 method5685(@OriginalArg(1) int arg0) {
		return this.aClass160Array1[arg0];
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BFZIII)[I")
	@Override
	public int[] method5686(@OriginalArg(1) float arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method5688(arg4).method1879(arg3, this.aClass160Array1[arg4].aBoolean323, arg2, (double) arg0, arg1, this.aClass38_87, this);
	}
}
