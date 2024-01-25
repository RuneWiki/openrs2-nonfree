import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class237 {

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "Lclient!ge;")
	private final Class83 aClass83_52 = new Class83(16);

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "Lclient!ci;")
	private final Class38 aClass38_78;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;)V")
	public Class237(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_78 = arg2;
		this.aClass38_78.method1032(30);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
	public void method5395() {
		@Pc(14) Class83 local14 = this.aClass83_52;
		synchronized (this.aClass83_52) {
			this.aClass83_52.method2346();
		}
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)V")
	public void method5397() {
		@Pc(6) Class83 local6 = this.aClass83_52;
		synchronized (this.aClass83_52) {
			this.aClass83_52.method2336();
		}
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)V")
	public void method5400() {
		@Pc(12) Class83 local12 = this.aClass83_52;
		synchronized (this.aClass83_52) {
			this.aClass83_52.method2345(5);
		}
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(II)Lclient!mo;")
	public Class163 method5401(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_52;
		@Pc(16) Class163 local16;
		synchronized (this.aClass83_52) {
			local16 = (Class163) this.aClass83_52.method2338((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class38 local35 = this.aClass38_78;
		@Pc(44) byte[] local44;
		synchronized (this.aClass38_78) {
			local44 = this.aClass38_78.method1039(arg0, 30);
		}
		local16 = new Class163();
		if (local44 != null) {
			local16.method4110(new Class4_Sub20(local44));
		}
		@Pc(66) Class83 local66 = this.aClass83_52;
		synchronized (this.aClass83_52) {
			this.aClass83_52.method2337(local16, (long) arg0);
			return local16;
		}
	}
}
