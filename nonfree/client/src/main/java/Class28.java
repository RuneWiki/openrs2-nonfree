import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class28 {

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "Lclient!wb;")
	public Class11_Sub43 aClass11_Sub43_1 = null;

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
	public int anInt466 = 0;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "([BLclient!wb;)V")
	public Class28(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class11_Sub43 arg1) {
		this.aClass11_Sub43_1 = arg1;
		try {
			@Pc(21) Class11_Sub25 local21 = new Class11_Sub25(arg0);
			@Pc(26) Class11_Sub25 local26 = new Class11_Sub25(arg0);
			local21.anInt6076 = 2;
			@Pc(33) int local33 = local21.method5185();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt6076 = local21.anInt6076 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass11_Sub43_1.anIntArray543[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method5185();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static26.aShortArray17[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static26.aShortArray12[local35] = local75;
					} else {
						Static26.aShortArray12[local35] = (short) local26.method5212();
					}
					if ((local62 & 0x2) == 0) {
						Static26.aShortArray13[local35] = local75;
					} else {
						Static26.aShortArray13[local35] = (short) local26.method5212();
					}
					if ((local62 & 0x4) == 0) {
						Static26.aShortArray18[local35] = local75;
					} else {
						Static26.aShortArray18[local35] = (short) local26.method5212();
					}
					Static26.aByteArray5[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static26.aShortArray12[local35] = (short) (((Static26.aShortArray12[local35] & 0xFF) << 3) + (Static26.aShortArray12[local35] >> 8 & 0x7));
						Static26.aShortArray13[local35] = (short) (((Static26.aShortArray13[local35] & 0xFF) << 3) + (Static26.aShortArray13[local35] >> 8 & 0x7));
						Static26.aShortArray18[local35] = (short) (((Static26.aShortArray18[local35] & 0xFF) << 3) + (Static26.aShortArray18[local35] >> 8 & 0x7));
						Static26.aShortArray12[local35] = (short) (Static26.aShortArray12[local35] << 3);
						Static26.aShortArray13[local35] = (short) (Static26.aShortArray13[local35] << 3);
						Static26.aShortArray18[local35] = (short) (Static26.aShortArray18[local35] << 3);
					}
					Static26.aShortArray11[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static26.aShortArray11[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean28 = true;
					} else if (local54 == 7) {
						this.aBoolean29 = true;
					}
					local35++;
				}
			}
			if (local26.anInt6076 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt466 = local35;
			this.aShortArray14 = new short[local35];
			this.aShortArray15 = new short[local35];
			this.aShortArray20 = new short[local35];
			this.aShortArray16 = new short[local35];
			this.aShortArray19 = new short[local35];
			this.aByteArray6 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray14[local54] = Static26.aShortArray17[local54];
				this.aShortArray15[local54] = Static26.aShortArray12[local54];
				this.aShortArray20[local54] = Static26.aShortArray13[local54];
				this.aShortArray16[local54] = Static26.aShortArray18[local54];
				this.aShortArray19[local54] = Static26.aShortArray11[local54];
				this.aByteArray6[local54] = Static26.aByteArray5[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt466 = 0;
			this.aBoolean28 = false;
			this.aBoolean29 = false;
		}
	}
}
