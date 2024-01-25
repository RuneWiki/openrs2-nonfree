import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class84 {

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "Z")
	public boolean aBoolean182 = false;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
	public int anInt2600 = 0;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "Z")
	public boolean aBoolean183 = false;

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "Lclient!dr;")
	public Class14_Sub9 aClass14_Sub9_1 = null;

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "[S")
	public short[] aShortArray65;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "[S")
	public short[] aShortArray70;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "[S")
	public short[] aShortArray71;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "([BLclient!dr;)V")
	public Class84(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class14_Sub9 arg1) {
		this.aClass14_Sub9_1 = arg1;
		try {
			@Pc(21) Class14_Sub4 local21 = new Class14_Sub4(arg0);
			@Pc(26) Class14_Sub4 local26 = new Class14_Sub4(arg0);
			local21.anInt2637 = 2;
			@Pc(33) int local33 = local21.method2548();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt2637 = local21.anInt2637 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass14_Sub9_1.anIntArray113[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method2548();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static119.aShortArray69[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static119.aShortArray63[local35] = local75;
					} else {
						Static119.aShortArray63[local35] = (short) local26.method2515();
					}
					if ((local62 & 0x2) == 0) {
						Static119.aShortArray67[local35] = local75;
					} else {
						Static119.aShortArray67[local35] = (short) local26.method2515();
					}
					if ((local62 & 0x4) == 0) {
						Static119.aShortArray64[local35] = local75;
					} else {
						Static119.aShortArray64[local35] = (short) local26.method2515();
					}
					Static119.aByteArray71[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static119.aShortArray63[local35] = (short) (((Static119.aShortArray63[local35] & 0xFF) << 3) + (Static119.aShortArray63[local35] >> 8 & 0x7));
						Static119.aShortArray67[local35] = (short) (((Static119.aShortArray67[local35] & 0xFF) << 3) + (Static119.aShortArray67[local35] >> 8 & 0x7));
						Static119.aShortArray64[local35] = (short) (((Static119.aShortArray64[local35] & 0xFF) << 3) + (Static119.aShortArray64[local35] >> 8 & 0x7));
						Static119.aShortArray63[local35] = (short) (Static119.aShortArray63[local35] << 3);
						Static119.aShortArray67[local35] = (short) (Static119.aShortArray67[local35] << 3);
						Static119.aShortArray64[local35] = (short) (Static119.aShortArray64[local35] << 3);
					}
					Static119.aShortArray66[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static119.aShortArray66[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean182 = true;
					} else if (local54 == 7) {
						this.aBoolean183 = true;
					}
					local35++;
				}
			}
			if (local26.anInt2637 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt2600 = local35;
			this.aShortArray68 = new short[local35];
			this.aShortArray65 = new short[local35];
			this.aShortArray72 = new short[local35];
			this.aShortArray70 = new short[local35];
			this.aShortArray71 = new short[local35];
			this.aByteArray70 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray68[local54] = Static119.aShortArray69[local54];
				this.aShortArray65[local54] = Static119.aShortArray63[local54];
				this.aShortArray72[local54] = Static119.aShortArray67[local54];
				this.aShortArray70[local54] = Static119.aShortArray64[local54];
				this.aShortArray71[local54] = Static119.aShortArray66[local54];
				this.aByteArray70[local54] = Static119.aByteArray71[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt2600 = 0;
			this.aBoolean182 = false;
			this.aBoolean183 = false;
		}
	}
}
