import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class26 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!i;")
	public Class1_Sub5 aClass1_Sub5_1 = null;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
	public int anInt806 = -1;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Z")
	public boolean aBoolean51 = false;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "[I")
	public final int[] anIntArray114;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "[I")
	public final int[] anIntArray116;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "[I")
	public final int[] anIntArray118;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "[I")
	public final int[] anIntArray117;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([BLclient!i;)V")
	public Class26(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub5 arg1) {
		this.aClass1_Sub5_1 = arg1;
		@Pc(18) Class1_Sub6 local18 = new Class1_Sub6(arg0);
		@Pc(23) Class1_Sub6 local23 = new Class1_Sub6(arg0);
		local18.anInt2574 = 2;
		@Pc(30) int local30 = local18.method1837();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2574 = local18.anInt2574 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1837();
			if (local47 > 0) {
				if (this.aClass1_Sub5_1.anIntArray155[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass1_Sub5_1.anIntArray155[local59] == 0) {
							Static33.anIntArray119[local34] = local59;
							Static33.anIntArray115[local34] = 0;
							Static33.anIntArray113[local34] = 0;
							Static33.anIntArray112[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static33.anIntArray119[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass1_Sub5_1.anIntArray155[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static33.anIntArray115[local34] = local94;
				} else {
					Static33.anIntArray115[local34] = local23.method1834();
				}
				if ((local47 & 0x2) == 0) {
					Static33.anIntArray113[local34] = local94;
				} else {
					Static33.anIntArray113[local34] = local23.method1834();
				}
				if ((local47 & 0x4) == 0) {
					Static33.anIntArray112[local34] = local94;
				} else {
					Static33.anIntArray112[local34] = local23.method1834();
				}
				local32 = local42;
				local34++;
				if (this.aClass1_Sub5_1.anIntArray155[local42] == 5) {
					this.aBoolean51 = true;
				}
			}
		}
		if (local23.anInt2574 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt806 = local34;
		this.anIntArray114 = new int[local34];
		this.anIntArray116 = new int[local34];
		this.anIntArray118 = new int[local34];
		this.anIntArray117 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray114[local47] = Static33.anIntArray119[local47];
			this.anIntArray116[local47] = Static33.anIntArray115[local47];
			this.anIntArray118[local47] = Static33.anIntArray113[local47];
			this.anIntArray117[local47] = Static33.anIntArray112[local47];
		}
	}
}
