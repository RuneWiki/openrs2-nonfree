import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class6_Sub4_Sub4 extends Class6_Sub4 {

	@OriginalMember(owner = "client!el", name = "u", descriptor = "Lclient!tq;")
	private Class305 aClass305_18;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!iaa;I)V")
	public void method2422(@OriginalArg(0) Class6_Sub26 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4966();
			if (local13 == 0) {
				return;
			}
			this.method2424(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BILclient!iaa;)V")
	private void method2424(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub26 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(8) int local8 = arg1.method4966();
		@Pc(15) int local15;
		if (this.aClass305_18 == null) {
			local15 = Static247.method4363(local8);
			this.aClass305_18 = new Class305(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(34) boolean local34 = arg1.method4966() == 1;
			@Pc(38) int local38 = arg1.method4949();
			@Pc(47) Class6 local47;
			if (local34) {
				local47 = new Class6_Sub30(arg1.method4941());
			} else {
				local47 = new Class6_Sub24(arg1.method5000());
			}
			this.aClass305_18.method7448((long) local38, local47);
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(III)I")
	public int method2425(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass305_18 == null) {
			return arg0;
		} else {
			@Pc(21) Class6_Sub24 local21 = (Class6_Sub24) this.aClass305_18.method7447((long) arg1);
			return local21 == null ? arg0 : local21.anInt4156;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
	public String method2429(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass305_18 == null) {
			return arg1;
		} else {
			@Pc(21) Class6_Sub30 local21 = (Class6_Sub30) this.aClass305_18.method7447((long) arg0);
			return local21 == null ? arg1 : local21.aString55;
		}
	}
}
