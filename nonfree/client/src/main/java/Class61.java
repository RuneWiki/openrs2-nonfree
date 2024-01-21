import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class61 {

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	public int anInt2372 = -1;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!nf;")
	public Class3_Sub13 aClass3_Sub13_1 = null;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "[I")
	public final int[] anIntArray203;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
	public final int[] anIntArray202;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "[I")
	public final int[] anIntArray206;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "[I")
	public final int[] anIntArray207;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "([BLclient!nf;)V")
	public Class61(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub13 arg1) {
		this.aClass3_Sub13_1 = arg1;
		@Pc(18) Class3_Sub2 local18 = new Class3_Sub2(arg0);
		@Pc(23) Class3_Sub2 local23 = new Class3_Sub2(arg0);
		local18.anInt413 = 2;
		@Pc(30) int local30 = local18.method270();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt413 = local18.anInt413 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method270();
			if (local47 > 0) {
				if (this.aClass3_Sub13_1.anIntArray185[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass3_Sub13_1.anIntArray185[local59] == 0) {
							Static89.anIntArray204[local34] = local59;
							Static89.anIntArray205[local34] = 0;
							Static89.anIntArray200[local34] = 0;
							Static89.anIntArray201[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static89.anIntArray204[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass3_Sub13_1.anIntArray185[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static89.anIntArray205[local34] = local94;
				} else {
					Static89.anIntArray205[local34] = local23.method269();
				}
				if ((local47 & 0x2) == 0) {
					Static89.anIntArray200[local34] = local94;
				} else {
					Static89.anIntArray200[local34] = local23.method269();
				}
				if ((local47 & 0x4) == 0) {
					Static89.anIntArray201[local34] = local94;
				} else {
					Static89.anIntArray201[local34] = local23.method269();
				}
				local32 = local42;
				local34++;
				if (this.aClass3_Sub13_1.anIntArray185[local42] == 5) {
					this.aBoolean110 = true;
				}
			}
		}
		if (local23.anInt413 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2372 = local34;
		this.anIntArray203 = new int[local34];
		this.anIntArray202 = new int[local34];
		this.anIntArray206 = new int[local34];
		this.anIntArray207 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray203[local47] = Static89.anIntArray204[local47];
			this.anIntArray202[local47] = Static89.anIntArray205[local47];
			this.anIntArray206[local47] = Static89.anIntArray200[local47];
			this.anIntArray207[local47] = Static89.anIntArray201[local47];
		}
	}
}
