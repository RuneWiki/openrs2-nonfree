import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class2_Sub2_Sub17 extends Class2_Sub2 {

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "Lclient!ob;")
	private Class70 aClass70_15;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!ea;)V")
	private void method2567(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(8) int local8 = arg1.method209();
		@Pc(15) int local15;
		if (this.aClass70_15 == null) {
			local15 = Static163.method2657(local8);
			this.aClass70_15 = new Class70(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(34) boolean local34 = arg1.method209() == 1;
			@Pc(38) int local38 = arg1.method166();
			@Pc(47) Class2 local47;
			if (local34) {
				local47 = new Class2_Sub26(arg1.method160());
			} else {
				local47 = new Class2_Sub23(arg1.method185());
			}
			this.aClass70_15.method2208((long) local38, local47);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!i;II)Lclient!i;")
	public Class41 method2570(@OriginalArg(0) Class41 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass70_15 == null) {
			return arg0;
		} else {
			@Pc(21) Class2_Sub26 local21 = (Class2_Sub26) this.aClass70_15.method2205((long) arg1);
			return local21 == null ? arg0 : local21.aClass41_1152;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ea;I)V")
	public void method2571(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method209();
			if (local17 == 0) {
				return;
			}
			this.method2567(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)I")
	public int method2572(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass70_15 == null) {
			return arg0;
		} else {
			@Pc(16) Class2_Sub23 local16 = (Class2_Sub23) this.aClass70_15.method2205((long) arg1);
			return local16 == null ? arg0 : local16.anInt3983;
		}
	}
}
