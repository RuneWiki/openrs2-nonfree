import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class97 {

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!li;")
	public Class1_Sub19 aClass1_Sub19_1 = null;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
	public int anInt3863 = -1;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Z")
	public boolean aBoolean181 = false;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "[S")
	public short[] aShortArray38;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([BLclient!li;)V")
	public Class97(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub19 arg1) {
		this.aClass1_Sub19_1 = arg1;
		@Pc(18) Class1_Sub16 local18 = new Class1_Sub16(arg0);
		@Pc(23) Class1_Sub16 local23 = new Class1_Sub16(arg0);
		local18.anInt4860 = 2;
		@Pc(30) int local30 = local18.method3793();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt4860 = local18.anInt4860 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass1_Sub19_1.anIntArray158[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method3793();
			if (local57 > 0) {
				if (this.aClass1_Sub19_1.anIntArray158[local44] == 0) {
					local36 = local44;
				}
				Static175.aShortArray35[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass1_Sub19_1.anIntArray158[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static175.aShortArray37[local32] = local74;
				} else {
					Static175.aShortArray37[local32] = (short) local23.method3788();
				}
				if ((local57 & 0x2) == 0) {
					Static175.aShortArray42[local32] = local74;
				} else {
					Static175.aShortArray42[local32] = (short) local23.method3788();
				}
				if ((local57 & 0x4) == 0) {
					Static175.aShortArray40[local32] = local74;
				} else {
					Static175.aShortArray40[local32] = (short) local23.method3788();
				}
				if (this.aClass1_Sub19_1.anIntArray158[local44] == 2) {
					Static175.aShortArray37[local32] = (short) (((Static175.aShortArray37[local32] & 0xFF) << 3) + (Static175.aShortArray37[local32] >> 8 & 0x7));
					Static175.aShortArray42[local32] = (short) (((Static175.aShortArray42[local32] & 0xFF) << 3) + (Static175.aShortArray42[local32] >> 8 & 0x7));
					Static175.aShortArray40[local32] = (short) (((Static175.aShortArray40[local32] & 0xFF) << 3) + (Static175.aShortArray40[local32] >> 8 & 0x7));
				}
				Static175.aShortArray34[local32] = -1;
				if (this.aClass1_Sub19_1.anIntArray158[local44] >= 1 && this.aClass1_Sub19_1.anIntArray158[local44] <= 3 && local34 > local36) {
					Static175.aShortArray34[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass1_Sub19_1.anIntArray158[local44] == 5) {
					this.aBoolean181 = true;
				}
			}
		}
		if (local23.anInt4860 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt3863 = local32;
		this.aShortArray36 = new short[local32];
		this.aShortArray38 = new short[local32];
		this.aShortArray41 = new short[local32];
		this.aShortArray43 = new short[local32];
		this.aShortArray39 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray36[local57] = Static175.aShortArray35[local57];
			this.aShortArray38[local57] = Static175.aShortArray37[local57];
			this.aShortArray41[local57] = Static175.aShortArray42[local57];
			this.aShortArray43[local57] = Static175.aShortArray40[local57];
			this.aShortArray39[local57] = Static175.aShortArray34[local57];
		}
	}
}
