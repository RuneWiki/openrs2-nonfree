import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "Lclient!qj;")
	public static Class288 aClass288_12;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
	public static int anInt7472;

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_63 = new Class181(55, -1);

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "Lclient!kg;")
	public static final Class186 aClass186_12 = new Class186(14, 0, 4, 1);

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
	public static int anInt7473 = 0;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BII)V")
	public static void method6582(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub4_Sub13 local8 = Static506.method2916(arg0, 13);
		local8.method4140();
		local8.anInt4508 = arg1;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/io/File;B)[B")
	public static byte[] method6585(@OriginalArg(0) File arg0) {
		return Static560.method7854((int) arg0.length(), arg0);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method6588(@OriginalArg(1) String arg0) {
		return Static639.method8797(10, arg0);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZBI)Lclient!ww;")
	public static Class14_Sub10 method6589(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class363[] local12 = Class175.aClass363Array1;
		synchronized (Class175.aClass363Array1) {
			@Pc(35) Class14_Sub10 local35;
			if (Class175.aClass363Array1.length <= arg1 || Class175.aClass363Array1[arg1].method8481()) {
				local35 = new Class14_Sub10();
				local35.aClass14_Sub9Array1 = new Class14_Sub9[arg1];
				for (@Pc(57) int local57 = 0; local57 < arg1; local57++) {
					local35.aClass14_Sub9Array1[local57] = new Class14_Sub9();
				}
			} else {
				local35 = (Class14_Sub10) Class175.aClass363Array1[arg1].method8479();
				local35.method8904();
				@Pc(42) int local42 = Static494.anIntArray664[arg1]--;
			}
			local35.aBoolean845 = arg0;
			return local35;
		}
	}
}
