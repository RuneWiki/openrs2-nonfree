import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class89 {

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "Lclient!uj;")
	public Class1_Sub28 aClass1_Sub28_1 = null;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
	public int anInt3424 = -1;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "([BLclient!uj;)V")
	public Class89(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub28 arg1) {
		this.aClass1_Sub28_1 = arg1;
		@Pc(18) Class1_Sub17 local18 = new Class1_Sub17(arg0);
		@Pc(23) Class1_Sub17 local23 = new Class1_Sub17(arg0);
		local18.anInt2656 = 2;
		@Pc(30) int local30 = local18.method2142();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt2656 = local18.anInt2656 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass1_Sub28_1.anIntArray483[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method2142();
			if (local57 > 0) {
				if (this.aClass1_Sub28_1.anIntArray483[local44] == 0) {
					local36 = local44;
				}
				Static168.aShortArray47[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass1_Sub28_1.anIntArray483[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static168.aShortArray44[local32] = local74;
				} else {
					Static168.aShortArray44[local32] = (short) local23.method2177();
				}
				if ((local57 & 0x2) == 0) {
					Static168.aShortArray45[local32] = local74;
				} else {
					Static168.aShortArray45[local32] = (short) local23.method2177();
				}
				if ((local57 & 0x4) == 0) {
					Static168.aShortArray46[local32] = local74;
				} else {
					Static168.aShortArray46[local32] = (short) local23.method2177();
				}
				if (this.aClass1_Sub28_1.anIntArray483[local44] == 2) {
					Static168.aShortArray44[local32] = (short) (((Static168.aShortArray44[local32] & 0xFF) << 3) + (Static168.aShortArray44[local32] >> 8 & 0x7));
					Static168.aShortArray45[local32] = (short) (((Static168.aShortArray45[local32] & 0xFF) << 3) + (Static168.aShortArray45[local32] >> 8 & 0x7));
					Static168.aShortArray46[local32] = (short) (((Static168.aShortArray46[local32] & 0xFF) << 3) + (Static168.aShortArray46[local32] >> 8 & 0x7));
				}
				Static168.aShortArray51[local32] = -1;
				if (this.aClass1_Sub28_1.anIntArray483[local44] >= 1 && this.aClass1_Sub28_1.anIntArray483[local44] <= 3 && local34 > local36) {
					Static168.aShortArray51[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass1_Sub28_1.anIntArray483[local44] == 5) {
					this.aBoolean146 = true;
				}
			}
		}
		if (local23.anInt2656 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt3424 = local32;
		this.aShortArray48 = new short[local32];
		this.aShortArray49 = new short[local32];
		this.aShortArray50 = new short[local32];
		this.aShortArray52 = new short[local32];
		this.aShortArray53 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray48[local57] = Static168.aShortArray47[local57];
			this.aShortArray49[local57] = Static168.aShortArray44[local57];
			this.aShortArray50[local57] = Static168.aShortArray45[local57];
			this.aShortArray52[local57] = Static168.aShortArray46[local57];
			this.aShortArray53[local57] = Static168.aShortArray51[local57];
		}
	}
}
