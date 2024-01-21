import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class51 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "Lclient!kc;")
	public Class2_Sub12 aClass2_Sub12_1 = null;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "Z")
	public boolean aBoolean108 = false;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "I")
	public int anInt2297 = -1;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "[S")
	public final short[] aShortArray83;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "[S")
	public final short[] aShortArray82;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "[S")
	public final short[] aShortArray87;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "[S")
	public final short[] aShortArray78;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "[S")
	public final short[] aShortArray79;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "([BLclient!kc;)V")
	public Class51(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub12 arg1) {
		this.aClass2_Sub12_1 = arg1;
		@Pc(18) Class2_Sub11 local18 = new Class2_Sub11(arg0);
		@Pc(23) Class2_Sub11 local23 = new Class2_Sub11(arg0);
		local18.anInt2235 = 2;
		@Pc(30) int local30 = local18.method1534();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt2235 = local18.anInt2235 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass2_Sub12_1.anIntArray216[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method1534();
			if (local57 > 0) {
				if (this.aClass2_Sub12_1.anIntArray216[local44] == 0) {
					local36 = local44;
				}
				Static100.aShortArray81[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass2_Sub12_1.anIntArray216[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static100.aShortArray86[local32] = local74;
				} else {
					Static100.aShortArray86[local32] = (short) local23.method1553();
				}
				if ((local57 & 0x2) == 0) {
					Static100.aShortArray80[local32] = local74;
				} else {
					Static100.aShortArray80[local32] = (short) local23.method1553();
				}
				if ((local57 & 0x4) == 0) {
					Static100.aShortArray85[local32] = local74;
				} else {
					Static100.aShortArray85[local32] = (short) local23.method1553();
				}
				if (this.aClass2_Sub12_1.anIntArray216[local44] == 2) {
					Static100.aShortArray86[local32] = (short) (((Static100.aShortArray86[local32] & 0xFF) << 3) + (Static100.aShortArray86[local32] >> 8 & 0x7));
					Static100.aShortArray80[local32] = (short) (((Static100.aShortArray80[local32] & 0xFF) << 3) + (Static100.aShortArray80[local32] >> 8 & 0x7));
					Static100.aShortArray85[local32] = (short) (((Static100.aShortArray85[local32] & 0xFF) << 3) + (Static100.aShortArray85[local32] >> 8 & 0x7));
				}
				Static100.aShortArray84[local32] = -1;
				if (this.aClass2_Sub12_1.anIntArray216[local44] >= 1 && this.aClass2_Sub12_1.anIntArray216[local44] <= 3 && local34 > local36) {
					Static100.aShortArray84[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass2_Sub12_1.anIntArray216[local44] == 5) {
					this.aBoolean108 = true;
				}
			}
		}
		if (local23.anInt2235 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2297 = local32;
		this.aShortArray83 = new short[local32];
		this.aShortArray82 = new short[local32];
		this.aShortArray87 = new short[local32];
		this.aShortArray78 = new short[local32];
		this.aShortArray79 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray83[local57] = Static100.aShortArray81[local57];
			this.aShortArray82[local57] = Static100.aShortArray86[local57];
			this.aShortArray87[local57] = Static100.aShortArray80[local57];
			this.aShortArray78[local57] = Static100.aShortArray85[local57];
			this.aShortArray79[local57] = Static100.aShortArray84[local57];
		}
	}
}
