import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class200 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Z")
	public boolean aBoolean455 = false;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "Z")
	public boolean aBoolean456 = false;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	public int anInt6206 = 0;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "Lclient!ud;")
	public Class4_Sub41 aClass4_Sub41_1 = null;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "[S")
	public short[] aShortArray100;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "[S")
	public short[] aShortArray101;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "[S")
	public short[] aShortArray98;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "[B")
	public byte[] aByteArray83;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "([BLclient!ud;)V")
	public Class200(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub41 arg1) {
		this.aClass4_Sub41_1 = arg1;
		try {
			@Pc(21) Class4_Sub11 local21 = new Class4_Sub11(arg0);
			@Pc(26) Class4_Sub11 local26 = new Class4_Sub11(arg0);
			local21.anInt3768 = 2;
			@Pc(33) int local33 = local21.method3440();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt3768 = local21.anInt3768 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass4_Sub41_1.anIntArray481[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method3440();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static323.aShortArray96[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static323.aShortArray102[local35] = local75;
					} else {
						Static323.aShortArray102[local35] = (short) local26.method3406();
					}
					if ((local62 & 0x2) == 0) {
						Static323.aShortArray104[local35] = local75;
					} else {
						Static323.aShortArray104[local35] = (short) local26.method3406();
					}
					if ((local62 & 0x4) == 0) {
						Static323.aShortArray103[local35] = local75;
					} else {
						Static323.aShortArray103[local35] = (short) local26.method3406();
					}
					Static323.aByteArray82[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static323.aShortArray102[local35] = (short) (((Static323.aShortArray102[local35] & 0xFF) << 3) + (Static323.aShortArray102[local35] >> 8 & 0x7));
						Static323.aShortArray104[local35] = (short) (((Static323.aShortArray104[local35] & 0xFF) << 3) + (Static323.aShortArray104[local35] >> 8 & 0x7));
						Static323.aShortArray103[local35] = (short) (((Static323.aShortArray103[local35] & 0xFF) << 3) + (Static323.aShortArray103[local35] >> 8 & 0x7));
						Static323.aShortArray102[local35] = (short) (Static323.aShortArray102[local35] << 3);
						Static323.aShortArray104[local35] = (short) (Static323.aShortArray104[local35] << 3);
						Static323.aShortArray103[local35] = (short) (Static323.aShortArray103[local35] << 3);
					}
					Static323.aShortArray105[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static323.aShortArray105[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean456 = true;
					} else if (local54 == 7) {
						this.aBoolean455 = true;
					}
					local35++;
				}
			}
			if (local26.anInt3768 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6206 = local35;
			this.aShortArray100 = new short[local35];
			this.aShortArray97 = new short[local35];
			this.aShortArray99 = new short[local35];
			this.aShortArray101 = new short[local35];
			this.aShortArray98 = new short[local35];
			this.aByteArray83 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray100[local54] = Static323.aShortArray96[local54];
				this.aShortArray97[local54] = Static323.aShortArray102[local54];
				this.aShortArray99[local54] = Static323.aShortArray104[local54];
				this.aShortArray101[local54] = Static323.aShortArray103[local54];
				this.aShortArray98[local54] = Static323.aShortArray105[local54];
				this.aByteArray83[local54] = Static323.aByteArray82[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt6206 = 0;
			this.aBoolean456 = false;
			this.aBoolean455 = false;
		}
	}
}
