import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZLSEKGJR")
public final class Class3_Sub1_Sub1_Sub4_Sub2 extends Class3_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!ZLSEKGJR", name = "rb", descriptor = "I")
	private int anInt759;

	@OriginalMember(owner = "client!ZLSEKGJR", name = "sb", descriptor = "Lclient!GALAVQEJ;")
	public Class7 aClass7_2;

	@OriginalMember(owner = "client!ZLSEKGJR", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method536(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = true;
			return this.aClass7_2 != null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("54130, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLSEKGJR", name = "c", descriptor = "(I)Lclient!CSGBDGDY;")
	private Class3_Sub1_Sub1_Sub1 method541(@OriginalArg(0) int arg0) {
		try {
			@Pc(14) int local14;
			if (super.anInt743 >= 0 && super.anInt746 == 0) {
				local14 = Class31.aClass31Array1[super.anInt743].anIntArray126[super.anInt744];
				@Pc(16) int local16 = -1;
				if (super.anInt711 >= 0 && super.anInt711 != super.anInt752) {
					local16 = Class31.aClass31Array1[super.anInt711].anIntArray126[super.anInt712];
				}
				return this.aClass7_2.method85(426, local14, Class31.aClass31Array1[super.anInt743].anIntArray129, local16);
			}
			local14 = -1;
			if (arg0 != 0) {
				throw new NullPointerException();
			}
			if (super.anInt711 >= 0) {
				local14 = Class31.aClass31Array1[super.anInt711].anIntArray126[super.anInt712];
			}
			return this.aClass7_2.method85(426, local14, (int[]) null, -1);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("90272, " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLSEKGJR", name = "a", descriptor = "(Z)Lclient!CSGBDGDY;")
	@Override
	protected Class3_Sub1_Sub1_Sub1 method535() {
		try {
			if (this.aClass7_2 == null) {
				return null;
			}
			@Pc(9) Class3_Sub1_Sub1_Sub1 local9 = this.method541(this.anInt759);
			if (local9 == null) {
				return null;
			}
			super.anInt758 = local9.anInt709;
			if (super.anInt714 != -1 && super.anInt715 != -1) {
				@Pc(36) Class6 local36 = Class6.aClass6Array1[super.anInt714];
				@Pc(39) Class3_Sub1_Sub1_Sub1 local39 = local36.method82();
				if (local39 != null) {
					@Pc(48) int local48 = local36.aClass31_2.anIntArray126[super.anInt715];
					@Pc(59) Class3_Sub1_Sub1_Sub1 local59 = new Class3_Sub1_Sub1_Sub1(true, Class18.method210(local48), local39, false, (byte) -45);
					local59.method46(-super.anInt718, 0, 0);
					local59.method40();
					local59.method41(local48);
					local59.anIntArrayArray2 = null;
					local59.anIntArrayArray1 = null;
					if (local36.anInt121 != 128 || local36.anInt122 != 128) {
						local59.method49(local36.anInt121, local36.anInt122, local36.anInt121);
					}
					local59.method50(local36.anInt124 + 64, 850 + local36.anInt125, -30, -50, -30, true);
					@Pc(122) Class3_Sub1_Sub1_Sub1[] local122 = new Class3_Sub1_Sub1_Sub1[] { local9, local59 };
					local9 = new Class3_Sub1_Sub1_Sub1(true, 2, local122, true);
				}
			}
			if (this.aClass7_2.aByte2 == 1) {
				local9.aBoolean19 = true;
			}
			return local9;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("62343, " + true + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
