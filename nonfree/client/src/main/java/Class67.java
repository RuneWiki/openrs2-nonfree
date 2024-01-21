import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class67 {

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
	public boolean aBoolean82 = false;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Lclient!te;")
	public Class4_Sub20 aClass4_Sub20_1 = null;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
	public int anInt2257 = -1;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "[I")
	public final int[] anIntArray289;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "[I")
	public final int[] anIntArray287;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "[I")
	public final int[] anIntArray290;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "[I")
	public final int[] anIntArray293;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([BLclient!te;)V")
	public Class67(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		this.aClass4_Sub20_1 = arg1;
		@Pc(18) Class4_Sub9 local18 = new Class4_Sub9(arg0);
		@Pc(23) Class4_Sub9 local23 = new Class4_Sub9(arg0);
		local18.anInt1312 = 2;
		@Pc(30) int local30 = local18.method773();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1312 = local18.anInt1312 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method773();
			if (local47 > 0) {
				if (this.aClass4_Sub20_1.anIntArray335[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass4_Sub20_1.anIntArray335[local59] == 0) {
							Static95.anIntArray291[local34] = local59;
							Static95.anIntArray288[local34] = 0;
							Static95.anIntArray292[local34] = 0;
							Static95.anIntArray286[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static95.anIntArray291[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass4_Sub20_1.anIntArray335[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static95.anIntArray288[local34] = local94;
				} else {
					Static95.anIntArray288[local34] = local23.method815();
				}
				if ((local47 & 0x2) == 0) {
					Static95.anIntArray292[local34] = local94;
				} else {
					Static95.anIntArray292[local34] = local23.method815();
				}
				if ((local47 & 0x4) == 0) {
					Static95.anIntArray286[local34] = local94;
				} else {
					Static95.anIntArray286[local34] = local23.method815();
				}
				local32 = local42;
				local34++;
				if (this.aClass4_Sub20_1.anIntArray335[local42] == 5) {
					this.aBoolean82 = true;
				}
			}
		}
		if (local23.anInt1312 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2257 = local34;
		this.anIntArray289 = new int[local34];
		this.anIntArray287 = new int[local34];
		this.anIntArray290 = new int[local34];
		this.anIntArray293 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray289[local47] = Static95.anIntArray291[local47];
			this.anIntArray287[local47] = Static95.anIntArray288[local47];
			this.anIntArray290[local47] = Static95.anIntArray292[local47];
			this.anIntArray293[local47] = Static95.anIntArray286[local47];
		}
	}
}
