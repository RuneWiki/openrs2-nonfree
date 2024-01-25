import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class227 implements Interface5 {

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "Lclient!bba;")
	private final Class30 aClass30_2 = new Class30(256);

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "Lclient!gj;")
	private final Class143 aClass143_85;

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "Lclient!gj;")
	private final Class143 aClass143_86;

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
	private final int anInt6198;

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "[Lclient!tr;")
	private final Class342[] aClass342Array1;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!gj;Lclient!gj;Lclient!gj;)V")
	public Class227(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_85 = arg1;
		this.aClass143_86 = arg2;
		@Pc(24) Class3_Sub17 local24 = new Class3_Sub17(arg0.method3125(0, 0));
		this.anInt6198 = local24.method4858();
		this.aClass342Array1 = new Class342[this.anInt6198];
		for (@Pc(36) int local36 = 0; local36 < this.anInt6198; local36++) {
			if (local24.method4888() == 1) {
				this.aClass342Array1[local36] = new Class342();
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt6198; local57++) {
			if (this.aClass342Array1[local57] != null) {
				this.aClass342Array1[local57].aBoolean693 = local24.method4888() == 0;
			}
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt6198; local83++) {
			if (this.aClass342Array1[local83] != null) {
				this.aClass342Array1[local83].aBoolean695 = local24.method4888() == 1;
			}
		}
		for (@Pc(114) int local114 = 0; local114 < this.anInt6198; local114++) {
			if (this.aClass342Array1[local114] != null) {
				this.aClass342Array1[local114].aBoolean690 = local24.method4888() == 1;
			}
		}
		for (@Pc(147) int local147 = 0; local147 < this.anInt6198; local147++) {
			if (this.aClass342Array1[local147] != null) {
				this.aClass342Array1[local147].aByte124 = local24.method4861();
			}
		}
		for (@Pc(173) int local173 = 0; local173 < this.anInt6198; local173++) {
			if (this.aClass342Array1[local173] != null) {
				this.aClass342Array1[local173].aByte126 = local24.method4861();
			}
		}
		for (@Pc(195) int local195 = 0; local195 < this.anInt6198; local195++) {
			if (this.aClass342Array1[local195] != null) {
				this.aClass342Array1[local195].aByte129 = local24.method4861();
			}
		}
		for (@Pc(221) int local221 = 0; local221 < this.anInt6198; local221++) {
			if (this.aClass342Array1[local221] != null) {
				this.aClass342Array1[local221].aByte128 = local24.method4861();
			}
		}
		for (@Pc(247) int local247 = 0; local247 < this.anInt6198; local247++) {
			if (this.aClass342Array1[local247] != null) {
				this.aClass342Array1[local247].aShort117 = (short) local24.method4858();
			}
		}
		for (@Pc(270) int local270 = 0; local270 < this.anInt6198; local270++) {
			if (this.aClass342Array1[local270] != null) {
				this.aClass342Array1[local270].aByte130 = local24.method4861();
			}
		}
		for (@Pc(296) int local296 = 0; local296 < this.anInt6198; local296++) {
			if (this.aClass342Array1[local296] != null) {
				this.aClass342Array1[local296].aByte127 = local24.method4861();
			}
		}
		for (@Pc(322) int local322 = 0; local322 < this.anInt6198; local322++) {
			if (this.aClass342Array1[local322] != null) {
				this.aClass342Array1[local322].aBoolean694 = local24.method4888() == 1;
			}
		}
		for (@Pc(355) int local355 = 0; local355 < this.anInt6198; local355++) {
			if (this.aClass342Array1[local355] != null) {
				this.aClass342Array1[local355].aBoolean691 = local24.method4888() == 1;
			}
		}
		for (@Pc(388) int local388 = 0; local388 < this.anInt6198; local388++) {
			if (this.aClass342Array1[local388] != null) {
				this.aClass342Array1[local388].aByte125 = local24.method4861();
			}
		}
		for (@Pc(410) int local410 = 0; local410 < this.anInt6198; local410++) {
			if (this.aClass342Array1[local410] != null) {
				this.aClass342Array1[local410].aBoolean692 = local24.method4888() == 1;
			}
		}
		for (@Pc(441) int local441 = 0; local441 < this.anInt6198; local441++) {
			if (this.aClass342Array1[local441] != null) {
				this.aClass342Array1[local441].aBoolean696 = local24.method4888() == 1;
			}
		}
		for (@Pc(472) int local472 = 0; local472 < this.anInt6198; local472++) {
			if (this.aClass342Array1[local472] != null) {
				this.aClass342Array1[local472].aBoolean689 = local24.method4888() == 1;
			}
		}
		for (@Pc(503) int local503 = 0; local503 < this.anInt6198; local503++) {
			if (this.aClass342Array1[local503] != null) {
				this.aClass342Array1[local503].anInt9279 = local24.method4888();
			}
		}
		for (@Pc(529) int local529 = 0; local529 < this.anInt6198; local529++) {
			if (this.aClass342Array1[local529] != null) {
				this.aClass342Array1[local529].anInt9281 = local24.method4868();
			}
		}
		for (@Pc(555) int local555 = 0; local555 < this.anInt6198; local555++) {
			if (this.aClass342Array1[local555] != null) {
				this.aClass342Array1[local555].anInt9280 = local24.method4888();
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)Lclient!lm;")
	private Class3_Sub6_Sub14 method5199(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub6 local10 = this.aClass30_2.method1092((long) arg0);
		if (local10 != null) {
			return (Class3_Sub6_Sub14) local10;
		}
		@Pc(23) byte[] local23 = this.aClass143_85.method3135(arg0);
		if (local23 == null) {
			return null;
		} else {
			@Pc(35) Class3_Sub6_Sub14 local35 = new Class3_Sub6_Sub14(new Class3_Sub17(local23));
			this.aClass30_2.method1094(local35, (long) arg0);
			return local35;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(FIZIIZ)[I")
	@Override
	public int[] method5192(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method5199(arg3).method5219(arg1, this.aClass143_86, (double) arg0, this.aClass342Array1[arg3].aBoolean691, arg4, arg2, this);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5197(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub6_Sub14 local10 = this.method5199(arg0);
		return local10 != null && local10.method5222(this, this.aClass143_86);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIFIBZ)[I")
	@Override
	public int[] method5195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		return this.method5199(arg1).method5223(this.aClass143_86, (double) arg2, arg0, this, arg3, this.aClass342Array1[arg1].aBoolean691);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I")
	@Override
	public int method5194() {
		return this.anInt6198;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)Lclient!tr;")
	@Override
	public Class342 method5193(@OriginalArg(0) int arg0) {
		return this.aClass342Array1[arg0];
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBZIFI)[F")
	@Override
	public float[] method5196(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method5199(arg0).method5217(arg3, arg1, this.aClass143_86, this, this.aClass342Array1[arg0].aBoolean691);
	}
}
