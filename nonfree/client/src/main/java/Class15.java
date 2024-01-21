import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class15 {

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!ii;")
	public Class2_Sub11 aClass2_Sub11_1 = null;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "I")
	public int anInt1075 = -1;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Z")
	public boolean aBoolean42 = false;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "[S")
	public final short[] aShortArray21;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "[S")
	public final short[] aShortArray20;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "[S")
	public final short[] aShortArray16;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "[S")
	public final short[] aShortArray19;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "[S")
	public final short[] aShortArray17;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "([BLclient!ii;)V")
	public Class15(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		this.aClass2_Sub11_1 = arg1;
		@Pc(18) Class2_Sub3 local18 = new Class2_Sub3(arg0);
		@Pc(23) Class2_Sub3 local23 = new Class2_Sub3(arg0);
		local18.anInt273 = 2;
		@Pc(30) int local30 = local18.method218();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt273 = local18.anInt273 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass2_Sub11_1.anIntArray267[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method218();
			if (local57 > 0) {
				if (this.aClass2_Sub11_1.anIntArray267[local44] == 0) {
					local36 = local44;
				}
				Static34.aShortArray14[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass2_Sub11_1.anIntArray267[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static34.aShortArray15[local32] = local74;
				} else {
					Static34.aShortArray15[local32] = (short) local23.method217();
				}
				if ((local57 & 0x2) == 0) {
					Static34.aShortArray23[local32] = local74;
				} else {
					Static34.aShortArray23[local32] = (short) local23.method217();
				}
				if ((local57 & 0x4) == 0) {
					Static34.aShortArray22[local32] = local74;
				} else {
					Static34.aShortArray22[local32] = (short) local23.method217();
				}
				if (this.aClass2_Sub11_1.anIntArray267[local44] == 2) {
					Static34.aShortArray15[local32] = (short) (((Static34.aShortArray15[local32] & 0xFF) << 3) + (Static34.aShortArray15[local32] >> 8 & 0x7));
					Static34.aShortArray23[local32] = (short) (((Static34.aShortArray23[local32] & 0xFF) << 3) + (Static34.aShortArray23[local32] >> 8 & 0x7));
					Static34.aShortArray22[local32] = (short) (((Static34.aShortArray22[local32] & 0xFF) << 3) + (Static34.aShortArray22[local32] >> 8 & 0x7));
				}
				Static34.aShortArray18[local32] = -1;
				if (this.aClass2_Sub11_1.anIntArray267[local44] >= 1 && this.aClass2_Sub11_1.anIntArray267[local44] <= 3 && local34 > local36) {
					Static34.aShortArray18[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass2_Sub11_1.anIntArray267[local44] == 5) {
					this.aBoolean42 = true;
				}
			}
		}
		if (local23.anInt273 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1075 = local32;
		this.aShortArray21 = new short[local32];
		this.aShortArray20 = new short[local32];
		this.aShortArray16 = new short[local32];
		this.aShortArray19 = new short[local32];
		this.aShortArray17 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray21[local57] = Static34.aShortArray14[local57];
			this.aShortArray20[local57] = Static34.aShortArray15[local57];
			this.aShortArray16[local57] = Static34.aShortArray23[local57];
			this.aShortArray19[local57] = Static34.aShortArray22[local57];
			this.aShortArray17[local57] = Static34.aShortArray18[local57];
		}
	}
}
