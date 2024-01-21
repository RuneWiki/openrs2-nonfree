import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TBFTCCSF")
public final class Class6_Sub1_Sub2_Sub4_Sub1 extends Class6_Sub1_Sub2_Sub4 {

	@OriginalMember(owner = "client!TBFTCCSF", name = "tb", descriptor = "Lclient!JRELGTVY;")
	public Class20 aClass20_1;

	@OriginalMember(owner = "client!TBFTCCSF", name = "rb", descriptor = "B")
	private byte aByte36 = 2;

	@OriginalMember(owner = "client!TBFTCCSF", name = "sb", descriptor = "Z")
	private boolean aBoolean135 = false;

	@OriginalMember(owner = "client!TBFTCCSF", name = "a", descriptor = "(B)Lclient!FLXAIVEA;")
	@Override
	protected Class6_Sub1_Sub2_Sub2 method522(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass20_1 == null) {
				return null;
			}
			@Pc(8) Class6_Sub1_Sub2_Sub2 local8 = this.method359();
			if (2 != this.aByte36) {
				throw new NullPointerException();
			}
			@Pc(14) boolean local14 = false;
			if (local8 == null) {
				return null;
			}
			super.anInt605 = local8.anInt738;
			if (super.anInt592 != -1 && super.anInt593 != -1) {
				@Pc(41) Class28 local41 = Class28.aClass28Array1[super.anInt592];
				@Pc(44) Class6_Sub1_Sub2_Sub2 local44 = local41.method188();
				if (local44 != null) {
					@Pc(53) int local53 = local41.aClass2_2.anIntArray10[super.anInt593];
					@Pc(64) Class6_Sub1_Sub2_Sub2 local64 = new Class6_Sub1_Sub2_Sub2(local44, Class27.method185(local53), true, (byte) 8, false);
					local64.method99(0, -super.anInt596, 0);
					local64.method93();
					local64.method94(local53);
					local64.anIntArrayArray5 = null;
					local64.anIntArrayArray4 = null;
					if (local41.anInt351 != 128 || local41.anInt352 != 128) {
						local64.method102(local41.anInt351, local41.anInt351, local41.anInt352);
					}
					local64.method103(64 + local41.anInt354, 850 + local41.anInt355, -30, -50, -30, true);
					@Pc(127) Class6_Sub1_Sub2_Sub2[] local127 = new Class6_Sub1_Sub2_Sub2[] { local8, local64 };
					local8 = new Class6_Sub1_Sub2_Sub2(2, 0, true, local127);
				}
			}
			if (this.aClass20_1.aByte22 == 1) {
				local8.aBoolean56 = true;
			}
			return local8;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("43860, " + arg0 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TBFTCCSF", name = "c", descriptor = "(I)Lclient!FLXAIVEA;")
	private Class6_Sub1_Sub2_Sub2 method359() {
		try {
			@Pc(24) int local24;
			if (super.anInt609 < 0 || super.anInt612 != 0) {
				local24 = -1;
				if (super.anInt587 >= 0) {
					local24 = Class2.aClass2Array1[super.anInt587].anIntArray10[super.anInt588];
				}
				return this.aClass20_1.method151((int[]) null, -1, local24);
			}
			local24 = Class2.aClass2Array1[super.anInt609].anIntArray10[super.anInt610];
			@Pc(26) int local26 = -1;
			if (super.anInt587 >= 0 && super.anInt587 != super.anInt599) {
				local26 = Class2.aClass2Array1[super.anInt587].anIntArray10[super.anInt588];
			}
			return this.aClass20_1.method151(Class2.aClass2Array1[super.anInt609].anIntArray13, local26, local24);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("69792, " + 507 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TBFTCCSF", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method381() {
		try {
			return this.aClass20_1 != null;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("95508, " + -40574 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}
}
