import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class6_Sub2_Sub14 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ua", name = "D", descriptor = "Lclient!fe;")
	private Class74 aClass74_29;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method5762(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass74_29 == null) {
			return arg0;
		} else {
			@Pc(21) Class6_Sub13 local21 = (Class6_Sub13) this.aClass74_29.method1883((long) arg1);
			return local21 == null ? arg0 : local21.aString13;
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)I")
	public int method5763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass74_29 == null) {
			return arg0;
		} else {
			@Pc(21) Class6_Sub39 local21 = (Class6_Sub39) this.aClass74_29.method1883((long) arg1);
			return local21 == null ? arg0 : local21.anInt6429;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ae;B)V")
	public void method5765(@OriginalArg(0) Class6_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6433();
			if (local5 == 0) {
				return;
			}
			this.method5766(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ae;BI)V")
	private void method5766(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(13) int local13 = arg0.method6433();
		@Pc(20) int local20;
		if (this.aClass74_29 == null) {
			local20 = Static52.method1203(local13);
			this.aClass74_29 = new Class74(local20);
		}
		for (local20 = 0; local20 < local13; local20++) {
			@Pc(41) boolean local41 = arg0.method6433() == 1;
			@Pc(45) int local45 = arg0.method6435();
			@Pc(54) Class6 local54;
			if (local41) {
				local54 = new Class6_Sub13(arg0.method6473());
			} else {
				local54 = new Class6_Sub39(arg0.method6442());
			}
			this.aClass74_29.method1890((long) local45, local54);
		}
	}
}
