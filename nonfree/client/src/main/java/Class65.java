import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class65 {

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
	public int anInt2669 = -1;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "Z")
	public boolean aBoolean107 = false;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "Lclient!ke;")
	public Class3_Sub14 aClass3_Sub14_1 = null;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "[S")
	public final short[] aShortArray34;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "[S")
	public final short[] aShortArray28;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "[S")
	public final short[] aShortArray31;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "[S")
	public final short[] aShortArray37;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "[S")
	public final short[] aShortArray29;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "([BLclient!ke;)V")
	public Class65(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub14 arg1) {
		this.aClass3_Sub14_1 = arg1;
		@Pc(18) Class3_Sub17 local18 = new Class3_Sub17(arg0);
		@Pc(23) Class3_Sub17 local23 = new Class3_Sub17(arg0);
		local18.anInt2923 = 2;
		@Pc(30) int local30 = local18.method2107();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt2923 = local18.anInt2923 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass3_Sub14_1.anIntArray275[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method2107();
			if (local57 > 0) {
				if (this.aClass3_Sub14_1.anIntArray275[local44] == 0) {
					local36 = local44;
				}
				Static123.aShortArray33[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass3_Sub14_1.anIntArray275[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static123.aShortArray30[local32] = local74;
				} else {
					Static123.aShortArray30[local32] = (short) local23.method2127();
				}
				if ((local57 & 0x2) == 0) {
					Static123.aShortArray35[local32] = local74;
				} else {
					Static123.aShortArray35[local32] = (short) local23.method2127();
				}
				if ((local57 & 0x4) == 0) {
					Static123.aShortArray36[local32] = local74;
				} else {
					Static123.aShortArray36[local32] = (short) local23.method2127();
				}
				if (this.aClass3_Sub14_1.anIntArray275[local44] == 2) {
					Static123.aShortArray30[local32] = (short) (((Static123.aShortArray30[local32] & 0xFF) << 3) + (Static123.aShortArray30[local32] >> 8 & 0x7));
					Static123.aShortArray35[local32] = (short) (((Static123.aShortArray35[local32] & 0xFF) << 3) + (Static123.aShortArray35[local32] >> 8 & 0x7));
					Static123.aShortArray36[local32] = (short) (((Static123.aShortArray36[local32] & 0xFF) << 3) + (Static123.aShortArray36[local32] >> 8 & 0x7));
				}
				Static123.aShortArray32[local32] = -1;
				if (this.aClass3_Sub14_1.anIntArray275[local44] >= 1 && this.aClass3_Sub14_1.anIntArray275[local44] <= 3 && local34 > local36) {
					Static123.aShortArray32[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass3_Sub14_1.anIntArray275[local44] == 5) {
					this.aBoolean107 = true;
				}
			}
		}
		if (local23.anInt2923 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2669 = local32;
		this.aShortArray34 = new short[local32];
		this.aShortArray28 = new short[local32];
		this.aShortArray31 = new short[local32];
		this.aShortArray37 = new short[local32];
		this.aShortArray29 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray34[local57] = Static123.aShortArray33[local57];
			this.aShortArray28[local57] = Static123.aShortArray30[local57];
			this.aShortArray31[local57] = Static123.aShortArray35[local57];
			this.aShortArray37[local57] = Static123.aShortArray36[local57];
			this.aShortArray29[local57] = Static123.aShortArray32[local57];
		}
	}
}
