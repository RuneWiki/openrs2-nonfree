import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class6_Sub2_Sub6 extends Class6_Sub2 {

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "Lclient!jj;")
	private Class108 aClass108_17;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;")
	public String method2074(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass108_17 == null) {
			return arg0;
		} else {
			@Pc(21) Class6_Sub24 local21 = (Class6_Sub24) this.aClass108_17.method2900((long) arg1);
			return local21 == null ? arg0 : local21.aString137;
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(III)I")
	public int method2076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass108_17 == null) {
			return arg0;
		} else {
			@Pc(24) Class6_Sub43 local24 = (Class6_Sub43) this.aClass108_17.method2900((long) arg1);
			return local24 == null ? arg0 : local24.anInt6289;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZILclient!ec;)V")
	private void method2077(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub10 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(13) int local13 = arg1.method3972();
		@Pc(20) int local20;
		if (this.aClass108_17 == null) {
			local20 = Static247.method4066(local13);
			this.aClass108_17 = new Class108(local20);
		}
		for (local20 = 0; local20 < local13; local20++) {
			@Pc(41) boolean local41 = arg1.method3972() == 1;
			@Pc(45) int local45 = arg1.method3996();
			@Pc(54) Class6 local54;
			if (local41) {
				local54 = new Class6_Sub24(arg1.method4023());
			} else {
				local54 = new Class6_Sub43(arg1.method3979());
			}
			this.aClass108_17.method2898((long) local45, local54);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!ec;)V")
	public void method2078(@OriginalArg(1) Class6_Sub10 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method3972();
			if (local16 == 0) {
				return;
			}
			this.method2077(local16, arg0);
		}
	}
}
