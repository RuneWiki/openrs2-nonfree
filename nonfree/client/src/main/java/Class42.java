import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class42 {

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	public int anInt1960 = -1;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Lclient!va;")
	public Class2_Sub13 aClass2_Sub13_1 = null;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Z")
	public boolean aBoolean107 = false;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "[I")
	public final int[] anIntArray212;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
	public final int[] anIntArray211;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "[I")
	public final int[] anIntArray214;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "[I")
	public final int[] anIntArray213;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "([BLclient!va;)V")
	public Class42(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		this.aClass2_Sub13_1 = arg1;
		@Pc(18) Class2_Sub3 local18 = new Class2_Sub3(arg0);
		@Pc(23) Class2_Sub3 local23 = new Class2_Sub3(arg0);
		local18.anInt1168 = 2;
		@Pc(30) int local30 = local18.method791();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1168 = local18.anInt1168 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method791();
			if (local47 > 0) {
				if (this.aClass2_Sub13_1.anIntArray336[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass2_Sub13_1.anIntArray336[local59] == 0) {
							Static70.anIntArray208[local34] = local59;
							Static70.anIntArray209[local34] = 0;
							Static70.anIntArray207[local34] = 0;
							Static70.anIntArray210[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static70.anIntArray208[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass2_Sub13_1.anIntArray336[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static70.anIntArray209[local34] = local94;
				} else {
					Static70.anIntArray209[local34] = local23.method805();
				}
				if ((local47 & 0x2) == 0) {
					Static70.anIntArray207[local34] = local94;
				} else {
					Static70.anIntArray207[local34] = local23.method805();
				}
				if ((local47 & 0x4) == 0) {
					Static70.anIntArray210[local34] = local94;
				} else {
					Static70.anIntArray210[local34] = local23.method805();
				}
				local32 = local42;
				local34++;
				if (this.aClass2_Sub13_1.anIntArray336[local42] == 5) {
					this.aBoolean107 = true;
				}
			}
		}
		if (local23.anInt1168 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1960 = local34;
		this.anIntArray212 = new int[local34];
		this.anIntArray211 = new int[local34];
		this.anIntArray214 = new int[local34];
		this.anIntArray213 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray212[local47] = Static70.anIntArray208[local47];
			this.anIntArray211[local47] = Static70.anIntArray209[local47];
			this.anIntArray214[local47] = Static70.anIntArray207[local47];
			this.anIntArray213[local47] = Static70.anIntArray210[local47];
		}
	}
}
