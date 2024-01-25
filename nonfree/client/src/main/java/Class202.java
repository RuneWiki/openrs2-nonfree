import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class202 {

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!ge;")
	private final Class83 aClass83_42 = new Class83(64);

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Lclient!ci;")
	private final Class38 aClass38_65;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;)V")
	public Class202(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_65 = arg2;
		if (this.aClass38_65 != null) {
			this.aClass38_65.method1032(11);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)V")
	public void method4860() {
		@Pc(2) Class83 local2 = this.aClass83_42;
		synchronized (this.aClass83_42) {
			this.aClass83_42.method2345(5);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public void method4862() {
		@Pc(11) Class83 local11 = this.aClass83_42;
		synchronized (this.aClass83_42) {
			this.aClass83_42.method2336();
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public void method4863() {
		@Pc(6) Class83 local6 = this.aClass83_42;
		synchronized (this.aClass83_42) {
			this.aClass83_42.method2346();
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Lclient!ns;")
	public Class176 method4864(@OriginalArg(1) int arg0) {
		@Pc(12) Class83 local12 = this.aClass83_42;
		@Pc(22) Class176 local22;
		synchronized (this.aClass83_42) {
			local22 = (Class176) this.aClass83_42.method2338((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class38 local35 = this.aClass38_65;
		@Pc(44) byte[] local44;
		synchronized (this.aClass38_65) {
			local44 = this.aClass38_65.method1039(arg0, 11);
		}
		local22 = new Class176();
		if (local44 != null) {
			local22.method4370(new Class4_Sub20(local44));
		}
		@Pc(66) Class83 local66 = this.aClass83_42;
		synchronized (this.aClass83_42) {
			this.aClass83_42.method2337(local22, (long) arg0);
			return local22;
		}
	}
}
