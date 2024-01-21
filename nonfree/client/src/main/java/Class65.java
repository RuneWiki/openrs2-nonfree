import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class65 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!q;")
	public Class1_Sub18 aClass1_Sub18_1 = null;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Z")
	public boolean aBoolean172 = false;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
	public int anInt3408 = -1;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "[I")
	public final int[] anIntArray452;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "[I")
	public final int[] anIntArray451;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
	public final int[] anIntArray449;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "[I")
	public final int[] anIntArray456;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([BLclient!q;)V")
	public Class65(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub18 arg1) {
		this.aClass1_Sub18_1 = arg1;
		@Pc(18) Class1_Sub8 local18 = new Class1_Sub8(arg0);
		@Pc(23) Class1_Sub8 local23 = new Class1_Sub8(arg0);
		local18.anInt1357 = 2;
		@Pc(30) int local30 = local18.method861();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1357 = local18.anInt1357 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method861();
			if (local47 > 0) {
				if (this.aClass1_Sub18_1.anIntArray448[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass1_Sub18_1.anIntArray448[local59] == 0) {
							Static131.anIntArray453[local34] = local59;
							Static131.anIntArray450[local34] = 0;
							Static131.anIntArray454[local34] = 0;
							Static131.anIntArray455[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static131.anIntArray453[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass1_Sub18_1.anIntArray448[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static131.anIntArray450[local34] = local94;
				} else {
					Static131.anIntArray450[local34] = local23.method889();
				}
				if ((local47 & 0x2) == 0) {
					Static131.anIntArray454[local34] = local94;
				} else {
					Static131.anIntArray454[local34] = local23.method889();
				}
				if ((local47 & 0x4) == 0) {
					Static131.anIntArray455[local34] = local94;
				} else {
					Static131.anIntArray455[local34] = local23.method889();
				}
				local32 = local42;
				local34++;
				if (this.aClass1_Sub18_1.anIntArray448[local42] == 5) {
					this.aBoolean172 = true;
				}
			}
		}
		if (local23.anInt1357 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt3408 = local34;
		this.anIntArray452 = new int[local34];
		this.anIntArray451 = new int[local34];
		this.anIntArray449 = new int[local34];
		this.anIntArray456 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray452[local47] = Static131.anIntArray453[local47];
			this.anIntArray451[local47] = Static131.anIntArray450[local47];
			this.anIntArray449[local47] = Static131.anIntArray454[local47];
			this.anIntArray456[local47] = Static131.anIntArray455[local47];
		}
	}
}
