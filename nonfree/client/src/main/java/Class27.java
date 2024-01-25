import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class27 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "Lclient!jda;")
	private Class165 aClass165_1 = new Class165(128);

	@OriginalMember(owner = "client!b", name = "l", descriptor = "Lclient!jda;")
	public Class165 aClass165_2 = new Class165(64);

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Lclient!aj;")
	private final Class15 aClass15_7;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "Lclient!aj;")
	public final Class15 aClass15_8;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;Lclient!aj;)V")
	public Class27(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) Class15 arg3) {
		this.aClass15_7 = arg2;
		this.aClass15_8 = arg3;
		this.aClass15_7.method512(36);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Lclient!rs;")
	public Class308 method693(@OriginalArg(0) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_1;
		@Pc(16) Class308 local16;
		synchronized (this.aClass165_1) {
			local16 = (Class308) this.aClass165_1.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class15 local29 = this.aClass15_7;
		@Pc(46) byte[] local46;
		synchronized (this.aClass15_7) {
			local46 = this.aClass15_7.method517(arg0, 36);
		}
		local16 = new Class308();
		local16.aClass27_4 = this;
		local16.anInt8777 = arg0;
		if (local46 != null) {
			local16.method7690(new Class3_Sub25(local46));
		}
		local16.method7687();
		@Pc(77) Class165 local77 = this.aClass165_1;
		synchronized (this.aClass165_1) {
			this.aClass165_1.method4392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
	public void method695(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass165_1 = new Class165(arg0);
		this.aClass165_2 = new Class165(arg1);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)V")
	public void method696() {
		@Pc(6) Class165 local6 = this.aClass165_1;
		synchronized (this.aClass165_1) {
			this.aClass165_1.method4394(5);
		}
		local6 = this.aClass165_2;
		synchronized (this.aClass165_2) {
			this.aClass165_2.method4394(5);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public void method697() {
		@Pc(2) Class165 local2 = this.aClass165_1;
		synchronized (this.aClass165_1) {
			this.aClass165_1.method4403();
		}
		local2 = this.aClass165_2;
		synchronized (this.aClass165_2) {
			this.aClass165_2.method4403();
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
	public void method698() {
		@Pc(6) Class165 local6 = this.aClass165_1;
		synchronized (this.aClass165_1) {
			this.aClass165_1.method4400();
		}
		local6 = this.aClass165_2;
		synchronized (this.aClass165_2) {
			this.aClass165_2.method4400();
		}
	}
}
