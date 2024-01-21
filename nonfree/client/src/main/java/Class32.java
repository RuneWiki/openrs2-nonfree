import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class32 {

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
	public int anInt1050 = -1;

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "Lclient!wd;")
	public Class3_Sub13 aClass3_Sub13_1 = null;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "[I")
	public final int[] anIntArray108;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
	public final int[] anIntArray102;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "[I")
	public final int[] anIntArray105;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "[I")
	public final int[] anIntArray109;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([BLclient!wd;)V")
	public Class32(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub13 arg1) {
		this.aClass3_Sub13_1 = arg1;
		@Pc(18) Class3_Sub4 local18 = new Class3_Sub4(arg0);
		@Pc(23) Class3_Sub4 local23 = new Class3_Sub4(arg0);
		local18.anInt627 = 2;
		@Pc(30) int local30 = local18.method446();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt627 = local18.anInt627 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method446();
			if (local47 > 0) {
				if (this.aClass3_Sub13_1.anIntArray338[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass3_Sub13_1.anIntArray338[local59] == 0) {
							Static37.anIntArray103[local34] = local59;
							Static37.anIntArray106[local34] = 0;
							Static37.anIntArray107[local34] = 0;
							Static37.anIntArray104[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static37.anIntArray103[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass3_Sub13_1.anIntArray338[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static37.anIntArray106[local34] = local94;
				} else {
					Static37.anIntArray106[local34] = local23.method436();
				}
				if ((local47 & 0x2) == 0) {
					Static37.anIntArray107[local34] = local94;
				} else {
					Static37.anIntArray107[local34] = local23.method436();
				}
				if ((local47 & 0x4) == 0) {
					Static37.anIntArray104[local34] = local94;
				} else {
					Static37.anIntArray104[local34] = local23.method436();
				}
				local32 = local42;
				local34++;
				if (this.aClass3_Sub13_1.anIntArray338[local42] == 5) {
					this.aBoolean71 = true;
				}
			}
		}
		if (local23.anInt627 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1050 = local34;
		this.anIntArray108 = new int[local34];
		this.anIntArray102 = new int[local34];
		this.anIntArray105 = new int[local34];
		this.anIntArray109 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray108[local47] = Static37.anIntArray103[local47];
			this.anIntArray102[local47] = Static37.anIntArray106[local47];
			this.anIntArray105[local47] = Static37.anIntArray107[local47];
			this.anIntArray109[local47] = Static37.anIntArray104[local47];
		}
	}
}
