import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class77 {

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "Lclient!sg;")
	public Class1_Sub28 aClass1_Sub28_1 = null;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Z")
	public boolean aBoolean159 = false;

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
	public int anInt2118 = -1;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "Z")
	public boolean aBoolean160 = false;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "[S")
	public short[] aShortArray38;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "([BLclient!sg;)V")
	public Class77(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub28 arg1) {
		this.aClass1_Sub28_1 = arg1;
		@Pc(21) Class1_Sub18 local21 = new Class1_Sub18(arg0);
		@Pc(26) Class1_Sub18 local26 = new Class1_Sub18(arg0);
		local21.anInt3911 = 2;
		@Pc(33) int local33 = local21.method3122();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.anInt3911 = local21.anInt3911 + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.aClass1_Sub28_1.anIntArray585[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.method3122();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static114.aShortArray40[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static114.aShortArray45[local35] = local77;
				} else {
					Static114.aShortArray45[local35] = (short) local26.method3081();
				}
				if ((local64 & 0x2) == 0) {
					Static114.aShortArray46[local35] = local77;
				} else {
					Static114.aShortArray46[local35] = (short) local26.method3081();
				}
				if ((local64 & 0x4) == 0) {
					Static114.aShortArray37[local35] = local77;
				} else {
					Static114.aShortArray37[local35] = (short) local26.method3081();
				}
				Static114.aByteArray40[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static114.aShortArray45[local35] = (short) (((Static114.aShortArray45[local35] & 0xFF) << 3) + (Static114.aShortArray45[local35] >> 8 & 0x7));
					Static114.aShortArray46[local35] = (short) (((Static114.aShortArray46[local35] & 0xFF) << 3) + (Static114.aShortArray46[local35] >> 8 & 0x7));
					Static114.aShortArray37[local35] = (short) (((Static114.aShortArray37[local35] & 0xFF) << 3) + (Static114.aShortArray37[local35] >> 8 & 0x7));
				}
				Static114.aShortArray39[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static114.aShortArray39[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean160 = true;
				} else if (local56 == 7) {
					this.aBoolean159 = true;
				}
				local35++;
			}
		}
		if (local26.anInt3911 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt2118 = local35;
		this.aShortArray42 = new short[local35];
		this.aShortArray43 = new short[local35];
		this.aShortArray44 = new short[local35];
		this.aShortArray38 = new short[local35];
		this.aShortArray41 = new short[local35];
		this.aByteArray39 = new byte[local35];
		for (local47 = 0; local47 < local35; local47++) {
			this.aShortArray42[local47] = Static114.aShortArray40[local47];
			this.aShortArray43[local47] = Static114.aShortArray45[local47];
			this.aShortArray44[local47] = Static114.aShortArray46[local47];
			this.aShortArray38[local47] = Static114.aShortArray37[local47];
			this.aShortArray41[local47] = Static114.aShortArray39[local47];
			this.aByteArray39[local47] = Static114.aByteArray40[local47];
		}
	}
}
