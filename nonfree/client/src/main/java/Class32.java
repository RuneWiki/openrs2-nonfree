import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class32 {

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!tc;")
	public Class3_Sub12 aClass3_Sub12_1 = null;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "Z")
	public boolean aBoolean70 = false;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
	public int anInt1221 = -1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "[I")
	public final int[] anIntArray85;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "[I")
	public final int[] anIntArray92;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "[I")
	public final int[] anIntArray88;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "[I")
	public final int[] anIntArray91;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([BLclient!tc;)V")
	public Class32(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub12 arg1) {
		this.aClass3_Sub12_1 = arg1;
		@Pc(18) Class3_Sub8 local18 = new Class3_Sub8(arg0);
		@Pc(23) Class3_Sub8 local23 = new Class3_Sub8(arg0);
		local18.anInt2704 = 2;
		@Pc(30) int local30 = local18.method1803();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2704 = local18.anInt2704 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1803();
			if (local47 > 0) {
				if (this.aClass3_Sub12_1.anIntArray277[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass3_Sub12_1.anIntArray277[local59] == 0) {
							Static43.anIntArray86[local34] = local59;
							Static43.anIntArray89[local34] = 0;
							Static43.anIntArray87[local34] = 0;
							Static43.anIntArray90[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static43.anIntArray86[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass3_Sub12_1.anIntArray277[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static43.anIntArray89[local34] = local94;
				} else {
					Static43.anIntArray89[local34] = local23.method1778();
				}
				if ((local47 & 0x2) == 0) {
					Static43.anIntArray87[local34] = local94;
				} else {
					Static43.anIntArray87[local34] = local23.method1778();
				}
				if ((local47 & 0x4) == 0) {
					Static43.anIntArray90[local34] = local94;
				} else {
					Static43.anIntArray90[local34] = local23.method1778();
				}
				local32 = local42;
				local34++;
				if (this.aClass3_Sub12_1.anIntArray277[local42] == 5) {
					this.aBoolean70 = true;
				}
			}
		}
		if (local23.anInt2704 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1221 = local34;
		this.anIntArray85 = new int[local34];
		this.anIntArray92 = new int[local34];
		this.anIntArray88 = new int[local34];
		this.anIntArray91 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray85[local47] = Static43.anIntArray86[local47];
			this.anIntArray92[local47] = Static43.anIntArray89[local47];
			this.anIntArray88[local47] = Static43.anIntArray87[local47];
			this.anIntArray91[local47] = Static43.anIntArray90[local47];
		}
	}
}
