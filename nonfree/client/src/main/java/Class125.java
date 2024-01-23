import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class125 {

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "Z")
	public boolean aBoolean257 = false;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!al;")
	public Class1_Sub3 aClass1_Sub3_1 = null;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
	public int anInt3813 = -1;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Z")
	public boolean aBoolean258 = false;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "[S")
	public short[] aShortArray73;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([BLclient!al;)V")
	public Class125(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		this.aClass1_Sub3_1 = arg1;
		@Pc(21) Class1_Sub14 local21 = new Class1_Sub14(arg0);
		@Pc(26) Class1_Sub14 local26 = new Class1_Sub14(arg0);
		local21.anInt1480 = 2;
		@Pc(33) int local33 = local21.method1378();
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		local26.anInt1480 = local21.anInt1480 + local33;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local33; local47++) {
			@Pc(56) int local56 = this.aClass1_Sub3_1.anIntArray14[local47];
			if (local56 == 0) {
				local37 = local47;
			}
			@Pc(64) int local64 = local21.method1378();
			if (local64 > 0) {
				if (local56 == 0) {
					local39 = local47;
				}
				Static198.aShortArray67[local35] = (short) local47;
				@Pc(77) short local77 = 0;
				if (local56 == 3) {
					local77 = 128;
				}
				if ((local64 & 0x1) == 0) {
					Static198.aShortArray75[local35] = local77;
				} else {
					Static198.aShortArray75[local35] = (short) local26.method1358();
				}
				if ((local64 & 0x2) == 0) {
					Static198.aShortArray69[local35] = local77;
				} else {
					Static198.aShortArray69[local35] = (short) local26.method1358();
				}
				if ((local64 & 0x4) == 0) {
					Static198.aShortArray70[local35] = local77;
				} else {
					Static198.aShortArray70[local35] = (short) local26.method1358();
				}
				Static198.aByteArray45[local35] = (byte) (local64 >>> 3 & 0x3);
				if (local56 == 2) {
					Static198.aShortArray75[local35] = (short) (((Static198.aShortArray75[local35] & 0xFF) << 3) + (Static198.aShortArray75[local35] >> 8 & 0x7));
					Static198.aShortArray69[local35] = (short) (((Static198.aShortArray69[local35] & 0xFF) << 3) + (Static198.aShortArray69[local35] >> 8 & 0x7));
					Static198.aShortArray70[local35] = (short) (((Static198.aShortArray70[local35] & 0xFF) << 3) + (Static198.aShortArray70[local35] >> 8 & 0x7));
				}
				Static198.aShortArray71[local35] = -1;
				if (local56 == 1 || local56 == 2 || local56 == 3) {
					if (local37 > local39) {
						Static198.aShortArray71[local35] = (short) local37;
						local39 = local37;
					}
				} else if (local56 == 5) {
					this.aBoolean258 = true;
				} else if (local56 == 7) {
					this.aBoolean257 = true;
				}
				local35++;
			}
		}
		if (local26.anInt1480 != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt3813 = local35;
		this.aShortArray68 = new short[local35];
		this.aShortArray66 = new short[local35];
		this.aShortArray74 = new short[local35];
		this.aShortArray72 = new short[local35];
		this.aShortArray73 = new short[local35];
		this.aByteArray46 = new byte[local35];
		for (local47 = 0; local47 < local35; local47++) {
			this.aShortArray68[local47] = Static198.aShortArray67[local47];
			this.aShortArray66[local47] = Static198.aShortArray75[local47];
			this.aShortArray74[local47] = Static198.aShortArray69[local47];
			this.aShortArray72[local47] = Static198.aShortArray70[local47];
			this.aShortArray73[local47] = Static198.aShortArray71[local47];
			this.aByteArray46[local47] = Static198.aByteArray45[local47];
		}
	}
}
