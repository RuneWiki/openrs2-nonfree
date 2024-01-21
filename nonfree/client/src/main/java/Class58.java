import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class58 {

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Lclient!h;")
	public Class1_Sub5 aClass1_Sub5_1 = null;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
	public int anInt2519 = -1;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "[I")
	public final int[] anIntArray385;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "[I")
	public final int[] anIntArray382;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "[I")
	public final int[] anIntArray384;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "[I")
	public final int[] anIntArray380;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([BLclient!h;)V")
	public Class58(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub5 arg1) {
		this.aClass1_Sub5_1 = arg1;
		@Pc(18) Class1_Sub8 local18 = new Class1_Sub8(arg0);
		@Pc(23) Class1_Sub8 local23 = new Class1_Sub8(arg0);
		local18.anInt1692 = 2;
		@Pc(30) int local30 = local18.method1186();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1692 = local18.anInt1692 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1186();
			if (local47 > 0) {
				if (this.aClass1_Sub5_1.anIntArray120[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass1_Sub5_1.anIntArray120[local59] == 0) {
							Static100.anIntArray386[local34] = local59;
							Static100.anIntArray379[local34] = 0;
							Static100.anIntArray383[local34] = 0;
							Static100.anIntArray381[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static100.anIntArray386[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass1_Sub5_1.anIntArray120[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static100.anIntArray379[local34] = local94;
				} else {
					Static100.anIntArray379[local34] = local23.method1195();
				}
				if ((local47 & 0x2) == 0) {
					Static100.anIntArray383[local34] = local94;
				} else {
					Static100.anIntArray383[local34] = local23.method1195();
				}
				if ((local47 & 0x4) == 0) {
					Static100.anIntArray381[local34] = local94;
				} else {
					Static100.anIntArray381[local34] = local23.method1195();
				}
				local32 = local42;
				local34++;
				if (this.aClass1_Sub5_1.anIntArray120[local42] == 5) {
					this.aBoolean139 = true;
				}
			}
		}
		if (local23.anInt1692 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2519 = local34;
		this.anIntArray385 = new int[local34];
		this.anIntArray382 = new int[local34];
		this.anIntArray384 = new int[local34];
		this.anIntArray380 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray385[local47] = Static100.anIntArray386[local47];
			this.anIntArray382[local47] = Static100.anIntArray379[local47];
			this.anIntArray384[local47] = Static100.anIntArray383[local47];
			this.anIntArray380[local47] = Static100.anIntArray381[local47];
		}
	}
}
