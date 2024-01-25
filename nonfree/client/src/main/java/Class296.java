import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class296 {

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "Lclient!nga;")
	private Class233 aClass233_47 = new Class233(64);

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "Lclient!eq;")
	private final Class97 aClass97_122;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class296(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_122 = arg2;
		if (this.aClass97_122 != null) {
			@Pc(20) int local20 = this.aClass97_122.method2546() - 1;
			this.aClass97_122.method2569(local20);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Lclient!ua;")
	public Class332 method7023(@OriginalArg(0) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_47;
		@Pc(16) Class332 local16;
		synchronized (this.aClass233_47) {
			local16 = (Class332) this.aClass233_47.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_122;
		@Pc(42) byte[] local42;
		synchronized (this.aClass97_122) {
			local42 = this.aClass97_122.method2545(Static69.method1334(arg0), Static20.method476(arg0));
		}
		local16 = new Class332();
		if (local42 != null) {
			local16.method7762(new Class2_Sub34(local42));
		}
		@Pc(69) Class233 local69 = this.aClass233_47;
		synchronized (this.aClass233_47) {
			this.aClass233_47.method5662(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)V")
	public void method7025(@OriginalArg(1) int arg0) {
		@Pc(14) Class233 local14 = this.aClass233_47;
		synchronized (this.aClass233_47) {
			this.aClass233_47.method5663();
			this.aClass233_47 = new Class233(arg0);
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(BI)V")
	public void method7026() {
		@Pc(2) Class233 local2 = this.aClass233_47;
		synchronized (this.aClass233_47) {
			this.aClass233_47.method5664(5);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	public void method7027() {
		@Pc(6) Class233 local6 = this.aClass233_47;
		synchronized (this.aClass233_47) {
			this.aClass233_47.method5663();
		}
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)V")
	public void method7028() {
		@Pc(8) Class233 local8 = this.aClass233_47;
		synchronized (this.aClass233_47) {
			this.aClass233_47.method5665();
		}
	}
}
