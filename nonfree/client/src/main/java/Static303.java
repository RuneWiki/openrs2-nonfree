import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray32 = new boolean[5];

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V")
	public static void method5147() {
		if (!Static223.aBoolean310) {
			Static223.aBoolean310 = true;
			Static246.aBoolean346 = true;
			Static495.aFloat180 += (-Static495.aFloat180 - 12.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V")
	public static void method5149() {
		@Pc(6) Class166 local6 = Static201.aClass166_20;
		synchronized (Static201.aClass166_20) {
			Static201.aClass166_20.method4802();
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(CLjava/lang/String;I)I")
	public static int method5151(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg1.charAt(local17) == arg0) {
				local12++;
			}
		}
		return local12;
	}
}
