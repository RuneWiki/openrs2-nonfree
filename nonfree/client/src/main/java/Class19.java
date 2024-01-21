import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class19 {

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public int anInt706 = -1;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!ga;")
	public Class5_Sub13 aClass5_Sub13_1 = null;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "Z")
	public boolean aBoolean45 = false;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "[S")
	public final short[] aShortArray15;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "[S")
	public final short[] aShortArray16;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "[S")
	public final short[] aShortArray11;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "[S")
	public final short[] aShortArray17;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "[S")
	public final short[] aShortArray12;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "([BLclient!ga;)V")
	public Class19(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub13 arg1) {
		this.aClass5_Sub13_1 = arg1;
		@Pc(18) Class5_Sub6 local18 = new Class5_Sub6(arg0);
		@Pc(23) Class5_Sub6 local23 = new Class5_Sub6(arg0);
		local18.anInt4050 = 2;
		@Pc(30) int local30 = local18.method3062();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt4050 = local18.anInt4050 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass5_Sub13_1.anIntArray125[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method3062();
			if (local57 > 0) {
				if (this.aClass5_Sub13_1.anIntArray125[local44] == 0) {
					local36 = local44;
				}
				Static34.aShortArray18[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass5_Sub13_1.anIntArray125[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static34.aShortArray13[local32] = local74;
				} else {
					Static34.aShortArray13[local32] = (short) local23.method3060();
				}
				if ((local57 & 0x2) == 0) {
					Static34.aShortArray9[local32] = local74;
				} else {
					Static34.aShortArray9[local32] = (short) local23.method3060();
				}
				if ((local57 & 0x4) == 0) {
					Static34.aShortArray14[local32] = local74;
				} else {
					Static34.aShortArray14[local32] = (short) local23.method3060();
				}
				if (this.aClass5_Sub13_1.anIntArray125[local44] == 2) {
					Static34.aShortArray13[local32] = (short) (((Static34.aShortArray13[local32] & 0xFF) << 3) + (Static34.aShortArray13[local32] >> 8 & 0x7));
					Static34.aShortArray9[local32] = (short) (((Static34.aShortArray9[local32] & 0xFF) << 3) + (Static34.aShortArray9[local32] >> 8 & 0x7));
					Static34.aShortArray14[local32] = (short) (((Static34.aShortArray14[local32] & 0xFF) << 3) + (Static34.aShortArray14[local32] >> 8 & 0x7));
				}
				Static34.aShortArray10[local32] = -1;
				if (this.aClass5_Sub13_1.anIntArray125[local44] >= 1 && this.aClass5_Sub13_1.anIntArray125[local44] <= 3 && local34 > local36) {
					Static34.aShortArray10[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass5_Sub13_1.anIntArray125[local44] == 5) {
					this.aBoolean45 = true;
				}
			}
		}
		if (local23.anInt4050 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt706 = local32;
		this.aShortArray15 = new short[local32];
		this.aShortArray16 = new short[local32];
		this.aShortArray11 = new short[local32];
		this.aShortArray17 = new short[local32];
		this.aShortArray12 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray15[local57] = Static34.aShortArray18[local57];
			this.aShortArray16[local57] = Static34.aShortArray13[local57];
			this.aShortArray11[local57] = Static34.aShortArray9[local57];
			this.aShortArray17[local57] = Static34.aShortArray14[local57];
			this.aShortArray12[local57] = Static34.aShortArray10[local57];
		}
	}
}
