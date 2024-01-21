import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "sb", descriptor = "Lclient!gc;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "pb", descriptor = "B")
	private byte aByte1 = 86;

	@OriginalMember(owner = "client!ab", name = "qb", descriptor = "Z")
	private boolean aBoolean19 = true;

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "B")
	private byte aByte2 = 3;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method315() {
		try {
			if (this.aClass13_1 == null) {
				return null;
			}
			@Pc(9) Class1_Sub1_Sub1_Sub5 local9 = this.method39(this.aBoolean19);
			if (local9 == null) {
				return null;
			}
			super.anInt169 = local9.anInt571;
			if (super.anInt156 != -1 && super.anInt157 != -1) {
				@Pc(37) Class29 local37 = Class29.aClass29Array1[super.anInt156];
				@Pc(40) Class1_Sub1_Sub1_Sub5 local40 = local37.method520();
				if (local40 != null) {
					@Pc(56) Class1_Sub1_Sub1_Sub5 local56 = new Class1_Sub1_Sub1_Sub5(true, local40, false, true, !local37.aBoolean187);
					local56.method300(0, 0, -super.anInt160);
					local56.method294(this.aByte1);
					local56.method295(local37.aClass27_2.anIntArray226[super.anInt157]);
					local56.anIntArrayArray8 = null;
					local56.anIntArrayArray7 = null;
					if (local37.anInt843 != 128 || local37.anInt844 != 128) {
						local56.method303(local37.anInt843, local37.anInt843, local37.anInt844);
					}
					local56.method304(local37.anInt846 + 64, local37.anInt847 + 850, -30, -50, -30, true);
					@Pc(125) Class1_Sub1_Sub1_Sub5[] local125 = new Class1_Sub1_Sub1_Sub5[] { local9, local56 };
					local9 = new Class1_Sub1_Sub1_Sub5((byte) 22, 2, true, local125);
				}
			}
			if (this.aClass13_1.aByte27 == 1) {
				local9.aBoolean122 = true;
			}
			return local9;
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("72005, " + -13634 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method39(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			}
			@Pc(20) int local20;
			if (super.anInt151 < 0 || super.anInt154 != 0) {
				local20 = -1;
				if (super.anInt148 >= 0) {
					local20 = Class27.aClass27Array1[super.anInt148].anIntArray226[super.anInt149];
				}
				return this.aClass13_1.method321(local20, this.aByte2, null, -1);
			}
			local20 = Class27.aClass27Array1[super.anInt151].anIntArray226[super.anInt152];
			@Pc(22) int local22 = -1;
			if (super.anInt148 >= 0 && super.anInt148 != super.anInt132) {
				local22 = Class27.aClass27Array1[super.anInt148].anIntArray226[super.anInt149];
			}
			return this.aClass13_1.method321(local20, this.aByte2, Class27.aClass27Array1[super.anInt151].anIntArray229, local22);
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("4673, " + arg0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method49(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 5) {
				throw new NullPointerException();
			}
			return this.aClass13_1 != null;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("94598, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}
}
