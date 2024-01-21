import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class25 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Z")
	public boolean aBoolean78 = false;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
	public int anInt1135 = -1;

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "Lclient!ta;")
	public Class3_Sub21 aClass3_Sub21_1 = null;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "[I")
	public final int[] anIntArray102;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "[I")
	public final int[] anIntArray103;

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "[I")
	public final int[] anIntArray105;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "[I")
	public final int[] anIntArray104;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "([BLclient!ta;)V")
	public Class25(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub21 arg1) {
		this.aClass3_Sub21_1 = arg1;
		@Pc(18) Class3_Sub12 local18 = new Class3_Sub12(arg0);
		@Pc(23) Class3_Sub12 local23 = new Class3_Sub12(arg0);
		local18.anInt1793 = 2;
		@Pc(30) int local30 = local18.method1354();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1793 = local18.anInt1793 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1354();
			if (local47 > 0) {
				if (this.aClass3_Sub21_1.anIntArray369[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass3_Sub21_1.anIntArray369[local59] == 0) {
							Static49.anIntArray100[local34] = local59;
							Static49.anIntArray106[local34] = 0;
							Static49.anIntArray101[local34] = 0;
							Static49.anIntArray107[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static49.anIntArray100[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass3_Sub21_1.anIntArray369[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static49.anIntArray106[local34] = local94;
				} else {
					Static49.anIntArray106[local34] = local23.method1366();
				}
				if ((local47 & 0x2) == 0) {
					Static49.anIntArray101[local34] = local94;
				} else {
					Static49.anIntArray101[local34] = local23.method1366();
				}
				if ((local47 & 0x4) == 0) {
					Static49.anIntArray107[local34] = local94;
				} else {
					Static49.anIntArray107[local34] = local23.method1366();
				}
				local32 = local42;
				local34++;
				if (this.aClass3_Sub21_1.anIntArray369[local42] == 5) {
					this.aBoolean78 = true;
				}
			}
		}
		if (local23.anInt1793 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1135 = local34;
		this.anIntArray102 = new int[local34];
		this.anIntArray103 = new int[local34];
		this.anIntArray105 = new int[local34];
		this.anIntArray104 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray102[local47] = Static49.anIntArray100[local47];
			this.anIntArray103[local47] = Static49.anIntArray106[local47];
			this.anIntArray105[local47] = Static49.anIntArray101[local47];
			this.anIntArray104[local47] = Static49.anIntArray107[local47];
		}
	}
}
