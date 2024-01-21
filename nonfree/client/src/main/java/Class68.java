import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class68 {

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	public int anInt2850 = -1;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "Z")
	public boolean aBoolean152 = false;

	@OriginalMember(owner = "client!t", name = "k", descriptor = "Lclient!rb;")
	public Class6_Sub15 aClass6_Sub15_1 = null;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "[I")
	public final int[] anIntArray310;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "[I")
	public final int[] anIntArray314;

	@OriginalMember(owner = "client!t", name = "g", descriptor = "[I")
	public final int[] anIntArray315;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "[I")
	public final int[] anIntArray311;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "([BLclient!rb;)V")
	public Class68(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		this.aClass6_Sub15_1 = arg1;
		@Pc(18) Class6_Sub4 local18 = new Class6_Sub4(arg0);
		@Pc(23) Class6_Sub4 local23 = new Class6_Sub4(arg0);
		local18.anInt1949 = 2;
		@Pc(30) int local30 = local18.method1321();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1949 = local18.anInt1949 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1321();
			if (local47 > 0) {
				if (this.aClass6_Sub15_1.anIntArray291[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass6_Sub15_1.anIntArray291[local59] == 0) {
							Static104.anIntArray312[local34] = local59;
							Static104.anIntArray317[local34] = 0;
							Static104.anIntArray316[local34] = 0;
							Static104.anIntArray313[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static104.anIntArray312[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass6_Sub15_1.anIntArray291[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static104.anIntArray317[local34] = local94;
				} else {
					Static104.anIntArray317[local34] = local23.method1285();
				}
				if ((local47 & 0x2) == 0) {
					Static104.anIntArray316[local34] = local94;
				} else {
					Static104.anIntArray316[local34] = local23.method1285();
				}
				if ((local47 & 0x4) == 0) {
					Static104.anIntArray313[local34] = local94;
				} else {
					Static104.anIntArray313[local34] = local23.method1285();
				}
				local32 = local42;
				local34++;
				if (this.aClass6_Sub15_1.anIntArray291[local42] == 5) {
					this.aBoolean152 = true;
				}
			}
		}
		if (local23.anInt1949 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2850 = local34;
		this.anIntArray310 = new int[local34];
		this.anIntArray314 = new int[local34];
		this.anIntArray315 = new int[local34];
		this.anIntArray311 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray310[local47] = Static104.anIntArray312[local47];
			this.anIntArray314[local47] = Static104.anIntArray317[local47];
			this.anIntArray315[local47] = Static104.anIntArray316[local47];
			this.anIntArray311[local47] = Static104.anIntArray313[local47];
		}
	}
}
