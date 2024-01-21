import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class50 {

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Z")
	public boolean aBoolean132 = false;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!v;")
	public Class3_Sub23 aClass3_Sub23_1 = null;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	public int anInt2638 = -1;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
	public final int[] anIntArray459;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "[I")
	public final int[] anIntArray454;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "[I")
	public final int[] anIntArray455;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "[I")
	public final int[] anIntArray456;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([BLclient!v;)V")
	public Class50(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub23 arg1) {
		this.aClass3_Sub23_1 = arg1;
		@Pc(18) Class3_Sub8 local18 = new Class3_Sub8(arg0);
		@Pc(23) Class3_Sub8 local23 = new Class3_Sub8(arg0);
		local18.anInt1948 = 2;
		@Pc(30) int local30 = local18.method1545();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1948 = local18.anInt1948 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1545();
			if (local47 > 0) {
				if (this.aClass3_Sub23_1.anIntArray665[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass3_Sub23_1.anIntArray665[local59] == 0) {
							Static97.anIntArray457[local34] = local59;
							Static97.anIntArray461[local34] = 0;
							Static97.anIntArray460[local34] = 0;
							Static97.anIntArray458[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static97.anIntArray457[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass3_Sub23_1.anIntArray665[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static97.anIntArray461[local34] = local94;
				} else {
					Static97.anIntArray461[local34] = local23.method1532();
				}
				if ((local47 & 0x2) == 0) {
					Static97.anIntArray460[local34] = local94;
				} else {
					Static97.anIntArray460[local34] = local23.method1532();
				}
				if ((local47 & 0x4) == 0) {
					Static97.anIntArray458[local34] = local94;
				} else {
					Static97.anIntArray458[local34] = local23.method1532();
				}
				local32 = local42;
				local34++;
				if (this.aClass3_Sub23_1.anIntArray665[local42] == 5) {
					this.aBoolean132 = true;
				}
			}
		}
		if (local23.anInt1948 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2638 = local34;
		this.anIntArray459 = new int[local34];
		this.anIntArray454 = new int[local34];
		this.anIntArray455 = new int[local34];
		this.anIntArray456 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray459[local47] = Static97.anIntArray457[local47];
			this.anIntArray454[local47] = Static97.anIntArray461[local47];
			this.anIntArray455[local47] = Static97.anIntArray460[local47];
			this.anIntArray456[local47] = Static97.anIntArray458[local47];
		}
	}
}
