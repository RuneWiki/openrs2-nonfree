import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "Lclient!gc;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316() {
		try {
			if (this.aClass13_1 == null) {
				return null;
			}
			@Pc(15) Class1_Sub1_Sub1_Sub5 local15 = this.method39();
			if (local15 == null) {
				return null;
			}
			super.anInt168 = local15.anInt566;
			if (super.anInt155 != -1 && super.anInt156 != -1) {
				@Pc(36) Class32 local36 = Class32.aClass32Array1[super.anInt155];
				@Pc(39) Class1_Sub1_Sub1_Sub5 local39 = local36.method530();
				if (local39 != null) {
					@Pc(48) int local48 = local36.aClass27_2.anIntArray227[super.anInt156];
					@Pc(59) Class1_Sub1_Sub1_Sub5 local59 = new Class1_Sub1_Sub1_Sub5(Class14.method328((byte) 8, local48), 992, false, true, local39);
					local59.method301(0, 0, -super.anInt159);
					local59.method295();
					local59.method296(local48);
					local59.anIntArrayArray8 = null;
					local59.anIntArrayArray7 = null;
					if (local36.anInt846 != 128 || local36.anInt847 != 128) {
						local59.method304(792, local36.anInt846, local36.anInt846, local36.anInt847);
					}
					local59.method305(local36.anInt849 + 64, local36.anInt850 + 850, -30, -50, -30, true);
					@Pc(122) Class1_Sub1_Sub1_Sub5[] local122 = new Class1_Sub1_Sub1_Sub5[] { local15, local59 };
					local15 = new Class1_Sub1_Sub1_Sub5((byte) 9, 2, local122, true);
				}
			}
			if (this.aClass13_1.aByte25 == 1) {
				local15.aBoolean133 = true;
			}
			return local15;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("63270, " + 45160 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method39() {
		try {
			@Pc(20) int local20;
			if (super.anInt150 < 0 || super.anInt153 != 0) {
				local20 = -1;
				if (super.anInt147 >= 0) {
					local20 = Class27.aClass27Array1[super.anInt147].anIntArray227[super.anInt148];
				}
				return this.aClass13_1.method322(local20, null, -1);
			}
			local20 = Class27.aClass27Array1[super.anInt150].anIntArray227[super.anInt151];
			@Pc(22) int local22 = -1;
			if (super.anInt147 >= 0 && super.anInt147 != super.anInt131) {
				local22 = Class27.aClass27Array1[super.anInt147].anIntArray227[super.anInt148];
			}
			return this.aClass13_1.method322(local20, Class27.aClass27Array1[super.anInt150].anIntArray230, local22);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("14524, " + 0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method49() {
		try {
			return this.aClass13_1 != null;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("37118, " + -323 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
