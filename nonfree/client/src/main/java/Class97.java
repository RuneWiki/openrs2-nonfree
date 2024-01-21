import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class97 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
	public int anInt3729 = -1;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "Lclient!ci;")
	public Class2_Sub8 aClass2_Sub8_1 = null;

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "Z")
	public boolean aBoolean174 = false;

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "[S")
	public final short[] aShortArray46;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "[S")
	public final short[] aShortArray45;

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "[S")
	public final short[] aShortArray47;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "[S")
	public final short[] aShortArray50;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "[S")
	public final short[] aShortArray43;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "([BLclient!ci;)V")
	public Class97(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub8 arg1) {
		this.aClass2_Sub8_1 = arg1;
		@Pc(18) Class2_Sub3 local18 = new Class2_Sub3(arg0);
		@Pc(23) Class2_Sub3 local23 = new Class2_Sub3(arg0);
		local18.anInt340 = 2;
		@Pc(30) int local30 = local18.method260();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt340 = local18.anInt340 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass2_Sub8_1.anIntArray62[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method260();
			if (local57 > 0) {
				if (this.aClass2_Sub8_1.anIntArray62[local44] == 0) {
					local36 = local44;
				}
				Static187.aShortArray44[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass2_Sub8_1.anIntArray62[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static187.aShortArray48[local32] = local74;
				} else {
					Static187.aShortArray48[local32] = (short) local23.method241();
				}
				if ((local57 & 0x2) == 0) {
					Static187.aShortArray41[local32] = local74;
				} else {
					Static187.aShortArray41[local32] = (short) local23.method241();
				}
				if ((local57 & 0x4) == 0) {
					Static187.aShortArray42[local32] = local74;
				} else {
					Static187.aShortArray42[local32] = (short) local23.method241();
				}
				if (this.aClass2_Sub8_1.anIntArray62[local44] == 2) {
					Static187.aShortArray48[local32] = (short) (((Static187.aShortArray48[local32] & 0xFF) << 3) + (Static187.aShortArray48[local32] >> 8 & 0x7));
					Static187.aShortArray41[local32] = (short) (((Static187.aShortArray41[local32] & 0xFF) << 3) + (Static187.aShortArray41[local32] >> 8 & 0x7));
					Static187.aShortArray42[local32] = (short) (((Static187.aShortArray42[local32] & 0xFF) << 3) + (Static187.aShortArray42[local32] >> 8 & 0x7));
				}
				Static187.aShortArray49[local32] = -1;
				if (this.aClass2_Sub8_1.anIntArray62[local44] >= 1 && this.aClass2_Sub8_1.anIntArray62[local44] <= 3 && local34 > local36) {
					Static187.aShortArray49[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass2_Sub8_1.anIntArray62[local44] == 5) {
					this.aBoolean174 = true;
				}
			}
		}
		if (local23.anInt340 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt3729 = local32;
		this.aShortArray46 = new short[local32];
		this.aShortArray45 = new short[local32];
		this.aShortArray47 = new short[local32];
		this.aShortArray50 = new short[local32];
		this.aShortArray43 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray46[local57] = Static187.aShortArray44[local57];
			this.aShortArray45[local57] = Static187.aShortArray48[local57];
			this.aShortArray47[local57] = Static187.aShortArray41[local57];
			this.aShortArray50[local57] = Static187.aShortArray42[local57];
			this.aShortArray43[local57] = Static187.aShortArray49[local57];
		}
	}
}
