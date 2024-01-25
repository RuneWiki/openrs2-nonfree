import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class88 {

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "Z")
	public boolean aBoolean250 = false;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "Lclient!nk;")
	public Class4_Sub32 aClass4_Sub32_1 = null;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "Z")
	public boolean aBoolean251 = false;

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "Z")
	public boolean aBoolean252 = false;

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
	public int anInt2756 = 0;

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "[S")
	public short[] aShortArray80;

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "([BLclient!nk;)V")
	public Class88(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub32 arg1) {
		this.aClass4_Sub32_1 = arg1;
		try {
			@Pc(24) Class4_Sub12 local24 = new Class4_Sub12(arg0);
			@Pc(29) Class4_Sub12 local29 = new Class4_Sub12(arg0);
			local24.anInt2997 = 2;
			@Pc(36) int local36 = local24.method2490();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt2997 = local24.anInt2997 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass4_Sub32_1.anIntArray318[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method2490();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static134.aShortArray78[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static134.aShortArray71[local38] = local78;
					} else {
						Static134.aShortArray71[local38] = (short) local29.method2502();
					}
					if ((local65 & 0x2) == 0) {
						Static134.aShortArray74[local38] = local78;
					} else {
						Static134.aShortArray74[local38] = (short) local29.method2502();
					}
					if ((local65 & 0x4) == 0) {
						Static134.aShortArray79[local38] = local78;
					} else {
						Static134.aShortArray79[local38] = (short) local29.method2502();
					}
					Static134.aByteArray27[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static134.aShortArray71[local38] = (short) (((Static134.aShortArray71[local38] & 0xFF) << 3) + (Static134.aShortArray71[local38] >> 8 & 0x7));
						Static134.aShortArray74[local38] = (short) (((Static134.aShortArray74[local38] & 0xFF) << 3) + (Static134.aShortArray74[local38] >> 8 & 0x7));
						Static134.aShortArray79[local38] = (short) (((Static134.aShortArray79[local38] & 0xFF) << 3) + (Static134.aShortArray79[local38] >> 8 & 0x7));
						Static134.aShortArray71[local38] = (short) (Static134.aShortArray71[local38] << 3);
						Static134.aShortArray74[local38] = (short) (Static134.aShortArray74[local38] << 3);
						Static134.aShortArray79[local38] = (short) (Static134.aShortArray79[local38] << 3);
					}
					Static134.aShortArray73[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static134.aShortArray73[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean251 = true;
					} else if (local57 == 7) {
						this.aBoolean252 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean250 = true;
					}
					local38++;
				}
			}
			if (local29.anInt2997 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt2756 = local38;
			this.aShortArray77 = new short[local38];
			this.aShortArray72 = new short[local38];
			this.aShortArray75 = new short[local38];
			this.aShortArray80 = new short[local38];
			this.aShortArray76 = new short[local38];
			this.aByteArray28 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray77[local57] = Static134.aShortArray78[local57];
				this.aShortArray72[local57] = Static134.aShortArray71[local57];
				this.aShortArray75[local57] = Static134.aShortArray74[local57];
				this.aShortArray80[local57] = Static134.aShortArray79[local57];
				this.aShortArray76[local57] = Static134.aShortArray73[local57];
				this.aByteArray28[local57] = Static134.aByteArray27[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt2756 = 0;
			this.aBoolean251 = false;
			this.aBoolean252 = false;
		}
	}
}
