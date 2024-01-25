import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class257 {

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Lclient!ge;")
	private final Class83 aClass83_59 = new Class83(64);

	@OriginalMember(owner = "client!un", name = "d", descriptor = "Lclient!ci;")
	private final Class38 aClass38_88;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;)V")
	public Class257(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_88 = arg2;
		if (this.aClass38_88 != null) {
			this.aClass38_88.method1032(35);
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	public void method5856() {
		@Pc(2) Class83 local2 = this.aClass83_59;
		synchronized (this.aClass83_59) {
			this.aClass83_59.method2346();
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V")
	public void method5857() {
		@Pc(2) Class83 local2 = this.aClass83_59;
		synchronized (this.aClass83_59) {
			this.aClass83_59.method2345(5);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
	public void method5859() {
		@Pc(13) Class83 local13 = this.aClass83_59;
		synchronized (this.aClass83_59) {
			this.aClass83_59.method2336();
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)Lclient!fp;")
	public Class78 method5860(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_59;
		@Pc(16) Class78 local16;
		synchronized (this.aClass83_59) {
			local16 = (Class78) this.aClass83_59.method2338((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class38 local29 = this.aClass38_88;
		@Pc(38) byte[] local38;
		synchronized (this.aClass38_88) {
			local38 = this.aClass38_88.method1039(arg0, 35);
		}
		local16 = new Class78();
		if (local38 != null) {
			local16.method2207(new Class4_Sub20(local38));
		}
		local16.method2211();
		@Pc(65) Class83 local65 = this.aClass83_59;
		synchronized (this.aClass83_59) {
			this.aClass83_59.method2337(local16, (long) arg0);
			return local16;
		}
	}
}
