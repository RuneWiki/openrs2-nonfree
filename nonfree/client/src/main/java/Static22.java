import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!da", name = "F", descriptor = "I")
	public static int anInt779;

	@OriginalMember(owner = "client!da", name = "I", descriptor = "Lclient!bf;")
	public static Class1_Sub4_Sub1 aClass1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!da", name = "B", descriptor = "Lclient!id;")
	private static Class34 aClass34_383 = Static9.method266("The server is being updated)3");

	@OriginalMember(owner = "client!da", name = "u", descriptor = "Lclient!id;")
	public static Class34 aClass34_377 = aClass34_383;

	@OriginalMember(owner = "client!da", name = "v", descriptor = "Lclient!id;")
	private static Class34 aClass34_378 = Static9.method266("Choose Option");

	@OriginalMember(owner = "client!da", name = "w", descriptor = "Lclient!id;")
	public static Class34 aClass34_379 = Static9.method266("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!da", name = "x", descriptor = "I")
	public static int anInt778 = 0;

	@OriginalMember(owner = "client!da", name = "y", descriptor = "Lclient!id;")
	private static Class34 aClass34_380 = Static9.method266("Prepared sound engine");

	@OriginalMember(owner = "client!da", name = "z", descriptor = "Lclient!id;")
	private static Class34 aClass34_381 = Static9.method266("Bad session id)3");

	@OriginalMember(owner = "client!da", name = "A", descriptor = "Lclient!id;")
	public static Class34 aClass34_382 = aClass34_378;

	@OriginalMember(owner = "client!da", name = "C", descriptor = "Lclient!id;")
	public static Class34 aClass34_384 = Static9.method266(" x ");

	@OriginalMember(owner = "client!da", name = "D", descriptor = "Lclient!id;")
	public static Class34 aClass34_385 = Static9.method266("");

	@OriginalMember(owner = "client!da", name = "E", descriptor = "Lclient!id;")
	private static Class34 aClass34_386 = Static9.method266("Please use a different world)3");

	@OriginalMember(owner = "client!da", name = "J", descriptor = "Lclient!id;")
	public static Class34 aClass34_387 = aClass34_381;

	@OriginalMember(owner = "client!da", name = "L", descriptor = "Lclient!id;")
	public static Class34 aClass34_388 = Static9.method266("Nehmen");

	@OriginalMember(owner = "client!da", name = "M", descriptor = "Lclient!id;")
	public static Class34 aClass34_389 = aClass34_386;

	@OriginalMember(owner = "client!da", name = "N", descriptor = "Lclient!id;")
	public static Class34 aClass34_390 = aClass34_380;

	@OriginalMember(owner = "client!da", name = "O", descriptor = "Lclient!id;")
	public static Class34 aClass34_391 = aClass34_386;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ic;IILclient!pa;)V")
	public static void method454(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class35_Sub1 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class38 local9 = Static43.aClass38_8;
		synchronized (Static43.aClass38_8) {
			for (@Pc(16) Class1_Sub18 local16 = (Class1_Sub18) Static43.aClass38_8.method1034(); local16 != null; local16 = (Class1_Sub18) Static43.aClass38_8.method1038()) {
				if ((long) arg1 == local16.aLong162 && arg0 == local16.aClass33_1 && local16.anInt2222 == 0) {
					local7 = local16.aByteArray38;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(66) byte[] local66 = arg0.method952(arg1);
			arg2.method1583(true, arg1, local66, arg0);
		} else {
			arg2.method1583(true, arg1, local7, arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	public static void method455() {
		aClass34_387 = null;
		aClass34_384 = null;
		aClass34_378 = null;
		aClass34_377 = null;
		aClass1_Sub4_Sub1_1 = null;
		aClass34_381 = null;
		aClass34_389 = null;
		aClass34_385 = null;
		aClass34_391 = null;
		aClass34_380 = null;
		aClass34_382 = null;
		aClass34_379 = null;
		aClass34_388 = null;
		aClass34_386 = null;
		aClass34_383 = null;
		aClass34_390 = null;
	}
}
