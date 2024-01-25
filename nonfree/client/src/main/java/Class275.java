import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class275 {

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "Lclient!ge;")
	private final Class83 aClass83_62 = new Class83(64);

	@OriginalMember(owner = "client!wt", name = "o", descriptor = "Lclient!ge;")
	public final Class83 aClass83_63 = new Class83(2);

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "Lclient!ci;")
	private final Class38 aClass38_96;

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "Lclient!ci;")
	public final Class38 aClass38_95;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;Lclient!ci;)V")
	public Class275(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) Class38 arg3) {
		this.aClass38_96 = arg2;
		this.aClass38_95 = arg3;
		this.aClass38_96.method1032(33);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
	public void method6295() {
		@Pc(12) Class83 local12 = this.aClass83_62;
		synchronized (this.aClass83_62) {
			this.aClass83_62.method2346();
		}
		local12 = this.aClass83_63;
		synchronized (this.aClass83_63) {
			this.aClass83_63.method2346();
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)V")
	public void method6298() {
		@Pc(2) Class83 local2 = this.aClass83_62;
		synchronized (this.aClass83_62) {
			this.aClass83_62.method2345(5);
		}
		local2 = this.aClass83_63;
		synchronized (this.aClass83_63) {
			this.aClass83_63.method2345(5);
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)V")
	public void method6299() {
		@Pc(10) Class83 local10 = this.aClass83_62;
		synchronized (this.aClass83_62) {
			this.aClass83_62.method2336();
		}
		local10 = this.aClass83_63;
		synchronized (this.aClass83_63) {
			this.aClass83_63.method2336();
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)Lclient!pe;")
	public Class194 method6300(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_62;
		@Pc(16) Class194 local16;
		synchronized (this.aClass83_62) {
			local16 = (Class194) this.aClass83_62.method2338((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class38 local29 = this.aClass38_96;
		@Pc(43) byte[] local43;
		synchronized (this.aClass38_96) {
			local43 = this.aClass38_96.method1039(arg0, 33);
		}
		local16 = new Class194();
		local16.aClass275_3 = this;
		if (local43 != null) {
			local16.method4692(new Class4_Sub20(local43));
		}
		@Pc(68) Class83 local68 = this.aClass83_62;
		synchronized (this.aClass83_62) {
			this.aClass83_62.method2337(local16, (long) arg0);
			return local16;
		}
	}
}
