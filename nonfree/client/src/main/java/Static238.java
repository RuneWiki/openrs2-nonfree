import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!lk", name = "P", descriptor = "I")
	public static int anInt4297;

	@OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
	public static int anInt4296 = 503;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)V")
	public static void method3396() {
		@Pc(12) int local12 = Static103.anInt6434;
		@Pc(14) int[] local14 = Static56.anIntArray110;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class11_Sub1_Sub3_Sub2 local24 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local14[local16]];
			if (local24 != null) {
				Static279.method3753(local24.method2635(), local24);
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "(I)V")
	public static void method3397() {
		if (!Static255.method3573()) {
			return;
		}
		if (Static253.aStringArray34 == null) {
			Static26.method383();
		}
		Static222.aBoolean369 = true;
		Static173.anInt2851 = 0;
		try {
			Static361.aClipboard1 = Static324.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(28) Exception local28) {
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)Lclient!kf;")
	public static Class111_Sub3 method3398(@OriginalArg(1) int arg0) {
		@Pc(11) Class63[] local11 = Class139.aClass63Array4;
		synchronized (Class139.aClass63Array4) {
			@Pc(27) Class111_Sub3 local27;
			if (Class139.aClass63Array4.length <= arg0 || Class139.aClass63Array4[arg0].method1018()) {
				local27 = new Class111_Sub3();
				local27.aClass111_Sub8Array1 = new Class111_Sub8[arg0];
				for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
					local27.aClass111_Sub8Array1[local33] = new Class111_Sub8();
				}
			} else {
				local27 = (Class111_Sub3) Class139.aClass63Array4[arg0].method1023();
				local27.method5886();
				@Pc(62) int local62 = Static160.anIntArray215[arg0]--;
			}
			return local27;
		}
	}
}
