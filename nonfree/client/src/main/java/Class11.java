import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class11 {

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "Z")
	public boolean aBoolean12 = false;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!me;")
	public Class4_Sub12 aClass4_Sub12_1 = null;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
	public int anInt347 = -1;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "[I")
	public final int[] anIntArray42;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "[I")
	public final int[] anIntArray41;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "[I")
	public final int[] anIntArray43;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "[I")
	public final int[] anIntArray39;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([BLclient!me;)V")
	public Class11(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub12 arg1) {
		this.aClass4_Sub12_1 = arg1;
		@Pc(18) Class4_Sub16 local18 = new Class4_Sub16(arg0);
		@Pc(23) Class4_Sub16 local23 = new Class4_Sub16(arg0);
		local18.anInt2019 = 2;
		@Pc(30) int local30 = local18.method1474();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2019 = local18.anInt2019 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1474();
			if (local47 > 0) {
				if (this.aClass4_Sub12_1.anIntArray198[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass4_Sub12_1.anIntArray198[local59] == 0) {
							Static12.anIntArray40[local34] = local59;
							Static12.anIntArray44[local34] = 0;
							Static12.anIntArray45[local34] = 0;
							Static12.anIntArray46[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static12.anIntArray40[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass4_Sub12_1.anIntArray198[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static12.anIntArray44[local34] = local94;
				} else {
					Static12.anIntArray44[local34] = local23.method1478();
				}
				if ((local47 & 0x2) == 0) {
					Static12.anIntArray45[local34] = local94;
				} else {
					Static12.anIntArray45[local34] = local23.method1478();
				}
				if ((local47 & 0x4) == 0) {
					Static12.anIntArray46[local34] = local94;
				} else {
					Static12.anIntArray46[local34] = local23.method1478();
				}
				local32 = local42;
				local34++;
				if (this.aClass4_Sub12_1.anIntArray198[local42] == 5) {
					this.aBoolean12 = true;
				}
			}
		}
		if (local23.anInt2019 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt347 = local34;
		this.anIntArray42 = new int[local34];
		this.anIntArray41 = new int[local34];
		this.anIntArray43 = new int[local34];
		this.anIntArray39 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray42[local47] = Static12.anIntArray40[local47];
			this.anIntArray41[local47] = Static12.anIntArray44[local47];
			this.anIntArray43[local47] = Static12.anIntArray45[local47];
			this.anIntArray39[local47] = Static12.anIntArray46[local47];
		}
	}
}
