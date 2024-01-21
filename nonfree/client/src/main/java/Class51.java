import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class51 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Z")
	public boolean aBoolean103 = false;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Lclient!qc;")
	public Class1_Sub22 aClass1_Sub22_1 = null;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "I")
	public int anInt2555 = -1;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "[S")
	public final short[] aShortArray41;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "[S")
	public final short[] aShortArray44;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "[S")
	public final short[] aShortArray40;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "[S")
	public final short[] aShortArray37;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "[S")
	public final short[] aShortArray36;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "([BLclient!qc;)V")
	public Class51(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub22 arg1) {
		this.aClass1_Sub22_1 = arg1;
		@Pc(18) Class1_Sub14 local18 = new Class1_Sub14(arg0);
		@Pc(23) Class1_Sub14 local23 = new Class1_Sub14(arg0);
		local18.anInt2306 = 2;
		@Pc(30) int local30 = local18.method1738();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt2306 = local18.anInt2306 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass1_Sub22_1.anIntArray403[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method1738();
			if (local57 > 0) {
				if (this.aClass1_Sub22_1.anIntArray403[local44] == 0) {
					local36 = local44;
				}
				Static103.aShortArray42[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass1_Sub22_1.anIntArray403[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static103.aShortArray38[local32] = local74;
				} else {
					Static103.aShortArray38[local32] = (short) local23.method1733();
				}
				if ((local57 & 0x2) == 0) {
					Static103.aShortArray43[local32] = local74;
				} else {
					Static103.aShortArray43[local32] = (short) local23.method1733();
				}
				if ((local57 & 0x4) == 0) {
					Static103.aShortArray45[local32] = local74;
				} else {
					Static103.aShortArray45[local32] = (short) local23.method1733();
				}
				if (this.aClass1_Sub22_1.anIntArray403[local44] == 2) {
					Static103.aShortArray38[local32] = (short) (((Static103.aShortArray38[local32] & 0xFF) << 3) + (Static103.aShortArray38[local32] >> 8 & 0x7));
					Static103.aShortArray43[local32] = (short) (((Static103.aShortArray43[local32] & 0xFF) << 3) + (Static103.aShortArray43[local32] >> 8 & 0x7));
					Static103.aShortArray45[local32] = (short) (((Static103.aShortArray45[local32] & 0xFF) << 3) + (Static103.aShortArray45[local32] >> 8 & 0x7));
				}
				Static103.aShortArray39[local32] = -1;
				if (this.aClass1_Sub22_1.anIntArray403[local44] >= 1 && this.aClass1_Sub22_1.anIntArray403[local44] <= 3 && local34 > local36) {
					Static103.aShortArray39[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass1_Sub22_1.anIntArray403[local44] == 5) {
					this.aBoolean103 = true;
				}
			}
		}
		if (local23.anInt2306 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2555 = local32;
		this.aShortArray41 = new short[local32];
		this.aShortArray44 = new short[local32];
		this.aShortArray40 = new short[local32];
		this.aShortArray37 = new short[local32];
		this.aShortArray36 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray41[local57] = Static103.aShortArray42[local57];
			this.aShortArray44[local57] = Static103.aShortArray38[local57];
			this.aShortArray40[local57] = Static103.aShortArray43[local57];
			this.aShortArray37[local57] = Static103.aShortArray45[local57];
			this.aShortArray36[local57] = Static103.aShortArray39[local57];
		}
	}
}
