import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class88 {

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
	public int anInt3918 = -1;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "Z")
	public boolean aBoolean222 = false;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "Lclient!wa;")
	public Class1_Sub26 aClass1_Sub26_1 = null;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "[S")
	public final short[] aShortArray47;

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "[S")
	public final short[] aShortArray49;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "[S")
	public final short[] aShortArray43;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "[S")
	public final short[] aShortArray48;

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "[S")
	public final short[] aShortArray50;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "([BLclient!wa;)V")
	public Class88(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub26 arg1) {
		this.aClass1_Sub26_1 = arg1;
		@Pc(18) Class1_Sub14 local18 = new Class1_Sub14(arg0);
		@Pc(23) Class1_Sub14 local23 = new Class1_Sub14(arg0);
		local18.anInt4061 = 2;
		@Pc(30) int local30 = local18.method3010();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt4061 = local18.anInt4061 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass1_Sub26_1.anIntArray360[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method3010();
			if (local57 > 0) {
				if (this.aClass1_Sub26_1.anIntArray360[local44] == 0) {
					local36 = local44;
				}
				Static182.aShortArray44[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass1_Sub26_1.anIntArray360[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static182.aShortArray46[local32] = local74;
				} else {
					Static182.aShortArray46[local32] = (short) local23.method3045();
				}
				if ((local57 & 0x2) == 0) {
					Static182.aShortArray51[local32] = local74;
				} else {
					Static182.aShortArray51[local32] = (short) local23.method3045();
				}
				if ((local57 & 0x4) == 0) {
					Static182.aShortArray52[local32] = local74;
				} else {
					Static182.aShortArray52[local32] = (short) local23.method3045();
				}
				if (this.aClass1_Sub26_1.anIntArray360[local44] == 2) {
					Static182.aShortArray46[local32] = (short) (((Static182.aShortArray46[local32] & 0xFF) << 3) + (Static182.aShortArray46[local32] >> 8 & 0x7));
					Static182.aShortArray51[local32] = (short) (((Static182.aShortArray51[local32] & 0xFF) << 3) + (Static182.aShortArray51[local32] >> 8 & 0x7));
					Static182.aShortArray52[local32] = (short) (((Static182.aShortArray52[local32] & 0xFF) << 3) + (Static182.aShortArray52[local32] >> 8 & 0x7));
				}
				Static182.aShortArray45[local32] = -1;
				if (this.aClass1_Sub26_1.anIntArray360[local44] >= 1 && this.aClass1_Sub26_1.anIntArray360[local44] <= 3 && local34 > local36) {
					Static182.aShortArray45[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass1_Sub26_1.anIntArray360[local44] == 5) {
					this.aBoolean222 = true;
				}
			}
		}
		if (local23.anInt4061 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt3918 = local32;
		this.aShortArray47 = new short[local32];
		this.aShortArray49 = new short[local32];
		this.aShortArray43 = new short[local32];
		this.aShortArray48 = new short[local32];
		this.aShortArray50 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray47[local57] = Static182.aShortArray44[local57];
			this.aShortArray49[local57] = Static182.aShortArray46[local57];
			this.aShortArray43[local57] = Static182.aShortArray51[local57];
			this.aShortArray48[local57] = Static182.aShortArray52[local57];
			this.aShortArray50[local57] = Static182.aShortArray45[local57];
		}
	}
}
