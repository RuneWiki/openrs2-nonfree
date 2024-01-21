import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class65 {

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Z")
	public boolean aBoolean216 = false;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	public int anInt2683 = -1;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!mc;")
	public Class1_Sub13 aClass1_Sub13_1 = null;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "[I")
	public final int[] anIntArray412;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "[I")
	public final int[] anIntArray407;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
	public final int[] anIntArray406;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "[I")
	public final int[] anIntArray408;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "([BLclient!mc;)V")
	public Class65(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub13 arg1) {
		this.aClass1_Sub13_1 = arg1;
		@Pc(18) Class1_Sub18 local18 = new Class1_Sub18(arg0);
		@Pc(23) Class1_Sub18 local23 = new Class1_Sub18(arg0);
		local18.anInt3078 = 2;
		@Pc(30) int local30 = local18.method2169();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt3078 = local18.anInt3078 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method2169();
			if (local47 > 0) {
				if (this.aClass1_Sub13_1.anIntArray266[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass1_Sub13_1.anIntArray266[local59] == 0) {
							Static106.anIntArray409[local34] = local59;
							Static106.anIntArray410[local34] = 0;
							Static106.anIntArray413[local34] = 0;
							Static106.anIntArray411[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static106.anIntArray409[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass1_Sub13_1.anIntArray266[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static106.anIntArray410[local34] = local94;
				} else {
					Static106.anIntArray410[local34] = local23.method2135();
				}
				if ((local47 & 0x2) == 0) {
					Static106.anIntArray413[local34] = local94;
				} else {
					Static106.anIntArray413[local34] = local23.method2135();
				}
				if ((local47 & 0x4) == 0) {
					Static106.anIntArray411[local34] = local94;
				} else {
					Static106.anIntArray411[local34] = local23.method2135();
				}
				local32 = local42;
				local34++;
				if (this.aClass1_Sub13_1.anIntArray266[local42] == 5) {
					this.aBoolean216 = true;
				}
			}
		}
		if (local23.anInt3078 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2683 = local34;
		this.anIntArray412 = new int[local34];
		this.anIntArray407 = new int[local34];
		this.anIntArray406 = new int[local34];
		this.anIntArray408 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray412[local47] = Static106.anIntArray409[local47];
			this.anIntArray407[local47] = Static106.anIntArray410[local47];
			this.anIntArray406[local47] = Static106.anIntArray413[local47];
			this.anIntArray408[local47] = Static106.anIntArray411[local47];
		}
	}
}
