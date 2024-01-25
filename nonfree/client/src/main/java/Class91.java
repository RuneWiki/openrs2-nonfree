import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class91 {

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "Lclient!ir;")
	public Class7_Sub26 aClass7_Sub26_1 = null;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Z")
	public boolean aBoolean145 = false;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
	public int anInt2516 = 0;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "([BLclient!ir;)V")
	public Class91(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class7_Sub26 arg1) {
		this.aClass7_Sub26_1 = arg1;
		try {
			@Pc(24) Class7_Sub14 local24 = new Class7_Sub14(arg0);
			@Pc(29) Class7_Sub14 local29 = new Class7_Sub14(arg0);
			local24.anInt4989 = 2;
			@Pc(36) int local36 = local24.method3981();
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = -1;
			@Pc(42) int local42 = -1;
			local29.anInt4989 = local24.anInt4989 + local36;
			@Pc(57) int local57;
			for (@Pc(50) int local50 = 0; local50 < local36; local50++) {
				local57 = this.aClass7_Sub26_1.anIntArray287[local50];
				if (local57 == 0) {
					local40 = local50;
				}
				@Pc(65) int local65 = local24.method3981();
				if (local65 > 0) {
					if (local57 == 0) {
						local42 = local50;
					}
					Static132.aShortArray39[local38] = (short) local50;
					@Pc(78) short local78 = 0;
					if (local57 == 3 || local57 == 10) {
						local78 = 128;
					}
					if ((local65 & 0x1) == 0) {
						Static132.aShortArray46[local38] = local78;
					} else {
						Static132.aShortArray46[local38] = (short) local29.method3974();
					}
					if ((local65 & 0x2) == 0) {
						Static132.aShortArray38[local38] = local78;
					} else {
						Static132.aShortArray38[local38] = (short) local29.method3974();
					}
					if ((local65 & 0x4) == 0) {
						Static132.aShortArray41[local38] = local78;
					} else {
						Static132.aShortArray41[local38] = (short) local29.method3974();
					}
					Static132.aByteArray29[local38] = (byte) (local65 >>> 3 & 0x3);
					if (local57 == 2 || local57 == 9) {
						Static132.aShortArray46[local38] = (short) (((Static132.aShortArray46[local38] & 0xFF) << 3) + (Static132.aShortArray46[local38] >> 8 & 0x7));
						Static132.aShortArray38[local38] = (short) (((Static132.aShortArray38[local38] & 0xFF) << 3) + (Static132.aShortArray38[local38] >> 8 & 0x7));
						Static132.aShortArray41[local38] = (short) (((Static132.aShortArray41[local38] & 0xFF) << 3) + (Static132.aShortArray41[local38] >> 8 & 0x7));
						Static132.aShortArray46[local38] = (short) (Static132.aShortArray46[local38] << 3);
						Static132.aShortArray38[local38] = (short) (Static132.aShortArray38[local38] << 3);
						Static132.aShortArray41[local38] = (short) (Static132.aShortArray41[local38] << 3);
					}
					Static132.aShortArray37[local38] = -1;
					if (local57 == 1 || local57 == 2 || local57 == 3) {
						if (local40 > local42) {
							Static132.aShortArray37[local38] = (short) local40;
							local42 = local40;
						}
					} else if (local57 == 5) {
						this.aBoolean146 = true;
					} else if (local57 == 7) {
						this.aBoolean144 = true;
					} else if (local57 == 9 || local57 == 10 || local57 == 8) {
						this.aBoolean145 = true;
					}
					local38++;
				}
			}
			if (local29.anInt4989 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt2516 = local38;
			this.aShortArray45 = new short[local38];
			this.aShortArray43 = new short[local38];
			this.aShortArray40 = new short[local38];
			this.aShortArray44 = new short[local38];
			this.aShortArray42 = new short[local38];
			this.aByteArray28 = new byte[local38];
			for (local57 = 0; local57 < local38; local57++) {
				this.aShortArray45[local57] = Static132.aShortArray39[local57];
				this.aShortArray43[local57] = Static132.aShortArray46[local57];
				this.aShortArray40[local57] = Static132.aShortArray38[local57];
				this.aShortArray44[local57] = Static132.aShortArray41[local57];
				this.aShortArray42[local57] = Static132.aShortArray37[local57];
				this.aByteArray28[local57] = Static132.aByteArray29[local57];
			}
		} catch (@Pc(372) Exception local372) {
			this.anInt2516 = 0;
			this.aBoolean146 = false;
			this.aBoolean144 = false;
		}
	}
}
