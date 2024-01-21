import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "qb", descriptor = "Lclient!gc;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316() {
		try {
			if (this.aClass13_1 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub1_Sub5 local8 = this.method39();
			if (local8 == null) {
				return null;
			}
			super.anInt169 = local8.anInt571;
			if (super.anInt156 != -1 && super.anInt157 != -1) {
				@Pc(39) Class32 local39 = Class32.aClass32Array1[super.anInt156];
				@Pc(42) Class1_Sub1_Sub1_Sub5 local42 = local39.method530();
				if (local42 != null) {
					@Pc(51) int local51 = local39.aClass27_2.anIntArray227[super.anInt157];
					@Pc(62) Class1_Sub1_Sub1_Sub5 local62 = new Class1_Sub1_Sub1_Sub5(Class14.method328(local51), local42, true, 0, false);
					local62.method301(0, 0, -super.anInt160);
					local62.method295();
					local62.method296(local51);
					local62.anIntArrayArray8 = null;
					local62.anIntArrayArray7 = null;
					if (local39.anInt844 != 128 || local39.anInt845 != 128) {
						local62.method304(local39.anInt844, (byte) 9, local39.anInt844, local39.anInt845);
					}
					local62.method305(local39.anInt847 + 64, local39.anInt848 + 850, -30, -50, -30, true);
					@Pc(125) Class1_Sub1_Sub1_Sub5[] local125 = new Class1_Sub1_Sub1_Sub5[] { local8, local62 };
					local8 = new Class1_Sub1_Sub1_Sub5(local125, 2, 294, true);
				}
			}
			if (this.aClass13_1.aByte23 == 1) {
				local8.aBoolean139 = true;
			}
			return local8;
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("13890, " + -28205 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method39() {
		try {
			@Pc(22) int local22;
			if (super.anInt151 < 0 || super.anInt154 != 0) {
				local22 = -1;
				if (super.anInt148 >= 0) {
					local22 = Class27.aClass27Array1[super.anInt148].anIntArray227[super.anInt149];
				}
				return this.aClass13_1.method322(local22, null, -1);
			}
			local22 = Class27.aClass27Array1[super.anInt151].anIntArray227[super.anInt152];
			@Pc(24) int local24 = -1;
			if (super.anInt148 >= 0 && super.anInt148 != super.anInt132) {
				local24 = Class27.aClass27Array1[super.anInt148].anIntArray227[super.anInt149];
			}
			return this.aClass13_1.method322(local22, Class27.aClass27Array1[super.anInt151].anIntArray230, local24);
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("18196, " + -466 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method49(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return this.aClass13_1 != null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("60806, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}
}
