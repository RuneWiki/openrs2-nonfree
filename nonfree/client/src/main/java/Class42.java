import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class42 {

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "Z")
	public boolean aBoolean73 = false;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
	public int anInt1915 = -1;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "Lclient!sc;")
	public Class2_Sub20 aClass2_Sub20_1 = null;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "[I")
	public final int[] anIntArray127;

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "[I")
	public final int[] anIntArray132;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "[I")
	public final int[] anIntArray131;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "[I")
	public final int[] anIntArray126;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([BLclient!sc;)V")
	public Class42(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		this.aClass2_Sub20_1 = arg1;
		@Pc(18) Class2_Sub13 local18 = new Class2_Sub13(arg0);
		@Pc(23) Class2_Sub13 local23 = new Class2_Sub13(arg0);
		local18.anInt2154 = 2;
		@Pc(30) int local30 = local18.method1402();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2154 = local18.anInt2154 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1402();
			if (local47 > 0) {
				if (this.aClass2_Sub20_1.anIntArray311[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass2_Sub20_1.anIntArray311[local59] == 0) {
							Static78.anIntArray128[local34] = local59;
							Static78.anIntArray130[local34] = 0;
							Static78.anIntArray133[local34] = 0;
							Static78.anIntArray129[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static78.anIntArray128[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass2_Sub20_1.anIntArray311[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static78.anIntArray130[local34] = local94;
				} else {
					Static78.anIntArray130[local34] = local23.method1429();
				}
				if ((local47 & 0x2) == 0) {
					Static78.anIntArray133[local34] = local94;
				} else {
					Static78.anIntArray133[local34] = local23.method1429();
				}
				if ((local47 & 0x4) == 0) {
					Static78.anIntArray129[local34] = local94;
				} else {
					Static78.anIntArray129[local34] = local23.method1429();
				}
				local32 = local42;
				local34++;
				if (this.aClass2_Sub20_1.anIntArray311[local42] == 5) {
					this.aBoolean73 = true;
				}
			}
		}
		if (local23.anInt2154 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1915 = local34;
		this.anIntArray127 = new int[local34];
		this.anIntArray132 = new int[local34];
		this.anIntArray131 = new int[local34];
		this.anIntArray126 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray127[local47] = Static78.anIntArray128[local47];
			this.anIntArray132[local47] = Static78.anIntArray130[local47];
			this.anIntArray131[local47] = Static78.anIntArray133[local47];
			this.anIntArray126[local47] = Static78.anIntArray129[local47];
		}
	}
}
