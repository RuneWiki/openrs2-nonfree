import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class53 {

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "Lclient!wc;")
	private Class110 aClass110_11;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V")
	public Class53(@OriginalArg(0) int arg0) {
		this.aClass110_11 = new Class110(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(JB)V")
	public void method1791(@OriginalArg(0) long arg0) {
		this.aClass110_11.method3886(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IJ)Lclient!qf;")
	public Class5 method1793(@OriginalArg(1) long arg0) {
		@Pc(10) Class2_Sub3_Sub1 local10 = (Class2_Sub3_Sub1) this.aClass110_11.method3891(arg0);
		return local10 == null ? null : local10.aClass5_1;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!qf;JI)V")
	public void method1794(@OriginalArg(0) Class5 arg0, @OriginalArg(1) long arg1) {
		this.aClass110_11.method3894(new Class2_Sub3_Sub1(arg0), arg1);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
	public void method1797() {
		this.aClass110_11.method3889();
	}
}
