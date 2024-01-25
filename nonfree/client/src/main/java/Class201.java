import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class201 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Lclient!hl;")
	public Class2_Sub16 aClass2_Sub16_1 = null;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
	public boolean aBoolean395 = false;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	public int anInt5577 = 0;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "Z")
	public boolean aBoolean396 = false;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "Z")
	public boolean aBoolean397 = false;

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "[S")
	public short[] aShortArray101;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "[S")
	public short[] aShortArray98;

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "[B")
	public byte[] aByteArray108;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([BLclient!hl;)V")
	public Class201(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub16 arg1) {
		this.aClass2_Sub16_1 = arg1;
		try {
			@Pc(24) Class2_Sub23 local24 = new Class2_Sub23(arg0);
			@Pc(29) Class2_Sub23 local29 = new Class2_Sub23(arg0);
			local24.anInt6952 = 2;
			@Pc(36) int local36 = local24.method5495();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt6952 = local24.anInt6952 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass2_Sub16_1.anIntArray278[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method5495();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static319.aShortArray100[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static319.aShortArray103[local38] = local78;
					} else {
						Static319.aShortArray103[local38] = (short) local29.method5501();
					}
					if ((local65 & 0x2) == 0) {
						Static319.aShortArray96[local38] = local78;
					} else {
						Static319.aShortArray96[local38] = (short) local29.method5501();
					}
					if ((local65 & 0x4) == 0) {
						Static319.aShortArray94[local38] = local78;
					} else {
						Static319.aShortArray94[local38] = (short) local29.method5501();
					}
					Static319.aByteArray107[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static319.aShortArray103[local38] = (short) (((Static319.aShortArray103[local38] & 0xFF) << 3) + (Static319.aShortArray103[local38] >> 8 & 0x7));
						Static319.aShortArray96[local38] = (short) (((Static319.aShortArray96[local38] & 0xFF) << 3) + (Static319.aShortArray96[local38] >> 8 & 0x7));
						Static319.aShortArray94[local38] = (short) (((Static319.aShortArray94[local38] & 0xFF) << 3) + (Static319.aShortArray94[local38] >> 8 & 0x7));
						Static319.aShortArray103[local38] = (short) (Static319.aShortArray103[local38] << 3);
						Static319.aShortArray96[local38] = (short) (Static319.aShortArray96[local38] << 3);
						Static319.aShortArray94[local38] = (short) (Static319.aShortArray94[local38] << 3);
					}
					Static319.aShortArray95[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static319.aShortArray95[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean397 = true;
					} else if (local57 == 7) {
						this.aBoolean395 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean396 = true;
					}
					local38++;
				}
			}
			if (local29.anInt6952 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt5577 = local38;
			this.aShortArray101 = new short[local38];
			this.aShortArray98 = new short[local38];
			this.aShortArray102 = new short[local38];
			this.aShortArray97 = new short[local38];
			this.aShortArray99 = new short[local38];
			this.aByteArray108 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray101[local57] = Static319.aShortArray100[local57];
				this.aShortArray98[local57] = Static319.aShortArray103[local57];
				this.aShortArray102[local57] = Static319.aShortArray96[local57];
				this.aShortArray97[local57] = Static319.aShortArray94[local57];
				this.aShortArray99[local57] = Static319.aShortArray95[local57];
				this.aByteArray108[local57] = Static319.aByteArray107[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt5577 = 0;
			this.aBoolean397 = false;
			this.aBoolean395 = false;
		}
	}
}
