import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class38 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Lclient!ac;")
	public Class3_Sub2 aClass3_Sub2_1 = null;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "Z")
	public boolean aBoolean77 = false;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	public int anInt1506 = -1;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "[I")
	public final int[] anIntArray251;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "[I")
	public final int[] anIntArray247;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "[I")
	public final int[] anIntArray252;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "[I")
	public final int[] anIntArray249;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([BLclient!ac;)V")
	public Class38(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		this.aClass3_Sub2_1 = arg1;
		@Pc(18) Class3_Sub11 local18 = new Class3_Sub11(arg0);
		@Pc(23) Class3_Sub11 local23 = new Class3_Sub11(arg0);
		local18.anInt2060 = 2;
		@Pc(30) int local30 = local18.method1421();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2060 = local18.anInt2060 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1421();
			if (local47 > 0) {
				if (this.aClass3_Sub2_1.anIntArray12[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass3_Sub2_1.anIntArray12[local59] == 0) {
							Static58.anIntArray253[local34] = local59;
							Static58.anIntArray248[local34] = 0;
							Static58.anIntArray246[local34] = 0;
							Static58.anIntArray250[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static58.anIntArray253[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass3_Sub2_1.anIntArray12[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static58.anIntArray248[local34] = local94;
				} else {
					Static58.anIntArray248[local34] = local23.method1446();
				}
				if ((local47 & 0x2) == 0) {
					Static58.anIntArray246[local34] = local94;
				} else {
					Static58.anIntArray246[local34] = local23.method1446();
				}
				if ((local47 & 0x4) == 0) {
					Static58.anIntArray250[local34] = local94;
				} else {
					Static58.anIntArray250[local34] = local23.method1446();
				}
				local32 = local42;
				local34++;
				if (this.aClass3_Sub2_1.anIntArray12[local42] == 5) {
					this.aBoolean77 = true;
				}
			}
		}
		if (local23.anInt2060 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1506 = local34;
		this.anIntArray251 = new int[local34];
		this.anIntArray247 = new int[local34];
		this.anIntArray252 = new int[local34];
		this.anIntArray249 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray251[local47] = Static58.anIntArray253[local47];
			this.anIntArray247[local47] = Static58.anIntArray248[local47];
			this.anIntArray252[local47] = Static58.anIntArray246[local47];
			this.anIntArray249[local47] = Static58.anIntArray250[local47];
		}
	}
}
