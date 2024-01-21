import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class48 {

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Z")
	public boolean aBoolean209 = false;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "I")
	public int anInt2785 = -1;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "Lclient!af;")
	public Class1_Sub3 aClass1_Sub3_1 = null;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "[S")
	public final short[] aShortArray27;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "[S")
	public final short[] aShortArray26;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "[S")
	public final short[] aShortArray30;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "[S")
	public final short[] aShortArray29;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "[S")
	public final short[] aShortArray28;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "([BLclient!af;)V")
	public Class48(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		this.aClass1_Sub3_1 = arg1;
		@Pc(18) Class1_Sub8 local18 = new Class1_Sub8(arg0);
		@Pc(23) Class1_Sub8 local23 = new Class1_Sub8(arg0);
		local18.anInt2195 = 2;
		@Pc(30) int local30 = local18.method1607();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt2195 = local18.anInt2195 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass1_Sub3_1.anIntArray27[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method1607();
			if (local57 > 0) {
				if (this.aClass1_Sub3_1.anIntArray27[local44] == 0) {
					local36 = local44;
				}
				Static100.aShortArray23[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass1_Sub3_1.anIntArray27[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static100.aShortArray24[local32] = local74;
				} else {
					Static100.aShortArray24[local32] = (short) local23.method1608();
				}
				if ((local57 & 0x2) == 0) {
					Static100.aShortArray22[local32] = local74;
				} else {
					Static100.aShortArray22[local32] = (short) local23.method1608();
				}
				if ((local57 & 0x4) == 0) {
					Static100.aShortArray25[local32] = local74;
				} else {
					Static100.aShortArray25[local32] = (short) local23.method1608();
				}
				if (this.aClass1_Sub3_1.anIntArray27[local44] == 2) {
					Static100.aShortArray24[local32] = (short) (((Static100.aShortArray24[local32] & 0xFF) << 3) + (Static100.aShortArray24[local32] >> 8 & 0x7));
					Static100.aShortArray22[local32] = (short) (((Static100.aShortArray22[local32] & 0xFF) << 3) + (Static100.aShortArray22[local32] >> 8 & 0x7));
					Static100.aShortArray25[local32] = (short) (((Static100.aShortArray25[local32] & 0xFF) << 3) + (Static100.aShortArray25[local32] >> 8 & 0x7));
				}
				Static100.aShortArray21[local32] = -1;
				if (this.aClass1_Sub3_1.anIntArray27[local44] >= 1 && this.aClass1_Sub3_1.anIntArray27[local44] <= 3 && local34 > local36) {
					Static100.aShortArray21[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass1_Sub3_1.anIntArray27[local44] == 5) {
					this.aBoolean209 = true;
				}
			}
		}
		if (local23.anInt2195 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2785 = local32;
		this.aShortArray27 = new short[local32];
		this.aShortArray26 = new short[local32];
		this.aShortArray30 = new short[local32];
		this.aShortArray29 = new short[local32];
		this.aShortArray28 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray27[local57] = Static100.aShortArray23[local57];
			this.aShortArray26[local57] = Static100.aShortArray24[local57];
			this.aShortArray30[local57] = Static100.aShortArray22[local57];
			this.aShortArray29[local57] = Static100.aShortArray25[local57];
			this.aShortArray28[local57] = Static100.aShortArray21[local57];
		}
	}
}
