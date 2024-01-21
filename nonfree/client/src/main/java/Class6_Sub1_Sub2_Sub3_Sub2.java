import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NVHCJIOR")
public final class Class6_Sub1_Sub2_Sub3_Sub2 extends Class6_Sub1_Sub2_Sub3 {

	@OriginalMember(owner = "client!NVHCJIOR", name = "xb", descriptor = "Lclient!XDDMQHDR;")
	public Class47 aClass47_2;

	@OriginalMember(owner = "client!NVHCJIOR", name = "ub", descriptor = "Z")
	private boolean aBoolean148 = true;

	@OriginalMember(owner = "client!NVHCJIOR", name = "vb", descriptor = "Z")
	private boolean aBoolean149 = true;

	@OriginalMember(owner = "client!NVHCJIOR", name = "wb", descriptor = "I")
	private int anInt562 = 8;

	@OriginalMember(owner = "client!NVHCJIOR", name = "c", descriptor = "(I)Lclient!NGYJLUVS;")
	private Class6_Sub1_Sub2_Sub5 method309() {
		try {
			@Pc(14) int local14;
			if (super.anInt529 < 0 || super.anInt532 != 0) {
				local14 = -1;
				if (super.anInt538 >= 0) {
					local14 = Class21.aClass21Array1[super.anInt538].anIntArray64[super.anInt539];
				}
				return this.aClass47_2.method541(-1, local14, this.anInt562, null);
			}
			local14 = Class21.aClass21Array1[super.anInt529].anIntArray64[super.anInt530];
			@Pc(16) int local16 = -1;
			if (super.anInt538 >= 0 && super.anInt538 != super.anInt551) {
				local16 = Class21.aClass21Array1[super.anInt538].anIntArray64[super.anInt539];
			}
			return this.aClass47_2.method541(local16, local14, this.anInt562, Class21.aClass21Array1[super.anInt529].anIntArray67);
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("54133, " + 4245 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NVHCJIOR", name = "a", descriptor = "(I)Lclient!NGYJLUVS;")
	@Override
	protected Class6_Sub1_Sub2_Sub5 method382() {
		try {
			if (this.aClass47_2 == null) {
				return null;
			}
			@Pc(8) Class6_Sub1_Sub2_Sub5 local8 = this.method309();
			if (local8 == null) {
				return null;
			}
			super.anInt524 = local8.anInt640;
			if (super.anInt516 != -1 && super.anInt517 != -1) {
				@Pc(36) Class12 local36 = Class12.aClass12Array1[super.anInt516];
				@Pc(39) Class6_Sub1_Sub2_Sub5 local39 = local36.method101();
				if (local39 != null) {
					@Pc(48) int local48 = local36.aClass21_1.anIntArray64[super.anInt517];
					@Pc(59) Class6_Sub1_Sub2_Sub5 local59 = new Class6_Sub1_Sub2_Sub5(Class34.method378(local48), true, true, local39, false);
					local59.method241(0, -super.anInt520, 0);
					local59.method235();
					local59.method236(local48);
					local59.anIntArrayArray9 = null;
					local59.anIntArrayArray8 = null;
					if (local36.anInt131 != 128 || local36.anInt132 != 128) {
						local59.method244(local36.anInt131, local36.anInt131, local36.anInt132);
					}
					local59.method245(local36.anInt134 + 64, local36.anInt135 + 850, -30, -50, -30, true);
					@Pc(122) Class6_Sub1_Sub2_Sub5[] local122 = new Class6_Sub1_Sub2_Sub5[] { local8, local59 };
					local8 = new Class6_Sub1_Sub2_Sub5(-426, 2, true, local122);
				}
			}
			if (this.aClass47_2.aByte23 == 1) {
				local8.aBoolean118 = true;
			}
			return local8;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("62819, " + -12617 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NVHCJIOR", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method306() {
		try {
			return this.aClass47_2 != null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("56372, " + true + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
