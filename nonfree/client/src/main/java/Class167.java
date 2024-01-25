import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class167 {

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Z")
	public boolean aBoolean422 = false;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Z")
	public boolean aBoolean421 = false;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Z")
	public boolean aBoolean423 = false;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!gg;")
	public Class1_Sub16 aClass1_Sub16_1 = null;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
	public int anInt4697 = 0;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "[S")
	public short[] aShortArray71;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "[S")
	public short[] aShortArray70;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "([BLclient!gg;)V")
	public Class167(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		this.aClass1_Sub16_1 = arg1;
		try {
			@Pc(24) Class1_Sub19 local24 = new Class1_Sub19(arg0);
			@Pc(29) Class1_Sub19 local29 = new Class1_Sub19(arg0);
			local24.anInt3698 = 2;
			@Pc(36) int local36 = local24.method2915();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt3698 = local24.anInt3698 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass1_Sub16_1.anIntArray181[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method2915();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static272.aShortArray66[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static272.aShortArray73[local38] = local78;
					} else {
						Static272.aShortArray73[local38] = (short) local29.method2918();
					}
					if ((local65 & 0x2) == 0) {
						Static272.aShortArray74[local38] = local78;
					} else {
						Static272.aShortArray74[local38] = (short) local29.method2918();
					}
					if ((local65 & 0x4) == 0) {
						Static272.aShortArray75[local38] = local78;
					} else {
						Static272.aShortArray75[local38] = (short) local29.method2918();
					}
					Static272.aByteArray68[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static272.aShortArray73[local38] = (short) (((Static272.aShortArray73[local38] & 0xFF) << 3) + (Static272.aShortArray73[local38] >> 8 & 0x7));
						Static272.aShortArray74[local38] = (short) (((Static272.aShortArray74[local38] & 0xFF) << 3) + (Static272.aShortArray74[local38] >> 8 & 0x7));
						Static272.aShortArray75[local38] = (short) (((Static272.aShortArray75[local38] & 0xFF) << 3) + (Static272.aShortArray75[local38] >> 8 & 0x7));
						Static272.aShortArray73[local38] = (short) (Static272.aShortArray73[local38] << 3);
						Static272.aShortArray74[local38] = (short) (Static272.aShortArray74[local38] << 3);
						Static272.aShortArray75[local38] = (short) (Static272.aShortArray75[local38] << 3);
					}
					Static272.aShortArray68[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static272.aShortArray68[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean423 = true;
					} else if (local57 == 7) {
						this.aBoolean421 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean422 = true;
					}
					local38++;
				}
			}
			if (local29.anInt3698 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt4697 = local38;
			this.aShortArray67 = new short[local38];
			this.aShortArray71 = new short[local38];
			this.aShortArray70 = new short[local38];
			this.aShortArray69 = new short[local38];
			this.aShortArray72 = new short[local38];
			this.aByteArray69 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray67[local57] = Static272.aShortArray66[local57];
				this.aShortArray71[local57] = Static272.aShortArray73[local57];
				this.aShortArray70[local57] = Static272.aShortArray74[local57];
				this.aShortArray69[local57] = Static272.aShortArray75[local57];
				this.aShortArray72[local57] = Static272.aShortArray68[local57];
				this.aByteArray69[local57] = Static272.aByteArray68[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt4697 = 0;
			this.aBoolean423 = false;
			this.aBoolean421 = false;
		}
	}
}
