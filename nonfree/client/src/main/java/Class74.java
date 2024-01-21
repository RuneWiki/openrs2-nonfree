import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class74 {

	@OriginalMember(owner = "client!va", name = "j", descriptor = "Z")
	public boolean aBoolean130 = false;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "I")
	public int anInt2986 = -1;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "Lclient!tc;")
	public Class5_Sub16 aClass5_Sub16_1 = null;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "[I")
	public final int[] anIntArray462;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "[I")
	public final int[] anIntArray463;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
	public final int[] anIntArray461;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "[I")
	public final int[] anIntArray467;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "([BLclient!tc;)V")
	public Class74(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub16 arg1) {
		this.aClass5_Sub16_1 = arg1;
		@Pc(18) Class5_Sub9 local18 = new Class5_Sub9(arg0);
		@Pc(23) Class5_Sub9 local23 = new Class5_Sub9(arg0);
		local18.anInt2140 = 2;
		@Pc(30) int local30 = local18.method1408();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2140 = local18.anInt2140 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1408();
			if (local47 > 0) {
				if (this.aClass5_Sub16_1.anIntArray428[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass5_Sub16_1.anIntArray428[local59] == 0) {
							Static113.anIntArray464[local34] = local59;
							Static113.anIntArray468[local34] = 0;
							Static113.anIntArray465[local34] = 0;
							Static113.anIntArray466[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static113.anIntArray464[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass5_Sub16_1.anIntArray428[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static113.anIntArray468[local34] = local94;
				} else {
					Static113.anIntArray468[local34] = local23.method1445();
				}
				if ((local47 & 0x2) == 0) {
					Static113.anIntArray465[local34] = local94;
				} else {
					Static113.anIntArray465[local34] = local23.method1445();
				}
				if ((local47 & 0x4) == 0) {
					Static113.anIntArray466[local34] = local94;
				} else {
					Static113.anIntArray466[local34] = local23.method1445();
				}
				local32 = local42;
				local34++;
				if (this.aClass5_Sub16_1.anIntArray428[local42] == 5) {
					this.aBoolean130 = true;
				}
			}
		}
		if (local23.anInt2140 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2986 = local34;
		this.anIntArray462 = new int[local34];
		this.anIntArray463 = new int[local34];
		this.anIntArray461 = new int[local34];
		this.anIntArray467 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray462[local47] = Static113.anIntArray464[local47];
			this.anIntArray463[local47] = Static113.anIntArray468[local47];
			this.anIntArray461[local47] = Static113.anIntArray465[local47];
			this.anIntArray467[local47] = Static113.anIntArray466[local47];
		}
	}
}
