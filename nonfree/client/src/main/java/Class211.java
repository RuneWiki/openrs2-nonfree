import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class211 {

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Lclient!of;")
	private Class188 aClass188_46 = new Class188(64);

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Lclient!mn;")
	private final Class171 aClass171_77;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;)V")
	public Class211(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_77 = arg2;
		if (this.aClass171_77 != null) {
			@Pc(20) int local20 = this.aClass171_77.method3677() - 1;
			this.aClass171_77.method3662(local20);
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)Lclient!rk;")
	public Class216 method4908(@OriginalArg(1) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_46;
		@Pc(16) Class216 local16;
		synchronized (this.aClass188_46) {
			local16 = (Class216) this.aClass188_46.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class171 local35 = this.aClass171_77;
		@Pc(50) byte[] local50;
		synchronized (this.aClass171_77) {
			local50 = this.aClass171_77.method3658(Static146.method2221(arg0), Static179.method2616(arg0));
		}
		local16 = new Class216();
		if (local50 != null) {
			local16.method4965(new Class2_Sub17(local50));
		}
		@Pc(72) Class188 local72 = this.aClass188_46;
		synchronized (this.aClass188_46) {
			this.aClass188_46.method4155((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public void method4910() {
		@Pc(2) Class188 local2 = this.aClass188_46;
		synchronized (this.aClass188_46) {
			this.aClass188_46.method4154();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)V")
	public void method4911() {
		@Pc(7) Class188 local7 = this.aClass188_46;
		synchronized (this.aClass188_46) {
			this.aClass188_46.method4169(5);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)V")
	public void method4912(@OriginalArg(1) int arg0) {
		@Pc(14) Class188 local14 = this.aClass188_46;
		synchronized (this.aClass188_46) {
			this.aClass188_46.method4156();
			this.aClass188_46 = new Class188(arg0);
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	public void method4913() {
		@Pc(10) Class188 local10 = this.aClass188_46;
		synchronized (this.aClass188_46) {
			this.aClass188_46.method4156();
		}
	}
}
