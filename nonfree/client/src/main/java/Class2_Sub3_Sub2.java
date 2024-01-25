import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 {

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "Lclient!il;")
	private Class162 aClass162_4;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)I")
	public int method663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass162_4 == null) {
			return arg0;
		} else {
			@Pc(16) Class2_Sub22 local16 = (Class2_Sub22) this.aClass162_4.method3519((long) arg1);
			return local16 == null ? arg0 : local16.anInt3866;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!es;II)V")
	private void method665(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(17) int local17 = arg0.method4325();
		@Pc(26) int local26;
		if (this.aClass162_4 == null) {
			local26 = Static89.method7259(local17);
			this.aClass162_4 = new Class162(local26);
		}
		for (local26 = 0; local26 < local17; local26++) {
			@Pc(45) boolean local45 = arg0.method4325() == 1;
			@Pc(51) int local51 = arg0.method4341();
			@Pc(60) Class2 local60;
			if (local45) {
				local60 = new Class2_Sub1(arg0.method4324());
			} else {
				local60 = new Class2_Sub22(arg0.method4307());
			}
			this.aClass162_4.method3522(local60, (long) local51);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZILjava/lang/String;)Ljava/lang/String;")
	public String method666(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass162_4 == null) {
			return arg1;
		} else {
			@Pc(21) Class2_Sub1 local21 = (Class2_Sub1) this.aClass162_4.method3519((long) arg0);
			return local21 == null ? arg1 : local21.aString1;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!es;I)V")
	public void method667(@OriginalArg(0) Class2_Sub15 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4325();
			if (local14 == 0) {
				return;
			}
			this.method665(arg0, local14);
		}
	}
}
