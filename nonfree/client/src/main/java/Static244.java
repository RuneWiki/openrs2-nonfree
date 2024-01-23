import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
	public static int anInt4843;

	@OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
	public static int anInt4847;

	@OriginalMember(owner = "client!sk", name = "V", descriptor = "Lclient!o;")
	public static Class116 aClass116_5;

	@OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
	public static int anInt4854;

	@OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
	public static volatile int anInt4846 = 0;

	@OriginalMember(owner = "client!sk", name = "P", descriptor = "Lclient!qc;")
	public static Class135 aClass135_30 = new Class135(50);

	@OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
	public static int anInt4849 = 0;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZI)I")
	public static int method3755(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 & 0x3F;
		@Pc(19) int local19 = arg0 >> 6 & 0x3;
		if (local13 == 18) {
			if (local19 == 0) {
				return 1;
			}
			if (local19 == 1) {
				return 2;
			}
			if (local19 == 2) {
				return 4;
			}
			if (local19 == 3) {
				return 8;
			}
		} else if (local13 == 19 || local13 == 21) {
			if (local19 == 0) {
				return 16;
			}
			if (local19 == 1) {
				return 32;
			}
			if (local19 == 2) {
				return 64;
			}
			if (local19 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(BII)V")
	public static void method3757(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class119 local3 = Static14.method289(arg1);
		@Pc(10) int local10 = local3.anInt3891;
		@Pc(13) int local13 = local3.anInt3899;
		@Pc(16) int local16 = local3.anInt3893;
		@Pc(23) int local23 = Class114.anIntArray338[local13 - local16];
		if (arg0 < 0 || local23 < arg0) {
			arg0 = 0;
		}
		local23 <<= local16;
		Static98.method1832(~local23 & Static128.anIntArray259[local10] | local23 & arg0 << local16, local10);
	}
}
