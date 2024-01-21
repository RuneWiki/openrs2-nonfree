import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class36 {

	@OriginalMember(owner = "client!le", name = "n", descriptor = "Lclient!re;")
	private final Class6_Sub2 aClass6_Sub2_34 = new Class6_Sub2();

	@OriginalMember(owner = "client!le", name = "s", descriptor = "Lclient!cd;")
	private final Class11 aClass11_1 = new Class11();

	@OriginalMember(owner = "client!le", name = "t", descriptor = "I")
	private final int anInt1688;

	@OriginalMember(owner = "client!le", name = "x", descriptor = "I")
	private int anInt1690;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "Lclient!mb;")
	private final Class38 aClass38_21;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V")
	public Class36(@OriginalArg(0) int arg0) {
		this.anInt1688 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.anInt1690 = arg0;
		this.aClass38_21 = new Class38(local16);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(JB)Lclient!re;")
	public Class6_Sub2 method1154(@OriginalArg(0) long arg0) {
		@Pc(10) Class6_Sub2 local10 = (Class6_Sub2) this.aClass38_21.method1183(arg0);
		if (local10 != null) {
			this.aClass11_1.method461(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public void method1155() {
		while (true) {
			@Pc(10) Class6_Sub2 local10 = this.aClass11_1.method463();
			if (local10 == null) {
				this.anInt1690 = this.anInt1688;
				return;
			}
			local10.method2083();
			local10.method2094();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(JLclient!re;B)V")
	public void method1161(@OriginalArg(0) long arg0, @OriginalArg(1) Class6_Sub2 arg1) {
		if (this.anInt1690 == 0) {
			@Pc(7) Class6_Sub2 local7 = this.aClass11_1.method463();
			local7.method2083();
			local7.method2094();
			if (local7 == this.aClass6_Sub2_34) {
				local7 = this.aClass11_1.method463();
				local7.method2083();
				local7.method2094();
			}
		} else {
			this.anInt1690--;
		}
		this.aClass38_21.method1184(arg1, arg0);
		this.aClass11_1.method461(arg1);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(JI)V")
	public void method1162(@OriginalArg(0) long arg0) {
		@Pc(10) Class6_Sub2 local10 = (Class6_Sub2) this.aClass38_21.method1183(arg0);
		if (local10 != null) {
			local10.method2083();
			local10.method2094();
			this.anInt1690++;
		}
	}
}
