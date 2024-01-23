import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class4_Sub2_Sub11 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "Lclient!lb;")
	private Class97 aClass97_8;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!p;I)V")
	public void method1511(@OriginalArg(0) Class4_Sub17 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method1874();
			if (local18 == 0) {
				return;
			}
			this.method1515(arg0, local18);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
	public String method1512(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass97_8 == null) {
			return arg0;
		} else {
			@Pc(25) Class4_Sub27 local25 = (Class4_Sub27) this.aClass97_8.method2360((long) arg1);
			return local25 == null ? arg0 : local25.aString156;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)I")
	public int method1513(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass97_8 == null) {
			return arg1;
		} else {
			@Pc(25) Class4_Sub19 local25 = (Class4_Sub19) this.aClass97_8.method2360((long) arg0);
			return local25 == null ? arg1 : local25.anInt2869;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!p;I)V")
	private void method1515(@OriginalArg(1) Class4_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(21) int local21 = arg0.method1874();
		@Pc(28) int local28;
		if (this.aClass97_8 == null) {
			local28 = Static74.method1127(local21);
			this.aClass97_8 = new Class97(local28);
		}
		for (local28 = 0; local28 < local21; local28++) {
			@Pc(52) boolean local52 = arg0.method1874() == 1;
			@Pc(56) int local56 = arg0.method1835();
			@Pc(65) Class4 local65;
			if (local52) {
				local65 = new Class4_Sub27(arg0.method1841());
			} else {
				local65 = new Class4_Sub19(arg0.method1889());
			}
			this.aClass97_8.method2364(local65, (long) local56);
		}
	}
}
