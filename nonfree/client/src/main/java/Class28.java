import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class28 {

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "Lclient!wn;")
	public Class1_Sub32 aClass1_Sub32_1 = null;

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
	public int anInt783 = -1;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "Z")
	public boolean aBoolean51 = false;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "Z")
	public boolean aBoolean52 = false;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "([BLclient!wn;)V")
	public Class28(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub32 arg1) {
		this.aClass1_Sub32_1 = arg1;
		@Pc(21) Class1_Sub14 local21 = new Class1_Sub14(arg0);
		@Pc(26) Class1_Sub14 local26 = new Class1_Sub14(arg0);
		local21.anInt3000 = 2;
		@Pc(33) int local33 = local21.method2199();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.anInt3000 = local21.anInt3000 + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.aClass1_Sub32_1.anIntArray571[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.method2199();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static33.aShortArray43[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static33.aShortArray48[local35] = local77;
				} else {
					Static33.aShortArray48[local35] = (short) local26.method2195();
				}
				if ((local64 & 0x2) == 0) {
					Static33.aShortArray46[local35] = local77;
				} else {
					Static33.aShortArray46[local35] = (short) local26.method2195();
				}
				if ((local64 & 0x4) == 0) {
					Static33.aShortArray45[local35] = local77;
				} else {
					Static33.aShortArray45[local35] = (short) local26.method2195();
				}
				Static33.aByteArray35[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static33.aShortArray48[local35] = (short) (((Static33.aShortArray48[local35] & 0xFF) << 3) + (Static33.aShortArray48[local35] >> 8 & 0x7));
					Static33.aShortArray46[local35] = (short) (((Static33.aShortArray46[local35] & 0xFF) << 3) + (Static33.aShortArray46[local35] >> 8 & 0x7));
					Static33.aShortArray45[local35] = (short) (((Static33.aShortArray45[local35] & 0xFF) << 3) + (Static33.aShortArray45[local35] >> 8 & 0x7));
				}
				Static33.aShortArray50[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static33.aShortArray50[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean52 = true;
				} else if (local56 == 7) {
					this.aBoolean51 = true;
				}
				local35++;
			}
		}
		if (local26.anInt3000 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt783 = local35;
		this.aShortArray49 = new short[local35];
		this.aShortArray44 = new short[local35];
		this.aShortArray47 = new short[local35];
		this.aShortArray51 = new short[local35];
		this.aShortArray42 = new short[local35];
		this.aByteArray36 = new byte[local35];
		for (local47 = 0; local47 < local35; local47++) {
			this.aShortArray49[local47] = Static33.aShortArray43[local47];
			this.aShortArray44[local47] = Static33.aShortArray48[local47];
			this.aShortArray47[local47] = Static33.aShortArray46[local47];
			this.aShortArray51[local47] = Static33.aShortArray45[local47];
			this.aShortArray42[local47] = Static33.aShortArray50[local47];
			this.aByteArray36[local47] = Static33.aByteArray35[local47];
		}
	}
}
