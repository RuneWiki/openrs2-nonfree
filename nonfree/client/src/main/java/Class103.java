import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class103 {

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Z")
	public boolean aBoolean212 = false;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Z")
	public boolean aBoolean211 = false;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Lclient!pg;")
	public Class4_Sub28 aClass4_Sub28_1 = null;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
	public int anInt3313 = -1;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "[S")
	public short[] aShortArray46;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([BLclient!pg;)V")
	public Class103(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class4_Sub28 arg1) {
		this.aClass4_Sub28_1 = arg1;
		@Pc(21) Class4_Sub24 local21 = new Class4_Sub24(arg0);
		@Pc(26) Class4_Sub24 local26 = new Class4_Sub24(arg0);
		local21.anInt3822 = 2;
		@Pc(33) int local33 = local21.method3110();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.anInt3822 = local21.anInt3822 + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.aClass4_Sub28_1.anIntArray340[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.method3110();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static163.aShortArray53[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static163.aShortArray49[local35] = local77;
				} else {
					Static163.aShortArray49[local35] = (short) local26.method3067();
				}
				if ((local64 & 0x2) == 0) {
					Static163.aShortArray55[local35] = local77;
				} else {
					Static163.aShortArray55[local35] = (short) local26.method3067();
				}
				if ((local64 & 0x4) == 0) {
					Static163.aShortArray52[local35] = local77;
				} else {
					Static163.aShortArray52[local35] = (short) local26.method3067();
				}
				Static163.aByteArray40[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static163.aShortArray49[local35] = (short) (((Static163.aShortArray49[local35] & 0xFF) << 3) + (Static163.aShortArray49[local35] >> 8 & 0x7));
					Static163.aShortArray55[local35] = (short) (((Static163.aShortArray55[local35] & 0xFF) << 3) + (Static163.aShortArray55[local35] >> 8 & 0x7));
					Static163.aShortArray52[local35] = (short) (((Static163.aShortArray52[local35] & 0xFF) << 3) + (Static163.aShortArray52[local35] >> 8 & 0x7));
				}
				Static163.aShortArray47[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static163.aShortArray47[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean211 = true;
				} else if (local56 == 7) {
					this.aBoolean212 = true;
				}
				local35++;
			}
		}
		if (local26.anInt3822 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt3313 = local35;
		this.aShortArray54 = new short[local35];
		this.aShortArray50 = new short[local35];
		this.aShortArray48 = new short[local35];
		this.aShortArray46 = new short[local35];
		this.aShortArray51 = new short[local35];
		this.aByteArray41 = new byte[local35];
		for (local47 = 0; local47 < local35; local47++) {
			this.aShortArray54[local47] = Static163.aShortArray53[local47];
			this.aShortArray50[local47] = Static163.aShortArray49[local47];
			this.aShortArray48[local47] = Static163.aShortArray55[local47];
			this.aShortArray46[local47] = Static163.aShortArray52[local47];
			this.aShortArray51[local47] = Static163.aShortArray47[local47];
			this.aByteArray41[local47] = Static163.aByteArray40[local47];
		}
	}
}
