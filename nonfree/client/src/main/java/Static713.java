import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static713 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)V")
	public static void method9477(@OriginalArg(1) boolean arg0) {
		Static165.method2505();
		if (!Static424.method6174(Static357.anInt5722)) {
			return;
		}
		@Pc(15) Class221[] local15 = Static487.aClass221Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class221 local23 = local15[local17];
			local23.anInt5769++;
			if (local23.anInt5769 < 50 && !arg0) {
				return;
			}
			local23.anInt5769 = 0;
			if (!local23.aBoolean488 && local23.aClass5_2 != null) {
				@Pc(60) Class2_Sub33 local60 = Static592.method8154(Static402.aClass349_93, local23.aClass48_1);
				local23.method5173(local60);
				try {
					local23.method5171((byte) 125);
				} catch (@Pc(69) IOException local69) {
					local23.aBoolean488 = true;
				}
			}
		}
		Static165.method2505();
	}
}
