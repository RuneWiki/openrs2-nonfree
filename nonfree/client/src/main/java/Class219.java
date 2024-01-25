import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class219 implements Interface7 {

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "Lclient!rw;")
	private final Class284 aClass284_3 = new Class284(256);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "Lclient!pq;")
	private final Class251 aClass251_101;

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "Lclient!pq;")
	private final Class251 aClass251_102;

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "I")
	private final int anInt6144;

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "[Lclient!du;")
	private final Class76[] aClass76Array1;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!pq;Lclient!pq;Lclient!pq;)V")
	public Class219(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_101 = arg1;
		this.aClass251_102 = arg2;
		@Pc(24) Class6_Sub14 local24 = new Class6_Sub14(arg0.method5860(0, 0));
		this.anInt6144 = local24.method6006();
		this.aClass76Array1 = new Class76[this.anInt6144];
		for (@Pc(36) int local36 = 0; local36 < this.anInt6144; local36++) {
			if (local24.method6041() == 1) {
				this.aClass76Array1[local36] = new Class76();
			}
		}
		for (@Pc(63) int local63 = 0; local63 < this.anInt6144; local63++) {
			if (this.aClass76Array1[local63] != null) {
				this.aClass76Array1[local63].aBoolean107 = local24.method6041() == 0;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt6144; local92++) {
			if (this.aClass76Array1[local92] != null) {
				this.aClass76Array1[local92].aBoolean110 = local24.method6041() == 1;
			}
		}
		for (@Pc(123) int local123 = 0; local123 < this.anInt6144; local123++) {
			if (this.aClass76Array1[local123] != null) {
				this.aClass76Array1[local123].aBoolean105 = local24.method6041() == 1;
			}
		}
		for (@Pc(154) int local154 = 0; local154 < this.anInt6144; local154++) {
			if (this.aClass76Array1[local154] != null) {
				this.aClass76Array1[local154].aBoolean111 = local24.method6041() == 1;
			}
		}
		for (@Pc(185) int local185 = 0; local185 < this.anInt6144; local185++) {
			if (this.aClass76Array1[local185] != null) {
				this.aClass76Array1[local185].aByte21 = local24.method6034();
			}
		}
		for (@Pc(211) int local211 = 0; local211 < this.anInt6144; local211++) {
			if (this.aClass76Array1[local211] != null) {
				this.aClass76Array1[local211].aByte23 = local24.method6034();
			}
		}
		for (@Pc(237) int local237 = 0; local237 < this.anInt6144; local237++) {
			if (this.aClass76Array1[local237] != null) {
				this.aClass76Array1[local237].aByte24 = local24.method6034();
			}
		}
		for (@Pc(259) int local259 = 0; local259 < this.anInt6144; local259++) {
			if (this.aClass76Array1[local259] != null) {
				this.aClass76Array1[local259].aByte22 = local24.method6034();
			}
		}
		for (@Pc(285) int local285 = 0; local285 < this.anInt6144; local285++) {
			if (this.aClass76Array1[local285] != null) {
				this.aClass76Array1[local285].aShort30 = (short) local24.method6006();
			}
		}
		for (@Pc(312) int local312 = 0; local312 < this.anInt6144; local312++) {
			if (this.aClass76Array1[local312] != null) {
				this.aClass76Array1[local312].aByte19 = local24.method6034();
			}
		}
		for (@Pc(338) int local338 = 0; local338 < this.anInt6144; local338++) {
			if (this.aClass76Array1[local338] != null) {
				this.aClass76Array1[local338].aByte20 = local24.method6034();
			}
		}
		for (@Pc(364) int local364 = 0; local364 < this.anInt6144; local364++) {
			if (this.aClass76Array1[local364] != null) {
				this.aClass76Array1[local364].aBoolean108 = local24.method6041() == 1;
			}
		}
		for (@Pc(395) int local395 = 0; local395 < this.anInt6144; local395++) {
			if (this.aClass76Array1[local395] != null) {
				this.aClass76Array1[local395].aBoolean112 = local24.method6041() == 1;
			}
		}
		for (@Pc(428) int local428 = 0; local428 < this.anInt6144; local428++) {
			if (this.aClass76Array1[local428] != null) {
				this.aClass76Array1[local428].aByte18 = local24.method6034();
			}
		}
		for (@Pc(450) int local450 = 0; local450 < this.anInt6144; local450++) {
			if (this.aClass76Array1[local450] != null) {
				this.aClass76Array1[local450].aBoolean106 = local24.method6041() == 1;
			}
		}
		for (@Pc(481) int local481 = 0; local481 < this.anInt6144; local481++) {
			if (this.aClass76Array1[local481] != null) {
				this.aClass76Array1[local481].aBoolean109 = local24.method6041() == 1;
			}
		}
		for (@Pc(514) int local514 = 0; local514 < this.anInt6144; local514++) {
			if (this.aClass76Array1[local514] != null) {
				this.aClass76Array1[local514].aBoolean104 = local24.method6041() == 1;
			}
		}
		for (@Pc(543) int local543 = 0; local543 < this.anInt6144; local543++) {
			if (this.aClass76Array1[local543] != null) {
				this.aClass76Array1[local543].anInt1602 = local24.method6041();
			}
		}
		for (@Pc(565) int local565 = 0; local565 < this.anInt6144; local565++) {
			if (this.aClass76Array1[local565] != null) {
				this.aClass76Array1[local565].anInt1601 = local24.method6027();
			}
		}
		for (@Pc(591) int local591 = 0; local591 < this.anInt6144; local591++) {
			if (this.aClass76Array1[local591] != null) {
				this.aClass76Array1[local591].aBoolean113 = local24.method6041() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)Lclient!du;")
	@Override
	public Class76 method5209(@OriginalArg(1) int arg0) {
		return this.aClass76Array1[arg0];
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)I")
	@Override
	public int method5210() {
		return this.anInt6144;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZFIIII)[I")
	@Override
	public int[] method5208(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method5214(arg4).method5321(arg0, arg3, this, (double) arg1, arg2, this.aClass251_102, this.aClass76Array1[arg4].aBoolean112);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5207(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub1_Sub13 local8 = this.method5214(arg0);
		return local8 != null && local8.method5317(this.aClass251_102, this);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZIFIIZ)[I")
	@Override
	public int[] method5206(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method5214(arg3).method5320(arg0, this.aClass76Array1[arg3].aBoolean112, (double) arg1, this, this.aClass251_102, arg2);
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(II)Lclient!of;")
	private Class6_Sub1_Sub13 method5214(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub1 local10 = this.aClass284_3.method6449((long) arg0);
		if (local10 != null) {
			return (Class6_Sub1_Sub13) local10;
		}
		@Pc(27) byte[] local27 = this.aClass251_101.method5855(arg0);
		if (local27 == null) {
			return null;
		} else {
			@Pc(39) Class6_Sub1_Sub13 local39 = new Class6_Sub1_Sub13(new Class6_Sub14(local27));
			this.aClass284_3.method6450((long) arg0, local39);
			return local39;
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIZF)[F")
	@Override
	public float[] method5211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3) {
		return this.method5214(arg0).method5315(this, arg2, this.aClass251_102, this.aClass76Array1[arg0].aBoolean112, arg1);
	}
}
