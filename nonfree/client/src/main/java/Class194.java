import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class194 implements Interface7 {

	@OriginalMember(owner = "client!km", name = "j", descriptor = "Lclient!hga;")
	private final Class137 aClass137_1 = new Class137(256);

	@OriginalMember(owner = "client!km", name = "r", descriptor = "Lclient!pu;")
	private final Class270 aClass270_55;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!pu;")
	private final Class270 aClass270_54;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "I")
	private final int anInt4799;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "[Lclient!aba;")
	private final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!pu;Lclient!pu;Lclient!pu;)V")
	public Class194(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_55 = arg1;
		this.aClass270_54 = arg2;
		@Pc(24) Class1_Sub35 local24 = new Class1_Sub35(arg0.method5704(0, 0));
		this.anInt4799 = local24.method5771();
		this.aClass3Array1 = new Class3[this.anInt4799];
		for (@Pc(36) int local36 = 0; local36 < this.anInt4799; local36++) {
			if (local24.method5750() == 1) {
				this.aClass3Array1[local36] = new Class3();
			}
		}
		for (@Pc(63) int local63 = 0; local63 < this.anInt4799; local63++) {
			if (this.aClass3Array1[local63] != null) {
				this.aClass3Array1[local63].aBoolean14 = local24.method5750() == 0;
			}
		}
		for (@Pc(89) int local89 = 0; local89 < this.anInt4799; local89++) {
			if (this.aClass3Array1[local89] != null) {
				this.aClass3Array1[local89].aBoolean8 = local24.method5750() == 1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < this.anInt4799; local116++) {
			if (this.aClass3Array1[local116] != null) {
				this.aClass3Array1[local116].aBoolean13 = local24.method5750() == 1;
			}
		}
		for (@Pc(147) int local147 = 0; local147 < this.anInt4799; local147++) {
			if (this.aClass3Array1[local147] != null) {
				this.aClass3Array1[local147].aBoolean11 = local24.method5750() == 1;
			}
		}
		for (@Pc(174) int local174 = 0; local174 < this.anInt4799; local174++) {
			if (this.aClass3Array1[local174] != null) {
				this.aClass3Array1[local174].aByte5 = local24.method5751();
			}
		}
		for (@Pc(200) int local200 = 0; local200 < this.anInt4799; local200++) {
			if (this.aClass3Array1[local200] != null) {
				this.aClass3Array1[local200].aByte2 = local24.method5751();
			}
		}
		for (@Pc(222) int local222 = 0; local222 < this.anInt4799; local222++) {
			if (this.aClass3Array1[local222] != null) {
				this.aClass3Array1[local222].aByte7 = local24.method5751();
			}
		}
		for (@Pc(248) int local248 = 0; local248 < this.anInt4799; local248++) {
			if (this.aClass3Array1[local248] != null) {
				this.aClass3Array1[local248].aByte1 = local24.method5751();
			}
		}
		for (@Pc(274) int local274 = 0; local274 < this.anInt4799; local274++) {
			if (this.aClass3Array1[local274] != null) {
				this.aClass3Array1[local274].aShort1 = (short) local24.method5771();
			}
		}
		for (@Pc(297) int local297 = 0; local297 < this.anInt4799; local297++) {
			if (this.aClass3Array1[local297] != null) {
				this.aClass3Array1[local297].aByte6 = local24.method5751();
			}
		}
		for (@Pc(319) int local319 = 0; local319 < this.anInt4799; local319++) {
			if (this.aClass3Array1[local319] != null) {
				this.aClass3Array1[local319].aByte3 = local24.method5751();
			}
		}
		for (@Pc(341) int local341 = 0; local341 < this.anInt4799; local341++) {
			if (this.aClass3Array1[local341] != null) {
				this.aClass3Array1[local341].aBoolean7 = local24.method5750() == 1;
			}
		}
		for (@Pc(370) int local370 = 0; local370 < this.anInt4799; local370++) {
			if (this.aClass3Array1[local370] != null) {
				this.aClass3Array1[local370].aBoolean9 = local24.method5750() == 1;
			}
		}
		for (@Pc(403) int local403 = 0; local403 < this.anInt4799; local403++) {
			if (this.aClass3Array1[local403] != null) {
				this.aClass3Array1[local403].aByte4 = local24.method5751();
			}
		}
		for (@Pc(429) int local429 = 0; local429 < this.anInt4799; local429++) {
			if (this.aClass3Array1[local429] != null) {
				this.aClass3Array1[local429].aBoolean12 = local24.method5750() == 1;
			}
		}
		for (@Pc(456) int local456 = 0; local456 < this.anInt4799; local456++) {
			if (this.aClass3Array1[local456] != null) {
				this.aClass3Array1[local456].aBoolean5 = local24.method5750() == 1;
			}
		}
		for (@Pc(487) int local487 = 0; local487 < this.anInt4799; local487++) {
			if (this.aClass3Array1[local487] != null) {
				this.aClass3Array1[local487].aBoolean6 = local24.method5750() == 1;
			}
		}
		for (@Pc(520) int local520 = 0; local520 < this.anInt4799; local520++) {
			if (this.aClass3Array1[local520] != null) {
				this.aClass3Array1[local520].anInt54 = local24.method5750();
			}
		}
		for (@Pc(546) int local546 = 0; local546 < this.anInt4799; local546++) {
			if (this.aClass3Array1[local546] != null) {
				this.aClass3Array1[local546].anInt55 = local24.method5804();
			}
		}
		for (@Pc(568) int local568 = 0; local568 < this.anInt4799; local568++) {
			if (this.aClass3Array1[local568] != null) {
				this.aClass3Array1[local568].aBoolean10 = local24.method5750() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IZFIII)[F")
	@Override
	public float[] method3873(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method3878(arg2).method6339(arg0, this, this.aClass270_54, this.aClass3Array1[arg2].aBoolean9, arg3);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3871(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub6_Sub14 local16 = this.method3878(arg0);
		return local16 != null && local16.method6338(this.aClass270_54, this);
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)Lclient!aba;")
	@Override
	public Class3 method3874(@OriginalArg(0) int arg0) {
		return this.aClass3Array1[arg0];
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZIIIFB)[I")
	@Override
	public int[] method3872(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		return this.method3878(arg2).method6332(this, (double) arg3, this.aClass270_54, this.aClass3Array1[arg2].aBoolean9, arg0, arg1);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIFIIZ)[I")
	@Override
	public int[] method3869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method3878(arg1).method6331(this, this.aClass270_54, arg3, arg4, arg0, (double) arg2, this.aClass3Array1[arg1].aBoolean9);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I")
	@Override
	public int method3870() {
		return this.anInt4799;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)Lclient!rr;")
	private Class1_Sub6_Sub14 method3878(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub6 local10 = this.aClass137_1.method2930((long) arg0);
		if (local10 != null) {
			return (Class1_Sub6_Sub14) local10;
		}
		@Pc(21) byte[] local21 = this.aClass270_55.method5691(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class1_Sub6_Sub14 local33 = new Class1_Sub6_Sub14(new Class1_Sub35(local21));
			this.aClass137_1.method2928((long) arg0, local33);
			return local33;
		}
	}
}
