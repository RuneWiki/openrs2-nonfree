import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BFCMZACY")
public final class Class2_Sub1_Sub1_Sub1_Sub1 extends Class2_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!BFCMZACY", name = "tb", descriptor = "Lclient!SHKUIFHF;")
	public Class32 aClass32_1;

	@OriginalMember(owner = "client!BFCMZACY", name = "rb", descriptor = "B")
	private byte aByte3 = 7;

	@OriginalMember(owner = "client!BFCMZACY", name = "sb", descriptor = "I")
	private int anInt113 = 122;

	@OriginalMember(owner = "client!BFCMZACY", name = "a", descriptor = "(B)Lclient!XBVYIDUH;")
	@Override
	protected Class2_Sub1_Sub1_Sub6 method507(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass32_1 == null) {
				return null;
			}
			@Pc(18) Class2_Sub1_Sub1_Sub6 local18 = this.method64();
			if (local18 == null) {
				return null;
			}
			super.anInt356 = local18.anInt754;
			if (super.anInt332 != -1 && super.anInt333 != -1) {
				@Pc(39) Class6 local39 = Class6.aClass6Array1[super.anInt332];
				@Pc(42) Class2_Sub1_Sub1_Sub6 local42 = local39.method194();
				if (local42 != null) {
					@Pc(51) int local51 = local39.aClass33_1.anIntArray115[super.anInt333];
					@Pc(63) Class2_Sub1_Sub1_Sub6 local63 = new Class2_Sub1_Sub1_Sub6(Class4.method168(this.aByte3, local51), (byte) 9, true, false, local42);
					local63.method525(0, 0, -super.anInt336);
					local63.method519();
					local63.method520(local51);
					local63.anIntArrayArray17 = null;
					local63.anIntArrayArray16 = null;
					if (local39.anInt189 != 128 || local39.anInt190 != 128) {
						local63.method528(local39.anInt190, local39.anInt189, local39.anInt189);
					}
					local63.method529(local39.anInt192 + 64, local39.anInt193 + 850, -30, -50, -30, true);
					@Pc(126) Class2_Sub1_Sub1_Sub6[] local126 = new Class2_Sub1_Sub1_Sub6[] { local18, local63 };
					local18 = new Class2_Sub1_Sub1_Sub6(true, 2, local126, false);
				}
			}
			if (this.aClass32_1.aByte33 == 1) {
				local18.aBoolean189 = true;
			}
			return local18;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("84921, " + 3 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFCMZACY", name = "b", descriptor = "(Z)Lclient!XBVYIDUH;")
	private Class2_Sub1_Sub1_Sub6 method64() {
		try {
			@Pc(14) int local14;
			if (super.anInt316 < 0 || super.anInt319 != 0) {
				local14 = -1;
				if (super.anInt324 >= 0) {
					local14 = Class33.aClass33Array1[super.anInt324].anIntArray115[super.anInt325];
				}
				return this.aClass32_1.method456(-1, local14, null);
			}
			local14 = Class33.aClass33Array1[super.anInt316].anIntArray115[super.anInt317];
			@Pc(16) int local16 = -1;
			if (super.anInt324 >= 0 && super.anInt324 != super.anInt309) {
				local16 = Class33.aClass33Array1[super.anInt324].anIntArray115[super.anInt325];
			}
			return this.aClass32_1.method456(local16, local14, Class33.aClass33Array1[super.anInt316].anIntArray118);
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("75261, " + true + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFCMZACY", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method221(@OriginalArg(0) int arg0) {
		try {
			return this.aClass32_1 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("40053, " + 122 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
