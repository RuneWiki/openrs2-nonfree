import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class50 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	public int anInt2153 = -1;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "Lclient!uc;")
	public Class1_Sub21 aClass1_Sub21_1 = null;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Z")
	public boolean aBoolean89 = false;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "[I")
	public final int[] anIntArray345;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "[I")
	public final int[] anIntArray352;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "[I")
	public final int[] anIntArray349;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
	public final int[] anIntArray346;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([BLclient!uc;)V")
	public Class50(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub21 arg1) {
		this.aClass1_Sub21_1 = arg1;
		@Pc(18) Class1_Sub12 local18 = new Class1_Sub12(arg0);
		@Pc(23) Class1_Sub12 local23 = new Class1_Sub12(arg0);
		local18.anInt1694 = 2;
		@Pc(30) int local30 = local18.method1190();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1694 = local18.anInt1694 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1190();
			if (local47 > 0) {
				if (this.aClass1_Sub21_1.anIntArray476[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass1_Sub21_1.anIntArray476[local59] == 0) {
							Static78.anIntArray350[local34] = local59;
							Static78.anIntArray347[local34] = 0;
							Static78.anIntArray351[local34] = 0;
							Static78.anIntArray348[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static78.anIntArray350[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass1_Sub21_1.anIntArray476[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static78.anIntArray347[local34] = local94;
				} else {
					Static78.anIntArray347[local34] = local23.method1185();
				}
				if ((local47 & 0x2) == 0) {
					Static78.anIntArray351[local34] = local94;
				} else {
					Static78.anIntArray351[local34] = local23.method1185();
				}
				if ((local47 & 0x4) == 0) {
					Static78.anIntArray348[local34] = local94;
				} else {
					Static78.anIntArray348[local34] = local23.method1185();
				}
				local32 = local42;
				local34++;
				if (this.aClass1_Sub21_1.anIntArray476[local42] == 5) {
					this.aBoolean89 = true;
				}
			}
		}
		if (local23.anInt1694 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2153 = local34;
		this.anIntArray345 = new int[local34];
		this.anIntArray352 = new int[local34];
		this.anIntArray349 = new int[local34];
		this.anIntArray346 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray345[local47] = Static78.anIntArray350[local47];
			this.anIntArray352[local47] = Static78.anIntArray347[local47];
			this.anIntArray349[local47] = Static78.anIntArray351[local47];
			this.anIntArray346[local47] = Static78.anIntArray348[local47];
		}
	}
}
