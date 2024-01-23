import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class42 {

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "[B")
	public static byte[] aByteArray16 = new byte[32896];

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!cd;")
	private Class22 aClass22_5 = new Class22(256);

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "Lclient!cd;")
	private Class22 aClass22_6 = new Class22(256);

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Lclient!ak;")
	private Class7 aClass7_61;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!ak;")
	private Class7 aClass7_62;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(13) int local13 = 0; local13 <= local6; local13++) {
				aByteArray16[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local13 * local13 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!ak;Lclient!ak;)V")
	public Class42(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1) {
		this.aClass7_61 = arg1;
		this.aClass7_62 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[IIZ)Lclient!om;")
	private Class1_Sub22_Sub1 method1026(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = (arg2 >>> 12 | (arg2 & 0x30000FFF) << 4) ^ arg0;
		@Pc(17) int local17 = local11 | arg2 << 16;
		@Pc(26) long local26 = (long) local17 ^ 0x100000000L;
		@Pc(33) Class1_Sub22_Sub1 local33 = (Class1_Sub22_Sub1) this.aClass22_6.method633(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(64) Class1_Sub3 local64 = (Class1_Sub3) this.aClass22_5.method633(local26);
			if (local64 == null) {
				local64 = Static15.method298(this.aClass7_61, arg2, arg0);
				if (local64 == null) {
					return null;
				}
				this.aClass22_5.method643(local26, local64);
			}
			local33 = local64.method300(arg1);
			if (local33 == null) {
				return null;
			} else {
				local64.method4534();
				this.aClass22_6.method643(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([IIII)Lclient!om;")
	private Class1_Sub22_Sub1 method1028(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg2 & 0x10000FFF) << 4 | arg2 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub22_Sub1 local31 = (Class1_Sub22_Sub1) this.aClass22_6.method633(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(51) Class44 local51 = Static302.method1045(this.aClass7_62, arg2, arg1);
			if (local51 == null) {
				return null;
			}
			local31 = local51.method1046();
			this.aClass22_6.method643(local24, local31);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray70.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[II)Lclient!om;")
	public Class1_Sub22_Sub1 method1031(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass7_61.method257() == 1) {
			return this.method1026(arg0, arg1, 0);
		} else if (this.aClass7_61.method265(arg0) == 1) {
			return this.method1026(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([III)Lclient!om;")
	public Class1_Sub22_Sub1 method1034(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass7_62.method257() == 1) {
			return this.method1028(arg0, arg1, 0);
		} else if (this.aClass7_62.method265(arg1) == 1) {
			return this.method1028(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
