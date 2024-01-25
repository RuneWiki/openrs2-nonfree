import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class227 {

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "Z")
	public boolean aBoolean468 = false;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "Z")
	public boolean aBoolean467 = false;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
	public int anInt6324 = 0;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "Lclient!ll;")
	public Class4_Sub24 aClass4_Sub24_1 = null;

	@OriginalMember(owner = "client!rt", name = "q", descriptor = "Z")
	public boolean aBoolean469 = false;

	@OriginalMember(owner = "client!rt", name = "o", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "[S")
	public short[] aShortArray100;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "([BLclient!ll;)V")
	public Class227(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub24 arg1) {
		this.aClass4_Sub24_1 = arg1;
		try {
			@Pc(24) Class4_Sub20 local24 = new Class4_Sub20(arg0);
			@Pc(29) Class4_Sub20 local29 = new Class4_Sub20(arg0);
			local24.anInt5526 = 2;
			@Pc(36) int local36 = local24.method4614();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt5526 = local24.anInt5526 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass4_Sub24_1.anIntArray359[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method4614();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static362.aShortArray93[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static362.aShortArray91[local38] = local78;
					} else {
						Static362.aShortArray91[local38] = (short) local29.method4619();
					}
					if ((local65 & 0x2) == 0) {
						Static362.aShortArray97[local38] = local78;
					} else {
						Static362.aShortArray97[local38] = (short) local29.method4619();
					}
					if ((local65 & 0x4) == 0) {
						Static362.aShortArray95[local38] = local78;
					} else {
						Static362.aShortArray95[local38] = (short) local29.method4619();
					}
					Static362.aByteArray86[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static362.aShortArray91[local38] = (short) (((Static362.aShortArray91[local38] & 0xFF) << 3) + (Static362.aShortArray91[local38] >> 8 & 0x7));
						Static362.aShortArray97[local38] = (short) (((Static362.aShortArray97[local38] & 0xFF) << 3) + (Static362.aShortArray97[local38] >> 8 & 0x7));
						Static362.aShortArray95[local38] = (short) (((Static362.aShortArray95[local38] & 0xFF) << 3) + (Static362.aShortArray95[local38] >> 8 & 0x7));
						Static362.aShortArray91[local38] = (short) (Static362.aShortArray91[local38] << 3);
						Static362.aShortArray97[local38] = (short) (Static362.aShortArray97[local38] << 3);
						Static362.aShortArray95[local38] = (short) (Static362.aShortArray95[local38] << 3);
					}
					Static362.aShortArray98[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static362.aShortArray98[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean467 = true;
					} else if (local57 == 7) {
						this.aBoolean469 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean468 = true;
					}
					local38++;
				}
			}
			if (local29.anInt5526 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6324 = local38;
			this.aShortArray99 = new short[local38];
			this.aShortArray94 = new short[local38];
			this.aShortArray96 = new short[local38];
			this.aShortArray92 = new short[local38];
			this.aShortArray100 = new short[local38];
			this.aByteArray85 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray99[local57] = Static362.aShortArray93[local57];
				this.aShortArray94[local57] = Static362.aShortArray91[local57];
				this.aShortArray96[local57] = Static362.aShortArray97[local57];
				this.aShortArray92[local57] = Static362.aShortArray95[local57];
				this.aShortArray100[local57] = Static362.aShortArray98[local57];
				this.aByteArray85[local57] = Static362.aByteArray86[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt6324 = 0;
			this.aBoolean467 = false;
			this.aBoolean469 = false;
		}
	}
}
