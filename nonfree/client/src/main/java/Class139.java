import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class139 {

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
	public int anInt4377 = -1;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "Z")
	public boolean aBoolean358 = false;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Lclient!fd;")
	public Class2_Sub10 aClass2_Sub10_1 = null;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Z")
	public boolean aBoolean359 = false;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([BLclient!fd;)V")
	public Class139(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		this.aClass2_Sub10_1 = arg1;
		@Pc(21) Class2_Sub26 local21 = new Class2_Sub26(arg0);
		@Pc(26) Class2_Sub26 local26 = new Class2_Sub26(arg0);
		local21.anInt5328 = 2;
		@Pc(33) int local33 = local21.method4261();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.anInt5328 = local21.anInt5328 + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.aClass2_Sub10_1.anIntArray111[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.method4261();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static211.aShortArray43[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static211.aShortArray45[local35] = local77;
				} else {
					Static211.aShortArray45[local35] = (short) local26.method4250();
				}
				if ((local64 & 0x2) == 0) {
					Static211.aShortArray49[local35] = local77;
				} else {
					Static211.aShortArray49[local35] = (short) local26.method4250();
				}
				if ((local64 & 0x4) == 0) {
					Static211.aShortArray48[local35] = local77;
				} else {
					Static211.aShortArray48[local35] = (short) local26.method4250();
				}
				Static211.aByteArray46[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static211.aShortArray45[local35] = (short) (((Static211.aShortArray45[local35] & 0xFF) << 3) + (Static211.aShortArray45[local35] >> 8 & 0x7));
					Static211.aShortArray49[local35] = (short) (((Static211.aShortArray49[local35] & 0xFF) << 3) + (Static211.aShortArray49[local35] >> 8 & 0x7));
					Static211.aShortArray48[local35] = (short) (((Static211.aShortArray48[local35] & 0xFF) << 3) + (Static211.aShortArray48[local35] >> 8 & 0x7));
				}
				Static211.aShortArray46[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static211.aShortArray46[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean359 = true;
				} else if (local56 == 7) {
					this.aBoolean358 = true;
				}
				local35++;
			}
		}
		if (local26.anInt5328 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt4377 = local35;
		this.aShortArray47 = new short[local35];
		this.aShortArray42 = new short[local35];
		this.aShortArray51 = new short[local35];
		this.aShortArray50 = new short[local35];
		this.aShortArray44 = new short[local35];
		this.aByteArray47 = new byte[local35];
		for (local47 = 0; local47 < local35; local47++) {
			this.aShortArray47[local47] = Static211.aShortArray43[local47];
			this.aShortArray42[local47] = Static211.aShortArray45[local47];
			this.aShortArray51[local47] = Static211.aShortArray49[local47];
			this.aShortArray50[local47] = Static211.aShortArray48[local47];
			this.aShortArray44[local47] = Static211.aShortArray46[local47];
			this.aByteArray47[local47] = Static211.aByteArray46[local47];
		}
	}
}
