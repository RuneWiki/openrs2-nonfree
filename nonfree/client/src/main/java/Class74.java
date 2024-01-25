import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dka")
public final class Class74 implements Interface3 {

	@OriginalMember(owner = "client!dka", name = "g", descriptor = "Lclient!bw;")
	private final Class42 aClass42_2 = new Class42(256);

	@OriginalMember(owner = "client!dka", name = "e", descriptor = "Lclient!gga;")
	private final Class124 aClass124_26;

	@OriginalMember(owner = "client!dka", name = "j", descriptor = "Lclient!gga;")
	private final Class124 aClass124_27;

	@OriginalMember(owner = "client!dka", name = "f", descriptor = "I")
	private final int anInt1980;

	@OriginalMember(owner = "client!dka", name = "c", descriptor = "[Lclient!hba;")
	private final Class136[] aClass136Array1;

	@OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(Lclient!gga;Lclient!gga;Lclient!gga;)V")
	public Class74(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_26 = arg1;
		this.aClass124_27 = arg2;
		@Pc(24) Class2_Sub8 local24 = new Class2_Sub8(arg0.method3641(0, 0));
		this.anInt1980 = local24.method5211();
		this.aClass136Array1 = new Class136[this.anInt1980];
		for (@Pc(36) int local36 = 0; local36 < this.anInt1980; local36++) {
			if (local24.method5203() == 1) {
				this.aClass136Array1[local36] = new Class136();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt1980; local61++) {
			if (this.aClass136Array1[local61] != null) {
				this.aClass136Array1[local61].aBoolean329 = local24.method5203() == 0;
			}
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt1980; local94++) {
			if (this.aClass136Array1[local94] != null) {
				this.aClass136Array1[local94].aBoolean333 = local24.method5203() == 1;
			}
		}
		for (@Pc(125) int local125 = 0; local125 < this.anInt1980; local125++) {
			if (this.aClass136Array1[local125] != null) {
				this.aClass136Array1[local125].aBoolean332 = local24.method5203() == 1;
			}
		}
		for (@Pc(158) int local158 = 0; local158 < this.anInt1980; local158++) {
			if (this.aClass136Array1[local158] != null) {
				this.aClass136Array1[local158].aByte66 = local24.method5175();
			}
		}
		for (@Pc(180) int local180 = 0; local180 < this.anInt1980; local180++) {
			if (this.aClass136Array1[local180] != null) {
				this.aClass136Array1[local180].aByte67 = local24.method5175();
			}
		}
		for (@Pc(206) int local206 = 0; local206 < this.anInt1980; local206++) {
			if (this.aClass136Array1[local206] != null) {
				this.aClass136Array1[local206].aByte62 = local24.method5175();
			}
		}
		for (@Pc(228) int local228 = 0; local228 < this.anInt1980; local228++) {
			if (this.aClass136Array1[local228] != null) {
				this.aClass136Array1[local228].aByte64 = local24.method5175();
			}
		}
		for (@Pc(254) int local254 = 0; local254 < this.anInt1980; local254++) {
			if (this.aClass136Array1[local254] != null) {
				this.aClass136Array1[local254].aShort48 = (short) local24.method5211();
			}
		}
		for (@Pc(281) int local281 = 0; local281 < this.anInt1980; local281++) {
			if (this.aClass136Array1[local281] != null) {
				this.aClass136Array1[local281].aByte61 = local24.method5175();
			}
		}
		for (@Pc(303) int local303 = 0; local303 < this.anInt1980; local303++) {
			if (this.aClass136Array1[local303] != null) {
				this.aClass136Array1[local303].aByte65 = local24.method5175();
			}
		}
		for (@Pc(329) int local329 = 0; local329 < this.anInt1980; local329++) {
			if (this.aClass136Array1[local329] != null) {
				this.aClass136Array1[local329].aBoolean330 = local24.method5203() == 1;
			}
		}
		for (@Pc(356) int local356 = 0; local356 < this.anInt1980; local356++) {
			if (this.aClass136Array1[local356] != null) {
				this.aClass136Array1[local356].aBoolean334 = local24.method5203() == 1;
			}
		}
		for (@Pc(387) int local387 = 0; local387 < this.anInt1980; local387++) {
			if (this.aClass136Array1[local387] != null) {
				this.aClass136Array1[local387].aByte63 = local24.method5175();
			}
		}
		for (@Pc(413) int local413 = 0; local413 < this.anInt1980; local413++) {
			if (this.aClass136Array1[local413] != null) {
				this.aClass136Array1[local413].aBoolean331 = local24.method5203() == 1;
			}
		}
		for (@Pc(446) int local446 = 0; local446 < this.anInt1980; local446++) {
			if (this.aClass136Array1[local446] != null) {
				this.aClass136Array1[local446].aBoolean335 = local24.method5203() == 1;
			}
		}
		for (@Pc(477) int local477 = 0; local477 < this.anInt1980; local477++) {
			if (this.aClass136Array1[local477] != null) {
				this.aClass136Array1[local477].aBoolean336 = local24.method5203() == 1;
			}
		}
		for (@Pc(510) int local510 = 0; local510 < this.anInt1980; local510++) {
			if (this.aClass136Array1[local510] != null) {
				this.aClass136Array1[local510].anInt4368 = local24.method5203();
			}
		}
		for (@Pc(536) int local536 = 0; local536 < this.anInt1980; local536++) {
			if (this.aClass136Array1[local536] != null) {
				this.aClass136Array1[local536].anInt4369 = local24.method5172();
			}
		}
		for (@Pc(558) int local558 = 0; local558 < this.anInt1980; local558++) {
			if (this.aClass136Array1[local558] != null) {
				this.aClass136Array1[local558].anInt4370 = local24.method5203();
			}
		}
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(I)I")
	@Override
	public int method1943() {
		return this.anInt1980;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method1940(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub1_Sub16 local13 = this.method1945(arg0);
		return local13 != null && local13.method6700(this.aClass124_27, this);
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(FIZBII)[I")
	@Override
	public int[] method1939(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method1945(arg1).method6697(arg2, (double) arg0, this, this.aClass124_27, arg3, this.aClass136Array1[arg1].aBoolean334);
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(II)Lclient!hba;")
	@Override
	public Class136 method1941(@OriginalArg(0) int arg0) {
		return this.aClass136Array1[arg0];
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(ZBFIII)[I")
	@Override
	public int[] method1938(@OriginalArg(0) boolean arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method1945(arg3).method6699(this.aClass124_27, this.aClass136Array1[arg3].aBoolean334, this, arg2, arg0, (double) arg1, arg4);
	}

	@OriginalMember(owner = "client!dka", name = "b", descriptor = "(IZ)Lclient!nl;")
	private Class2_Sub1_Sub16 method1945(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1 local10 = this.aClass42_2.method1177((long) arg0);
		if (local10 != null) {
			return (Class2_Sub1_Sub16) local10;
		}
		@Pc(21) byte[] local21 = this.aClass124_26.method3610(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class2_Sub1_Sub16 local33 = new Class2_Sub1_Sub16(new Class2_Sub8(local21));
			this.aClass42_2.method1175(local33, (long) arg0);
			return local33;
		}
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(IBZIFI)[F")
	@Override
	public float[] method1942(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method1945(arg3).method6698(this.aClass124_27, this.aClass136Array1[arg3].aBoolean334, arg0, arg1, this);
	}
}
