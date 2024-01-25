import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class14_Sub2_Sub10 extends Class14_Sub2 {

	@OriginalMember(owner = "client!jk", name = "B", descriptor = "I")
	private int anInt3223;

	@OriginalMember(owner = "client!jk", name = "C", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!jk", name = "F", descriptor = "Lclient!bn;")
	private Class25 aClass25_8;

	@OriginalMember(owner = "client!jk", name = "G", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!jk", name = "N", descriptor = "Lclient!bn;")
	public Class25 aClass25_9;

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "Ljava/lang/String;")
	private String aString116 = "null";

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(BI)Ljava/lang/String;")
	public String method2989(@OriginalArg(1) int arg0) {
		if (this.aClass25_9 == null) {
			return this.aString116;
		} else {
			@Pc(22) Class14_Sub29 local22 = (Class14_Sub29) this.aClass25_9.method691((long) arg0);
			return local22 == null ? this.aString116 : local22.aString201;
		}
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)V")
	private void method2990() {
		this.aClass25_8 = new Class25(this.aClass25_9.method684());
		for (@Pc(28) Class14_Sub29 local28 = (Class14_Sub29) this.aClass25_9.method697(); local28 != null; local28 = (Class14_Sub29) this.aClass25_9.method694()) {
			@Pc(39) Class14_Sub41 local39 = new Class14_Sub41(local28.aString201, (int) local28.aLong217);
			this.aClass25_8.method687(Static137.method2765(local28.aString201), local39);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method2991(@OriginalArg(0) String arg0) {
		if (this.aClass25_9 == null) {
			return false;
		}
		if (this.aClass25_8 == null) {
			this.method2990();
		}
		for (@Pc(30) Class14_Sub41 local30 = (Class14_Sub41) this.aClass25_8.method691(Static137.method2765(arg0)); local30 != null; local30 = (Class14_Sub41) this.aClass25_8.method692()) {
			if (local30.aString239.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I")
	public int method2993(@OriginalArg(1) int arg0) {
		if (this.aClass25_9 == null) {
			return this.anInt3223;
		} else {
			@Pc(21) Class14_Sub34 local21 = (Class14_Sub34) this.aClass25_9.method691((long) arg0);
			return local21 == null ? this.anInt3223 : local21.anInt6039;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!jg;II)V")
	private void method2994(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static85.method2093(arg0.method2553());
		} else if (arg1 == 2) {
			this.aChar4 = Static85.method2093(arg0.method2553());
		} else if (arg1 == 3) {
			this.aString116 = arg0.method2496();
		} else if (arg1 == 4) {
			this.anInt3223 = arg0.method2510();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(43) int local43 = arg0.method2498();
			this.aClass25_9 = new Class25(Static224.method4011(local43));
			for (@Pc(53) int local53 = 0; local53 < local43; local53++) {
				@Pc(59) int local59 = arg0.method2510();
				@Pc(69) Class14 local69;
				if (arg1 == 5) {
					local69 = new Class14_Sub29(arg0.method2496());
				} else {
					local69 = new Class14_Sub34(arg0.method2510());
				}
				this.aClass25_9.method687((long) local59, local69);
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)Z")
	public boolean method2995(@OriginalArg(1) int arg0) {
		if (this.aClass25_9 == null) {
			return false;
		}
		if (this.aClass25_8 == null) {
			this.method2998();
		}
		@Pc(22) Class14_Sub34 local22 = (Class14_Sub34) this.aClass25_8.method691((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(Lclient!jg;I)V")
	public void method2996(@OriginalArg(0) Class14_Sub4 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2548();
			if (local15 == 0) {
				return;
			}
			this.method2994(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V")
	private void method2998() {
		this.aClass25_8 = new Class25(this.aClass25_9.method684());
		for (@Pc(20) Class14_Sub34 local20 = (Class14_Sub34) this.aClass25_9.method697(); local20 != null; local20 = (Class14_Sub34) this.aClass25_9.method694()) {
			@Pc(29) Class14_Sub34 local29 = new Class14_Sub34((int) local20.aLong217);
			this.aClass25_8.method687((long) local20.anInt6039, local29);
		}
	}
}
