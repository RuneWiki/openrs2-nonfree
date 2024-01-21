import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KPZIZBER")
public final class Class8_Sub1_Sub1_Sub1_Sub1 extends Class8_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!KPZIZBER", name = "sb", descriptor = "Lclient!NIJEYEOX;")
	public Class26 aClass26_1;

	@OriginalMember(owner = "client!KPZIZBER", name = "rb", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!KPZIZBER", name = "a", descriptor = "(B)Lclient!JJMVUSJJ;")
	@Override
	protected Class8_Sub1_Sub1_Sub5 method533(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass26_1 == null) {
				return null;
			}
			@Pc(8) Class8_Sub1_Sub1_Sub5 local8 = this.method250();
			if (local8 == null) {
				return null;
			}
			super.anInt710 = local8.anInt786;
			if (super.anInt701 != -1 && super.anInt702 != -1) {
				@Pc(40) Class12 local40 = Class12.aClass12Array1[super.anInt701];
				@Pc(43) Class8_Sub1_Sub1_Sub5 local43 = local40.method75();
				if (local43 != null) {
					@Pc(52) int local52 = local40.aClass46_1.anIntArray194[super.anInt702];
					@Pc(63) Class8_Sub1_Sub1_Sub5 local63 = new Class8_Sub1_Sub1_Sub5(true, Class29.method309(local52), false, 9, local43);
					local63.method223(0, 161, -super.anInt705, 0);
					local63.method217(979);
					local63.method218(local52);
					local63.anIntArrayArray8 = null;
					local63.anIntArrayArray7 = null;
					if (local40.anInt104 != 128 || local40.anInt105 != 128) {
						local63.method226(local40.anInt105, local40.anInt104, local40.anInt104);
					}
					local63.method227(local40.anInt107 + 64, local40.anInt108 + 850, -30, -50, -30, true);
					@Pc(126) Class8_Sub1_Sub1_Sub5[] local126 = new Class8_Sub1_Sub1_Sub5[] { local8, local63 };
					local8 = new Class8_Sub1_Sub1_Sub5(local126, 976, 2, true);
				}
			}
			if (this.aClass26_1.aByte11 == 1) {
				local8.aBoolean69 = true;
			}
			return local8;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("78638, " + 7 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPZIZBER", name = "b", descriptor = "(I)Lclient!JJMVUSJJ;")
	private Class8_Sub1_Sub1_Sub5 method250() {
		try {
			@Pc(23) int local23;
			if (super.anInt711 < 0 || super.anInt714 != 0) {
				local23 = -1;
				if (super.anInt727 >= 0) {
					local23 = Class46.aClass46Array1[super.anInt727].anIntArray194[super.anInt728];
				}
				return this.aClass26_1.method295(local23, -1, null);
			}
			local23 = Class46.aClass46Array1[super.anInt711].anIntArray194[super.anInt712];
			@Pc(25) int local25 = -1;
			if (super.anInt727 >= 0 && super.anInt727 != super.anInt706) {
				local25 = Class46.aClass46Array1[super.anInt727].anIntArray194[super.anInt728];
			}
			return this.aClass26_1.method295(local23, local25, Class46.aClass46Array1[super.anInt711].anIntArray197);
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("71204, " + 0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPZIZBER", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method474(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
			return this.aClass26_1 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("86512, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
