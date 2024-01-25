import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class112 {

	@OriginalMember(owner = "client!it", name = "i", descriptor = "Z")
	public boolean aBoolean223 = false;

	@OriginalMember(owner = "client!it", name = "e", descriptor = "I")
	public int anInt2984 = 0;

	@OriginalMember(owner = "client!it", name = "o", descriptor = "Z")
	public boolean aBoolean224 = false;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "Lclient!sm;")
	public Class2_Sub39 aClass2_Sub39_1 = null;

	@OriginalMember(owner = "client!it", name = "p", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!it", name = "d", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!it", name = "k", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!it", name = "g", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!it", name = "n", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!it", name = "m", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "([BLclient!sm;)V")
	public Class112(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub39 arg1) {
		this.aClass2_Sub39_1 = arg1;
		try {
			@Pc(21) Class2_Sub16 local21 = new Class2_Sub16(arg0);
			@Pc(26) Class2_Sub16 local26 = new Class2_Sub16(arg0);
			local21.anInt6145 = 2;
			@Pc(33) int local33 = local21.method5350();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt6145 = local21.anInt6145 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass2_Sub39_1.anIntArray1068[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method5350();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static153.aShortArray50[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static153.aShortArray46[local35] = local75;
					} else {
						Static153.aShortArray46[local35] = (short) local26.method5342();
					}
					if ((local62 & 0x2) == 0) {
						Static153.aShortArray43[local35] = local75;
					} else {
						Static153.aShortArray43[local35] = (short) local26.method5342();
					}
					if ((local62 & 0x4) == 0) {
						Static153.aShortArray48[local35] = local75;
					} else {
						Static153.aShortArray48[local35] = (short) local26.method5342();
					}
					Static153.aByteArray45[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static153.aShortArray46[local35] = (short) (((Static153.aShortArray46[local35] & 0xFF) << 3) + (Static153.aShortArray46[local35] >> 8 & 0x7));
						Static153.aShortArray43[local35] = (short) (((Static153.aShortArray43[local35] & 0xFF) << 3) + (Static153.aShortArray43[local35] >> 8 & 0x7));
						Static153.aShortArray48[local35] = (short) (((Static153.aShortArray48[local35] & 0xFF) << 3) + (Static153.aShortArray48[local35] >> 8 & 0x7));
						Static153.aShortArray46[local35] = (short) (Static153.aShortArray46[local35] << 3);
						Static153.aShortArray43[local35] = (short) (Static153.aShortArray43[local35] << 3);
						Static153.aShortArray48[local35] = (short) (Static153.aShortArray48[local35] << 3);
					}
					Static153.aShortArray44[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static153.aShortArray44[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean223 = true;
					} else if (local54 == 7) {
						this.aBoolean224 = true;
					}
					local35++;
				}
			}
			if (local26.anInt6145 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt2984 = local35;
			this.aShortArray52 = new short[local35];
			this.aShortArray45 = new short[local35];
			this.aShortArray49 = new short[local35];
			this.aShortArray47 = new short[local35];
			this.aShortArray51 = new short[local35];
			this.aByteArray46 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray52[local54] = Static153.aShortArray50[local54];
				this.aShortArray45[local54] = Static153.aShortArray46[local54];
				this.aShortArray49[local54] = Static153.aShortArray43[local54];
				this.aShortArray47[local54] = Static153.aShortArray48[local54];
				this.aShortArray51[local54] = Static153.aShortArray44[local54];
				this.aByteArray46[local54] = Static153.aByteArray45[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt2984 = 0;
			this.aBoolean223 = false;
			this.aBoolean224 = false;
		}
	}
}
