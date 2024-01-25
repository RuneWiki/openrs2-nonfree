import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IZIIII)V")
	public static void method6680(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(20) long local20 = (long) (arg4 | (arg0 ? Integer.MIN_VALUE : 0));
		@Pc(26) Class5_Sub48 local26 = (Class5_Sub48) Static236.aClass291_18.method6993(local20, 1);
		if (local26 == null) {
			local26 = new Class5_Sub48();
			Static236.aClass291_18.method6984(local20, local26);
		}
		if (local26.anIntArray523.length <= arg2) {
			@Pc(51) int[] local51 = new int[arg2 + 1];
			@Pc(56) int[] local56 = new int[arg2 + 1];
			for (@Pc(58) int local58 = 0; local58 < local26.anIntArray523.length; local58++) {
				local51[local58] = local26.anIntArray523[local58];
				local56[local58] = local26.anIntArray524[local58];
			}
			for (@Pc(90) int local90 = local26.anIntArray523.length; local90 < arg2; local90++) {
				local51[local90] = -1;
				local56[local90] = 0;
			}
			local26.anIntArray524 = local56;
			local26.anIntArray523 = local51;
		}
		local26.anIntArray523[arg2] = arg1;
		local26.anIntArray524[arg2] = arg3;
	}

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "(I)V")
	public static void method6682() {
		if (Static279.aClass146_22 != null) {
			Static410.aClass194_1 = new Class194();
			Static410.aClass194_1.method4396(Static240.aLong121, Static279.aClass146_22, Static279.aClass146_22.anInt3227, Static279.aClass146_22.aClass335_1.method8349(Static323.anInt5795));
			Static564.aThread6 = new Thread(Static410.aClass194_1, "");
			Static564.aThread6.start();
		}
	}

	@OriginalMember(owner = "client!pja", name = "c", descriptor = "(I)[Lclient!bl;")
	public static Class45[] method6683() {
		return new Class45[] { Static157.aClass45_1, Static157.aClass45_2, Static157.aClass45_3, Static157.aClass45_4, Static157.aClass45_5, Static157.aClass45_6, Static157.aClass45_7, Static157.aClass45_8, Static157.aClass45_9, Static157.aClass45_10, Static157.aClass45_11, Static157.aClass45_12, Static157.aClass45_13 };
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IILclient!ib;)Ljava/lang/String;")
	public static String method6684(@OriginalArg(2) Class5_Sub23 arg0) {
		try {
			@Pc(7) int local7 = arg0.method8499();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(27) byte[] local27 = new byte[local7];
			arg0.anInt9869 += Static559.aClass247_1.method5664(arg0.aByteArray102, 0, local27, local7, arg0.anInt9869);
			return Static455.method6706(local27, 0, local7);
		} catch (@Pc(51) Exception local51) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(BI)V")
	public static void method6685() {
		@Pc(5) Class391 local5 = Static320.aClass391_27;
		synchronized (Static320.aClass391_27) {
			Static320.aClass391_27.method9274(5);
		}
		local5 = Static32.aClass391_5;
		synchronized (Static32.aClass391_5) {
			Static32.aClass391_5.method9274(5);
		}
	}
}
