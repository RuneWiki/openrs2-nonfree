import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class221 {

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
	public int anInt5758 = 0;

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "Lclient!md;")
	public Class4_Sub23 aClass4_Sub23_1 = null;

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "Z")
	public boolean aBoolean408 = false;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "Z")
	public boolean aBoolean407 = false;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "Z")
	public boolean aBoolean409 = false;

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "[S")
	public short[] aShortArray91;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "([BLclient!md;)V")
	public Class221(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub23 arg1) {
		this.aClass4_Sub23_1 = arg1;
		try {
			@Pc(24) Class4_Sub9 local24 = new Class4_Sub9(arg0);
			@Pc(29) Class4_Sub9 local29 = new Class4_Sub9(arg0);
			local24.anInt6207 = 2;
			@Pc(36) int local36 = local24.method5007();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt6207 = local24.anInt6207 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass4_Sub23_1.anIntArray336[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method5007();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static348.aShortArray96[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static348.aShortArray95[local38] = local78;
					} else {
						Static348.aShortArray95[local38] = (short) local29.method5020();
					}
					if ((local65 & 0x2) == 0) {
						Static348.aShortArray97[local38] = local78;
					} else {
						Static348.aShortArray97[local38] = (short) local29.method5020();
					}
					if ((local65 & 0x4) == 0) {
						Static348.aShortArray93[local38] = local78;
					} else {
						Static348.aShortArray93[local38] = (short) local29.method5020();
					}
					Static348.aByteArray73[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static348.aShortArray95[local38] = (short) (((Static348.aShortArray95[local38] & 0xFF) << 3) + (Static348.aShortArray95[local38] >> 8 & 0x7));
						Static348.aShortArray97[local38] = (short) (((Static348.aShortArray97[local38] & 0xFF) << 3) + (Static348.aShortArray97[local38] >> 8 & 0x7));
						Static348.aShortArray93[local38] = (short) (((Static348.aShortArray93[local38] & 0xFF) << 3) + (Static348.aShortArray93[local38] >> 8 & 0x7));
						Static348.aShortArray95[local38] = (short) (Static348.aShortArray95[local38] << 3);
						Static348.aShortArray97[local38] = (short) (Static348.aShortArray97[local38] << 3);
						Static348.aShortArray93[local38] = (short) (Static348.aShortArray93[local38] << 3);
					}
					Static348.aShortArray98[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static348.aShortArray98[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean407 = true;
					} else if (local57 == 7) {
						this.aBoolean409 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean408 = true;
					}
					local38++;
				}
			}
			if (local29.anInt6207 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt5758 = local38;
			this.aShortArray94 = new short[local38];
			this.aShortArray89 = new short[local38];
			this.aShortArray92 = new short[local38];
			this.aShortArray91 = new short[local38];
			this.aShortArray90 = new short[local38];
			this.aByteArray74 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray94[local57] = Static348.aShortArray96[local57];
				this.aShortArray89[local57] = Static348.aShortArray95[local57];
				this.aShortArray92[local57] = Static348.aShortArray97[local57];
				this.aShortArray91[local57] = Static348.aShortArray93[local57];
				this.aShortArray90[local57] = Static348.aShortArray98[local57];
				this.aByteArray74[local57] = Static348.aByteArray73[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt5758 = 0;
			this.aBoolean407 = false;
			this.aBoolean409 = false;
		}
	}
}
