import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class241 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
	public int anInt6533 = 0;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Z")
	public boolean aBoolean443 = false;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Z")
	public boolean aBoolean444 = false;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!eb;")
	public Class6_Sub9 aClass6_Sub9_1 = null;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Z")
	public boolean aBoolean445 = false;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "[B")
	public byte[] aByteArray84;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "([BLclient!eb;)V")
	public Class241(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class6_Sub9 arg1) {
		this.aClass6_Sub9_1 = arg1;
		try {
			@Pc(24) Class6_Sub15 local24 = new Class6_Sub15(arg0);
			@Pc(29) Class6_Sub15 local29 = new Class6_Sub15(arg0);
			local24.anInt3487 = 2;
			@Pc(36) int local36 = local24.method3111();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt3487 = local24.anInt3487 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass6_Sub9_1.anIntArray165[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method3111();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static395.aShortArray96[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static395.aShortArray92[local38] = local78;
					} else {
						Static395.aShortArray92[local38] = (short) local29.method3125();
					}
					if ((local65 & 0x2) == 0) {
						Static395.aShortArray88[local38] = local78;
					} else {
						Static395.aShortArray88[local38] = (short) local29.method3125();
					}
					if ((local65 & 0x4) == 0) {
						Static395.aShortArray91[local38] = local78;
					} else {
						Static395.aShortArray91[local38] = (short) local29.method3125();
					}
					Static395.aByteArray85[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static395.aShortArray92[local38] = (short) (((Static395.aShortArray92[local38] & 0xFF) << 3) + (Static395.aShortArray92[local38] >> 8 & 0x7));
						Static395.aShortArray88[local38] = (short) (((Static395.aShortArray88[local38] & 0xFF) << 3) + (Static395.aShortArray88[local38] >> 8 & 0x7));
						Static395.aShortArray91[local38] = (short) (((Static395.aShortArray91[local38] & 0xFF) << 3) + (Static395.aShortArray91[local38] >> 8 & 0x7));
						Static395.aShortArray92[local38] = (short) (Static395.aShortArray92[local38] << 3);
						Static395.aShortArray88[local38] = (short) (Static395.aShortArray88[local38] << 3);
						Static395.aShortArray91[local38] = (short) (Static395.aShortArray91[local38] << 3);
					}
					Static395.aShortArray95[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static395.aShortArray95[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean445 = true;
					} else if (local57 == 7) {
						this.aBoolean444 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean443 = true;
					}
					local38++;
				}
			}
			if (local29.anInt3487 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6533 = local38;
			this.aShortArray90 = new short[local38];
			this.aShortArray94 = new short[local38];
			this.aShortArray97 = new short[local38];
			this.aShortArray89 = new short[local38];
			this.aShortArray93 = new short[local38];
			this.aByteArray84 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray90[local57] = Static395.aShortArray96[local57];
				this.aShortArray94[local57] = Static395.aShortArray92[local57];
				this.aShortArray97[local57] = Static395.aShortArray88[local57];
				this.aShortArray89[local57] = Static395.aShortArray91[local57];
				this.aShortArray93[local57] = Static395.aShortArray95[local57];
				this.aByteArray84[local57] = Static395.aByteArray85[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt6533 = 0;
			this.aBoolean445 = false;
			this.aBoolean444 = false;
		}
	}
}
