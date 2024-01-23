import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class39 {

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Z")
	public boolean aBoolean98 = false;

	@OriginalMember(owner = "client!em", name = "n", descriptor = "Lclient!t;")
	public Class1_Sub30 aClass1_Sub30_1 = null;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "Z")
	public boolean aBoolean99 = false;

	@OriginalMember(owner = "client!em", name = "o", descriptor = "I")
	public int anInt1383 = -1;

	@OriginalMember(owner = "client!em", name = "p", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "([BLclient!t;)V")
	public Class39(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub30 arg1) {
		this.aClass1_Sub30_1 = arg1;
		@Pc(21) Class1_Sub11 local21 = new Class1_Sub11(arg0);
		@Pc(26) Class1_Sub11 local26 = new Class1_Sub11(arg0);
		local21.anInt3264 = 2;
		@Pc(33) int local33 = local21.method2690();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.anInt3264 = local21.anInt3264 + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.aClass1_Sub30_1.anIntArray429[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.method2690();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static65.aShortArray31[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static65.aShortArray32[local35] = local77;
				} else {
					Static65.aShortArray32[local35] = (short) local26.method2644();
				}
				if ((local64 & 0x2) == 0) {
					Static65.aShortArray25[local35] = local77;
				} else {
					Static65.aShortArray25[local35] = (short) local26.method2644();
				}
				if ((local64 & 0x4) == 0) {
					Static65.aShortArray29[local35] = local77;
				} else {
					Static65.aShortArray29[local35] = (short) local26.method2644();
				}
				Static65.aByteArray28[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static65.aShortArray32[local35] = (short) (((Static65.aShortArray32[local35] & 0xFF) << 3) + (Static65.aShortArray32[local35] >> 8 & 0x7));
					Static65.aShortArray25[local35] = (short) (((Static65.aShortArray25[local35] & 0xFF) << 3) + (Static65.aShortArray25[local35] >> 8 & 0x7));
					Static65.aShortArray29[local35] = (short) (((Static65.aShortArray29[local35] & 0xFF) << 3) + (Static65.aShortArray29[local35] >> 8 & 0x7));
				}
				Static65.aShortArray27[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static65.aShortArray27[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean98 = true;
				} else if (local56 == 7) {
					this.aBoolean99 = true;
				}
				local35++;
			}
		}
		if (local26.anInt3264 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1383 = local35;
		this.aShortArray33 = new short[local35];
		this.aShortArray30 = new short[local35];
		this.aShortArray28 = new short[local35];
		this.aShortArray24 = new short[local35];
		this.aShortArray26 = new short[local35];
		this.aByteArray27 = new byte[local35];
		for (local47 = 0; local47 < local35; local47++) {
			this.aShortArray33[local47] = Static65.aShortArray31[local47];
			this.aShortArray30[local47] = Static65.aShortArray32[local47];
			this.aShortArray28[local47] = Static65.aShortArray25[local47];
			this.aShortArray24[local47] = Static65.aShortArray29[local47];
			this.aShortArray26[local47] = Static65.aShortArray27[local47];
			this.aByteArray27[local47] = Static65.aByteArray28[local47];
		}
	}
}
