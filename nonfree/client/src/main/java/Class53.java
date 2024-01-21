import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class53 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!u;")
	public Class3_Sub12 aClass3_Sub12_1 = null;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "Z")
	public boolean aBoolean103 = false;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
	public int anInt2173 = -1;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "[I")
	public final int[] anIntArray243;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "[I")
	public final int[] anIntArray240;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "[I")
	public final int[] anIntArray244;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "[I")
	public final int[] anIntArray242;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([BLclient!u;)V")
	public Class53(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub12 arg1) {
		this.aClass3_Sub12_1 = arg1;
		@Pc(18) Class3_Sub6 local18 = new Class3_Sub6(arg0);
		@Pc(23) Class3_Sub6 local23 = new Class3_Sub6(arg0);
		local18.anInt2416 = 2;
		@Pc(30) int local30 = local18.method1587();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2416 = local18.anInt2416 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1587();
			if (local47 > 0) {
				if (this.aClass3_Sub12_1.anIntArray314[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass3_Sub12_1.anIntArray314[local59] == 0) {
							Static86.anIntArray238[local34] = local59;
							Static86.anIntArray239[local34] = 0;
							Static86.anIntArray241[local34] = 0;
							Static86.anIntArray245[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static86.anIntArray238[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass3_Sub12_1.anIntArray314[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static86.anIntArray239[local34] = local94;
				} else {
					Static86.anIntArray239[local34] = local23.method1620();
				}
				if ((local47 & 0x2) == 0) {
					Static86.anIntArray241[local34] = local94;
				} else {
					Static86.anIntArray241[local34] = local23.method1620();
				}
				if ((local47 & 0x4) == 0) {
					Static86.anIntArray245[local34] = local94;
				} else {
					Static86.anIntArray245[local34] = local23.method1620();
				}
				local32 = local42;
				local34++;
				if (this.aClass3_Sub12_1.anIntArray314[local42] == 5) {
					this.aBoolean103 = true;
				}
			}
		}
		if (local23.anInt2416 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2173 = local34;
		this.anIntArray243 = new int[local34];
		this.anIntArray240 = new int[local34];
		this.anIntArray244 = new int[local34];
		this.anIntArray242 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray243[local47] = Static86.anIntArray238[local47];
			this.anIntArray240[local47] = Static86.anIntArray239[local47];
			this.anIntArray244[local47] = Static86.anIntArray241[local47];
			this.anIntArray242[local47] = Static86.anIntArray245[local47];
		}
	}
}
