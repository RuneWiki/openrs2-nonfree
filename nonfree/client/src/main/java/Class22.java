import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class22 {

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Z")
	public boolean aBoolean54 = false;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
	public int anInt1047 = -1;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Lclient!we;")
	public Class2_Sub24 aClass2_Sub24_1 = null;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "[I")
	public final int[] anIntArray170;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
	public final int[] anIntArray169;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "[I")
	public final int[] anIntArray168;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "[I")
	public final int[] anIntArray172;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([BLclient!we;)V")
	public Class22(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub24 arg1) {
		this.aClass2_Sub24_1 = arg1;
		@Pc(18) Class2_Sub18 local18 = new Class2_Sub18(arg0);
		@Pc(23) Class2_Sub18 local23 = new Class2_Sub18(arg0);
		local18.anInt3423 = 2;
		@Pc(30) int local30 = local18.method2387();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt3423 = local18.anInt3423 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method2387();
			if (local47 > 0) {
				if (this.aClass2_Sub24_1.anIntArray636[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass2_Sub24_1.anIntArray636[local59] == 0) {
							Static36.anIntArray167[local34] = local59;
							Static36.anIntArray171[local34] = 0;
							Static36.anIntArray165[local34] = 0;
							Static36.anIntArray166[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static36.anIntArray167[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass2_Sub24_1.anIntArray636[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static36.anIntArray171[local34] = local94;
				} else {
					Static36.anIntArray171[local34] = local23.method2375();
				}
				if ((local47 & 0x2) == 0) {
					Static36.anIntArray165[local34] = local94;
				} else {
					Static36.anIntArray165[local34] = local23.method2375();
				}
				if ((local47 & 0x4) == 0) {
					Static36.anIntArray166[local34] = local94;
				} else {
					Static36.anIntArray166[local34] = local23.method2375();
				}
				local32 = local42;
				local34++;
				if (this.aClass2_Sub24_1.anIntArray636[local42] == 5) {
					this.aBoolean54 = true;
				}
			}
		}
		if (local23.anInt3423 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1047 = local34;
		this.anIntArray170 = new int[local34];
		this.anIntArray169 = new int[local34];
		this.anIntArray168 = new int[local34];
		this.anIntArray172 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray170[local47] = Static36.anIntArray167[local47];
			this.anIntArray169[local47] = Static36.anIntArray171[local47];
			this.anIntArray168[local47] = Static36.anIntArray165[local47];
			this.anIntArray172[local47] = Static36.anIntArray166[local47];
		}
	}
}
