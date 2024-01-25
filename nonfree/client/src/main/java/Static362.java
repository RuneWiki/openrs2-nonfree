import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!va", name = "R", descriptor = "[[Lclient!ws;")
	public static Class251[][] aClass251ArrayArray1;

	@OriginalMember(owner = "client!va", name = "X", descriptor = "I")
	public static int anInt6403;

	@OriginalMember(owner = "client!va", name = "J", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_172 = new Class77(22, -2);

	@OriginalMember(owner = "client!va", name = "T", descriptor = "Lclient!sq;")
	public static Class214 aClass214_32 = new Class214(8);

	@OriginalMember(owner = "client!va", name = "U", descriptor = "I")
	public static int anInt6401 = 0;

	@OriginalMember(owner = "client!va", name = "V", descriptor = "[I")
	public static final int[] anIntArray775 = new int[14];

	@OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
	public static int anInt6404 = 2;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(III)I")
	public static int method5518(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!fc;II)Lclient!ss;")
	public static Class216 method5519(@OriginalArg(1) Class71 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method1555(arg1, 0);
		return local14 == null ? null : new Class216(local14);
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(Z)V")
	public static void method5520() {
		@Pc(6) Class154 local6 = Static329.aClass154_48;
		synchronized (Static329.aClass154_48) {
			Static329.aClass154_48.method3748();
		}
		local6 = Static350.aClass154_53;
		synchronized (Static350.aClass154_53) {
			Static350.aClass154_53.method3748();
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIZ)V")
	public static void method5522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) long local14 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg1);
		@Pc(20) Class2_Sub16 local20 = (Class2_Sub16) Static291.aClass214_29.method5059(local14);
		if (local20 == null) {
			local20 = new Class2_Sub16();
			Static291.aClass214_29.method5065(local14, local20);
		}
		if (local20.anIntArray273.length <= arg3) {
			@Pc(45) int[] local45 = new int[arg3 + 1];
			@Pc(50) int[] local50 = new int[arg3 + 1];
			for (@Pc(52) int local52 = 0; local52 < local20.anIntArray273.length; local52++) {
				local45[local52] = local20.anIntArray273[local52];
				local50[local52] = local20.anIntArray272[local52];
			}
			for (@Pc(78) int local78 = local20.anIntArray273.length; local78 < arg3; local78++) {
				local45[local78] = -1;
				local50[local78] = 0;
			}
			local20.anIntArray272 = local50;
			local20.anIntArray273 = local45;
		}
		local20.anIntArray273[arg3] = arg2;
		local20.anIntArray272[arg3] = arg0;
	}
}
