import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class70 {

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "Lclient!mc;")
	public Class2_Sub24 aClass2_Sub24_1 = null;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
	public int anInt3200 = -1;

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "[S")
	public short[] aShortArray100;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "([BLclient!mc;)V")
	public Class70(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub24 arg1) {
		this.aClass2_Sub24_1 = arg1;
		@Pc(18) Class2_Sub23 local18 = new Class2_Sub23(arg0);
		@Pc(23) Class2_Sub23 local23 = new Class2_Sub23(arg0);
		local18.anInt2703 = 2;
		@Pc(30) int local30 = local18.method2122();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt2703 = local18.anInt2703 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass2_Sub24_1.anIntArray475[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method2122();
			if (local57 > 0) {
				if (this.aClass2_Sub24_1.anIntArray475[local44] == 0) {
					local36 = local44;
				}
				Static141.aShortArray101[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass2_Sub24_1.anIntArray475[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static141.aShortArray96[local32] = local74;
				} else {
					Static141.aShortArray96[local32] = (short) local23.method2135();
				}
				if ((local57 & 0x2) == 0) {
					Static141.aShortArray98[local32] = local74;
				} else {
					Static141.aShortArray98[local32] = (short) local23.method2135();
				}
				if ((local57 & 0x4) == 0) {
					Static141.aShortArray95[local32] = local74;
				} else {
					Static141.aShortArray95[local32] = (short) local23.method2135();
				}
				if (this.aClass2_Sub24_1.anIntArray475[local44] == 2) {
					Static141.aShortArray96[local32] = (short) (((Static141.aShortArray96[local32] & 0xFF) << 3) + (Static141.aShortArray96[local32] >> 8 & 0x7));
					Static141.aShortArray98[local32] = (short) (((Static141.aShortArray98[local32] & 0xFF) << 3) + (Static141.aShortArray98[local32] >> 8 & 0x7));
					Static141.aShortArray95[local32] = (short) (((Static141.aShortArray95[local32] & 0xFF) << 3) + (Static141.aShortArray95[local32] >> 8 & 0x7));
				}
				Static141.aShortArray102[local32] = -1;
				if (this.aClass2_Sub24_1.anIntArray475[local44] >= 1 && this.aClass2_Sub24_1.anIntArray475[local44] <= 3 && local34 > local36) {
					Static141.aShortArray102[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass2_Sub24_1.anIntArray475[local44] == 5) {
					this.aBoolean141 = true;
				}
			}
		}
		if (local23.anInt2703 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt3200 = local32;
		this.aShortArray103 = new short[local32];
		this.aShortArray94 = new short[local32];
		this.aShortArray99 = new short[local32];
		this.aShortArray97 = new short[local32];
		this.aShortArray100 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray103[local57] = Static141.aShortArray101[local57];
			this.aShortArray94[local57] = Static141.aShortArray96[local57];
			this.aShortArray99[local57] = Static141.aShortArray98[local57];
			this.aShortArray97[local57] = Static141.aShortArray95[local57];
			this.aShortArray100[local57] = Static141.aShortArray102[local57];
		}
	}
}
