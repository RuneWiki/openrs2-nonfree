import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class240 {

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "Z")
	public boolean aBoolean456 = false;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "Lclient!wo;")
	public Class2_Sub47 aClass2_Sub47_1 = null;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
	public int anInt6777 = 0;

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "Z")
	public boolean aBoolean457 = false;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "Z")
	public boolean aBoolean458 = false;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "[S")
	public short[] aShortArray106;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "[S")
	public short[] aShortArray100;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "[B")
	public byte[] aByteArray81;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "([BLclient!wo;)V")
	public Class240(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub47 arg1) {
		this.aClass2_Sub47_1 = arg1;
		try {
			@Pc(24) Class2_Sub17 local24 = new Class2_Sub17(arg0);
			@Pc(29) Class2_Sub17 local29 = new Class2_Sub17(arg0);
			local24.anInt7523 = 2;
			@Pc(36) int local36 = local24.method6138();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt7523 = local24.anInt7523 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass2_Sub47_1.anIntArray626[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method6138();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static395.aShortArray99[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static395.aShortArray101[local38] = local78;
					} else {
						Static395.aShortArray101[local38] = (short) local29.method6134();
					}
					if ((local65 & 0x2) == 0) {
						Static395.aShortArray103[local38] = local78;
					} else {
						Static395.aShortArray103[local38] = (short) local29.method6134();
					}
					if ((local65 & 0x4) == 0) {
						Static395.aShortArray98[local38] = local78;
					} else {
						Static395.aShortArray98[local38] = (short) local29.method6134();
					}
					Static395.aByteArray80[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static395.aShortArray101[local38] = (short) (((Static395.aShortArray101[local38] & 0xFF) << 3) + (Static395.aShortArray101[local38] >> 8 & 0x7));
						Static395.aShortArray103[local38] = (short) (((Static395.aShortArray103[local38] & 0xFF) << 3) + (Static395.aShortArray103[local38] >> 8 & 0x7));
						Static395.aShortArray98[local38] = (short) (((Static395.aShortArray98[local38] & 0xFF) << 3) + (Static395.aShortArray98[local38] >> 8 & 0x7));
						Static395.aShortArray101[local38] = (short) (Static395.aShortArray101[local38] << 3);
						Static395.aShortArray103[local38] = (short) (Static395.aShortArray103[local38] << 3);
						Static395.aShortArray98[local38] = (short) (Static395.aShortArray98[local38] << 3);
					}
					Static395.aShortArray104[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static395.aShortArray104[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean458 = true;
					} else if (local57 == 7) {
						this.aBoolean456 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean457 = true;
					}
					local38++;
				}
			}
			if (local29.anInt7523 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6777 = local38;
			this.aShortArray102 = new short[local38];
			this.aShortArray97 = new short[local38];
			this.aShortArray106 = new short[local38];
			this.aShortArray105 = new short[local38];
			this.aShortArray100 = new short[local38];
			this.aByteArray81 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray102[local57] = Static395.aShortArray99[local57];
				this.aShortArray97[local57] = Static395.aShortArray101[local57];
				this.aShortArray106[local57] = Static395.aShortArray103[local57];
				this.aShortArray105[local57] = Static395.aShortArray98[local57];
				this.aShortArray100[local57] = Static395.aShortArray104[local57];
				this.aByteArray81[local57] = Static395.aByteArray80[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt6777 = 0;
			this.aBoolean458 = false;
			this.aBoolean456 = false;
		}
	}
}
