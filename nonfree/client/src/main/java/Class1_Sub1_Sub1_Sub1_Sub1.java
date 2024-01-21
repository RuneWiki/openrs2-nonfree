import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "Lclient!gc;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "qb", descriptor = "I")
	private int anInt124 = 650;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass13_1 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub1_Sub5 local8 = this.method39();
			if (local8 == null) {
				return null;
			}
			super.anInt171 = local8.anInt560;
			@Pc(20) boolean local20 = false;
			if (super.anInt158 != -1 && super.anInt159 != -1) {
				@Pc(33) Class32 local33 = Class32.aClass32Array1[super.anInt158];
				@Pc(36) Class1_Sub1_Sub1_Sub5 local36 = local33.method530();
				if (local36 != null) {
					@Pc(45) int local45 = local33.aClass27_2.anIntArray227[super.anInt159];
					@Pc(56) Class1_Sub1_Sub1_Sub5 local56 = new Class1_Sub1_Sub1_Sub5(23727, Class14.method328(local45), true, local36, false);
					local56.method301(0, -super.anInt162, 0);
					local56.method295();
					local56.method296(local45);
					local56.anIntArrayArray8 = null;
					local56.anIntArrayArray7 = null;
					if (local33.anInt838 != 128 || local33.anInt839 != 128) {
						local56.method304(local33.anInt838, local33.anInt839, local33.anInt838);
					}
					local56.method305(local33.anInt841 + 64, local33.anInt842 + 850, -30, -50, -30, true);
					@Pc(119) Class1_Sub1_Sub1_Sub5[] local119 = new Class1_Sub1_Sub1_Sub5[] { local8, local56 };
					local8 = new Class1_Sub1_Sub1_Sub5(2, 962, local119, true);
				}
			}
			if (this.aClass13_1.aByte21 == 1) {
				local8.aBoolean130 = true;
			}
			return local8;
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("16810, " + arg0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method39() {
		try {
			@Pc(23) int local23;
			if (super.anInt153 < 0 || super.anInt156 != 0) {
				local23 = -1;
				if (super.anInt150 >= 0) {
					local23 = Class27.aClass27Array1[super.anInt150].anIntArray227[super.anInt151];
				}
				return this.aClass13_1.method322(-1, local23, null);
			}
			local23 = Class27.aClass27Array1[super.anInt153].anIntArray227[super.anInt154];
			@Pc(25) int local25 = -1;
			if (super.anInt150 >= 0 && super.anInt150 != super.anInt134) {
				local25 = Class27.aClass27Array1[super.anInt150].anIntArray227[super.anInt151];
			}
			return this.aClass13_1.method322(local25, local23, Class27.aClass27Array1[super.anInt153].anIntArray230);
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("94662, " + 0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method49() {
		try {
			return this.aClass13_1 != null;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("49582, " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}
}
