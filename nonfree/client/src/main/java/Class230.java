import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class230 {

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "Lclient!of;")
	private Class188 aClass188_51 = new Class188(64);

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "Lclient!of;")
	public Class188 aClass188_52 = new Class188(64);

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "Lclient!mn;")
	private final Class171 aClass171_89;

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "Lclient!mn;")
	public final Class171 aClass171_90;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;Lclient!mn;)V")
	public Class230(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		this.aClass171_89 = arg2;
		this.aClass171_90 = arg3;
		this.aClass171_89.method3662(34);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IB)Lclient!hj;")
	public Class112 method5250(@OriginalArg(0) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_51;
		@Pc(16) Class112 local16;
		synchronized (this.aClass188_51) {
			local16 = (Class112) this.aClass188_51.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_89;
		@Pc(38) byte[] local38;
		synchronized (this.aClass171_89) {
			local38 = this.aClass171_89.method3658(34, arg0);
		}
		local16 = new Class112();
		local16.aClass230_4 = this;
		if (local38 != null) {
			local16.method2316(new Class2_Sub17(local38));
		}
		@Pc(63) Class188 local63 = this.aClass188_51;
		synchronized (this.aClass188_51) {
			this.aClass188_51.method4155((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
	public void method5254() {
		@Pc(2) Class188 local2 = this.aClass188_51;
		synchronized (this.aClass188_51) {
			this.aClass188_51.method4156();
		}
		local2 = this.aClass188_52;
		synchronized (this.aClass188_52) {
			this.aClass188_52.method4156();
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V")
	public void method5255() {
		@Pc(14) Class188 local14 = this.aClass188_51;
		synchronized (this.aClass188_51) {
			this.aClass188_51.method4154();
		}
		local14 = this.aClass188_52;
		synchronized (this.aClass188_52) {
			this.aClass188_52.method4154();
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V")
	public void method5256() {
		@Pc(2) Class188 local2 = this.aClass188_51;
		synchronized (this.aClass188_51) {
			this.aClass188_51.method4169(5);
		}
		@Pc(30) Class188 local30 = this.aClass188_52;
		synchronized (this.aClass188_52) {
			this.aClass188_52.method4169(5);
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(IIB)V")
	public void method5257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass188_51 = new Class188(arg1);
		this.aClass188_52 = new Class188(arg0);
	}
}
