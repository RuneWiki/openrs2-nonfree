import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class69 {

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!ge;")
	public Class2_Sub6 aClass2_Sub6_1 = null;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
	public int anInt2995 = -1;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "[I")
	public final int[] anIntArray356;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "[I")
	public final int[] anIntArray360;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
	public final int[] anIntArray357;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "[I")
	public final int[] anIntArray354;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([BLclient!ge;)V")
	public Class69(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub6 arg1) {
		this.aClass2_Sub6_1 = arg1;
		@Pc(18) Class2_Sub12 local18 = new Class2_Sub12(arg0);
		@Pc(23) Class2_Sub12 local23 = new Class2_Sub12(arg0);
		local18.anInt1939 = 2;
		@Pc(30) int local30 = local18.method1399();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1939 = local18.anInt1939 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1399();
			if (local47 > 0) {
				if (this.aClass2_Sub6_1.anIntArray129[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass2_Sub6_1.anIntArray129[local59] == 0) {
							Static116.anIntArray359[local34] = local59;
							Static116.anIntArray353[local34] = 0;
							Static116.anIntArray355[local34] = 0;
							Static116.anIntArray358[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static116.anIntArray359[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass2_Sub6_1.anIntArray129[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static116.anIntArray353[local34] = local94;
				} else {
					Static116.anIntArray353[local34] = local23.method1407();
				}
				if ((local47 & 0x2) == 0) {
					Static116.anIntArray355[local34] = local94;
				} else {
					Static116.anIntArray355[local34] = local23.method1407();
				}
				if ((local47 & 0x4) == 0) {
					Static116.anIntArray358[local34] = local94;
				} else {
					Static116.anIntArray358[local34] = local23.method1407();
				}
				local32 = local42;
				local34++;
				if (this.aClass2_Sub6_1.anIntArray129[local42] == 5) {
					this.aBoolean139 = true;
				}
			}
		}
		if (local23.anInt1939 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2995 = local34;
		this.anIntArray356 = new int[local34];
		this.anIntArray360 = new int[local34];
		this.anIntArray357 = new int[local34];
		this.anIntArray354 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray356[local47] = Static116.anIntArray359[local47];
			this.anIntArray360[local47] = Static116.anIntArray353[local47];
			this.anIntArray357[local47] = Static116.anIntArray355[local47];
			this.anIntArray354[local47] = Static116.anIntArray358[local47];
		}
	}
}
