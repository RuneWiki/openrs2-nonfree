import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class33 {

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Z")
	public boolean aBoolean41 = false;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "Lclient!sn;")
	public Class3_Sub39 aClass3_Sub39_1 = null;

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	public int anInt899 = 0;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "Z")
	public boolean aBoolean42 = false;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([BLclient!sn;)V")
	public Class33(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub39 arg1) {
		this.aClass3_Sub39_1 = arg1;
		try {
			@Pc(21) Class3_Sub4 local21 = new Class3_Sub4(arg0);
			@Pc(26) Class3_Sub4 local26 = new Class3_Sub4(arg0);
			local21.anInt4268 = 2;
			@Pc(33) int local33 = local21.method3643();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt4268 = local21.anInt4268 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass3_Sub39_1.anIntArray473[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method3643();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static43.aShortArray20[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static43.aShortArray24[local35] = local75;
					} else {
						Static43.aShortArray24[local35] = (short) local26.method3657();
					}
					if ((local62 & 0x2) == 0) {
						Static43.aShortArray19[local35] = local75;
					} else {
						Static43.aShortArray19[local35] = (short) local26.method3657();
					}
					if ((local62 & 0x4) == 0) {
						Static43.aShortArray17[local35] = local75;
					} else {
						Static43.aShortArray17[local35] = (short) local26.method3657();
					}
					Static43.aByteArray12[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static43.aShortArray24[local35] = (short) (((Static43.aShortArray24[local35] & 0xFF) << 3) + (Static43.aShortArray24[local35] >> 8 & 0x7));
						Static43.aShortArray19[local35] = (short) (((Static43.aShortArray19[local35] & 0xFF) << 3) + (Static43.aShortArray19[local35] >> 8 & 0x7));
						Static43.aShortArray17[local35] = (short) (((Static43.aShortArray17[local35] & 0xFF) << 3) + (Static43.aShortArray17[local35] >> 8 & 0x7));
						Static43.aShortArray24[local35] = (short) (Static43.aShortArray24[local35] << 3);
						Static43.aShortArray19[local35] = (short) (Static43.aShortArray19[local35] << 3);
						Static43.aShortArray17[local35] = (short) (Static43.aShortArray17[local35] << 3);
					}
					Static43.aShortArray26[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static43.aShortArray26[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean41 = true;
					} else if (local54 == 7) {
						this.aBoolean42 = true;
					}
					local35++;
				}
			}
			if (local26.anInt4268 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt899 = local35;
			this.aShortArray21 = new short[local35];
			this.aShortArray25 = new short[local35];
			this.aShortArray22 = new short[local35];
			this.aShortArray23 = new short[local35];
			this.aShortArray18 = new short[local35];
			this.aByteArray11 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray21[local54] = Static43.aShortArray20[local54];
				this.aShortArray25[local54] = Static43.aShortArray24[local54];
				this.aShortArray22[local54] = Static43.aShortArray19[local54];
				this.aShortArray23[local54] = Static43.aShortArray17[local54];
				this.aShortArray18[local54] = Static43.aShortArray26[local54];
				this.aByteArray11[local54] = Static43.aByteArray12[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt899 = 0;
			this.aBoolean41 = false;
			this.aBoolean42 = false;
		}
	}
}
