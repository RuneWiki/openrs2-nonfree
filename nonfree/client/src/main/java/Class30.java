import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class30 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	public int anInt1449 = -1;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!oc;")
	public Class3_Sub16 aClass3_Sub16_1 = null;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "[I")
	public final int[] anIntArray175;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "[I")
	public final int[] anIntArray171;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "[I")
	public final int[] anIntArray178;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "[I")
	public final int[] anIntArray172;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([BLclient!oc;)V")
	public Class30(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub16 arg1) {
		this.aClass3_Sub16_1 = arg1;
		@Pc(18) Class3_Sub12 local18 = new Class3_Sub12(arg0);
		@Pc(23) Class3_Sub12 local23 = new Class3_Sub12(arg0);
		local18.anInt2886 = 2;
		@Pc(30) int local30 = local18.method1936();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2886 = local18.anInt2886 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1936();
			if (local47 > 0) {
				if (this.aClass3_Sub16_1.anIntArray266[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass3_Sub16_1.anIntArray266[local59] == 0) {
							Static47.anIntArray174[local34] = local59;
							Static47.anIntArray177[local34] = 0;
							Static47.anIntArray173[local34] = 0;
							Static47.anIntArray176[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static47.anIntArray174[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass3_Sub16_1.anIntArray266[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static47.anIntArray177[local34] = local94;
				} else {
					Static47.anIntArray177[local34] = local23.method1944();
				}
				if ((local47 & 0x2) == 0) {
					Static47.anIntArray173[local34] = local94;
				} else {
					Static47.anIntArray173[local34] = local23.method1944();
				}
				if ((local47 & 0x4) == 0) {
					Static47.anIntArray176[local34] = local94;
				} else {
					Static47.anIntArray176[local34] = local23.method1944();
				}
				local32 = local42;
				local34++;
				if (this.aClass3_Sub16_1.anIntArray266[local42] == 5) {
					this.aBoolean47 = true;
				}
			}
		}
		if (local23.anInt2886 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1449 = local34;
		this.anIntArray175 = new int[local34];
		this.anIntArray171 = new int[local34];
		this.anIntArray178 = new int[local34];
		this.anIntArray172 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray175[local47] = Static47.anIntArray174[local47];
			this.anIntArray171[local47] = Static47.anIntArray177[local47];
			this.anIntArray178[local47] = Static47.anIntArray173[local47];
			this.anIntArray172[local47] = Static47.anIntArray176[local47];
		}
	}
}
