import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "Z")
	public static boolean aBoolean442;

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_209 = new Class92(24, 8);

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)I")
	public static int method4981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static215.aByteArrayArray13 == null ? 0 : (Static215.aByteArrayArray13[arg0][arg1] & 0xFF) << 3;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method4983(@OriginalArg(1) String[] arg0) {
		@Pc(6) String[] local6 = new String[5];
		for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
			local6[local8] = local8 + ": ";
			if (arg0 != null && arg0[local8] != null) {
				local6[local8] = local6[local8] + arg0[local8];
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)I")
	public static int method4984(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(15) int local15 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIILclient!us;)V")
	public static void method4985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub4 arg4) {
		@Pc(4) Class217 local4 = Static344.method4926(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt3896 = (arg1 << Static287.anInt5248) + Static340.anInt6290;
		arg4.anInt3899 = arg3;
		arg4.anInt3898 = (arg2 << Static287.anInt5248) + Static340.anInt6290;
		for (@Pc(28) Class182 local28 = local4.aClass182_3; local28 != null; local28 = local28.aClass182_2) {
			if (local28.aClass1_Sub3_2.aBoolean425) {
				@Pc(38) int local38 = local28.aClass1_Sub3_2.method4828();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt3899 += local8;
			arg4.aBoolean305 = true;
		}
		local4.aClass1_Sub4_1 = arg4;
	}
}
