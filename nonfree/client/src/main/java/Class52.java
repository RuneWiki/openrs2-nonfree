import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class52 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public int anInt2295 = -1;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Z")
	public boolean aBoolean108 = false;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!vb;")
	public Class6_Sub14 aClass6_Sub14_1 = null;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "[I")
	public final int[] anIntArray229;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "[I")
	public final int[] anIntArray225;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "[I")
	public final int[] anIntArray228;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "[I")
	public final int[] anIntArray226;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([BLclient!vb;)V")
	public Class52(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class6_Sub14 arg1) {
		this.aClass6_Sub14_1 = arg1;
		@Pc(18) Class6_Sub1 local18 = new Class6_Sub1(arg0);
		@Pc(23) Class6_Sub1 local23 = new Class6_Sub1(arg0);
		local18.anInt2209 = 2;
		@Pc(30) int local30 = local18.method1495();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2209 = local18.anInt2209 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1495();
			if (local47 > 0) {
				if (this.aClass6_Sub14_1.anIntArray291[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass6_Sub14_1.anIntArray291[local59] == 0) {
							Static80.anIntArray227[local34] = local59;
							Static80.anIntArray223[local34] = 0;
							Static80.anIntArray222[local34] = 0;
							Static80.anIntArray224[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static80.anIntArray227[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass6_Sub14_1.anIntArray291[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static80.anIntArray223[local34] = local94;
				} else {
					Static80.anIntArray223[local34] = local23.method1492();
				}
				if ((local47 & 0x2) == 0) {
					Static80.anIntArray222[local34] = local94;
				} else {
					Static80.anIntArray222[local34] = local23.method1492();
				}
				if ((local47 & 0x4) == 0) {
					Static80.anIntArray224[local34] = local94;
				} else {
					Static80.anIntArray224[local34] = local23.method1492();
				}
				local32 = local42;
				local34++;
				if (this.aClass6_Sub14_1.anIntArray291[local42] == 5) {
					this.aBoolean108 = true;
				}
			}
		}
		if (local23.anInt2209 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2295 = local34;
		this.anIntArray229 = new int[local34];
		this.anIntArray225 = new int[local34];
		this.anIntArray228 = new int[local34];
		this.anIntArray226 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray229[local47] = Static80.anIntArray227[local47];
			this.anIntArray225[local47] = Static80.anIntArray223[local47];
			this.anIntArray228[local47] = Static80.anIntArray222[local47];
			this.anIntArray226[local47] = Static80.anIntArray224[local47];
		}
	}
}
