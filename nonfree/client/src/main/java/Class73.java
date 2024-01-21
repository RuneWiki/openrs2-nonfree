import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class73 {

	@OriginalMember(owner = "client!te", name = "b", descriptor = "Lclient!dd;")
	public Class2_Sub7 aClass2_Sub7_1 = null;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "Z")
	public boolean aBoolean105 = false;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "I")
	public int anInt2462 = -1;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "[I")
	public final int[] anIntArray358;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "[I")
	public final int[] anIntArray355;

	@OriginalMember(owner = "client!te", name = "h", descriptor = "[I")
	public final int[] anIntArray357;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "[I")
	public final int[] anIntArray360;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "([BLclient!dd;)V")
	public Class73(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		this.aClass2_Sub7_1 = arg1;
		@Pc(18) Class2_Sub10 local18 = new Class2_Sub10(arg0);
		@Pc(23) Class2_Sub10 local23 = new Class2_Sub10(arg0);
		local18.anInt2187 = 2;
		@Pc(30) int local30 = local18.method1514();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2187 = local18.anInt2187 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1514();
			if (local47 > 0) {
				if (this.aClass2_Sub7_1.anIntArray64[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass2_Sub7_1.anIntArray64[local59] == 0) {
							Static115.anIntArray353[local34] = local59;
							Static115.anIntArray354[local34] = 0;
							Static115.anIntArray359[local34] = 0;
							Static115.anIntArray356[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static115.anIntArray353[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass2_Sub7_1.anIntArray64[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static115.anIntArray354[local34] = local94;
				} else {
					Static115.anIntArray354[local34] = local23.method1513();
				}
				if ((local47 & 0x2) == 0) {
					Static115.anIntArray359[local34] = local94;
				} else {
					Static115.anIntArray359[local34] = local23.method1513();
				}
				if ((local47 & 0x4) == 0) {
					Static115.anIntArray356[local34] = local94;
				} else {
					Static115.anIntArray356[local34] = local23.method1513();
				}
				local32 = local42;
				local34++;
				if (this.aClass2_Sub7_1.anIntArray64[local42] == 5) {
					this.aBoolean105 = true;
				}
			}
		}
		if (local23.anInt2187 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2462 = local34;
		this.anIntArray358 = new int[local34];
		this.anIntArray355 = new int[local34];
		this.anIntArray357 = new int[local34];
		this.anIntArray360 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray358[local47] = Static115.anIntArray353[local47];
			this.anIntArray355[local47] = Static115.anIntArray354[local47];
			this.anIntArray357[local47] = Static115.anIntArray359[local47];
			this.anIntArray360[local47] = Static115.anIntArray356[local47];
		}
	}
}
