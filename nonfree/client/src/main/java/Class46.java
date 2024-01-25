import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class46 {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	public int anInt1560 = 0;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Z")
	public boolean aBoolean119 = false;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Z")
	public boolean aBoolean120 = false;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "Z")
	public boolean aBoolean121 = false;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!sp;")
	public Class3_Sub39 aClass3_Sub39_1 = null;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "[S")
	public short[] aShortArray8;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "[S")
	public short[] aShortArray5;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "[S")
	public short[] aShortArray12;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "[S")
	public short[] aShortArray6;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([BLclient!sp;)V")
	public Class46(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub39 arg1) {
		this.aClass3_Sub39_1 = arg1;
		try {
			@Pc(24) Class3_Sub2 local24 = new Class3_Sub2(arg0);
			@Pc(29) Class3_Sub2 local29 = new Class3_Sub2(arg0);
			local24.anInt7620 = 2;
			@Pc(36) int local36 = local24.method6053();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt7620 = local24.anInt7620 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass3_Sub39_1.anIntArray471[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method6053();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static68.aShortArray7[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static68.aShortArray4[local38] = local78;
					} else {
						Static68.aShortArray4[local38] = (short) local29.method6038();
					}
					if ((local65 & 0x2) == 0) {
						Static68.aShortArray11[local38] = local78;
					} else {
						Static68.aShortArray11[local38] = (short) local29.method6038();
					}
					if ((local65 & 0x4) == 0) {
						Static68.aShortArray9[local38] = local78;
					} else {
						Static68.aShortArray9[local38] = (short) local29.method6038();
					}
					Static68.aByteArray19[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static68.aShortArray4[local38] = (short) (((Static68.aShortArray4[local38] & 0xFF) << 3) + (Static68.aShortArray4[local38] >> 8 & 0x7));
						Static68.aShortArray11[local38] = (short) (((Static68.aShortArray11[local38] & 0xFF) << 3) + (Static68.aShortArray11[local38] >> 8 & 0x7));
						Static68.aShortArray9[local38] = (short) (((Static68.aShortArray9[local38] & 0xFF) << 3) + (Static68.aShortArray9[local38] >> 8 & 0x7));
						Static68.aShortArray4[local38] = (short) (Static68.aShortArray4[local38] << 3);
						Static68.aShortArray11[local38] = (short) (Static68.aShortArray11[local38] << 3);
						Static68.aShortArray9[local38] = (short) (Static68.aShortArray9[local38] << 3);
					}
					Static68.aShortArray10[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static68.aShortArray10[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean121 = true;
					} else if (local57 == 7) {
						this.aBoolean119 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean120 = true;
					}
					local38++;
				}
			}
			if (local29.anInt7620 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt1560 = local38;
			this.aShortArray8 = new short[local38];
			this.aShortArray5 = new short[local38];
			this.aShortArray12 = new short[local38];
			this.aShortArray13 = new short[local38];
			this.aShortArray6 = new short[local38];
			this.aByteArray18 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray8[local57] = Static68.aShortArray7[local57];
				this.aShortArray5[local57] = Static68.aShortArray4[local57];
				this.aShortArray12[local57] = Static68.aShortArray11[local57];
				this.aShortArray13[local57] = Static68.aShortArray9[local57];
				this.aShortArray6[local57] = Static68.aShortArray10[local57];
				this.aByteArray18[local57] = Static68.aByteArray19[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt1560 = 0;
			this.aBoolean121 = false;
			this.aBoolean119 = false;
		}
	}
}
