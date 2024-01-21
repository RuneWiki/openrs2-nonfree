import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class81 {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!ia;")
	public Class3_Sub12 aClass3_Sub12_1 = null;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "Z")
	public boolean aBoolean149 = false;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
	public int anInt3315 = -1;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "[S")
	public final short[] aShortArray53;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "[S")
	public final short[] aShortArray47;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "[S")
	public final short[] aShortArray46;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "[S")
	public final short[] aShortArray52;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "[S")
	public final short[] aShortArray45;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([BLclient!ia;)V")
	public Class81(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub12 arg1) {
		this.aClass3_Sub12_1 = arg1;
		@Pc(18) Class3_Sub4 local18 = new Class3_Sub4(arg0);
		@Pc(23) Class3_Sub4 local23 = new Class3_Sub4(arg0);
		local18.anInt1758 = 2;
		@Pc(30) int local30 = local18.method1278();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt1758 = local18.anInt1758 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass3_Sub12_1.anIntArray89[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method1278();
			if (local57 > 0) {
				if (this.aClass3_Sub12_1.anIntArray89[local44] == 0) {
					local36 = local44;
				}
				Static162.aShortArray49[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass3_Sub12_1.anIntArray89[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static162.aShortArray51[local32] = local74;
				} else {
					Static162.aShortArray51[local32] = (short) local23.method1291();
				}
				if ((local57 & 0x2) == 0) {
					Static162.aShortArray48[local32] = local74;
				} else {
					Static162.aShortArray48[local32] = (short) local23.method1291();
				}
				if ((local57 & 0x4) == 0) {
					Static162.aShortArray50[local32] = local74;
				} else {
					Static162.aShortArray50[local32] = (short) local23.method1291();
				}
				if (this.aClass3_Sub12_1.anIntArray89[local44] == 2) {
					Static162.aShortArray51[local32] = (short) (((Static162.aShortArray51[local32] & 0xFF) << 3) + (Static162.aShortArray51[local32] >> 8 & 0x7));
					Static162.aShortArray48[local32] = (short) (((Static162.aShortArray48[local32] & 0xFF) << 3) + (Static162.aShortArray48[local32] >> 8 & 0x7));
					Static162.aShortArray50[local32] = (short) (((Static162.aShortArray50[local32] & 0xFF) << 3) + (Static162.aShortArray50[local32] >> 8 & 0x7));
				}
				Static162.aShortArray54[local32] = -1;
				if (this.aClass3_Sub12_1.anIntArray89[local44] >= 1 && this.aClass3_Sub12_1.anIntArray89[local44] <= 3 && local34 > local36) {
					Static162.aShortArray54[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass3_Sub12_1.anIntArray89[local44] == 5) {
					this.aBoolean149 = true;
				}
			}
		}
		if (local23.anInt1758 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt3315 = local32;
		this.aShortArray53 = new short[local32];
		this.aShortArray47 = new short[local32];
		this.aShortArray46 = new short[local32];
		this.aShortArray52 = new short[local32];
		this.aShortArray45 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray53[local57] = Static162.aShortArray49[local57];
			this.aShortArray47[local57] = Static162.aShortArray51[local57];
			this.aShortArray46[local57] = Static162.aShortArray48[local57];
			this.aShortArray52[local57] = Static162.aShortArray50[local57];
			this.aShortArray45[local57] = Static162.aShortArray54[local57];
		}
	}
}
