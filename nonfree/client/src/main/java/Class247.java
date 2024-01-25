import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class247 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	public int anInt7248 = 0;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!gr;")
	public Class1_Sub16 aClass1_Sub16_1 = null;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "Z")
	public boolean aBoolean466 = false;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "Z")
	public boolean aBoolean467 = false;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Z")
	public boolean aBoolean468 = false;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[S")
	public short[] aShortArray100;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[S")
	public short[] aShortArray98;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "[S")
	public short[] aShortArray101;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([BLclient!gr;)V")
	public Class247(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		this.aClass1_Sub16_1 = arg1;
		try {
			@Pc(24) Class1_Sub1 local24 = new Class1_Sub1(arg0);
			@Pc(29) Class1_Sub1 local29 = new Class1_Sub1(arg0);
			local24.anInt5056 = 2;
			@Pc(36) int local36 = local24.method4130();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt5056 = local24.anInt5056 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass1_Sub16_1.anIntArray221[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method4130();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static417.aShortArray97[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static417.aShortArray93[local38] = local78;
					} else {
						Static417.aShortArray93[local38] = (short) local29.method4131();
					}
					if ((local65 & 0x2) == 0) {
						Static417.aShortArray96[local38] = local78;
					} else {
						Static417.aShortArray96[local38] = (short) local29.method4131();
					}
					if ((local65 & 0x4) == 0) {
						Static417.aShortArray99[local38] = local78;
					} else {
						Static417.aShortArray99[local38] = (short) local29.method4131();
					}
					Static417.aByteArray86[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static417.aShortArray93[local38] = (short) (((Static417.aShortArray93[local38] & 0xFF) << 3) + (Static417.aShortArray93[local38] >> 8 & 0x7));
						Static417.aShortArray96[local38] = (short) (((Static417.aShortArray96[local38] & 0xFF) << 3) + (Static417.aShortArray96[local38] >> 8 & 0x7));
						Static417.aShortArray99[local38] = (short) (((Static417.aShortArray99[local38] & 0xFF) << 3) + (Static417.aShortArray99[local38] >> 8 & 0x7));
						Static417.aShortArray93[local38] = (short) (Static417.aShortArray93[local38] << 3);
						Static417.aShortArray96[local38] = (short) (Static417.aShortArray96[local38] << 3);
						Static417.aShortArray99[local38] = (short) (Static417.aShortArray99[local38] << 3);
					}
					Static417.aShortArray95[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static417.aShortArray95[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean466 = true;
					} else if (local57 == 7) {
						this.aBoolean468 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean467 = true;
					}
					local38++;
				}
			}
			if (local29.anInt5056 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt7248 = local38;
			this.aShortArray100 = new short[local38];
			this.aShortArray98 = new short[local38];
			this.aShortArray94 = new short[local38];
			this.aShortArray92 = new short[local38];
			this.aShortArray101 = new short[local38];
			this.aByteArray85 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray100[local57] = Static417.aShortArray97[local57];
				this.aShortArray98[local57] = Static417.aShortArray93[local57];
				this.aShortArray94[local57] = Static417.aShortArray96[local57];
				this.aShortArray92[local57] = Static417.aShortArray99[local57];
				this.aShortArray101[local57] = Static417.aShortArray95[local57];
				this.aByteArray85[local57] = Static417.aByteArray86[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt7248 = 0;
			this.aBoolean466 = false;
			this.aBoolean468 = false;
		}
	}
}
