import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class76 {

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
	public int anInt2923 = -1;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "Z")
	public boolean aBoolean120 = false;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "Lclient!bd;")
	public Class4_Sub3 aClass4_Sub3_1 = null;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "[I")
	public final int[] anIntArray327;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "[I")
	public final int[] anIntArray324;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "[I")
	public final int[] anIntArray322;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[I")
	public final int[] anIntArray325;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([BLclient!bd;)V")
	public Class76(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub3 arg1) {
		this.aClass4_Sub3_1 = arg1;
		@Pc(18) Class4_Sub13 local18 = new Class4_Sub13(arg0);
		@Pc(23) Class4_Sub13 local23 = new Class4_Sub13(arg0);
		local18.anInt1643 = 2;
		@Pc(30) int local30 = local18.method1223();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1643 = local18.anInt1643 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1223();
			if (local47 > 0) {
				if (this.aClass4_Sub3_1.anIntArray15[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass4_Sub3_1.anIntArray15[local59] == 0) {
							Static124.anIntArray323[local34] = local59;
							Static124.anIntArray326[local34] = 0;
							Static124.anIntArray329[local34] = 0;
							Static124.anIntArray328[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static124.anIntArray323[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass4_Sub3_1.anIntArray15[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static124.anIntArray326[local34] = local94;
				} else {
					Static124.anIntArray326[local34] = local23.method1212();
				}
				if ((local47 & 0x2) == 0) {
					Static124.anIntArray329[local34] = local94;
				} else {
					Static124.anIntArray329[local34] = local23.method1212();
				}
				if ((local47 & 0x4) == 0) {
					Static124.anIntArray328[local34] = local94;
				} else {
					Static124.anIntArray328[local34] = local23.method1212();
				}
				local32 = local42;
				local34++;
				if (this.aClass4_Sub3_1.anIntArray15[local42] == 5) {
					this.aBoolean120 = true;
				}
			}
		}
		if (local23.anInt1643 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2923 = local34;
		this.anIntArray327 = new int[local34];
		this.anIntArray324 = new int[local34];
		this.anIntArray322 = new int[local34];
		this.anIntArray325 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray327[local47] = Static124.anIntArray323[local47];
			this.anIntArray324[local47] = Static124.anIntArray326[local47];
			this.anIntArray322[local47] = Static124.anIntArray329[local47];
			this.anIntArray325[local47] = Static124.anIntArray328[local47];
		}
	}
}
