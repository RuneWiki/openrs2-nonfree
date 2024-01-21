import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class73 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	public int anInt2879 = -1;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "Z")
	public boolean aBoolean116 = false;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!kg;")
	public Class1_Sub18 aClass1_Sub18_1 = null;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "[S")
	public final short[] aShortArray34;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "[S")
	public final short[] aShortArray29;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "[S")
	public final short[] aShortArray30;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "[S")
	public final short[] aShortArray31;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "[S")
	public final short[] aShortArray32;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([BLclient!kg;)V")
	public Class73(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub18 arg1) {
		this.aClass1_Sub18_1 = arg1;
		@Pc(18) Class1_Sub8 local18 = new Class1_Sub8(arg0);
		@Pc(23) Class1_Sub8 local23 = new Class1_Sub8(arg0);
		local18.anInt446 = 2;
		@Pc(30) int local30 = local18.method336();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt446 = local18.anInt446 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass1_Sub18_1.anIntArray220[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method336();
			if (local57 > 0) {
				if (this.aClass1_Sub18_1.anIntArray220[local44] == 0) {
					local36 = local44;
				}
				Static134.aShortArray33[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass1_Sub18_1.anIntArray220[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static134.aShortArray28[local32] = local74;
				} else {
					Static134.aShortArray28[local32] = (short) local23.method351();
				}
				if ((local57 & 0x2) == 0) {
					Static134.aShortArray36[local32] = local74;
				} else {
					Static134.aShortArray36[local32] = (short) local23.method351();
				}
				if ((local57 & 0x4) == 0) {
					Static134.aShortArray35[local32] = local74;
				} else {
					Static134.aShortArray35[local32] = (short) local23.method351();
				}
				Static134.aShortArray27[local32] = -1;
				if (this.aClass1_Sub18_1.anIntArray220[local44] >= 1 && this.aClass1_Sub18_1.anIntArray220[local44] <= 3 && local34 > local36) {
					Static134.aShortArray27[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass1_Sub18_1.anIntArray220[local44] == 5) {
					this.aBoolean116 = true;
				}
			}
		}
		if (local23.anInt446 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2879 = local32;
		this.aShortArray34 = new short[local32];
		this.aShortArray29 = new short[local32];
		this.aShortArray30 = new short[local32];
		this.aShortArray31 = new short[local32];
		this.aShortArray32 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray34[local57] = Static134.aShortArray33[local57];
			this.aShortArray29[local57] = Static134.aShortArray28[local57];
			this.aShortArray30[local57] = Static134.aShortArray36[local57];
			this.aShortArray31[local57] = Static134.aShortArray35[local57];
			this.aShortArray32[local57] = Static134.aShortArray27[local57];
		}
	}
}
