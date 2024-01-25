import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "Lclient!rg;")
	public static Class310 aClass310_64;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IILclient!rea;)V")
	public static void method5111(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub21_Sub2 arg1) {
		Static134.anInt2097 = 0;
		Static279.aBoolean636 = false;
		Static461.method6794(arg1);
		Static331.method5122(arg1, -1);
		if (Static279.aBoolean636) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt8936 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt8936 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILclient!bd;ILclient!ha;I)V")
	public static void method5112(@OriginalArg(1) Class32 arg0, @OriginalArg(3) Class144 arg1) {
		Static216.aClass32_31.method588();
		if (Static626.aBoolean722) {
			return;
		}
		for (@Pc(23) Class14_Sub39 local23 = (Class14_Sub39) arg0.method584(); local23 != null; local23 = (Class14_Sub39) arg0.method577()) {
			@Pc(31) Class152 local31 = Static224.aClass274_2.method6614(local23.anInt8785);
			if (Static391.method5939(local31)) {
				@Pc(43) boolean local43 = Static650.method9124(local23, local31, arg1);
				if (local43) {
					Static161.method1394(local31, local23, arg1);
				}
			}
		}
	}
}
