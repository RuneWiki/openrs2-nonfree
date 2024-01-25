import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
	public static int anInt3607 = -1;

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
	public static int anInt3609 = 0;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZZLclient!uf;)V")
	public static void method3357(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class357 arg1) {
		@Pc(12) int local12 = arg1.anInt10393 == 0 ? arg1.anInt10395 : arg1.anInt10393;
		@Pc(24) int local24 = arg1.anInt10413 == 0 ? arg1.anInt10465 : arg1.anInt10413;
		Static13.method7476(arg1.anInt10460, arg0, local24, local12, Static111.aClass357ArrayArray1[arg1.anInt10460 >> 16]);
		if (arg1.aClass357Array2 != null) {
			Static13.method7476(arg1.anInt10460, arg0, local24, local12, arg1.aClass357Array2);
		}
		@Pc(61) Class2_Sub20 local61 = (Class2_Sub20) Static507.aClass335_33.method8357((long) arg1.anInt10460);
		if (local61 != null) {
			Static618.method9235(local24, local12, arg0, local61.anInt1667);
		}
	}
}
