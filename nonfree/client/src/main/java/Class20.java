import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class20 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
	public boolean aBoolean34 = false;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	public int anInt806 = -1;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!de;")
	public Class3_Sub5 aClass3_Sub5_1 = null;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "[I")
	public final int[] anIntArray88;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
	public final int[] anIntArray93;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
	public final int[] anIntArray89;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[I")
	public final int[] anIntArray92;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([BLclient!de;)V")
	public Class20(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub5 arg1) {
		this.aClass3_Sub5_1 = arg1;
		@Pc(18) Class3_Sub7 local18 = new Class3_Sub7(arg0);
		@Pc(23) Class3_Sub7 local23 = new Class3_Sub7(arg0);
		local18.anInt964 = 2;
		@Pc(30) int local30 = local18.method647();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt964 = local18.anInt964 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method647();
			if (local47 > 0) {
				if (this.aClass3_Sub5_1.anIntArray74[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass3_Sub5_1.anIntArray74[local59] == 0) {
							Static26.anIntArray90[local34] = local59;
							Static26.anIntArray91[local34] = 0;
							Static26.anIntArray94[local34] = 0;
							Static26.anIntArray95[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static26.anIntArray90[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass3_Sub5_1.anIntArray74[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static26.anIntArray91[local34] = local94;
				} else {
					Static26.anIntArray91[local34] = local23.method635();
				}
				if ((local47 & 0x2) == 0) {
					Static26.anIntArray94[local34] = local94;
				} else {
					Static26.anIntArray94[local34] = local23.method635();
				}
				if ((local47 & 0x4) == 0) {
					Static26.anIntArray95[local34] = local94;
				} else {
					Static26.anIntArray95[local34] = local23.method635();
				}
				local32 = local42;
				local34++;
				if (this.aClass3_Sub5_1.anIntArray74[local42] == 5) {
					this.aBoolean34 = true;
				}
			}
		}
		if (local23.anInt964 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt806 = local34;
		this.anIntArray88 = new int[local34];
		this.anIntArray93 = new int[local34];
		this.anIntArray89 = new int[local34];
		this.anIntArray92 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray88[local47] = Static26.anIntArray90[local47];
			this.anIntArray93[local47] = Static26.anIntArray91[local47];
			this.anIntArray89[local47] = Static26.anIntArray94[local47];
			this.anIntArray92[local47] = Static26.anIntArray95[local47];
		}
	}
}
