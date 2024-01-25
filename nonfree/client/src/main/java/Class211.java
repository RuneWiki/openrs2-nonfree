import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class211 {

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_43 = new Class288(64);

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "Lclient!gp;")
	private final Class117 aClass117_147;

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "Lclient!gp;")
	public final Class117 aClass117_146;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;Lclient!gp;)V")
	public Class211(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) Class117 arg3) {
		this.aClass117_147 = arg2;
		this.aClass117_146 = arg3;
		this.aClass117_147.method2951(3);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public void method5219() {
		@Pc(6) Class288 local6 = this.aClass288_43;
		synchronized (this.aClass288_43) {
			this.aClass288_43.method6744();
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Lclient!jd;")
	public Class156 method5220(@OriginalArg(1) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_43;
		@Pc(16) Class156 local16;
		synchronized (this.aClass288_43) {
			local16 = (Class156) this.aClass288_43.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_147;
		@Pc(38) byte[] local38;
		synchronized (this.aClass117_147) {
			local38 = this.aClass117_147.method2962(arg0, 3);
		}
		local16 = new Class156();
		local16.aClass211_1 = this;
		if (local38 != null) {
			local16.method3771(new Class5_Sub3(local38));
		}
		@Pc(68) Class288 local68 = this.aClass288_43;
		synchronized (this.aClass288_43) {
			this.aClass288_43.method6746(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)V")
	public void method5221() {
		@Pc(14) Class288 local14 = this.aClass288_43;
		synchronized (this.aClass288_43) {
			this.aClass288_43.method6735(5);
		}
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V")
	public void method5224() {
		@Pc(2) Class288 local2 = this.aClass288_43;
		synchronized (this.aClass288_43) {
			this.aClass288_43.method6742();
		}
	}
}
