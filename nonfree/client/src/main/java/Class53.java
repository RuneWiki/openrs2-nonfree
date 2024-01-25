import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class53 {

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
	public int anInt1407 = 0;

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "Lclient!ii;")
	public Class3_Sub24 aClass3_Sub24_1 = null;

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "Z")
	public boolean aBoolean93 = false;

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "Z")
	public boolean aBoolean94 = false;

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "Z")
	public boolean aBoolean95 = false;

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "([BLclient!ii;)V")
	public Class53(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub24 arg1) {
		this.aClass3_Sub24_1 = arg1;
		try {
			@Pc(24) Class3_Sub25 local24 = new Class3_Sub25(arg0);
			@Pc(29) Class3_Sub25 local29 = new Class3_Sub25(arg0);
			local24.anInt4974 = 2;
			@Pc(36) int local36 = local24.method4096();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt4974 = local24.anInt4974 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass3_Sub24_1.anIntArray158[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method4096();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static78.aShortArray28[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static78.aShortArray25[local38] = local78;
					} else {
						Static78.aShortArray25[local38] = (short) local29.method4092();
					}
					if ((local65 & 0x2) == 0) {
						Static78.aShortArray21[local38] = local78;
					} else {
						Static78.aShortArray21[local38] = (short) local29.method4092();
					}
					if ((local65 & 0x4) == 0) {
						Static78.aShortArray30[local38] = local78;
					} else {
						Static78.aShortArray30[local38] = (short) local29.method4092();
					}
					Static78.aByteArray29[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static78.aShortArray25[local38] = (short) (((Static78.aShortArray25[local38] & 0xFF) << 3) + (Static78.aShortArray25[local38] >> 8 & 0x7));
						Static78.aShortArray21[local38] = (short) (((Static78.aShortArray21[local38] & 0xFF) << 3) + (Static78.aShortArray21[local38] >> 8 & 0x7));
						Static78.aShortArray30[local38] = (short) (((Static78.aShortArray30[local38] & 0xFF) << 3) + (Static78.aShortArray30[local38] >> 8 & 0x7));
						Static78.aShortArray25[local38] = (short) (Static78.aShortArray25[local38] << 3);
						Static78.aShortArray21[local38] = (short) (Static78.aShortArray21[local38] << 3);
						Static78.aShortArray30[local38] = (short) (Static78.aShortArray30[local38] << 3);
					}
					Static78.aShortArray23[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static78.aShortArray23[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean95 = true;
					} else if (local57 == 7) {
						this.aBoolean94 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean93 = true;
					}
					local38++;
				}
			}
			if (local29.anInt4974 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt1407 = local38;
			this.aShortArray22 = new short[local38];
			this.aShortArray24 = new short[local38];
			this.aShortArray29 = new short[local38];
			this.aShortArray26 = new short[local38];
			this.aShortArray27 = new short[local38];
			this.aByteArray30 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray22[local57] = Static78.aShortArray28[local57];
				this.aShortArray24[local57] = Static78.aShortArray25[local57];
				this.aShortArray29[local57] = Static78.aShortArray21[local57];
				this.aShortArray26[local57] = Static78.aShortArray30[local57];
				this.aShortArray27[local57] = Static78.aShortArray23[local57];
				this.aByteArray30[local57] = Static78.aByteArray29[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt1407 = 0;
			this.aBoolean95 = false;
			this.aBoolean94 = false;
		}
	}
}
