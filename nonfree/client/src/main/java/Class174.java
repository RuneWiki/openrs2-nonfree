import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class174 {

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "Z")
	public boolean aBoolean321 = false;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	public int anInt4761 = 0;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Z")
	public boolean aBoolean323 = false;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "Lclient!eb;")
	public Class10_Sub13 aClass10_Sub13_1 = null;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "Z")
	public boolean aBoolean322 = false;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "[S")
	public short[] aShortArray79;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "([BLclient!eb;)V")
	public Class174(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class10_Sub13 arg1) {
		this.aClass10_Sub13_1 = arg1;
		try {
			@Pc(24) Class10_Sub8 local24 = new Class10_Sub8(arg0);
			@Pc(29) Class10_Sub8 local29 = new Class10_Sub8(arg0);
			local24.anInt2989 = 2;
			@Pc(36) int local36 = local24.method2502();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt2989 = local24.anInt2989 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass10_Sub13_1.anIntArray148[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method2502();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static272.aShortArray81[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static272.aShortArray84[local38] = local78;
					} else {
						Static272.aShortArray84[local38] = (short) local29.method2462();
					}
					if ((local65 & 0x2) == 0) {
						Static272.aShortArray80[local38] = local78;
					} else {
						Static272.aShortArray80[local38] = (short) local29.method2462();
					}
					if ((local65 & 0x4) == 0) {
						Static272.aShortArray77[local38] = local78;
					} else {
						Static272.aShortArray77[local38] = (short) local29.method2462();
					}
					Static272.aByteArray58[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static272.aShortArray84[local38] = (short) (((Static272.aShortArray84[local38] & 0xFF) << 3) + (Static272.aShortArray84[local38] >> 8 & 0x7));
						Static272.aShortArray80[local38] = (short) (((Static272.aShortArray80[local38] & 0xFF) << 3) + (Static272.aShortArray80[local38] >> 8 & 0x7));
						Static272.aShortArray77[local38] = (short) (((Static272.aShortArray77[local38] & 0xFF) << 3) + (Static272.aShortArray77[local38] >> 8 & 0x7));
						Static272.aShortArray84[local38] = (short) (Static272.aShortArray84[local38] << 3);
						Static272.aShortArray80[local38] = (short) (Static272.aShortArray80[local38] << 3);
						Static272.aShortArray77[local38] = (short) (Static272.aShortArray77[local38] << 3);
					}
					Static272.aShortArray83[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static272.aShortArray83[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean323 = true;
					} else if (local57 == 7) {
						this.aBoolean321 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean322 = true;
					}
					local38++;
				}
			}
			if (local29.anInt2989 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt4761 = local38;
			this.aShortArray78 = new short[local38];
			this.aShortArray79 = new short[local38];
			this.aShortArray75 = new short[local38];
			this.aShortArray82 = new short[local38];
			this.aShortArray76 = new short[local38];
			this.aByteArray57 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray78[local57] = Static272.aShortArray81[local57];
				this.aShortArray79[local57] = Static272.aShortArray84[local57];
				this.aShortArray75[local57] = Static272.aShortArray80[local57];
				this.aShortArray82[local57] = Static272.aShortArray77[local57];
				this.aShortArray76[local57] = Static272.aShortArray83[local57];
				this.aByteArray57[local57] = Static272.aByteArray58[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt4761 = 0;
			this.aBoolean323 = false;
			this.aBoolean321 = false;
		}
	}
}
