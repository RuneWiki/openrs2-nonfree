import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class43 {

	@OriginalMember(owner = "client!db", name = "c", descriptor = "I")
	public int anInt1194 = 0;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "Lclient!fh;")
	public Class4_Sub10 aClass4_Sub10_1 = null;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Z")
	public boolean aBoolean91 = false;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Z")
	public boolean aBoolean90 = false;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "([BLclient!fh;)V")
	public Class43(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub10 arg1) {
		this.aClass4_Sub10_1 = arg1;
		try {
			@Pc(21) Class4_Sub7 local21 = new Class4_Sub7(arg0);
			@Pc(26) Class4_Sub7 local26 = new Class4_Sub7(arg0);
			local21.anInt2667 = 2;
			@Pc(33) int local33 = local21.method2380();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt2667 = local21.anInt2667 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass4_Sub10_1.anIntArray198[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method2380();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static53.aShortArray25[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static53.aShortArray23[local35] = local75;
					} else {
						Static53.aShortArray23[local35] = (short) local26.method2370();
					}
					if ((local62 & 0x2) == 0) {
						Static53.aShortArray22[local35] = local75;
					} else {
						Static53.aShortArray22[local35] = (short) local26.method2370();
					}
					if ((local62 & 0x4) == 0) {
						Static53.aShortArray31[local35] = local75;
					} else {
						Static53.aShortArray31[local35] = (short) local26.method2370();
					}
					Static53.aByteArray20[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static53.aShortArray23[local35] = (short) (((Static53.aShortArray23[local35] & 0xFF) << 3) + (Static53.aShortArray23[local35] >> 8 & 0x7));
						Static53.aShortArray22[local35] = (short) (((Static53.aShortArray22[local35] & 0xFF) << 3) + (Static53.aShortArray22[local35] >> 8 & 0x7));
						Static53.aShortArray31[local35] = (short) (((Static53.aShortArray31[local35] & 0xFF) << 3) + (Static53.aShortArray31[local35] >> 8 & 0x7));
						Static53.aShortArray23[local35] = (short) (Static53.aShortArray23[local35] << 3);
						Static53.aShortArray22[local35] = (short) (Static53.aShortArray22[local35] << 3);
						Static53.aShortArray31[local35] = (short) (Static53.aShortArray31[local35] << 3);
					}
					Static53.aShortArray27[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static53.aShortArray27[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean91 = true;
					} else if (local54 == 7) {
						this.aBoolean90 = true;
					}
					local35++;
				}
			}
			if (local26.anInt2667 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt1194 = local35;
			this.aShortArray30 = new short[local35];
			this.aShortArray24 = new short[local35];
			this.aShortArray28 = new short[local35];
			this.aShortArray26 = new short[local35];
			this.aShortArray29 = new short[local35];
			this.aByteArray21 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray30[local54] = Static53.aShortArray25[local54];
				this.aShortArray24[local54] = Static53.aShortArray23[local54];
				this.aShortArray28[local54] = Static53.aShortArray22[local54];
				this.aShortArray26[local54] = Static53.aShortArray31[local54];
				this.aShortArray29[local54] = Static53.aShortArray27[local54];
				this.aByteArray21[local54] = Static53.aByteArray20[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt1194 = 0;
			this.aBoolean91 = false;
			this.aBoolean90 = false;
		}
	}
}
