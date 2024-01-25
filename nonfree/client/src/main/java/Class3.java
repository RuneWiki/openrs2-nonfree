import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3 {

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Z")
	public boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!mk;")
	public Class2_Sub29 aClass2_Sub29_1 = null;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Z")
	public boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
	public int anInt82 = 0;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "[S")
	public short[] aShortArray7;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "[S")
	public short[] aShortArray6;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[S")
	public short[] aShortArray3;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "[S")
	public short[] aShortArray1;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "[S")
	public short[] aShortArray8;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "([BLclient!mk;)V")
	public Class3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub29 arg1) {
		this.aClass2_Sub29_1 = arg1;
		try {
			@Pc(21) Class2_Sub10 local21 = new Class2_Sub10(arg0);
			@Pc(26) Class2_Sub10 local26 = new Class2_Sub10(arg0);
			local21.anInt4807 = 2;
			@Pc(33) int local33 = local21.method4421();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt4807 = local21.anInt4807 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass2_Sub29_1.anIntArray312[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method4421();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static3.aShortArray10[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static3.aShortArray4[local35] = local75;
					} else {
						Static3.aShortArray4[local35] = (short) local26.method4424();
					}
					if ((local62 & 0x2) == 0) {
						Static3.aShortArray5[local35] = local75;
					} else {
						Static3.aShortArray5[local35] = (short) local26.method4424();
					}
					if ((local62 & 0x4) == 0) {
						Static3.aShortArray2[local35] = local75;
					} else {
						Static3.aShortArray2[local35] = (short) local26.method4424();
					}
					Static3.aByteArray2[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static3.aShortArray4[local35] = (short) (((Static3.aShortArray4[local35] & 0xFF) << 3) + (Static3.aShortArray4[local35] >> 8 & 0x7));
						Static3.aShortArray5[local35] = (short) (((Static3.aShortArray5[local35] & 0xFF) << 3) + (Static3.aShortArray5[local35] >> 8 & 0x7));
						Static3.aShortArray2[local35] = (short) (((Static3.aShortArray2[local35] & 0xFF) << 3) + (Static3.aShortArray2[local35] >> 8 & 0x7));
						Static3.aShortArray4[local35] = (short) (Static3.aShortArray4[local35] << 3);
						Static3.aShortArray5[local35] = (short) (Static3.aShortArray5[local35] << 3);
						Static3.aShortArray2[local35] = (short) (Static3.aShortArray2[local35] << 3);
					}
					Static3.aShortArray9[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static3.aShortArray9[local35] = (short) local37;
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
			if (local26.anInt4807 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt82 = local35;
			this.aShortArray7 = new short[local35];
			this.aShortArray6 = new short[local35];
			this.aShortArray3 = new short[local35];
			this.aShortArray1 = new short[local35];
			this.aShortArray8 = new short[local35];
			this.aByteArray1 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray7[local54] = Static3.aShortArray10[local54];
				this.aShortArray6[local54] = Static3.aShortArray4[local54];
				this.aShortArray3[local54] = Static3.aShortArray5[local54];
				this.aShortArray1[local54] = Static3.aShortArray2[local54];
				this.aShortArray8[local54] = Static3.aShortArray9[local54];
				this.aByteArray1[local54] = Static3.aByteArray2[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt82 = 0;
			this.aBoolean8 = false;
			this.aBoolean7 = false;
		}
	}
}
