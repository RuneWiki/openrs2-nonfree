import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class124 {

	@OriginalMember(owner = "client!w", name = "g", descriptor = "I")
	public int anInt4897 = -1;

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Lclient!pb;")
	public Class1_Sub23 aClass1_Sub23_1 = null;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Z")
	public boolean aBoolean435 = false;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "([BLclient!pb;)V")
	public Class124(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub23 arg1) {
		this.aClass1_Sub23_1 = arg1;
		@Pc(18) Class1_Sub26 local18 = new Class1_Sub26(arg0);
		@Pc(23) Class1_Sub26 local23 = new Class1_Sub26(arg0);
		local18.anInt4021 = 2;
		@Pc(30) int local30 = local18.method2945();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt4021 = local18.anInt4021 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass1_Sub23_1.anIntArray310[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method2945();
			if (local57 > 0) {
				if (this.aClass1_Sub23_1.anIntArray310[local44] == 0) {
					local36 = local44;
				}
				Static226.aShortArray62[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass1_Sub23_1.anIntArray310[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static226.aShortArray56[local32] = local74;
				} else {
					Static226.aShortArray56[local32] = (short) local23.method2965();
				}
				if ((local57 & 0x2) == 0) {
					Static226.aShortArray55[local32] = local74;
				} else {
					Static226.aShortArray55[local32] = (short) local23.method2965();
				}
				if ((local57 & 0x4) == 0) {
					Static226.aShortArray59[local32] = local74;
				} else {
					Static226.aShortArray59[local32] = (short) local23.method2965();
				}
				if (this.aClass1_Sub23_1.anIntArray310[local44] == 2) {
					Static226.aShortArray56[local32] = (short) (((Static226.aShortArray56[local32] & 0xFF) << 3) + (Static226.aShortArray56[local32] >> 8 & 0x7));
					Static226.aShortArray55[local32] = (short) (((Static226.aShortArray55[local32] & 0xFF) << 3) + (Static226.aShortArray55[local32] >> 8 & 0x7));
					Static226.aShortArray59[local32] = (short) (((Static226.aShortArray59[local32] & 0xFF) << 3) + (Static226.aShortArray59[local32] >> 8 & 0x7));
				}
				Static226.aShortArray57[local32] = -1;
				if (this.aClass1_Sub23_1.anIntArray310[local44] >= 1 && this.aClass1_Sub23_1.anIntArray310[local44] <= 3 && local34 > local36) {
					Static226.aShortArray57[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass1_Sub23_1.anIntArray310[local44] == 5) {
					this.aBoolean435 = true;
				}
			}
		}
		if (local23.anInt4021 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt4897 = local32;
		this.aShortArray60 = new short[local32];
		this.aShortArray61 = new short[local32];
		this.aShortArray58 = new short[local32];
		this.aShortArray53 = new short[local32];
		this.aShortArray54 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray60[local57] = Static226.aShortArray62[local57];
			this.aShortArray61[local57] = Static226.aShortArray56[local57];
			this.aShortArray58[local57] = Static226.aShortArray55[local57];
			this.aShortArray53[local57] = Static226.aShortArray59[local57];
			this.aShortArray54[local57] = Static226.aShortArray57[local57];
		}
	}
}
