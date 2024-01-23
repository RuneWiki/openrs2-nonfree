import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class179 {

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
	public int anInt5697 = -1;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "Lclient!gf;")
	public Class8_Sub11 aClass8_Sub11_1 = null;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "Z")
	public boolean aBoolean479 = false;

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "Z")
	public boolean aBoolean480 = false;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "[S")
	public short[] aShortArray88;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "([BLclient!gf;)V")
	public Class179(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class8_Sub11 arg1) {
		this.aClass8_Sub11_1 = arg1;
		@Pc(21) Class8_Sub2 local21 = new Class8_Sub2(arg0);
		@Pc(26) Class8_Sub2 local26 = new Class8_Sub2(arg0);
		local21.anInt2955 = 2;
		@Pc(33) int local33 = local21.method2334();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.anInt2955 = local21.anInt2955 + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.aClass8_Sub11_1.anIntArray127[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.method2334();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static296.aShortArray89[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static296.aShortArray93[local35] = local77;
				} else {
					Static296.aShortArray93[local35] = (short) local26.method2325();
				}
				if ((local64 & 0x2) == 0) {
					Static296.aShortArray86[local35] = local77;
				} else {
					Static296.aShortArray86[local35] = (short) local26.method2325();
				}
				if ((local64 & 0x4) == 0) {
					Static296.aShortArray90[local35] = local77;
				} else {
					Static296.aShortArray90[local35] = (short) local26.method2325();
				}
				Static296.aByteArray76[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static296.aShortArray93[local35] = (short) (((Static296.aShortArray93[local35] & 0xFF) << 3) + (Static296.aShortArray93[local35] >> 8 & 0x7));
					Static296.aShortArray86[local35] = (short) (((Static296.aShortArray86[local35] & 0xFF) << 3) + (Static296.aShortArray86[local35] >> 8 & 0x7));
					Static296.aShortArray90[local35] = (short) (((Static296.aShortArray90[local35] & 0xFF) << 3) + (Static296.aShortArray90[local35] >> 8 & 0x7));
				}
				Static296.aShortArray91[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static296.aShortArray91[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean479 = true;
				} else if (local56 == 7) {
					this.aBoolean480 = true;
				}
				local35++;
			}
		}
		if (local26.anInt2955 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt5697 = local35;
		this.aShortArray92 = new short[local35];
		this.aShortArray87 = new short[local35];
		this.aShortArray94 = new short[local35];
		this.aShortArray85 = new short[local35];
		this.aShortArray88 = new short[local35];
		this.aByteArray75 = new byte[local35];
		for (local47 = 0; local47 < local35; local47++) {
			this.aShortArray92[local47] = Static296.aShortArray89[local47];
			this.aShortArray87[local47] = Static296.aShortArray93[local47];
			this.aShortArray94[local47] = Static296.aShortArray86[local47];
			this.aShortArray85[local47] = Static296.aShortArray90[local47];
			this.aShortArray88[local47] = Static296.aShortArray91[local47];
			this.aByteArray75[local47] = Static296.aByteArray76[local47];
		}
	}
}
