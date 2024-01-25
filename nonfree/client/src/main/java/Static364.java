import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!mea", name = "M", descriptor = "[Lclient!bka;")
	public static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!mea", name = "K", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_235 = new Class179(102, -1);

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V")
	public static void method5249() {
		if (Static164.anIntArray710 != null && Static404.anIntArray300 != null) {
			return;
		}
		Static164.anIntArray710 = new int[256];
		Static404.anIntArray300 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static164.anIntArray710[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static404.anIntArray300[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BIILclient!qf;)V")
	public static void method5251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class283 arg2) {
		Static128.aClass283ArrayArray1[arg0][arg1] = arg2;
	}
}
