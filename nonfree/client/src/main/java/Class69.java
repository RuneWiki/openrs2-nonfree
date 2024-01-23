import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class69 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "Z")
	public boolean aBoolean155 = false;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "I")
	public int anInt2794 = -1;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "Lclient!ca;")
	public Class1_Sub4 aClass1_Sub4_1 = null;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "[S")
	public short[] aShortArray37;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "[S")
	public short[] aShortArray38;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "([BLclient!ca;)V")
	public Class69(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub4 arg1) {
		this.aClass1_Sub4_1 = arg1;
		@Pc(18) Class1_Sub9 local18 = new Class1_Sub9(arg0);
		@Pc(23) Class1_Sub9 local23 = new Class1_Sub9(arg0);
		local18.anInt1192 = 2;
		@Pc(30) int local30 = local18.method895();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt1192 = local18.anInt1192 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass1_Sub4_1.anIntArray87[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method895();
			if (local57 > 0) {
				if (this.aClass1_Sub4_1.anIntArray87[local44] == 0) {
					local36 = local44;
				}
				Static127.aShortArray33[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass1_Sub4_1.anIntArray87[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static127.aShortArray34[local32] = local74;
				} else {
					Static127.aShortArray34[local32] = (short) local23.method926();
				}
				if ((local57 & 0x2) == 0) {
					Static127.aShortArray36[local32] = local74;
				} else {
					Static127.aShortArray36[local32] = (short) local23.method926();
				}
				if ((local57 & 0x4) == 0) {
					Static127.aShortArray40[local32] = local74;
				} else {
					Static127.aShortArray40[local32] = (short) local23.method926();
				}
				if (this.aClass1_Sub4_1.anIntArray87[local44] == 2) {
					Static127.aShortArray34[local32] = (short) (((Static127.aShortArray34[local32] & 0xFF) << 3) + (Static127.aShortArray34[local32] >> 8 & 0x7));
					Static127.aShortArray36[local32] = (short) (((Static127.aShortArray36[local32] & 0xFF) << 3) + (Static127.aShortArray36[local32] >> 8 & 0x7));
					Static127.aShortArray40[local32] = (short) (((Static127.aShortArray40[local32] & 0xFF) << 3) + (Static127.aShortArray40[local32] >> 8 & 0x7));
				}
				Static127.aShortArray42[local32] = -1;
				if (this.aClass1_Sub4_1.anIntArray87[local44] >= 1 && this.aClass1_Sub4_1.anIntArray87[local44] <= 3 && local34 > local36) {
					Static127.aShortArray42[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass1_Sub4_1.anIntArray87[local44] == 5) {
					this.aBoolean155 = true;
				}
			}
		}
		if (local23.anInt1192 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2794 = local32;
		this.aShortArray37 = new short[local32];
		this.aShortArray41 = new short[local32];
		this.aShortArray35 = new short[local32];
		this.aShortArray38 = new short[local32];
		this.aShortArray39 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray37[local57] = Static127.aShortArray33[local57];
			this.aShortArray41[local57] = Static127.aShortArray34[local57];
			this.aShortArray35[local57] = Static127.aShortArray36[local57];
			this.aShortArray38[local57] = Static127.aShortArray40[local57];
			this.aShortArray39[local57] = Static127.aShortArray42[local57];
		}
	}
}
