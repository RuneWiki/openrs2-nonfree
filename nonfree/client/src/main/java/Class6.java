import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class6 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Z")
	public boolean aBoolean7 = false;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Lclient!lr;")
	public Class1_Sub25 aClass1_Sub25_1 = null;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "I")
	public int anInt94 = 0;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "Z")
	public boolean aBoolean8 = false;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "[S")
	public short[] aShortArray5;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "[S")
	public short[] aShortArray4;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "[S")
	public short[] aShortArray6;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "[S")
	public short[] aShortArray2;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "[S")
	public short[] aShortArray3;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "([BLclient!lr;)V")
	public Class6(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub25 arg1) {
		this.aClass1_Sub25_1 = arg1;
		try {
			@Pc(21) Class1_Sub33 local21 = new Class1_Sub33(arg0);
			@Pc(26) Class1_Sub33 local26 = new Class1_Sub33(arg0);
			local21.lb = 2;
			@Pc(33) int local33 = local21.method5174();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.lb = local21.lb + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass1_Sub25_1.anIntArray453[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method5174();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static7.aShortArray10[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static7.aShortArray7[local35] = local75;
					} else {
						Static7.aShortArray7[local35] = (short) local26.method5136();
					}
					if ((local62 & 0x2) == 0) {
						Static7.aShortArray1[local35] = local75;
					} else {
						Static7.aShortArray1[local35] = (short) local26.method5136();
					}
					if ((local62 & 0x4) == 0) {
						Static7.aShortArray9[local35] = local75;
					} else {
						Static7.aShortArray9[local35] = (short) local26.method5136();
					}
					Static7.aByteArray3[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static7.aShortArray7[local35] = (short) (((Static7.aShortArray7[local35] & 0xFF) << 3) + (Static7.aShortArray7[local35] >> 8 & 0x7));
						Static7.aShortArray1[local35] = (short) (((Static7.aShortArray1[local35] & 0xFF) << 3) + (Static7.aShortArray1[local35] >> 8 & 0x7));
						Static7.aShortArray9[local35] = (short) (((Static7.aShortArray9[local35] & 0xFF) << 3) + (Static7.aShortArray9[local35] >> 8 & 0x7));
						Static7.aShortArray7[local35] = (short) (Static7.aShortArray7[local35] << 3);
						Static7.aShortArray1[local35] = (short) (Static7.aShortArray1[local35] << 3);
						Static7.aShortArray9[local35] = (short) (Static7.aShortArray9[local35] << 3);
					}
					Static7.aShortArray8[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static7.aShortArray8[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean8 = true;
					} else if (local54 == 7) {
						this.aBoolean7 = true;
					}
					local35++;
				}
			}
			if (local26.lb != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt94 = local35;
			this.aShortArray5 = new short[local35];
			this.aShortArray4 = new short[local35];
			this.aShortArray6 = new short[local35];
			this.aShortArray2 = new short[local35];
			this.aShortArray3 = new short[local35];
			this.aByteArray2 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray5[local54] = Static7.aShortArray10[local54];
				this.aShortArray4[local54] = Static7.aShortArray7[local54];
				this.aShortArray6[local54] = Static7.aShortArray1[local54];
				this.aShortArray2[local54] = Static7.aShortArray9[local54];
				this.aShortArray3[local54] = Static7.aShortArray8[local54];
				this.aByteArray2[local54] = Static7.aByteArray3[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt94 = 0;
			this.aBoolean8 = false;
			this.aBoolean7 = false;
		}
	}
}
