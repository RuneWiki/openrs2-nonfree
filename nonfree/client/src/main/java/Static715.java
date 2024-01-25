import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static715 {

	@OriginalMember(owner = "client!wka", name = "a", descriptor = "(BI[B)[B")
	public static byte[] method9512(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(12) byte[] local12 = new byte[arg0];
		Static728.method274(arg1, 0, local12, 0, arg0);
		return local12;
	}

	@OriginalMember(owner = "client!wka", name = "a", descriptor = "(II)V")
	public static void method9513(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static90.aFloat42 = 3.0F;
		} else if (arg0 == 50) {
			Static90.aFloat42 = 4.0F;
		} else if (arg0 == 75) {
			Static90.aFloat42 = 6.0F;
		} else if (arg0 == 100) {
			Static90.aFloat42 = 8.0F;
		} else if (arg0 == 200) {
			Static90.aFloat42 = 16.0F;
		}
		Static537.anInt5296 = -1;
		Static537.anInt5296 = -1;
	}

	@OriginalMember(owner = "client!wka", name = "a", descriptor = "(I)V")
	public static void method9514() {
		if (Static718.anInt10954 == -1 || Static711.anInt10853 == -1) {
			return;
		}
		if (Static718.anInt10954 == 1 || Static718.anInt10954 == 3 || Static718.anInt10954 != Static711.anInt10853 && (Static718.anInt10954 == 0 || Static711.anInt10853 == 0)) {
			Static217.anInt3445 = 0;
			Static676.anInt10488 = 0;
			Static467.aClass218_37.method5097();
		}
		Static711.anInt10853 = Static718.anInt10954;
	}
}
