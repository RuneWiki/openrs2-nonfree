import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class40 {

	@OriginalMember(owner = "client!o", name = "i", descriptor = "I")
	public int anInt2231 = -1;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "Z")
	public boolean aBoolean114 = false;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Lclient!hd;")
	public Class2_Sub11 aClass2_Sub11_1 = null;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
	public final int[] anIntArray308;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "[I")
	public final int[] anIntArray309;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "[I")
	public final int[] anIntArray311;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
	public final int[] anIntArray304;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "([BLclient!hd;)V")
	public Class40(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		this.aClass2_Sub11_1 = arg1;
		@Pc(18) Class2_Sub6 local18 = new Class2_Sub6(arg0);
		@Pc(23) Class2_Sub6 local23 = new Class2_Sub6(arg0);
		local18.anInt952 = 2;
		@Pc(30) int local30 = local18.method665();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt952 = local18.anInt952 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method665();
			if (local47 > 0) {
				if (this.aClass2_Sub11_1.anIntArray225[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass2_Sub11_1.anIntArray225[local59] == 0) {
							Static71.anIntArray310[local34] = local59;
							Static71.anIntArray305[local34] = 0;
							Static71.anIntArray307[local34] = 0;
							Static71.anIntArray306[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static71.anIntArray310[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass2_Sub11_1.anIntArray225[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static71.anIntArray305[local34] = local94;
				} else {
					Static71.anIntArray305[local34] = local23.method664();
				}
				if ((local47 & 0x2) == 0) {
					Static71.anIntArray307[local34] = local94;
				} else {
					Static71.anIntArray307[local34] = local23.method664();
				}
				if ((local47 & 0x4) == 0) {
					Static71.anIntArray306[local34] = local94;
				} else {
					Static71.anIntArray306[local34] = local23.method664();
				}
				local32 = local42;
				local34++;
				if (this.aClass2_Sub11_1.anIntArray225[local42] == 5) {
					this.aBoolean114 = true;
				}
			}
		}
		if (local23.anInt952 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2231 = local34;
		this.anIntArray308 = new int[local34];
		this.anIntArray309 = new int[local34];
		this.anIntArray311 = new int[local34];
		this.anIntArray304 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray308[local47] = Static71.anIntArray310[local47];
			this.anIntArray309[local47] = Static71.anIntArray305[local47];
			this.anIntArray311[local47] = Static71.anIntArray307[local47];
			this.anIntArray304[local47] = Static71.anIntArray306[local47];
		}
	}
}
