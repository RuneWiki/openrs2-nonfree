import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class72 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
	public int anInt3249 = -1;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "Lclient!sh;")
	public Class2_Sub24 aClass2_Sub24_1 = null;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "[I")
	public final int[] anIntArray286;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "[I")
	public final int[] anIntArray289;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "[I")
	public final int[] anIntArray293;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
	public final int[] anIntArray288;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([BLclient!sh;)V")
	public Class72(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub24 arg1) {
		this.aClass2_Sub24_1 = arg1;
		@Pc(18) Class2_Sub2 local18 = new Class2_Sub2(arg0);
		@Pc(23) Class2_Sub2 local23 = new Class2_Sub2(arg0);
		local18.anInt2385 = 2;
		@Pc(30) int local30 = local18.method1698();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2385 = local18.anInt2385 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1698();
			if (local47 > 0) {
				if (this.aClass2_Sub24_1.anIntArray322[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass2_Sub24_1.anIntArray322[local59] == 0) {
							Static143.anIntArray292[local34] = local59;
							Static143.anIntArray287[local34] = 0;
							Static143.anIntArray291[local34] = 0;
							Static143.anIntArray290[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static143.anIntArray292[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass2_Sub24_1.anIntArray322[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static143.anIntArray287[local34] = local94;
				} else {
					Static143.anIntArray287[local34] = local23.method1669();
				}
				if ((local47 & 0x2) == 0) {
					Static143.anIntArray291[local34] = local94;
				} else {
					Static143.anIntArray291[local34] = local23.method1669();
				}
				if ((local47 & 0x4) == 0) {
					Static143.anIntArray290[local34] = local94;
				} else {
					Static143.anIntArray290[local34] = local23.method1669();
				}
				local32 = local42;
				local34++;
				if (this.aClass2_Sub24_1.anIntArray322[local42] == 5) {
					this.aBoolean144 = true;
				}
			}
		}
		if (local23.anInt2385 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt3249 = local34;
		this.anIntArray286 = new int[local34];
		this.anIntArray289 = new int[local34];
		this.anIntArray293 = new int[local34];
		this.anIntArray288 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray286[local47] = Static143.anIntArray292[local47];
			this.anIntArray289[local47] = Static143.anIntArray287[local47];
			this.anIntArray293[local47] = Static143.anIntArray291[local47];
			this.anIntArray288[local47] = Static143.anIntArray290[local47];
		}
	}
}
