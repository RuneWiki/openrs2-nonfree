import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class3_Sub7_Sub10 extends Class3_Sub7 {

	@OriginalMember(owner = "client!jv", name = "K", descriptor = "Lclient!sba;")
	private Class297 aClass297_21;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method4066(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass297_21 == null) {
			return arg0;
		} else {
			@Pc(24) Class3_Sub46 local24 = (Class3_Sub46) this.aClass297_21.method6531((long) arg1);
			return local24 == null ? arg0 : local24.aString217;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!ie;B)V")
	public void method4070(@OriginalArg(0) Class3_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6814();
			if (local9 == 0) {
				return;
			}
			this.method4072(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(III)I")
	public int method4071(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass297_21 == null) {
			return arg0;
		} else {
			@Pc(21) Class3_Sub2 local21 = (Class3_Sub2) this.aClass297_21.method6531((long) arg1);
			return local21 == null ? arg0 : local21.anInt39;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IILclient!ie;)V")
	private void method4072(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(19) int local19 = arg1.method6814();
		@Pc(28) int local28;
		if (this.aClass297_21 == null) {
			local28 = Static538.method7366(local19);
			this.aClass297_21 = new Class297(local28);
		}
		for (local28 = 0; local28 < local19; local28++) {
			@Pc(49) boolean local49 = arg1.method6814() == 1;
			@Pc(53) int local53 = arg1.method6830();
			@Pc(62) Class3 local62;
			if (local49) {
				local62 = new Class3_Sub46(arg1.method6786());
			} else {
				local62 = new Class3_Sub2(arg1.method6816());
			}
			this.aClass297_21.method6537((long) local53, local62);
		}
	}
}
