import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!aaa", name = "M", descriptor = "I")
	public static int anInt81;

	@OriginalMember(owner = "client!aaa", name = "F", descriptor = "J")
	public static long aLong13 = 0L;

	@OriginalMember(owner = "client!aaa", name = "I", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!aaa", name = "J", descriptor = "I")
	public static int anInt79 = -1;

	@OriginalMember(owner = "client!aaa", name = "K", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!aaa", name = "N", descriptor = "[I")
	public static final int[] anIntArray16 = new int[25];

	@OriginalMember(owner = "client!aaa", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString1 = null;

	@OriginalMember(owner = "client!aaa", name = "Q", descriptor = "[I")
	public static final int[] anIntArray17 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(III)Z")
	public static boolean method207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!taa;ZLclient!taa;IIBZ)I")
	public static int method208(@OriginalArg(0) Class185_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class185_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static50.method964(arg2, arg0, arg4, arg1);
		if (local10 != 0) {
			return arg1 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(31) int local31 = Static50.method964(arg2, arg0, arg3, arg5);
			return arg5 ? -local31 : local31;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(II)Lclient!rh;")
	public static Class256 method209(@OriginalArg(0) int arg0) {
		@Pc(8) Class256[] local8 = Static258.method4332();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class256 local16 = local8[local10];
			if (arg0 == local16.anInt7305) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!qa;Lclient!jg;I)I")
	public static int method210(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class151 arg1) {
		if (arg1.anInt4485 != -1) {
			return arg1.anInt4485;
		}
		if (arg1.anInt4479 != -1) {
			@Pc(25) Class220 local25 = arg0.anInterface8_14.method878(arg0.method7267() ? arg1.anInt4479 : arg1.anInt4478);
			if (!local25.aBoolean446) {
				return local25.aShort100;
			}
		}
		return arg1.anInt4473;
	}
}
