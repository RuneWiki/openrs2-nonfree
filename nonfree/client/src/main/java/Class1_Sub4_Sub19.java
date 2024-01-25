import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class1_Sub4_Sub19 extends Class1_Sub4 {

	@OriginalMember(owner = "client!nk", name = "J", descriptor = "Lclient!dq;")
	private Class38 aClass38_21;

	@OriginalMember(owner = "client!nk", name = "K", descriptor = "Lclient!dq;")
	public Class38 aClass38_22;

	@OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
	private int anInt4275;

	@OriginalMember(owner = "client!nk", name = "P", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!nk", name = "R", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!nk", name = "G", descriptor = "Ljava/lang/String;")
	private String aString42 = "null";

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method3965(@OriginalArg(1) int arg0) {
		if (this.aClass38_22 == null) {
			return this.aString42;
		} else {
			@Pc(25) Class1_Sub38 local25 = (Class1_Sub38) this.aClass38_22.method1475((long) arg0);
			return local25 == null ? this.aString42 : local25.aString56;
		}
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(II)I")
	public int method3966(@OriginalArg(1) int arg0) {
		if (this.aClass38_22 == null) {
			return this.anInt4275;
		} else {
			@Pc(22) Class1_Sub9 local22 = (Class1_Sub9) this.aClass38_22.method1475((long) arg0);
			return local22 == null ? this.anInt4275 : local22.anInt571;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!at;II)V")
	private void method3967(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static19.method532(arg0.method2122());
		} else if (arg1 == 2) {
			this.aChar2 = Static19.method532(arg0.method2122());
		} else if (arg1 == 3) {
			this.aString42 = arg0.method2109();
		} else if (arg1 == 4) {
			this.anInt4275 = arg0.method2140();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(62) int local62 = arg0.method2161();
			this.aClass38_22 = new Class38(Static73.method1617(local62));
			for (@Pc(72) int local72 = 0; local72 < local62; local72++) {
				@Pc(78) int local78 = arg0.method2140();
				@Pc(88) Class1 local88;
				if (arg1 == 5) {
					local88 = new Class1_Sub38(arg0.method2109());
				} else {
					local88 = new Class1_Sub9(arg0.method2140());
				}
				this.aClass38_22.method1472(local88, (long) local78);
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "(I)V")
	private void method3969() {
		this.aClass38_21 = new Class38(this.aClass38_22.method1468());
		for (@Pc(20) Class1_Sub9 local20 = (Class1_Sub9) this.aClass38_22.method1474(); local20 != null; local20 = (Class1_Sub9) this.aClass38_22.method1470()) {
			@Pc(29) Class1_Sub9 local29 = new Class1_Sub9((int) local20.aLong217);
			this.aClass38_21.method1472(local29, (long) local20.anInt571);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method3970(@OriginalArg(0) String arg0) {
		if (this.aClass38_22 == null) {
			return false;
		}
		if (this.aClass38_21 == null) {
			this.method3971();
		}
		for (@Pc(25) Class1_Sub2 local25 = (Class1_Sub2) this.aClass38_21.method1475(Static44.method1076(arg0)); local25 != null; local25 = (Class1_Sub2) this.aClass38_21.method1477()) {
			if (local25.aString1.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "(I)V")
	private void method3971() {
		this.aClass38_21 = new Class38(this.aClass38_22.method1468());
		for (@Pc(20) Class1_Sub38 local20 = (Class1_Sub38) this.aClass38_22.method1474(); local20 != null; local20 = (Class1_Sub38) this.aClass38_22.method1470()) {
			@Pc(31) Class1_Sub2 local31 = new Class1_Sub2(local20.aString56, (int) local20.aLong217);
			this.aClass38_21.method1472(local31, Static44.method1076(local20.aString56));
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!at;Z)V")
	public void method3972(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method2132();
			if (local11 == 0) {
				return;
			}
			this.method3967(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(BI)Z")
	public boolean method3973(@OriginalArg(1) int arg0) {
		if (this.aClass38_22 == null) {
			return false;
		}
		if (this.aClass38_21 == null) {
			this.method3969();
		}
		@Pc(28) Class1_Sub9 local28 = (Class1_Sub9) this.aClass38_21.method1475((long) arg0);
		return local28 != null;
	}
}
