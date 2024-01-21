import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class44 {

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Z")
	public boolean aBoolean101 = false;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	public int anInt1999 = -1;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!ud;")
	public Class3_Sub24 aClass3_Sub24_1 = null;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "[I")
	public final int[] anIntArray189;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "[I")
	public final int[] anIntArray190;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "[I")
	public final int[] anIntArray188;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "[I")
	public final int[] anIntArray194;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "([BLclient!ud;)V")
	public Class44(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub24 arg1) {
		this.aClass3_Sub24_1 = arg1;
		@Pc(18) Class3_Sub11 local18 = new Class3_Sub11(arg0);
		@Pc(23) Class3_Sub11 local23 = new Class3_Sub11(arg0);
		local18.anInt1562 = 2;
		@Pc(30) int local30 = local18.method981();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt1562 = local18.anInt1562 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method981();
			if (local47 > 0) {
				if (this.aClass3_Sub24_1.anIntArray379[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass3_Sub24_1.anIntArray379[local59] == 0) {
							Static68.anIntArray191[local34] = local59;
							Static68.anIntArray192[local34] = 0;
							Static68.anIntArray187[local34] = 0;
							Static68.anIntArray193[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static68.anIntArray191[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass3_Sub24_1.anIntArray379[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static68.anIntArray192[local34] = local94;
				} else {
					Static68.anIntArray192[local34] = local23.method1025();
				}
				if ((local47 & 0x2) == 0) {
					Static68.anIntArray187[local34] = local94;
				} else {
					Static68.anIntArray187[local34] = local23.method1025();
				}
				if ((local47 & 0x4) == 0) {
					Static68.anIntArray193[local34] = local94;
				} else {
					Static68.anIntArray193[local34] = local23.method1025();
				}
				local32 = local42;
				local34++;
				if (this.aClass3_Sub24_1.anIntArray379[local42] == 5) {
					this.aBoolean101 = true;
				}
			}
		}
		if (local23.anInt1562 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1999 = local34;
		this.anIntArray189 = new int[local34];
		this.anIntArray190 = new int[local34];
		this.anIntArray188 = new int[local34];
		this.anIntArray194 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray189[local47] = Static68.anIntArray191[local47];
			this.anIntArray190[local47] = Static68.anIntArray192[local47];
			this.anIntArray188[local47] = Static68.anIntArray187[local47];
			this.anIntArray194[local47] = Static68.anIntArray193[local47];
		}
	}
}
