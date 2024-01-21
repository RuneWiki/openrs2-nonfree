import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class72 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Z")
	public boolean aBoolean137 = false;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!ke;")
	public Class3_Sub13 aClass3_Sub13_1 = null;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	public int anInt3283 = -1;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "[I")
	public final int[] anIntArray384;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "[I")
	public final int[] anIntArray379;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "[I")
	public final int[] anIntArray383;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "[I")
	public final int[] anIntArray382;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "([BLclient!ke;)V")
	public Class72(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub13 arg1) {
		this.aClass3_Sub13_1 = arg1;
		@Pc(18) Class3_Sub4 local18 = new Class3_Sub4(arg0);
		@Pc(23) Class3_Sub4 local23 = new Class3_Sub4(arg0);
		local18.anInt232 = 2;
		@Pc(30) int local30 = local18.method191();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt232 = local18.anInt232 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method191();
			if (local47 > 0) {
				if (this.aClass3_Sub13_1.anIntArray213[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass3_Sub13_1.anIntArray213[local59] == 0) {
							Static144.anIntArray377[local34] = local59;
							Static144.anIntArray378[local34] = 0;
							Static144.anIntArray380[local34] = 0;
							Static144.anIntArray381[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static144.anIntArray377[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass3_Sub13_1.anIntArray213[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static144.anIntArray378[local34] = local94;
				} else {
					Static144.anIntArray378[local34] = local23.method216();
				}
				if ((local47 & 0x2) == 0) {
					Static144.anIntArray380[local34] = local94;
				} else {
					Static144.anIntArray380[local34] = local23.method216();
				}
				if ((local47 & 0x4) == 0) {
					Static144.anIntArray381[local34] = local94;
				} else {
					Static144.anIntArray381[local34] = local23.method216();
				}
				local32 = local42;
				local34++;
				if (this.aClass3_Sub13_1.anIntArray213[local42] == 5) {
					this.aBoolean137 = true;
				}
			}
		}
		if (local23.anInt232 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt3283 = local34;
		this.anIntArray384 = new int[local34];
		this.anIntArray379 = new int[local34];
		this.anIntArray383 = new int[local34];
		this.anIntArray382 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray384[local47] = Static144.anIntArray377[local47];
			this.anIntArray379[local47] = Static144.anIntArray378[local47];
			this.anIntArray383[local47] = Static144.anIntArray380[local47];
			this.anIntArray382[local47] = Static144.anIntArray381[local47];
		}
	}
}
