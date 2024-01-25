import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class334 implements Interface7 {

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!vi;")
	private final Class357 aClass357_4 = new Class357(256);

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Lclient!la;")
	private final Class196 aClass196_116;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!la;")
	private final Class196 aClass196_115;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
	private final int anInt9421;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "[Lclient!kv;")
	private final Class195[] aClass195Array1;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!la;)V")
	public Class334(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_116 = arg1;
		this.aClass196_115 = arg2;
		@Pc(24) Class3_Sub3 local24 = new Class3_Sub3(arg0.method5102(0, 0));
		this.anInt9421 = local24.method4221();
		this.aClass195Array1 = new Class195[this.anInt9421];
		for (@Pc(36) int local36 = 0; local36 < this.anInt9421; local36++) {
			if (local24.method4225() == 1) {
				this.aClass195Array1[local36] = new Class195();
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt9421; local57++) {
			if (this.aClass195Array1[local57] != null) {
				this.aClass195Array1[local57].aBoolean365 = local24.method4225() == 0;
			}
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt9421; local83++) {
			if (this.aClass195Array1[local83] != null) {
				this.aClass195Array1[local83].aBoolean364 = local24.method4225() == 1;
			}
		}
		for (@Pc(114) int local114 = 0; local114 < this.anInt9421; local114++) {
			if (this.aClass195Array1[local114] != null) {
				this.aClass195Array1[local114].aBoolean369 = local24.method4225() == 1;
			}
		}
		for (@Pc(145) int local145 = 0; local145 < this.anInt9421; local145++) {
			if (this.aClass195Array1[local145] != null) {
				this.aClass195Array1[local145].aByte84 = local24.method4254();
			}
		}
		for (@Pc(167) int local167 = 0; local167 < this.anInt9421; local167++) {
			if (this.aClass195Array1[local167] != null) {
				this.aClass195Array1[local167].aByte79 = local24.method4254();
			}
		}
		for (@Pc(193) int local193 = 0; local193 < this.anInt9421; local193++) {
			if (this.aClass195Array1[local193] != null) {
				this.aClass195Array1[local193].aByte83 = local24.method4254();
			}
		}
		for (@Pc(215) int local215 = 0; local215 < this.anInt9421; local215++) {
			if (this.aClass195Array1[local215] != null) {
				this.aClass195Array1[local215].aByte82 = local24.method4254();
			}
		}
		for (@Pc(237) int local237 = 0; local237 < this.anInt9421; local237++) {
			if (this.aClass195Array1[local237] != null) {
				this.aClass195Array1[local237].aShort79 = (short) local24.method4221();
			}
		}
		for (@Pc(264) int local264 = 0; local264 < this.anInt9421; local264++) {
			if (this.aClass195Array1[local264] != null) {
				this.aClass195Array1[local264].aByte80 = local24.method4254();
			}
		}
		for (@Pc(290) int local290 = 0; local290 < this.anInt9421; local290++) {
			if (this.aClass195Array1[local290] != null) {
				this.aClass195Array1[local290].aByte81 = local24.method4254();
			}
		}
		for (@Pc(316) int local316 = 0; local316 < this.anInt9421; local316++) {
			if (this.aClass195Array1[local316] != null) {
				this.aClass195Array1[local316].aBoolean362 = local24.method4225() == 1;
			}
		}
		for (@Pc(349) int local349 = 0; local349 < this.anInt9421; local349++) {
			if (this.aClass195Array1[local349] != null) {
				this.aClass195Array1[local349].aBoolean368 = local24.method4225() == 1;
			}
		}
		for (@Pc(380) int local380 = 0; local380 < this.anInt9421; local380++) {
			if (this.aClass195Array1[local380] != null) {
				this.aClass195Array1[local380].aByte78 = local24.method4254();
			}
		}
		for (@Pc(402) int local402 = 0; local402 < this.anInt9421; local402++) {
			if (this.aClass195Array1[local402] != null) {
				this.aClass195Array1[local402].aBoolean366 = local24.method4225() == 1;
			}
		}
		for (@Pc(435) int local435 = 0; local435 < this.anInt9421; local435++) {
			if (this.aClass195Array1[local435] != null) {
				this.aClass195Array1[local435].aBoolean363 = local24.method4225() == 1;
			}
		}
		for (@Pc(466) int local466 = 0; local466 < this.anInt9421; local466++) {
			if (this.aClass195Array1[local466] != null) {
				this.aClass195Array1[local466].aBoolean367 = local24.method4225() == 1;
			}
		}
		for (@Pc(495) int local495 = 0; local495 < this.anInt9421; local495++) {
			if (this.aClass195Array1[local495] != null) {
				this.aClass195Array1[local495].anInt5428 = local24.method4225();
			}
		}
		for (@Pc(521) int local521 = 0; local521 < this.anInt9421; local521++) {
			if (this.aClass195Array1[local521] != null) {
				this.aClass195Array1[local521].anInt5427 = local24.method4207();
			}
		}
		for (@Pc(547) int local547 = 0; local547 < this.anInt9421; local547++) {
			if (this.aClass195Array1[local547] != null) {
				this.aClass195Array1[local547].anInt5424 = local24.method4225();
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZFIIB)[F")
	@Override
	public float[] method8114(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method8123(arg0).method5210(arg3, arg2, this, this.aClass196_115, this.aClass195Array1[arg0].aBoolean368);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Lclient!kv;")
	@Override
	public Class195 method8118(@OriginalArg(0) int arg0) {
		return this.aClass195Array1[arg0];
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method8115(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub4_Sub17 local13 = this.method8123(arg0);
		return local13 != null && local13.method5212(this.aClass196_115, this);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZIIIF)[I")
	@Override
	public int[] method8116(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4) {
		return this.method8123(arg2).method5209(this, this.aClass195Array1[arg2].aBoolean368, (double) arg4, arg0, this.aClass196_115, arg3, arg1);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZFIZI)[I")
	@Override
	public int[] method8117(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method8123(arg3).method5208(arg0, arg2, (double) arg1, this.aClass195Array1[arg3].aBoolean368, this, this.aClass196_115);
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)Lclient!lg;")
	private Class3_Sub4_Sub17 method8123(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub4 local15 = this.aClass357_4.method8390((long) arg0);
		if (local15 != null) {
			return (Class3_Sub4_Sub17) local15;
		}
		@Pc(26) byte[] local26 = this.aClass196_116.method5113(arg0);
		if (local26 == null) {
			return null;
		} else {
			@Pc(38) Class3_Sub4_Sub17 local38 = new Class3_Sub4_Sub17(new Class3_Sub3(local26));
			this.aClass357_4.method8392((long) arg0, local38);
			return local38;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)I")
	@Override
	public int method8113() {
		return this.anInt9421;
	}
}
