import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class22 implements Interface6 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!je;JB[I)Ljava/lang/String;")
	@Override
	public String method337(@OriginalArg(0) Class127 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 == Static393.aClass127_18) {
			@Pc(21) Class12 local21 = Static108.aClass263_1.method5783(arg2[0]);
			return local21.method171((int) arg1);
		} else if (arg0 == Static97.aClass127_4 || arg0 == Static40.aClass127_2) {
			@Pc(39) Class60 local39 = Static313.aClass272_2.method6068((int) arg1);
			return local39.aString11;
		} else if (arg0 == Static223.aClass127_12 || arg0 == Static259.aClass127_16 || arg0 == Static426.aClass127_19) {
			return Static108.aClass263_1.method5783(arg2[0]).method171((int) arg1);
		} else {
			return null;
		}
	}
}
