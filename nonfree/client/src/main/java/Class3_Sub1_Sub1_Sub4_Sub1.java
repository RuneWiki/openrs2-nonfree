import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UGARWYIU")
public final class Class3_Sub1_Sub1_Sub4_Sub1 extends Class3_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!UGARWYIU", name = "pb", descriptor = "Lclient!BJGOYLYN;")
	public Class2 aClass2_1;

	@OriginalMember(owner = "client!UGARWYIU", name = "nb", descriptor = "I")
	private int anInt613 = 932;

	@OriginalMember(owner = "client!UGARWYIU", name = "ob", descriptor = "Z")
	private boolean aBoolean133 = true;

	@OriginalMember(owner = "client!UGARWYIU", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method506() {
		try {
			return this.aClass2_1 != null;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("24602, " + 8 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UGARWYIU", name = "c", descriptor = "(B)Lclient!UNLYQRUD;")
	private Class3_Sub1_Sub1_Sub5 method387() {
		try {
			@Pc(14) int local14;
			if (super.anInt701 < 0 || super.anInt704 != 0) {
				local14 = -1;
				if (super.anInt732 >= 0) {
					local14 = Class30.aClass30Array1[super.anInt732].anIntArray90[super.anInt733];
				}
				return this.aClass2_1.method2(-1, null, local14);
			}
			local14 = Class30.aClass30Array1[super.anInt701].anIntArray90[super.anInt702];
			@Pc(16) int local16 = -1;
			if (super.anInt732 >= 0 && super.anInt732 != super.anInt689) {
				local16 = Class30.aClass30Array1[super.anInt732].anIntArray90[super.anInt733];
			}
			return this.aClass2_1.method2(local16, Class30.aClass30Array1[super.anInt701].anIntArray93, local14);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("29461, " + 103 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UGARWYIU", name = "a", descriptor = "(B)Lclient!UNLYQRUD;")
	@Override
	protected Class3_Sub1_Sub1_Sub5 method505() {
		try {
			if (this.aClass2_1 == null) {
				return null;
			}
			@Pc(8) Class3_Sub1_Sub1_Sub5 local8 = this.method387();
			if (local8 == null) {
				return null;
			}
			super.anInt691 = local8.anInt688;
			if (super.anInt709 != -1 && super.anInt710 != -1) {
				@Pc(36) Class39 local36 = Class39.aClass39Array1[super.anInt709];
				@Pc(39) Class3_Sub1_Sub1_Sub5 local39 = local36.method377();
				if (local39 != null) {
					@Pc(48) int local48 = local36.aClass30_2.anIntArray90[super.anInt710];
					@Pc(59) Class3_Sub1_Sub1_Sub5 local59 = new Class3_Sub1_Sub1_Sub5(true, local39, false, 8, Class5.method64(local48));
					local59.method409(-super.anInt713, 0, 0);
					local59.method403(956);
					local59.method404(936, local48);
					local59.anIntArrayArray15 = null;
					local59.anIntArrayArray14 = null;
					if (local36.anInt559 != 128 || local36.anInt560 != 128) {
						local59.method412(local36.anInt559, local36.anInt560, local36.anInt559);
					}
					local59.method413(local36.anInt562 + 64, local36.anInt563 + 850, -30, -50, -30, true);
					@Pc(122) Class3_Sub1_Sub1_Sub5[] local122 = new Class3_Sub1_Sub1_Sub5[] { local8, local59 };
					local8 = new Class3_Sub1_Sub1_Sub5(2, this.anInt613, local122, true);
				}
			}
			if (this.aClass2_1.aByte2 == 1) {
				local8.aBoolean139 = true;
			}
			return local8;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("81002, " + 93 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
