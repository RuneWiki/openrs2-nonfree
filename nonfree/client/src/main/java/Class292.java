import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class292 {

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!h;")
	private Class125 aClass125_60 = new Class125(64);

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!h;")
	public Class125 aClass125_61 = new Class125(64);

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!an;")
	private final Class16 aClass16_110;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!an;")
	public final Class16 aClass16_111;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;Lclient!an;)V")
	public Class292(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) Class16 arg3) {
		this.aClass16_110 = arg2;
		this.aClass16_111 = arg3;
		this.aClass16_110.method399(34);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
	public void method7211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass125_60 = new Class125(arg0);
		this.aClass125_61 = new Class125(arg1);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)Lclient!vu;")
	public Class310 method7212(@OriginalArg(0) int arg0) {
		@Pc(11) Class125 local11 = this.aClass125_60;
		@Pc(21) Class310 local21;
		synchronized (this.aClass125_60) {
			local21 = (Class310) this.aClass125_60.method3446((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class16 local34 = this.aClass16_110;
		@Pc(43) byte[] local43;
		synchronized (this.aClass16_110) {
			local43 = this.aClass16_110.method408(34, arg0);
		}
		local21 = new Class310();
		local21.aClass292_4 = this;
		if (local43 != null) {
			local21.method7752(new Class12_Sub8(local43));
		}
		@Pc(68) Class125 local68 = this.aClass125_60;
		synchronized (this.aClass125_60) {
			this.aClass125_60.method3437(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V")
	public void method7213() {
		@Pc(10) Class125 local10 = this.aClass125_60;
		synchronized (this.aClass125_60) {
			this.aClass125_60.method3447(5);
		}
		local10 = this.aClass125_61;
		synchronized (this.aClass125_61) {
			this.aClass125_61.method3447(5);
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public void method7214() {
		@Pc(6) Class125 local6 = this.aClass125_60;
		synchronized (this.aClass125_60) {
			this.aClass125_60.method3440();
		}
		local6 = this.aClass125_61;
		synchronized (this.aClass125_61) {
			this.aClass125_61.method3440();
		}
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
	public void method7216() {
		@Pc(2) Class125 local2 = this.aClass125_60;
		synchronized (this.aClass125_60) {
			this.aClass125_60.method3442();
		}
		local2 = this.aClass125_61;
		synchronized (this.aClass125_61) {
			this.aClass125_61.method3442();
		}
	}
}
