import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class88 {

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Z")
	public boolean aBoolean185 = false;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "Lclient!ai;")
	public Class4_Sub3 aClass4_Sub3_1 = null;

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "Z")
	public boolean aBoolean186 = false;

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
	public int anInt2800 = -1;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([BLclient!ai;)V")
	public Class88(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub3 arg1) {
		this.aClass4_Sub3_1 = arg1;
		@Pc(21) Class4_Sub17 local21 = new Class4_Sub17(arg0);
		@Pc(26) Class4_Sub17 local26 = new Class4_Sub17(arg0);
		local21.anInt2400 = 2;
		@Pc(33) int local33 = local21.method1874();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.anInt2400 = local21.anInt2400 + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.aClass4_Sub3_1.anIntArray13[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.method1874();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static135.aShortArray31[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static135.aShortArray26[local35] = local77;
				} else {
					Static135.aShortArray26[local35] = (short) local26.method1863();
				}
				if ((local64 & 0x2) == 0) {
					Static135.aShortArray30[local35] = local77;
				} else {
					Static135.aShortArray30[local35] = (short) local26.method1863();
				}
				if ((local64 & 0x4) == 0) {
					Static135.aShortArray33[local35] = local77;
				} else {
					Static135.aShortArray33[local35] = (short) local26.method1863();
				}
				Static135.aByteArray34[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static135.aShortArray26[local35] = (short) (((Static135.aShortArray26[local35] & 0xFF) << 3) + (Static135.aShortArray26[local35] >> 8 & 0x7));
					Static135.aShortArray30[local35] = (short) (((Static135.aShortArray30[local35] & 0xFF) << 3) + (Static135.aShortArray30[local35] >> 8 & 0x7));
					Static135.aShortArray33[local35] = (short) (((Static135.aShortArray33[local35] & 0xFF) << 3) + (Static135.aShortArray33[local35] >> 8 & 0x7));
				}
				Static135.aShortArray25[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static135.aShortArray25[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean185 = true;
				} else if (local56 == 7) {
					this.aBoolean186 = true;
				}
				local35++;
			}
		}
		if (local26.anInt2400 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2800 = local35;
		this.aShortArray29 = new short[local35];
		this.aShortArray28 = new short[local35];
		this.aShortArray27 = new short[local35];
		this.aShortArray24 = new short[local35];
		this.aShortArray32 = new short[local35];
		this.aByteArray35 = new byte[local35];
		for (local47 = 0; local47 < local35; local47++) {
			this.aShortArray29[local47] = Static135.aShortArray31[local47];
			this.aShortArray28[local47] = Static135.aShortArray26[local47];
			this.aShortArray27[local47] = Static135.aShortArray30[local47];
			this.aShortArray24[local47] = Static135.aShortArray33[local47];
			this.aShortArray32[local47] = Static135.aShortArray25[local47];
			this.aByteArray35[local47] = Static135.aByteArray34[local47];
		}
	}
}
