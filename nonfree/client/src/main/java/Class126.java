import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class126 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Lclient!jd;")
	public Class5_Sub21 aClass5_Sub21_1 = null;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "Z")
	public boolean aBoolean212 = false;

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "Z")
	public boolean aBoolean213 = false;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
	public int anInt3341 = 0;

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "Z")
	public boolean aBoolean214 = false;

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "([BLclient!jd;)V")
	public Class126(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub21 arg1) {
		this.aClass5_Sub21_1 = arg1;
		try {
			@Pc(24) Class5_Sub15 local24 = new Class5_Sub15(arg0);
			@Pc(29) Class5_Sub15 local29 = new Class5_Sub15(arg0);
			local24.anInt7013 = 2;
			@Pc(36) int local36 = local24.method5539();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt7013 = local24.anInt7013 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass5_Sub21_1.anIntArray182[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method5539();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static201.aShortArray46[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static201.aShortArray50[local38] = local78;
					} else {
						Static201.aShortArray50[local38] = (short) local29.method5576();
					}
					if ((local65 & 0x2) == 0) {
						Static201.aShortArray44[local38] = local78;
					} else {
						Static201.aShortArray44[local38] = (short) local29.method5576();
					}
					if ((local65 & 0x4) == 0) {
						Static201.aShortArray45[local38] = local78;
					} else {
						Static201.aShortArray45[local38] = (short) local29.method5576();
					}
					Static201.aByteArray48[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static201.aShortArray50[local38] = (short) (((Static201.aShortArray50[local38] & 0xFF) << 3) + (Static201.aShortArray50[local38] >> 8 & 0x7));
						Static201.aShortArray44[local38] = (short) (((Static201.aShortArray44[local38] & 0xFF) << 3) + (Static201.aShortArray44[local38] >> 8 & 0x7));
						Static201.aShortArray45[local38] = (short) (((Static201.aShortArray45[local38] & 0xFF) << 3) + (Static201.aShortArray45[local38] >> 8 & 0x7));
						Static201.aShortArray50[local38] = (short) (Static201.aShortArray50[local38] << 3);
						Static201.aShortArray44[local38] = (short) (Static201.aShortArray44[local38] << 3);
						Static201.aShortArray45[local38] = (short) (Static201.aShortArray45[local38] << 3);
					}
					Static201.aShortArray49[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static201.aShortArray49[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean213 = true;
					} else if (local57 == 7) {
						this.aBoolean214 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean212 = true;
					}
					local38++;
				}
			}
			if (local29.anInt7013 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt3341 = local38;
			this.aShortArray53 = new short[local38];
			this.aShortArray51 = new short[local38];
			this.aShortArray52 = new short[local38];
			this.aShortArray48 = new short[local38];
			this.aShortArray47 = new short[local38];
			this.aByteArray49 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray53[local57] = Static201.aShortArray46[local57];
				this.aShortArray51[local57] = Static201.aShortArray50[local57];
				this.aShortArray52[local57] = Static201.aShortArray44[local57];
				this.aShortArray48[local57] = Static201.aShortArray45[local57];
				this.aShortArray47[local57] = Static201.aShortArray49[local57];
				this.aByteArray49[local57] = Static201.aByteArray48[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt3341 = 0;
			this.aBoolean213 = false;
			this.aBoolean214 = false;
		}
	}
}
