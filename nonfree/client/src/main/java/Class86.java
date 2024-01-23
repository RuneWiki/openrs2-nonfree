import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class86 {

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Z")
	public boolean aBoolean253 = false;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	public int anInt4088 = -1;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!ha;")
	public Class2_Sub12 aClass2_Sub12_1 = null;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "[S")
	public short[] aShortArray129;

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "[S")
	public short[] aShortArray131;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "[S")
	public short[] aShortArray128;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "[S")
	public short[] aShortArray133;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "[S")
	public short[] aShortArray124;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([BLclient!ha;)V")
	public Class86(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub12 arg1) {
		this.aClass2_Sub12_1 = arg1;
		@Pc(18) Class2_Sub3 local18 = new Class2_Sub3(arg0);
		@Pc(23) Class2_Sub3 local23 = new Class2_Sub3(arg0);
		local18.anInt239 = 2;
		@Pc(30) int local30 = local18.method209();
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		local23.anInt239 = local18.anInt239 + local30;
		@Pc(57) int local57;
		for (@Pc(44) int local44 = 0; local44 < local30; local44++) {
			if (this.aClass2_Sub12_1.anIntArray169[local44] == 0) {
				local34 = local44;
			}
			local57 = local18.method209();
			if (local57 > 0) {
				if (this.aClass2_Sub12_1.anIntArray169[local44] == 0) {
					local36 = local44;
				}
				Static174.aShortArray125[local32] = (short) local44;
				@Pc(74) short local74 = 0;
				if (this.aClass2_Sub12_1.anIntArray169[local44] == 3) {
					local74 = 128;
				}
				if ((local57 & 0x1) == 0) {
					Static174.aShortArray130[local32] = local74;
				} else {
					Static174.aShortArray130[local32] = (short) local23.method204();
				}
				if ((local57 & 0x2) == 0) {
					Static174.aShortArray127[local32] = local74;
				} else {
					Static174.aShortArray127[local32] = (short) local23.method204();
				}
				if ((local57 & 0x4) == 0) {
					Static174.aShortArray126[local32] = local74;
				} else {
					Static174.aShortArray126[local32] = (short) local23.method204();
				}
				if (this.aClass2_Sub12_1.anIntArray169[local44] == 2) {
					Static174.aShortArray130[local32] = (short) (((Static174.aShortArray130[local32] & 0xFF) << 3) + (Static174.aShortArray130[local32] >> 8 & 0x7));
					Static174.aShortArray127[local32] = (short) (((Static174.aShortArray127[local32] & 0xFF) << 3) + (Static174.aShortArray127[local32] >> 8 & 0x7));
					Static174.aShortArray126[local32] = (short) (((Static174.aShortArray126[local32] & 0xFF) << 3) + (Static174.aShortArray126[local32] >> 8 & 0x7));
				}
				Static174.aShortArray132[local32] = -1;
				if (this.aClass2_Sub12_1.anIntArray169[local44] >= 1 && this.aClass2_Sub12_1.anIntArray169[local44] <= 3 && local34 > local36) {
					Static174.aShortArray132[local32] = (short) local34;
					local36 = local34;
				}
				local32++;
				if (this.aClass2_Sub12_1.anIntArray169[local44] == 5) {
					this.aBoolean253 = true;
				}
			}
		}
		if (local23.anInt239 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt4088 = local32;
		this.aShortArray129 = new short[local32];
		this.aShortArray131 = new short[local32];
		this.aShortArray128 = new short[local32];
		this.aShortArray133 = new short[local32];
		this.aShortArray124 = new short[local32];
		for (local57 = 0; local57 < local32; local57++) {
			this.aShortArray129[local57] = Static174.aShortArray125[local57];
			this.aShortArray131[local57] = Static174.aShortArray130[local57];
			this.aShortArray128[local57] = Static174.aShortArray127[local57];
			this.aShortArray133[local57] = Static174.aShortArray126[local57];
			this.aShortArray124[local57] = Static174.aShortArray132[local57];
		}
	}
}
