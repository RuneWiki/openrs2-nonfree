import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class28 {

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "[I")
	public static int[] anIntArray232 = new int[500];

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "[I")
	public static int[] anIntArray228 = new int[500];

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "[I")
	public static int[] anIntArray233 = new int[500];

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "[I")
	public static int[] anIntArray227 = new int[500];

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!ga;")
	public Class2_Sub5 aClass2_Sub5_1 = null;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Z")
	public boolean aBoolean88 = false;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
	public int anInt1098 = -1;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
	public final int[] anIntArray226;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "[I")
	public final int[] anIntArray231;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
	public final int[] anIntArray230;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "[I")
	public final int[] anIntArray229;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([BLclient!ga;)V", line = 42)
	public Class28(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		this.aClass2_Sub5_1 = arg1;
		@Pc(18) Class2_Sub3 local18 = new Class2_Sub3(arg0);
		@Pc(23) Class2_Sub3 local23 = new Class2_Sub3(arg0);
		local18.anInt2546 = 2;
		@Pc(30) int local30 = local18.method1708();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2546 = local18.anInt2546 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1708();
			if (local47 > 0) {
				if (this.aClass2_Sub5_1.anIntArray142[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass2_Sub5_1.anIntArray142[local59] == 0) {
							anIntArray227[local34] = local59;
							anIntArray228[local34] = 0;
							anIntArray233[local34] = 0;
							anIntArray232[local34] = 0;
							local34++;
							break;
						}
					}
				}
				anIntArray227[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass2_Sub5_1.anIntArray142[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					anIntArray228[local34] = local94;
				} else {
					anIntArray228[local34] = local23.method1699();
				}
				if ((local47 & 0x2) == 0) {
					anIntArray233[local34] = local94;
				} else {
					anIntArray233[local34] = local23.method1699();
				}
				if ((local47 & 0x4) == 0) {
					anIntArray232[local34] = local94;
				} else {
					anIntArray232[local34] = local23.method1699();
				}
				local32 = local42;
				local34++;
				if (this.aClass2_Sub5_1.anIntArray142[local42] == 5) {
					this.aBoolean88 = true;
				}
			}
		}
		if (local23.anInt2546 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1098 = local34;
		this.anIntArray226 = new int[local34];
		this.anIntArray231 = new int[local34];
		this.anIntArray230 = new int[local34];
		this.anIntArray229 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray226[local47] = anIntArray227[local47];
			this.anIntArray231[local47] = anIntArray228[local47];
			this.anIntArray230[local47] = anIntArray233[local47];
			this.anIntArray229[local47] = anIntArray232[local47];
		}
	}
}
