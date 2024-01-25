import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BII)I")
	public static int method3877(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static646.anIntArray509[arg0 & 0x3] : Static28.anIntArray19[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)I")
	public static int method3878() {
		@Pc(15) int local15 = Static420.aClass331_1.method7957();
		if (local15 < Static42.aClass331Array1.length - 1) {
			Static420.aClass331_1 = Static42.aClass331Array1[local15 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
	public static void method3882(@OriginalArg(1) int arg0) {
		@Pc(19) Class6_Sub2_Sub4 local19 = Static602.method8315((long) arg0, 17);
		local19.method2038();
	}
}
