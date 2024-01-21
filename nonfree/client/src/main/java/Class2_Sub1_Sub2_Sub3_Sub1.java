import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RLTBSHTA")
public final class Class2_Sub1_Sub2_Sub3_Sub1 extends Class2_Sub1_Sub2_Sub3 {

	@OriginalMember(owner = "client!RLTBSHTA", name = "vb", descriptor = "Lclient!ZLQCXMFK;")
	public Class46 aClass46_1;

	@OriginalMember(owner = "client!RLTBSHTA", name = "sb", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!RLTBSHTA", name = "tb", descriptor = "B")
	private byte aByte18 = 0;

	@OriginalMember(owner = "client!RLTBSHTA", name = "ub", descriptor = "Z")
	private boolean aBoolean160 = true;

	@OriginalMember(owner = "client!RLTBSHTA", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method473() {
		try {
			return this.aClass46_1 != null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("38140, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLTBSHTA", name = "c", descriptor = "(I)Lclient!IEHKDFMR;")
	private Class2_Sub1_Sub2_Sub2 method311() {
		try {
			@Pc(23) int local23;
			if (super.anInt684 < 0 || super.anInt687 != 0) {
				local23 = -1;
				if (super.anInt693 >= 0) {
					local23 = Class39.aClass39Array1[super.anInt693].anIntArray166[super.anInt694];
				}
				return this.aClass46_1.method483(-1, null, local23);
			}
			local23 = Class39.aClass39Array1[super.anInt684].anIntArray166[super.anInt685];
			@Pc(25) int local25 = -1;
			if (super.anInt693 >= 0 && super.anInt693 != super.anInt661) {
				local25 = Class39.aClass39Array1[super.anInt693].anIntArray166[super.anInt694];
			}
			return this.aClass46_1.method483(local25, Class39.aClass39Array1[super.anInt684].anIntArray169, local23);
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("6817, " + 0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RLTBSHTA", name = "a", descriptor = "(I)Lclient!IEHKDFMR;")
	@Override
	protected Class2_Sub1_Sub2_Sub2 method469() {
		try {
			if (this.aClass46_1 == null) {
				return null;
			}
			@Pc(8) Class2_Sub1_Sub2_Sub2 local8 = this.method311();
			if (local8 == null) {
				return null;
			}
			super.anInt656 = local8.anInt655;
			if (super.anInt663 != -1 && super.anInt664 != -1) {
				@Pc(39) Class33 local39 = Class33.aClass33Array1[super.anInt663];
				@Pc(42) Class2_Sub1_Sub2_Sub2 local42 = local39.method318();
				if (local42 != null) {
					@Pc(51) int local51 = local39.aClass39_2.anIntArray166[super.anInt664];
					@Pc(63) Class2_Sub1_Sub2_Sub2 local63 = new Class2_Sub1_Sub2_Sub2(false, (byte) 1, Class26.method223(this.aByte18, local51), local42, true);
					local63.method164(0, 0, -super.anInt667);
					local63.method158();
					local63.method159((byte) 9, local51);
					local63.anIntArrayArray8 = null;
					local63.anIntArrayArray7 = null;
					if (local39.anInt477 != 128 || local39.anInt478 != 128) {
						local63.method167(local39.anInt477, local39.anInt478, local39.anInt477);
					}
					local63.method168(local39.anInt480 + 64, local39.anInt481 + 850, -30, -50, -30, true);
					@Pc(126) Class2_Sub1_Sub2_Sub2[] local126 = new Class2_Sub1_Sub2_Sub2[] { local8, local63 };
					local8 = new Class2_Sub1_Sub2_Sub2((byte) -29, true, 2, local126);
				}
			}
			if (this.aClass46_1.aByte27 == 1) {
				local8.aBoolean80 = true;
			}
			return local8;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("51975, " + 0 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}
}
