import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static689 {

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
	public static int anInt10537 = 0;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V")
	public static void method9045(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1) {
		Static326.aHashtable5.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BI)Lclient!kka;")
	public static Class210 method9046() {
		return new Class210(1, false);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(III)Lclient!uda;")
	public static Class356 method9047(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class356 local7 = new Class356();
		local7.anInt9609 = arg1 + 1 + 5;
		local7.anInt9606 = arg0 + 5 + 1;
		local7.anInt9620 = -1;
		local7.anInt9604 = -1;
		local7.anIntArrayArray53 = new int[local7.anInt9609][local7.anInt9606];
		local7.method8400();
		return local7;
	}
}
