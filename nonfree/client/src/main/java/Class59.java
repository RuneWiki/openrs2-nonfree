import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class59 {

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!mc;")
	public Class1_Sub15 aClass1_Sub15_1 = null;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	public int anInt2339 = -1;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Z")
	public boolean aBoolean92 = false;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "[I")
	public final int[] anIntArray354;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "[I")
	public final int[] anIntArray358;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
	public final int[] anIntArray359;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "[I")
	public final int[] anIntArray357;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "([BLclient!mc;)V")
	public Class59(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub15 arg1) {
		this.aClass1_Sub15_1 = arg1;
		@Pc(18) Class1_Sub20 local18 = new Class1_Sub20(arg0);
		@Pc(23) Class1_Sub20 local23 = new Class1_Sub20(arg0);
		local18.anInt2951 = 2;
		@Pc(30) int local30 = local18.method2053();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2951 = local18.anInt2951 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method2053();
			if (local47 > 0) {
				if (this.aClass1_Sub15_1.anIntArray298[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass1_Sub15_1.anIntArray298[local59] == 0) {
							Static94.anIntArray360[local34] = local59;
							Static94.anIntArray361[local34] = 0;
							Static94.anIntArray356[local34] = 0;
							Static94.anIntArray355[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static94.anIntArray360[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass1_Sub15_1.anIntArray298[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static94.anIntArray361[local34] = local94;
				} else {
					Static94.anIntArray361[local34] = local23.method2080();
				}
				if ((local47 & 0x2) == 0) {
					Static94.anIntArray356[local34] = local94;
				} else {
					Static94.anIntArray356[local34] = local23.method2080();
				}
				if ((local47 & 0x4) == 0) {
					Static94.anIntArray355[local34] = local94;
				} else {
					Static94.anIntArray355[local34] = local23.method2080();
				}
				local32 = local42;
				local34++;
				if (this.aClass1_Sub15_1.anIntArray298[local42] == 5) {
					this.aBoolean92 = true;
				}
			}
		}
		if (local23.anInt2951 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2339 = local34;
		this.anIntArray354 = new int[local34];
		this.anIntArray358 = new int[local34];
		this.anIntArray359 = new int[local34];
		this.anIntArray357 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray354[local47] = Static94.anIntArray360[local47];
			this.anIntArray358[local47] = Static94.anIntArray361[local47];
			this.anIntArray359[local47] = Static94.anIntArray356[local47];
			this.anIntArray357[local47] = Static94.anIntArray355[local47];
		}
	}
}
