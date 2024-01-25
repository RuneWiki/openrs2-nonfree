import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class373 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "Lclient!pja;")
	private final Class279 aClass279_60 = new Class279(64);

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "Lclient!pja;")
	private final Class279 aClass279_61 = new Class279(100);

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "Lclient!gj;")
	private final Class143 aClass143_136;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;Lclient!gj;Lclient!gj;)V")
	public Class373(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(3) Class143 arg3, @OriginalArg(4) Class143 arg4) {
		this.aClass143_136 = arg2;
		if (this.aClass143_136 != null) {
			@Pc(26) int local26 = this.aClass143_136.method3116() - 1;
			this.aClass143_136.method3123(local26);
		}
		Static580.method7794(arg4, arg3);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)V")
	public void method8319() {
		@Pc(6) Class279 local6 = this.aClass279_60;
		synchronized (this.aClass279_60) {
			this.aClass279_60.method6630(5);
		}
		local6 = this.aClass279_61;
		synchronized (this.aClass279_61) {
			this.aClass279_61.method6630(5);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public void method8320() {
		@Pc(8) Class279 local8 = this.aClass279_60;
		synchronized (this.aClass279_60) {
			this.aClass279_60.method6638();
		}
		local8 = this.aClass279_61;
		synchronized (this.aClass279_61) {
			this.aClass279_61.method6638();
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Lclient!ija;")
	public Class3_Sub6_Sub11 method8321(@OriginalArg(0) int arg0) {
		@Pc(12) Class279 local12 = this.aClass279_61;
		synchronized (this.aClass279_61) {
			@Pc(22) Class3_Sub6_Sub11 local22 = (Class3_Sub6_Sub11) this.aClass279_61.method6631((long) arg0);
			if (local22 == null) {
				local22 = new Class3_Sub6_Sub11(arg0);
				this.aClass279_61.method6635(local22, (long) arg0);
			}
			return local22.method4036() ? local22 : null;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public void method8322() {
		@Pc(6) Class279 local6 = this.aClass279_60;
		synchronized (this.aClass279_60) {
			this.aClass279_60.method6637();
		}
		local6 = this.aClass279_61;
		synchronized (this.aClass279_61) {
			this.aClass279_61.method6637();
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(BI)Lclient!c;")
	public Class48 method8323(@OriginalArg(1) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_60;
		@Pc(22) Class48 local22;
		synchronized (this.aClass279_60) {
			local22 = (Class48) this.aClass279_60.method6631((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class143 local35 = this.aClass143_136;
		@Pc(48) byte[] local48;
		synchronized (this.aClass143_136) {
			local48 = this.aClass143_136.method3125(Static453.method6505(arg0), Static459.method6586(arg0));
		}
		local22 = new Class48();
		local22.aClass373_1 = this;
		local22.anInt1551 = arg0;
		if (local48 != null) {
			local22.method1522(new Class3_Sub17(local48));
		}
		local22.method1519();
		@Pc(79) Class279 local79 = this.aClass279_60;
		synchronized (this.aClass279_60) {
			this.aClass279_60.method6635(local22, (long) arg0);
			return local22;
		}
	}
}
