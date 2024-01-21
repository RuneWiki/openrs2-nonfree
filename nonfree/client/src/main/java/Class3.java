import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Lclient!we;")
	public Class5_Sub24 aClass5_Sub24_1 = null;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Z")
	public boolean aBoolean2 = false;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
	public int anInt24 = -1;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "[I")
	public final int[] anIntArray9;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
	public final int[] anIntArray8;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "[I")
	public final int[] anIntArray4;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "[I")
	public final int[] anIntArray11;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([BLclient!we;)V")
	public Class3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub24 arg1) {
		this.aClass5_Sub24_1 = arg1;
		@Pc(18) Class5_Sub14 local18 = new Class5_Sub14(arg0);
		@Pc(23) Class5_Sub14 local23 = new Class5_Sub14(arg0);
		local18.anInt2199 = 2;
		@Pc(30) int local30 = local18.method1471();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.anInt2199 = local18.anInt2199 + local30;
		@Pc(47) int local47;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			local47 = local18.method1471();
			if (local47 > 0) {
				if (this.aClass5_Sub24_1.anIntArray447[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass5_Sub24_1.anIntArray447[local59] == 0) {
							Static3.anIntArray10[local34] = local59;
							Static3.anIntArray5[local34] = 0;
							Static3.anIntArray7[local34] = 0;
							Static3.anIntArray6[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static3.anIntArray10[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass5_Sub24_1.anIntArray447[local42] == 3) {
					local94 = 128;
				}
				if ((local47 & 0x1) == 0) {
					Static3.anIntArray5[local34] = local94;
				} else {
					Static3.anIntArray5[local34] = local23.method1428();
				}
				if ((local47 & 0x2) == 0) {
					Static3.anIntArray7[local34] = local94;
				} else {
					Static3.anIntArray7[local34] = local23.method1428();
				}
				if ((local47 & 0x4) == 0) {
					Static3.anIntArray6[local34] = local94;
				} else {
					Static3.anIntArray6[local34] = local23.method1428();
				}
				local32 = local42;
				local34++;
				if (this.aClass5_Sub24_1.anIntArray447[local42] == 5) {
					this.aBoolean2 = true;
				}
			}
		}
		if (local23.anInt2199 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt24 = local34;
		this.anIntArray9 = new int[local34];
		this.anIntArray8 = new int[local34];
		this.anIntArray4 = new int[local34];
		this.anIntArray11 = new int[local34];
		for (local47 = 0; local47 < local34; local47++) {
			this.anIntArray9[local47] = Static3.anIntArray10[local47];
			this.anIntArray8[local47] = Static3.anIntArray5[local47];
			this.anIntArray4[local47] = Static3.anIntArray7[local47];
			this.anIntArray11[local47] = Static3.anIntArray6[local47];
		}
	}
}
