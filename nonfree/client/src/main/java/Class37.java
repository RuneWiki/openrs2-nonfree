import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class37 implements Interface9 {

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Lclient!ar;")
	private final Class16 aClass16_1 = new Class16(256);

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "Lclient!sea;")
	private final Class308 aClass308_26;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Lclient!sea;")
	private final Class308 aClass308_25;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
	private final int anInt1075;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "[Lclient!au;")
	private final Class17[] aClass17Array1;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!sea;Lclient!sea;Lclient!sea;)V")
	public Class37(@OriginalArg(0) Class308 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_26 = arg2;
		this.aClass308_25 = arg1;
		@Pc(24) Class1_Sub3 local24 = new Class1_Sub3(arg0.method6569(0, 0));
		this.anInt1075 = local24.method7945();
		this.aClass17Array1 = new Class17[this.anInt1075];
		for (@Pc(36) int local36 = 0; local36 < this.anInt1075; local36++) {
			if (local24.method7974() == 1) {
				this.aClass17Array1[local36] = new Class17();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt1075; local61++) {
			if (this.aClass17Array1[local61] != null) {
				this.aClass17Array1[local61].aBoolean32 = local24.method7974() == 0;
			}
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt1075; local94++) {
			if (this.aClass17Array1[local94] != null) {
				this.aClass17Array1[local94].aBoolean25 = local24.method7974() == 1;
			}
		}
		for (@Pc(121) int local121 = 0; local121 < this.anInt1075; local121++) {
			if (this.aClass17Array1[local121] != null) {
				this.aClass17Array1[local121].aBoolean33 = local24.method7974() == 1;
			}
		}
		for (@Pc(152) int local152 = 0; local152 < this.anInt1075; local152++) {
			if (this.aClass17Array1[local152] != null) {
				this.aClass17Array1[local152].aBoolean34 = local24.method7974() == 1;
			}
		}
		for (@Pc(185) int local185 = 0; local185 < this.anInt1075; local185++) {
			if (this.aClass17Array1[local185] != null) {
				this.aClass17Array1[local185].aByte17 = local24.method7963();
			}
		}
		for (@Pc(211) int local211 = 0; local211 < this.anInt1075; local211++) {
			if (this.aClass17Array1[local211] != null) {
				this.aClass17Array1[local211].aByte21 = local24.method7963();
			}
		}
		for (@Pc(237) int local237 = 0; local237 < this.anInt1075; local237++) {
			if (this.aClass17Array1[local237] != null) {
				this.aClass17Array1[local237].aByte22 = local24.method7963();
			}
		}
		for (@Pc(259) int local259 = 0; local259 < this.anInt1075; local259++) {
			if (this.aClass17Array1[local259] != null) {
				this.aClass17Array1[local259].aByte20 = local24.method7963();
			}
		}
		for (@Pc(285) int local285 = 0; local285 < this.anInt1075; local285++) {
			if (this.aClass17Array1[local285] != null) {
				this.aClass17Array1[local285].aShort19 = (short) local24.method7945();
			}
		}
		for (@Pc(312) int local312 = 0; local312 < this.anInt1075; local312++) {
			if (this.aClass17Array1[local312] != null) {
				this.aClass17Array1[local312].aByte18 = local24.method7963();
			}
		}
		for (@Pc(338) int local338 = 0; local338 < this.anInt1075; local338++) {
			if (this.aClass17Array1[local338] != null) {
				this.aClass17Array1[local338].aByte19 = local24.method7963();
			}
		}
		for (@Pc(364) int local364 = 0; local364 < this.anInt1075; local364++) {
			if (this.aClass17Array1[local364] != null) {
				this.aClass17Array1[local364].aBoolean31 = local24.method7974() == 1;
			}
		}
		for (@Pc(393) int local393 = 0; local393 < this.anInt1075; local393++) {
			if (this.aClass17Array1[local393] != null) {
				this.aClass17Array1[local393].aBoolean29 = local24.method7974() == 1;
			}
		}
		for (@Pc(420) int local420 = 0; local420 < this.anInt1075; local420++) {
			if (this.aClass17Array1[local420] != null) {
				this.aClass17Array1[local420].aByte16 = local24.method7963();
			}
		}
		for (@Pc(442) int local442 = 0; local442 < this.anInt1075; local442++) {
			if (this.aClass17Array1[local442] != null) {
				this.aClass17Array1[local442].aBoolean26 = local24.method7974() == 1;
			}
		}
		for (@Pc(475) int local475 = 0; local475 < this.anInt1075; local475++) {
			if (this.aClass17Array1[local475] != null) {
				this.aClass17Array1[local475].aBoolean30 = local24.method7974() == 1;
			}
		}
		for (@Pc(508) int local508 = 0; local508 < this.anInt1075; local508++) {
			if (this.aClass17Array1[local508] != null) {
				this.aClass17Array1[local508].aBoolean28 = local24.method7974() == 1;
			}
		}
		for (@Pc(537) int local537 = 0; local537 < this.anInt1075; local537++) {
			if (this.aClass17Array1[local537] != null) {
				this.aClass17Array1[local537].anInt577 = local24.method7974();
			}
		}
		for (@Pc(563) int local563 = 0; local563 < this.anInt1075; local563++) {
			if (this.aClass17Array1[local563] != null) {
				this.aClass17Array1[local563].anInt576 = local24.method7940();
			}
		}
		for (@Pc(585) int local585 = 0; local585 < this.anInt1075; local585++) {
			if (this.aClass17Array1[local585] != null) {
				this.aClass17Array1[local585].aBoolean27 = local24.method7974() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method949(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub8_Sub16 local16 = this.method954(arg0);
		return local16 != null && local16.method7046(this.aClass308_26, this);
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Lclient!tf;")
	private Class1_Sub8_Sub16 method954(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub8 local10 = this.aClass16_1.method471((long) arg0);
		if (local10 != null) {
			return (Class1_Sub8_Sub16) local10;
		}
		@Pc(21) byte[] local21 = this.aClass308_25.method6547(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(45) Class1_Sub8_Sub16 local45 = new Class1_Sub8_Sub16(new Class1_Sub3(local21));
			this.aClass16_1.method476((long) arg0, local45);
			return local45;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(FZIBII)[I")
	@Override
	public int[] method952(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method954(arg3).method7050(this.aClass17Array1[arg3].aBoolean29, arg2, this.aClass308_26, arg1, (double) arg0, this);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(FIZIIZ)[F")
	@Override
	public float[] method951(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method954(arg2).method7048(this.aClass308_26, this, arg3, this.aClass17Array1[arg2].aBoolean29, arg1);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Lclient!au;")
	@Override
	public Class17 method947(@OriginalArg(1) int arg0) {
		return this.aClass17Array1[arg0];
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZIIFIB)[I")
	@Override
	public int[] method948(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4) {
		return this.method954(arg1).method7045(arg0, arg4, this.aClass17Array1[arg1].aBoolean29, this.aClass308_26, arg2, this, (double) arg3);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I")
	@Override
	public int method950() {
		return this.anInt1075;
	}
}
