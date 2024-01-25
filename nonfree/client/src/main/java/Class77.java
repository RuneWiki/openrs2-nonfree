import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class77 {

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "Lclient!cda;")
	public Class1_Sub7 aClass1_Sub7_1 = null;

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
	public int anInt2092 = 0;

	@OriginalMember(owner = "client!eaa", name = "m", descriptor = "Z")
	public boolean aBoolean176 = false;

	@OriginalMember(owner = "client!eaa", name = "o", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!eaa", name = "l", descriptor = "Z")
	public boolean aBoolean175 = false;

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!eaa", name = "j", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!eaa", name = "q", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!eaa", name = "p", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!eaa", name = "g", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "([BLclient!cda;)V")
	public Class77(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		this.aClass1_Sub7_1 = arg1;
		try {
			@Pc(24) Class1_Sub17 local24 = new Class1_Sub17(arg0);
			@Pc(29) Class1_Sub17 local29 = new Class1_Sub17(arg0);
			local24.anInt4872 = 2;
			@Pc(36) int local36 = local24.method4487();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt4872 = local24.anInt4872 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass1_Sub7_1.anIntArray96[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method4487();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static97.aShortArray34[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static97.aShortArray28[local38] = local78;
					} else {
						Static97.aShortArray28[local38] = (short) local29.method4477();
					}
					if ((local65 & 0x2) == 0) {
						Static97.aShortArray33[local38] = local78;
					} else {
						Static97.aShortArray33[local38] = (short) local29.method4477();
					}
					if ((local65 & 0x4) == 0) {
						Static97.aShortArray29[local38] = local78;
					} else {
						Static97.aShortArray29[local38] = (short) local29.method4477();
					}
					Static97.aByteArray21[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static97.aShortArray28[local38] = (short) (((Static97.aShortArray28[local38] & 0xFF) << 3) + (Static97.aShortArray28[local38] >> 8 & 0x7));
						Static97.aShortArray33[local38] = (short) (((Static97.aShortArray33[local38] & 0xFF) << 3) + (Static97.aShortArray33[local38] >> 8 & 0x7));
						Static97.aShortArray29[local38] = (short) (((Static97.aShortArray29[local38] & 0xFF) << 3) + (Static97.aShortArray29[local38] >> 8 & 0x7));
						Static97.aShortArray28[local38] = (short) (Static97.aShortArray28[local38] << 3);
						Static97.aShortArray33[local38] = (short) (Static97.aShortArray33[local38] << 3);
						Static97.aShortArray29[local38] = (short) (Static97.aShortArray29[local38] << 3);
					}
					Static97.aShortArray31[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static97.aShortArray31[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean175 = true;
					} else if (local57 == 7) {
						this.aBoolean177 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean176 = true;
					}
					local38++;
				}
			}
			if (local29.anInt4872 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt2092 = local38;
			this.aShortArray27 = new short[local38];
			this.aShortArray32 = new short[local38];
			this.aShortArray30 = new short[local38];
			this.aShortArray36 = new short[local38];
			this.aShortArray35 = new short[local38];
			this.aByteArray20 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray27[local57] = Static97.aShortArray34[local57];
				this.aShortArray32[local57] = Static97.aShortArray28[local57];
				this.aShortArray30[local57] = Static97.aShortArray33[local57];
				this.aShortArray36[local57] = Static97.aShortArray29[local57];
				this.aShortArray35[local57] = Static97.aShortArray31[local57];
				this.aByteArray20[local57] = Static97.aByteArray21[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt2092 = 0;
			this.aBoolean175 = false;
			this.aBoolean177 = false;
		}
	}
}
