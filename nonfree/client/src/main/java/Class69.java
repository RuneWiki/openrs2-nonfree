import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class69 {

	@OriginalMember(owner = "client!td", name = "j", descriptor = "Z")
	public boolean aBoolean213 = false;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "I")
	public int anInt2882 = -1;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Lclient!la;")
	public Class2_Sub9 aClass2_Sub9_1 = null;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "[I")
	public final int[] anIntArray370;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "[I")
	public final int[] anIntArray374;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "[I")
	public final int[] anIntArray371;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "[I")
	public final int[] anIntArray373;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "([BLclient!la;)V")
	public Class69(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub9 arg1) {
		this.aClass2_Sub9_1 = arg1;
		@Pc(18) Class2_Sub17 local18 = new Class2_Sub17(arg0);
		@Pc(23) Class2_Sub17 local23 = new Class2_Sub17(arg0);
		local18.anInt2799 = 2;
		@Pc(30) int local30 = local18.method1780();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2799 = local18.anInt2799 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1780();
			if (local47 > 0) {
				if (this.aClass2_Sub9_1.anIntArray233[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass2_Sub9_1.anIntArray233[local59] == 0) {
							Static109.anIntArray375[local34] = local59;
							Static109.anIntArray372[local34] = 0;
							Static109.anIntArray369[local34] = 0;
							Static109.anIntArray368[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static109.anIntArray375[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass2_Sub9_1.anIntArray233[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static109.anIntArray372[local34] = local94;
				} else {
					Static109.anIntArray372[local34] = local23.method1791();
				}
				if ((local47 & 0x2) == 0) {
					Static109.anIntArray369[local34] = local94;
				} else {
					Static109.anIntArray369[local34] = local23.method1791();
				}
				if ((local47 & 0x4) == 0) {
					Static109.anIntArray368[local34] = local94;
				} else {
					Static109.anIntArray368[local34] = local23.method1791();
				}
				local32 = local42;
				local34++;
				if (this.aClass2_Sub9_1.anIntArray233[local42] == 5) {
					this.aBoolean213 = true;
				}
			}
		}
		if (local23.anInt2799 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2882 = local34;
		this.anIntArray370 = new int[local34];
		this.anIntArray374 = new int[local34];
		this.anIntArray371 = new int[local34];
		this.anIntArray373 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray370[local47] = Static109.anIntArray375[local47];
			this.anIntArray374[local47] = Static109.anIntArray372[local47];
			this.anIntArray371[local47] = Static109.anIntArray369[local47];
			this.anIntArray373[local47] = Static109.anIntArray368[local47];
		}
	}
}
