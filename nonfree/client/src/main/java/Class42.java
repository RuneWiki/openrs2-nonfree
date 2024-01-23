import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class42 {

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	public int anInt1264 = -1;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "Z")
	public boolean aBoolean123 = false;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Lclient!vb;")
	public Class1_Sub32 aClass1_Sub32_1 = null;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "Z")
	public boolean aBoolean124 = false;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([BLclient!vb;)V")
	public Class42(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub32 arg1) {
		this.aClass1_Sub32_1 = arg1;
		@Pc(21) Class1_Sub13 local21 = new Class1_Sub13(arg0);
		@Pc(26) Class1_Sub13 local26 = new Class1_Sub13(arg0);
		local21.anInt2018 = 2;
		@Pc(33) int local33 = local21.method1853();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.anInt2018 = local21.anInt2018 + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.aClass1_Sub32_1.anIntArray581[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.method1853();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static61.aShortArray37[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static61.aShortArray35[local35] = local77;
				} else {
					Static61.aShortArray35[local35] = (short) local26.method1817();
				}
				if ((local64 & 0x2) == 0) {
					Static61.aShortArray38[local35] = local77;
				} else {
					Static61.aShortArray38[local35] = (short) local26.method1817();
				}
				if ((local64 & 0x4) == 0) {
					Static61.aShortArray43[local35] = local77;
				} else {
					Static61.aShortArray43[local35] = (short) local26.method1817();
				}
				Static61.aByteArray44[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static61.aShortArray35[local35] = (short) (((Static61.aShortArray35[local35] & 0xFF) << 3) + (Static61.aShortArray35[local35] >> 8 & 0x7));
					Static61.aShortArray38[local35] = (short) (((Static61.aShortArray38[local35] & 0xFF) << 3) + (Static61.aShortArray38[local35] >> 8 & 0x7));
					Static61.aShortArray43[local35] = (short) (((Static61.aShortArray43[local35] & 0xFF) << 3) + (Static61.aShortArray43[local35] >> 8 & 0x7));
				}
				Static61.aShortArray41[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static61.aShortArray41[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean124 = true;
				} else if (local56 == 7) {
					this.aBoolean123 = true;
				}
				local35++;
			}
		}
		if (local26.anInt2018 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1264 = local35;
		this.aShortArray39 = new short[local35];
		this.aShortArray42 = new short[local35];
		this.aShortArray40 = new short[local35];
		this.aShortArray36 = new short[local35];
		this.aShortArray44 = new short[local35];
		this.aByteArray45 = new byte[local35];
		for (local47 = 0; local47 < local35; local47++) {
			this.aShortArray39[local47] = Static61.aShortArray37[local47];
			this.aShortArray42[local47] = Static61.aShortArray35[local47];
			this.aShortArray40[local47] = Static61.aShortArray38[local47];
			this.aShortArray36[local47] = Static61.aShortArray43[local47];
			this.aShortArray44[local47] = Static61.aShortArray41[local47];
			this.aByteArray45[local47] = Static61.aByteArray44[local47];
		}
	}
}
