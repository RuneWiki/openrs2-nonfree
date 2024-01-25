import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!au", name = "A", descriptor = "Lclient!gu;")
	private Class96 aClass96_6;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ILclient!hp;I)V")
	private void method496(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(22) int local22 = arg0.method5366();
		@Pc(29) int local29;
		if (this.aClass96_6 == null) {
			local29 = Static406.method5434(local22);
			this.aClass96_6 = new Class96(local29);
		}
		for (local29 = 0; local29 < local22; local29++) {
			@Pc(47) boolean local47 = arg0.method5366() == 1;
			@Pc(51) int local51 = arg0.method5399();
			@Pc(60) Class1 local60;
			if (local47) {
				local60 = new Class1_Sub12(arg0.method5401());
			} else {
				local60 = new Class1_Sub43(arg0.method5407());
			}
			this.aClass96_6.method2341((long) local51, local60);
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BILjava/lang/String;)Ljava/lang/String;")
	public String method497(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass96_6 == null) {
			return arg1;
		} else {
			@Pc(21) Class1_Sub12 local21 = (Class1_Sub12) this.aClass96_6.method2335((long) arg0);
			return local21 == null ? arg1 : local21.aString11;
		}
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(III)I")
	public int method502(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass96_6 == null) {
			return arg0;
		} else {
			@Pc(24) Class1_Sub43 local24 = (Class1_Sub43) this.aClass96_6.method2335((long) arg1);
			return local24 == null ? arg0 : local24.anInt6933;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ILclient!hp;)V")
	public void method503(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method5366();
			if (local12 == 0) {
				return;
			}
			this.method496(arg0, local12);
		}
	}
}
