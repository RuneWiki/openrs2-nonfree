import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class3_Sub6_Sub5 extends Class3_Sub6 {

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "Lclient!cja;")
	private Class62 aClass62_8;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!fca;II)V")
	private void method1614(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(21) int local21 = arg0.method4888();
		@Pc(28) int local28;
		if (this.aClass62_8 == null) {
			local28 = Static527.method7377(local21);
			this.aClass62_8 = new Class62(local28);
		}
		for (local28 = 0; local28 < local21; local28++) {
			@Pc(47) boolean local47 = arg0.method4888() == 1;
			@Pc(51) int local51 = arg0.method4862();
			@Pc(60) Class3 local60;
			if (local47) {
				local60 = new Class3_Sub40(arg0.method4847());
			} else {
				local60 = new Class3_Sub53(arg0.method4868());
			}
			this.aClass62_8.method1686((long) local51, local60);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLclient!fca;)V")
	public void method1615(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4888();
			if (local5 == 0) {
				return;
			}
			this.method1614(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)I")
	public int method1616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass62_8 == null) {
			return arg1;
		} else {
			@Pc(25) Class3_Sub53 local25 = (Class3_Sub53) this.aClass62_8.method1682((long) arg0);
			return local25 == null ? arg1 : local25.anInt10023;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method1617(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass62_8 == null) {
			return arg1;
		} else {
			@Pc(20) Class3_Sub40 local20 = (Class3_Sub40) this.aClass62_8.method1682((long) arg0);
			return local20 == null ? arg1 : local20.aString100;
		}
	}
}
