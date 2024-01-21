import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CHUIKYUV")
public final class Class4_Sub1_Sub1_Sub1_Sub1 extends Class4_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!CHUIKYUV", name = "ub", descriptor = "Lclient!AUWOQLEO;")
	public Class2 aClass2_1;

	@OriginalMember(owner = "client!CHUIKYUV", name = "sb", descriptor = "I")
	private int anInt152 = 5131;

	@OriginalMember(owner = "client!CHUIKYUV", name = "tb", descriptor = "Z")
	private boolean aBoolean28 = true;

	@OriginalMember(owner = "client!CHUIKYUV", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method469() {
		try {
			return this.aClass2_1 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("24357, " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CHUIKYUV", name = "a", descriptor = "(B)Lclient!IGXVZOHI;")
	private Class4_Sub1_Sub1_Sub3 method52(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(25) int local25;
			if (super.anInt626 < 0 || super.anInt629 != 0) {
				local25 = -1;
				if (super.anInt664 >= 0) {
					local25 = Class5.aClass5Array1[super.anInt664].anIntArray7[super.anInt665];
				}
				return this.aClass2_1.method7(-1, local25, null);
			}
			local25 = Class5.aClass5Array1[super.anInt626].anIntArray7[super.anInt627];
			@Pc(27) int local27 = -1;
			if (super.anInt664 >= 0 && super.anInt664 != super.anInt645) {
				local27 = Class5.aClass5Array1[super.anInt664].anIntArray7[super.anInt665];
			}
			return this.aClass2_1.method7(local27, local25, Class5.aClass5Array1[super.anInt626].anIntArray10);
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("74299, " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CHUIKYUV", name = "a", descriptor = "(I)Lclient!IGXVZOHI;")
	@Override
	protected Class4_Sub1_Sub1_Sub3 method531() {
		try {
			if (this.aClass2_1 == null) {
				return null;
			}
			@Pc(8) Class4_Sub1_Sub1_Sub3 local8 = this.method52((byte) 5);
			if (local8 == null) {
				return null;
			}
			super.anInt642 = local8.anInt760;
			if (super.anInt669 != -1 && super.anInt670 != -1) {
				@Pc(36) Class42 local36 = Class42.aClass42Array1[super.anInt669];
				@Pc(39) Class4_Sub1_Sub1_Sub3 local39 = local36.method527();
				if (local39 != null) {
					@Pc(48) int local48 = local36.aClass5_1.anIntArray7[super.anInt670];
					@Pc(60) Class4_Sub1_Sub1_Sub3 local60 = new Class4_Sub1_Sub1_Sub3(true, local39, false, Class22.method274(local48, this.anInt152), (byte) 1);
					local60.method296(0, 0, -super.anInt673);
					local60.method290();
					local60.method291(local48);
					local60.anIntArrayArray5 = null;
					local60.anIntArrayArray4 = null;
					if (local36.anInt751 != 128 || local36.anInt752 != 128) {
						local60.method299(local36.anInt751, local36.anInt752, local36.anInt751);
					}
					local60.method300(local36.anInt754 + 64, local36.anInt755 + 850, -30, -50, -30, true);
					@Pc(123) Class4_Sub1_Sub1_Sub3[] local123 = new Class4_Sub1_Sub1_Sub3[] { local8, local60 };
					local8 = new Class4_Sub1_Sub1_Sub3(2, local123, true, (byte) 63);
				}
			}
			if (this.aClass2_1.aByte1 == 1) {
				local8.aBoolean120 = true;
			}
			return local8;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("78981, " + 47492 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
