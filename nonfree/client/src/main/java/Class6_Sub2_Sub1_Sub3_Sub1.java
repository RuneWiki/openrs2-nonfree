import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JKNLPRIU")
public final class Class6_Sub2_Sub1_Sub3_Sub1 extends Class6_Sub2_Sub1_Sub3 {

	@OriginalMember(owner = "client!JKNLPRIU", name = "rb", descriptor = "Lclient!JKAPIYZO;")
	public Class16 aClass16_1;

	@OriginalMember(owner = "client!JKNLPRIU", name = "pb", descriptor = "I")
	private int anInt324 = -40048;

	@OriginalMember(owner = "client!JKNLPRIU", name = "qb", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!JKNLPRIU", name = "b", descriptor = "(B)Lclient!WEVRTBOZ;")
	private Class6_Sub2_Sub1_Sub6 method227() {
		try {
			@Pc(14) int local14;
			if (super.anInt616 < 0 || super.anInt619 != 0) {
				local14 = -1;
				if (super.anInt654 >= 0) {
					local14 = Class33.aClass33Array1[super.anInt654].anIntArray129[super.anInt655];
				}
				return this.aClass16_1.method201(local14, null, -1);
			}
			local14 = Class33.aClass33Array1[super.anInt616].anIntArray129[super.anInt617];
			@Pc(16) int local16 = -1;
			if (super.anInt654 >= 0 && super.anInt654 != super.anInt640) {
				local16 = Class33.aClass33Array1[super.anInt654].anIntArray129[super.anInt655];
			}
			return this.aClass16_1.method201(local14, Class33.aClass33Array1[super.anInt616].anIntArray132, local16);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("21732, " + 6 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JKNLPRIU", name = "a", descriptor = "(Z)Lclient!WEVRTBOZ;")
	@Override
	protected Class6_Sub2_Sub1_Sub6 method482() {
		try {
			if (this.aClass16_1 == null) {
				return null;
			}
			@Pc(8) Class6_Sub2_Sub1_Sub6 local8 = this.method227();
			if (local8 == null) {
				return null;
			}
			super.anInt661 = local8.anInt714;
			if (super.anInt630 != -1 && super.anInt631 != -1) {
				@Pc(34) Class29 local34 = Class29.aClass29Array1[super.anInt630];
				@Pc(37) Class6_Sub2_Sub1_Sub6 local37 = local34.method361();
				if (local37 != null) {
					@Pc(46) int local46 = local34.aClass33_2.anIntArray129[super.anInt631];
					@Pc(57) Class6_Sub2_Sub1_Sub6 local57 = new Class6_Sub2_Sub1_Sub6(107, local37, Class12.method88(local46), false, true);
					local57.method500(-super.anInt634, 0, 0);
					local57.method494((byte) 2);
					local57.method495(local46, 803);
					local57.anIntArrayArray19 = null;
					local57.anIntArrayArray18 = null;
					if (local34.anInt545 != 128 || local34.anInt546 != 128) {
						local57.method503(local34.anInt545, local34.anInt545, local34.anInt546);
					}
					local57.method504(local34.anInt548 + 64, local34.anInt549 + 850, -30, -50, -30, true);
					@Pc(120) Class6_Sub2_Sub1_Sub6[] local120 = new Class6_Sub2_Sub1_Sub6[] { local8, local57 };
					local8 = new Class6_Sub2_Sub1_Sub6(local120, true, true, 2);
				}
			}
			if (this.aClass16_1.aByte10 == 1) {
				local8.aBoolean192 = true;
			}
			return local8;
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("29999, " + true + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JKNLPRIU", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method446() {
		try {
			return this.aClass16_1 != null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("38398, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
