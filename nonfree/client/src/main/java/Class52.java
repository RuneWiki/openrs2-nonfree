import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class52 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "Lclient!gd;")
	public Class4_Sub11 aClass4_Sub11_1 = null;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
	public int anInt1990 = -1;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "Z")
	public boolean aBoolean122 = false;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
	public final int[] anIntArray275;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "[I")
	public final int[] anIntArray270;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "[I")
	public final int[] anIntArray268;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "[I")
	public final int[] anIntArray273;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([BLclient!gd;)V")
	public Class52(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		this.aClass4_Sub11_1 = arg1;
		@Pc(18) Class4_Sub10 local18 = new Class4_Sub10(arg0);
		@Pc(23) Class4_Sub10 local23 = new Class4_Sub10(arg0);
		local18.anInt931 = 2;
		@Pc(30) int local30 = local18.method599();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt931 = local18.anInt931 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method599();
			if (local47 > 0) {
				if (this.aClass4_Sub11_1.anIntArray125[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass4_Sub11_1.anIntArray125[local59] == 0) {
							Static80.anIntArray271[local34] = local59;
							Static80.anIntArray274[local34] = 0;
							Static80.anIntArray269[local34] = 0;
							Static80.anIntArray272[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static80.anIntArray271[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass4_Sub11_1.anIntArray125[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static80.anIntArray274[local34] = local94;
				} else {
					Static80.anIntArray274[local34] = local23.method580();
				}
				if ((local47 & 0x2) == 0) {
					Static80.anIntArray269[local34] = local94;
				} else {
					Static80.anIntArray269[local34] = local23.method580();
				}
				if ((local47 & 0x4) == 0) {
					Static80.anIntArray272[local34] = local94;
				} else {
					Static80.anIntArray272[local34] = local23.method580();
				}
				local32 = local42;
				local34++;
				if (this.aClass4_Sub11_1.anIntArray125[local42] == 5) {
					this.aBoolean122 = true;
				}
			}
		}
		if (local23.anInt931 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1990 = local34;
		this.anIntArray275 = new int[local34];
		this.anIntArray270 = new int[local34];
		this.anIntArray268 = new int[local34];
		this.anIntArray273 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray275[local47] = Static80.anIntArray271[local47];
			this.anIntArray270[local47] = Static80.anIntArray274[local47];
			this.anIntArray268[local47] = Static80.anIntArray269[local47];
			this.anIntArray273[local47] = Static80.anIntArray272[local47];
		}
	}
}
