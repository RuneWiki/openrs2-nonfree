import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class3_Sub4_Sub15 extends Class3_Sub4 {

	@OriginalMember(owner = "client!k", name = "t", descriptor = "Lclient!qp;")
	private Class280 aClass280_23;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!sl;I)V")
	public void method4548(@OriginalArg(0) Class3_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4225();
			if (local5 == 0) {
				return;
			}
			this.method4552(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(III)I")
	public int method4550(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass280_23 == null) {
			return arg0;
		} else {
			@Pc(16) Class3_Sub19 local16 = (Class3_Sub19) this.aClass280_23.method7107((long) arg1);
			return local16 == null ? arg0 : local16.anInt2696;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZILclient!sl;)V")
	private void method4552(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(14) int local14 = arg1.method4225();
		@Pc(21) int local21;
		if (this.aClass280_23 == null) {
			local21 = Static109.method2234(local14);
			this.aClass280_23 = new Class280(local21);
		}
		for (local21 = 0; local21 < local14; local21++) {
			@Pc(40) boolean local40 = arg1.method4225() == 1;
			@Pc(44) int local44 = arg1.method4204();
			@Pc(53) Class3 local53;
			if (local40) {
				local53 = new Class3_Sub48(arg1.method4233());
			} else {
				local53 = new Class3_Sub19(arg1.method4207());
			}
			this.aClass280_23.method7109(local53, (long) local44);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZLjava/lang/String;I)Ljava/lang/String;")
	public String method4553(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass280_23 == null) {
			return arg0;
		} else {
			@Pc(16) Class3_Sub48 local16 = (Class3_Sub48) this.aClass280_23.method7107((long) arg1);
			return local16 == null ? arg0 : local16.aString106;
		}
	}
}
