import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class44 {

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
	public int anInt2178 = -1;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Z")
	public boolean aBoolean114 = false;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!ea;")
	public Class2_Sub5 aClass2_Sub5_1 = null;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "[I")
	public final int[] anIntArray299;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "[I")
	public final int[] anIntArray298;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "[I")
	public final int[] anIntArray292;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "[I")
	public final int[] anIntArray294;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([BLclient!ea;)V")
	public Class44(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		this.aClass2_Sub5_1 = arg1;
		@Pc(18) Class2_Sub8 local18 = new Class2_Sub8(arg0);
		@Pc(23) Class2_Sub8 local23 = new Class2_Sub8(arg0);
		local18.anInt2342 = 2;
		@Pc(30) int local30 = local18.method1410();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2342 = local18.anInt2342 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1410();
			if (local47 > 0) {
				if (this.aClass2_Sub5_1.anIntArray96[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass2_Sub5_1.anIntArray96[local59] == 0) {
							Static73.anIntArray296[local34] = local59;
							Static73.anIntArray293[local34] = 0;
							Static73.anIntArray295[local34] = 0;
							Static73.anIntArray297[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static73.anIntArray296[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass2_Sub5_1.anIntArray96[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static73.anIntArray293[local34] = local94;
				} else {
					Static73.anIntArray293[local34] = local23.method1399();
				}
				if ((local47 & 0x2) == 0) {
					Static73.anIntArray295[local34] = local94;
				} else {
					Static73.anIntArray295[local34] = local23.method1399();
				}
				if ((local47 & 0x4) == 0) {
					Static73.anIntArray297[local34] = local94;
				} else {
					Static73.anIntArray297[local34] = local23.method1399();
				}
				local32 = local42;
				local34++;
				if (this.aClass2_Sub5_1.anIntArray96[local42] == 5) {
					this.aBoolean114 = true;
				}
			}
		}
		if (local23.anInt2342 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2178 = local34;
		this.anIntArray299 = new int[local34];
		this.anIntArray298 = new int[local34];
		this.anIntArray292 = new int[local34];
		this.anIntArray294 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray299[local47] = Static73.anIntArray296[local47];
			this.anIntArray298[local47] = Static73.anIntArray293[local47];
			this.anIntArray292[local47] = Static73.anIntArray295[local47];
			this.anIntArray294[local47] = Static73.anIntArray297[local47];
		}
	}
}
