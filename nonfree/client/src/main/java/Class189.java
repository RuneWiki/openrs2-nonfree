import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class189 {

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Z")
	public boolean aBoolean458 = false;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Z")
	public boolean aBoolean459 = false;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "Z")
	public boolean aBoolean460 = false;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
	public int anInt5318 = 0;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Lclient!qs;")
	public Class2_Sub35 aClass2_Sub35_1 = null;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "[S")
	public short[] aShortArray70;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "[B")
	public byte[] aByteArray149;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([BLclient!qs;)V")
	public Class189(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub35 arg1) {
		this.aClass2_Sub35_1 = arg1;
		try {
			@Pc(24) Class2_Sub20 local24 = new Class2_Sub20(arg0);
			@Pc(29) Class2_Sub20 local29 = new Class2_Sub20(arg0);
			local24.anInt4608 = 2;
			@Pc(36) int local36 = local24.method3737();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt4608 = local24.anInt4608 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass2_Sub35_1.anIntArray379[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method3737();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static295.aShortArray67[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static295.aShortArray73[local38] = local78;
					} else {
						Static295.aShortArray73[local38] = (short) local29.method3683();
					}
					if ((local65 & 0x2) == 0) {
						Static295.aShortArray69[local38] = local78;
					} else {
						Static295.aShortArray69[local38] = (short) local29.method3683();
					}
					if ((local65 & 0x4) == 0) {
						Static295.aShortArray71[local38] = local78;
					} else {
						Static295.aShortArray71[local38] = (short) local29.method3683();
					}
					Static295.aByteArray148[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static295.aShortArray73[local38] = (short) (((Static295.aShortArray73[local38] & 0xFF) << 3) + (Static295.aShortArray73[local38] >> 8 & 0x7));
						Static295.aShortArray69[local38] = (short) (((Static295.aShortArray69[local38] & 0xFF) << 3) + (Static295.aShortArray69[local38] >> 8 & 0x7));
						Static295.aShortArray71[local38] = (short) (((Static295.aShortArray71[local38] & 0xFF) << 3) + (Static295.aShortArray71[local38] >> 8 & 0x7));
						Static295.aShortArray73[local38] = (short) (Static295.aShortArray73[local38] << 3);
						Static295.aShortArray69[local38] = (short) (Static295.aShortArray69[local38] << 3);
						Static295.aShortArray71[local38] = (short) (Static295.aShortArray71[local38] << 3);
					}
					Static295.aShortArray66[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static295.aShortArray66[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean458 = true;
					} else if (local57 == 7) {
						this.aBoolean459 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean460 = true;
					}
					local38++;
				}
			}
			if (local29.anInt4608 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt5318 = local38;
			this.aShortArray72 = new short[local38];
			this.aShortArray70 = new short[local38];
			this.aShortArray74 = new short[local38];
			this.aShortArray68 = new short[local38];
			this.aShortArray75 = new short[local38];
			this.aByteArray149 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray72[local57] = Static295.aShortArray67[local57];
				this.aShortArray70[local57] = Static295.aShortArray73[local57];
				this.aShortArray74[local57] = Static295.aShortArray69[local57];
				this.aShortArray68[local57] = Static295.aShortArray71[local57];
				this.aShortArray75[local57] = Static295.aShortArray66[local57];
				this.aByteArray149[local57] = Static295.aByteArray148[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt5318 = 0;
			this.aBoolean458 = false;
			this.aBoolean459 = false;
		}
	}
}
