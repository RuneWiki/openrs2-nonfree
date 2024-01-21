import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class30 {

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!ff;")
	public Class1_Sub6 aClass1_Sub6_1 = null;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Z")
	public boolean aBoolean49 = false;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	public int anInt1156 = -1;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
	public final int[] anIntArray232;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "[I")
	public final int[] anIntArray227;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "[I")
	public final int[] anIntArray231;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "[I")
	public final int[] anIntArray233;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([BLclient!ff;)V")
	public Class30(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub6 arg1) {
		this.aClass1_Sub6_1 = arg1;
		@Pc(18) Class1_Sub5 local18 = new Class1_Sub5(arg0);
		@Pc(23) Class1_Sub5 local23 = new Class1_Sub5(arg0);
		local18.anInt792 = 2;
		@Pc(30) int local30 = local18.method672();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt792 = local18.anInt792 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method672();
			if (local47 > 0) {
				if (this.aClass1_Sub6_1.anIntArray194[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass1_Sub6_1.anIntArray194[local59] == 0) {
							Static44.anIntArray229[local34] = local59;
							Static44.anIntArray228[local34] = 0;
							Static44.anIntArray234[local34] = 0;
							Static44.anIntArray230[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static44.anIntArray229[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass1_Sub6_1.anIntArray194[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static44.anIntArray228[local34] = local94;
				} else {
					Static44.anIntArray228[local34] = local23.method636();
				}
				if ((local47 & 0x2) == 0) {
					Static44.anIntArray234[local34] = local94;
				} else {
					Static44.anIntArray234[local34] = local23.method636();
				}
				if ((local47 & 0x4) == 0) {
					Static44.anIntArray230[local34] = local94;
				} else {
					Static44.anIntArray230[local34] = local23.method636();
				}
				local32 = local42;
				local34++;
				if (this.aClass1_Sub6_1.anIntArray194[local42] == 5) {
					this.aBoolean49 = true;
				}
			}
		}
		if (local23.anInt792 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1156 = local34;
		this.anIntArray232 = new int[local34];
		this.anIntArray227 = new int[local34];
		this.anIntArray231 = new int[local34];
		this.anIntArray233 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray232[local47] = Static44.anIntArray229[local47];
			this.anIntArray227[local47] = Static44.anIntArray228[local47];
			this.anIntArray231[local47] = Static44.anIntArray234[local47];
			this.anIntArray233[local47] = Static44.anIntArray230[local47];
		}
	}
}
