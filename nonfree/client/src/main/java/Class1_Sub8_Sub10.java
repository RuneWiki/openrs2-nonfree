import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class1_Sub8_Sub10 extends Class1_Sub8 {

	@OriginalMember(owner = "client!qaa", name = "B", descriptor = "Lclient!faa;")
	private Class91 aClass91_33;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BLclient!ac;)V")
	public void method5895(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7974();
			if (local9 == 0) {
				return;
			}
			this.method5897(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILclient!ac;I)V")
	private void method5897(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(14) int local14 = arg1.method7974();
		@Pc(21) int local21;
		if (this.aClass91_33 == null) {
			local21 = Static122.method2187(local14);
			this.aClass91_33 = new Class91(local21);
		}
		for (local21 = 0; local21 < local14; local21++) {
			@Pc(40) boolean local40 = arg1.method7974() == 1;
			@Pc(44) int local44 = arg1.method7919();
			@Pc(53) Class1 local53;
			if (local40) {
				local53 = new Class1_Sub44(arg1.method7951());
			} else {
				local53 = new Class1_Sub27(arg1.method7940());
			}
			this.aClass91_33.method2269((long) local44, local53);
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
	public String method5898(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass91_33 == null) {
			return arg0;
		} else {
			@Pc(16) Class1_Sub44 local16 = (Class1_Sub44) this.aClass91_33.method2271((long) arg1);
			return local16 == null ? arg0 : local16.aString91;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(III)I")
	public int method5899(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass91_33 == null) {
			return arg1;
		} else {
			@Pc(21) Class1_Sub27 local21 = (Class1_Sub27) this.aClass91_33.method2271((long) arg0);
			return local21 == null ? arg1 : local21.anInt3348;
		}
	}
}
