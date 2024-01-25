import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_1 = new Class287(81, 4);

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	public static int anInt87 = -1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I[BLjava/io/File;I)V")
	public static void method94(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local19.readFully(arg0, 0, arg2);
		} catch (@Pc(26) EOFException local26) {
		}
		local19.close();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!pn;[Lclient!cp;)V")
	public static void method95(@OriginalArg(0) Class25_Sub2 arg0, @OriginalArg(1) Class3_Sub9[] arg1) {
		@Pc(6) int local6;
		if (Static239.aBoolean310) {
			local6 = arg0.method6658(arg1);
			Static68.aClass31_4.method8038(local6, arg1);
		}
		if (Static108.aClass127Array5 == Static256.aClass127Array3) {
			@Pc(28) int local28;
			if (arg0 instanceof Class25_Sub2_Sub2) {
				local6 = ((Class25_Sub2_Sub2) arg0).aShort106;
				local28 = ((Class25_Sub2_Sub2) arg0).aShort107;
			} else {
				local6 = arg0.anInt8476 >> Static385.anInt6657;
				local28 = arg0.anInt8482 >> Static385.anInt6657;
			}
			Static68.aClass31_4.YA(Static420.aClass127Array6[0].method7860(arg0.anInt8482, arg0.anInt8476), Static192.method3362(local6, local28), Static93.method1989(local6, local28), Static443.method6173(local6, local28));
		}
		@Pc(64) Class25_Sub10 local64 = arg0.method6647(Static68.aClass31_4);
		if (local64 == null) {
			return;
		}
		local64.aClass25_Sub2_2 = arg0;
		if (Static538.aBoolean626) {
			@Pc(73) Class269 local73 = Static545.aClass269_10;
			synchronized (Static545.aClass269_10) {
				@Pc(77) boolean local77 = false;
				for (@Pc(82) Class25_Sub10 local82 = (Class25_Sub10) Static545.aClass269_10.method5974(); local82 != null; local82 = (Class25_Sub10) Static545.aClass269_10.method5979()) {
					if (arg0.anInt8478 >= local82.aClass25_Sub2_2.anInt8478) {
						Static551.method7563(local82, local64);
						local77 = true;
						break;
					}
				}
				if (!local77) {
					Static545.aClass269_10.method5977(local64);
				}
				return;
			}
		}
		@Pc(117) boolean local117 = false;
		for (@Pc(122) Class25_Sub10 local122 = (Class25_Sub10) Static545.aClass269_10.method5974(); local122 != null; local122 = (Class25_Sub10) Static545.aClass269_10.method5979()) {
			if (arg0.anInt8478 >= local122.aClass25_Sub2_2.anInt8478) {
				Static551.method7563(local122, local64);
				local117 = true;
				break;
			}
		}
		if (!local117) {
			Static545.aClass269_10.method5977(local64);
		}
	}
}
