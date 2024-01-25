import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class200 {

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "I")
	public int anInt4947;

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "Lclient!mf;")
	private final Class222 aClass222_29 = new Class222(64);

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "Lclient!mf;")
	public final Class222 aClass222_30 = new Class222(60);

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "Lclient!pu;")
	public final Class270 aClass270_56;

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "Lclient!pu;")
	private final Class270 aClass270_57;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;Lclient!pu;)V")
	public Class200(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2, @OriginalArg(3) Class270 arg3) {
		this.aClass270_56 = arg3;
		this.aClass270_57 = arg2;
		@Pc(26) int local26 = this.aClass270_57.method5674() - 1;
		this.aClass270_57.method5685(local26);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)V")
	public void method3954() {
		@Pc(12) Class222 local12 = this.aClass222_29;
		synchronized (this.aClass222_29) {
			this.aClass222_29.method4433(5);
		}
		local12 = this.aClass222_30;
		synchronized (this.aClass222_30) {
			this.aClass222_30.method4433(5);
		}
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)V")
	public void method3955() {
		@Pc(6) Class222 local6 = this.aClass222_29;
		synchronized (this.aClass222_29) {
			this.aClass222_29.method4422();
		}
		local6 = this.aClass222_30;
		synchronized (this.aClass222_30) {
			this.aClass222_30.method4422();
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)Lclient!cs;")
	public Class60 method3956(@OriginalArg(1) int arg0) {
		@Pc(11) Class222 local11 = this.aClass222_29;
		@Pc(21) Class60 local21;
		synchronized (this.aClass222_29) {
			local21 = (Class60) this.aClass222_29.method4430((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class270 local34 = this.aClass270_57;
		@Pc(49) byte[] local49;
		synchronized (this.aClass270_57) {
			local49 = this.aClass270_57.method5704(Static449.method6209(arg0), Static77.method1316(arg0));
		}
		local21 = new Class60();
		local21.anInt1398 = arg0;
		local21.aClass200_1 = this;
		if (local49 != null) {
			local21.method1222(new Class1_Sub35(local49));
		}
		@Pc(79) Class222 local79 = this.aClass222_29;
		synchronized (this.aClass222_29) {
			this.aClass222_29.method4434(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(B)V")
	public void method3957() {
		@Pc(2) Class222 local2 = this.aClass222_29;
		synchronized (this.aClass222_29) {
			this.aClass222_29.method4428();
		}
		local2 = this.aClass222_30;
		synchronized (this.aClass222_30) {
			this.aClass222_30.method4428();
		}
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)V")
	public void method3958(@OriginalArg(0) int arg0) {
		this.anInt4947 = arg0;
		@Pc(15) Class222 local15 = this.aClass222_30;
		synchronized (this.aClass222_30) {
			this.aClass222_30.method4428();
		}
	}
}
