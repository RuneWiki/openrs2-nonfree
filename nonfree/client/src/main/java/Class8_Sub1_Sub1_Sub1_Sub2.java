import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GYKYBIID")
public final class Class8_Sub1_Sub1_Sub1_Sub2 extends Class8_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!GYKYBIID", name = "pb", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!GYKYBIID", name = "sb", descriptor = "Lclient!YANZSPIT;")
	public Class45 aClass45_2;

	@OriginalMember(owner = "client!GYKYBIID", name = "qb", descriptor = "I")
	private int anInt235 = 41952;

	@OriginalMember(owner = "client!GYKYBIID", name = "rb", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!GYKYBIID", name = "c", descriptor = "(I)Lclient!KDWDYCIL;")
	private Class8_Sub1_Sub1_Sub3 method89() {
		try {
			@Pc(14) int local14;
			if (super.anInt215 < 0 || super.anInt218 != 0) {
				local14 = -1;
				if (super.anInt210 >= 0) {
					local14 = Class20.aClass20Array1[super.anInt210].anIntArray110[super.anInt211];
				}
				return this.aClass45_2.method518(null, local14, -1);
			}
			local14 = Class20.aClass20Array1[super.anInt215].anIntArray110[super.anInt216];
			@Pc(16) int local16 = -1;
			if (super.anInt210 >= 0 && super.anInt210 != super.anInt192) {
				local16 = Class20.aClass20Array1[super.anInt210].anIntArray110[super.anInt211];
			}
			return this.aClass45_2.method518(Class20.aClass20Array1[super.anInt215].anIntArray113, local14, local16);
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("13473, " + 778 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GYKYBIID", name = "a", descriptor = "(I)Lclient!KDWDYCIL;")
	@Override
	protected Class8_Sub1_Sub1_Sub3 method472() {
		try {
			if (this.aClass45_2 == null) {
				return null;
			}
			@Pc(18) Class8_Sub1_Sub1_Sub3 local18 = this.method89();
			if (local18 == null) {
				return null;
			}
			super.anInt194 = local18.anInt634;
			if (super.anInt220 != -1 && super.anInt221 != -1) {
				@Pc(39) Class32 local39 = Class32.aClass32Array1[super.anInt220];
				@Pc(42) Class8_Sub1_Sub1_Sub3 local42 = local39.method313();
				if (local42 != null) {
					@Pc(51) int local51 = local39.aClass20_2.anIntArray110[super.anInt221];
					@Pc(63) Class8_Sub1_Sub1_Sub3 local63 = new Class8_Sub1_Sub1_Sub3((byte) -48, false, local42, Class34.method331(local51, this.anInt235), true);
					local63.method149(0, -super.anInt224, 0);
					local63.method143();
					local63.method144(local51);
					local63.anIntArrayArray7 = null;
					local63.anIntArrayArray6 = null;
					if (local39.anInt515 != 128 || local39.anInt516 != 128) {
						local63.method152(local39.anInt515, local39.anInt515, local39.anInt516);
					}
					local63.method153(local39.anInt518 + 64, local39.anInt519 + 850, -30, -50, -30, true);
					@Pc(126) Class8_Sub1_Sub1_Sub3[] local126 = new Class8_Sub1_Sub1_Sub3[] { local18, local63 };
					local18 = new Class8_Sub1_Sub1_Sub3(local126, 2, true, -234);
				}
			}
			if (this.aClass45_2.aByte21 == 1) {
				local18.aBoolean67 = true;
			}
			return local18;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("96980, " + 9 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GYKYBIID", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method85() {
		try {
			return this.aClass45_2 != null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("29891, " + true + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
