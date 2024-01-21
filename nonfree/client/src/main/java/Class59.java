import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class59 {

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	public int anInt2771 = -1;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!ed;")
	public Class4_Sub8 aClass4_Sub8_1 = null;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
	public boolean aBoolean119 = false;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "[S")
	public final short[] aShortArray40;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "[S")
	public final short[] aShortArray36;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[S")
	public final short[] aShortArray37;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "[S")
	public final short[] aShortArray35;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "[S")
	public final short[] aShortArray34;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([BLclient!ed;)V")
	public Class59(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub8 arg1) {
		this.aClass4_Sub8_1 = arg1;
		@Pc(18) Class4_Sub11 local18 = new Class4_Sub11(arg0);
		@Pc(23) Class4_Sub11 local23 = new Class4_Sub11(arg0);
		local18.anInt1597 = 2;
		@Pc(30) int local30 = local18.method1253();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt1597 = local18.anInt1597 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass4_Sub8_1.anIntArray92[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method1253();
			if (local57 > 0) {
				if (this.aClass4_Sub8_1.anIntArray92[local44] == 0) {
					local36 = local44;
				}
				Static115.aShortArray38[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass4_Sub8_1.anIntArray92[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static115.aShortArray39[local32] = local74;
				} else {
					Static115.aShortArray39[local32] = (short) local23.method1255();
				}
				if ((local57 & 0x2) == 0) {
					Static115.aShortArray42[local32] = local74;
				} else {
					Static115.aShortArray42[local32] = (short) local23.method1255();
				}
				if ((local57 & 0x4) == 0) {
					Static115.aShortArray41[local32] = local74;
				} else {
					Static115.aShortArray41[local32] = (short) local23.method1255();
				}
				if (this.aClass4_Sub8_1.anIntArray92[local44] == 2) {
					Static115.aShortArray39[local32] = (short) (((Static115.aShortArray39[local32] & 0xFF) << 3) + (Static115.aShortArray39[local32] >> 8 & 0x7));
					Static115.aShortArray42[local32] = (short) (((Static115.aShortArray42[local32] & 0xFF) << 3) + (Static115.aShortArray42[local32] >> 8 & 0x7));
					Static115.aShortArray41[local32] = (short) (((Static115.aShortArray41[local32] & 0xFF) << 3) + (Static115.aShortArray41[local32] >> 8 & 0x7));
				}
				Static115.aShortArray43[local32] = -1;
				if (this.aClass4_Sub8_1.anIntArray92[local44] >= 1 && this.aClass4_Sub8_1.anIntArray92[local44] <= 3 && local34 > local36) {
					Static115.aShortArray43[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass4_Sub8_1.anIntArray92[local44] == 5) {
					this.aBoolean119 = true;
				}
			}
		}
		if (local23.anInt1597 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2771 = local32;
		this.aShortArray40 = new short[local32];
		this.aShortArray36 = new short[local32];
		this.aShortArray37 = new short[local32];
		this.aShortArray35 = new short[local32];
		this.aShortArray34 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray40[local57] = Static115.aShortArray38[local57];
			this.aShortArray36[local57] = Static115.aShortArray39[local57];
			this.aShortArray37[local57] = Static115.aShortArray42[local57];
			this.aShortArray35[local57] = Static115.aShortArray41[local57];
			this.aShortArray34[local57] = Static115.aShortArray43[local57];
		}
	}
}
