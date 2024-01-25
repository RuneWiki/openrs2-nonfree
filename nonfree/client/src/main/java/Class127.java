import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class127 {

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "Lclient!kh;")
	private final Class134 aClass134_30 = new Class134(64);

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "Lclient!kh;")
	private final Class134 aClass134_31 = new Class134(100);

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "Lclient!ul;")
	private final Class246 aClass246_113;

	static {
		new Class7("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;Lclient!ul;Lclient!ul;)V")
	public Class127(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) Class246 arg3, @OriginalArg(4) Class246 arg4) {
		this.aClass246_113 = arg2;
		if (this.aClass246_113 != null) {
			@Pc(26) int local26 = this.aClass246_113.method5502() - 1;
			this.aClass246_113.method5492(local26);
		}
		Static10.method333(arg3, arg4);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)Lclient!sm;")
	public Class223 method2975(@OriginalArg(0) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_30;
		@Pc(18) Class223 local18;
		synchronized (this.aClass134_30) {
			local18 = (Class223) this.aClass134_30.method3266((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class246 local31 = this.aClass246_113;
		@Pc(44) byte[] local44;
		synchronized (this.aClass246_113) {
			local44 = this.aClass246_113.method5477(Static92.method1685(arg0), Static14.method385(arg0));
		}
		local18 = new Class223();
		local18.aClass127_2 = this;
		local18.anInt6043 = arg0;
		if (local44 != null) {
			local18.method5053(new Class1_Sub5(local44));
		}
		local18.method5052();
		@Pc(85) Class134 local85 = this.aClass134_30;
		synchronized (this.aClass134_30) {
			this.aClass134_30.method3263((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(IB)Lclient!ir;")
	public Class1_Sub2_Sub9 method2976(@OriginalArg(0) int arg0) {
		@Pc(14) Class134 local14 = this.aClass134_31;
		@Pc(24) Class1_Sub2_Sub9 local24;
		synchronized (this.aClass134_31) {
			local24 = (Class1_Sub2_Sub9) this.aClass134_31.method3266((long) arg0);
			if (local24 == null) {
				local24 = new Class1_Sub2_Sub9(arg0);
				this.aClass134_31.method3263((long) arg0, local24);
			}
		}
		synchronized (local24) {
			return local24.method2801() ? local24 : null;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	public void method2979() {
		@Pc(6) Class134 local6 = this.aClass134_30;
		synchronized (this.aClass134_30) {
			this.aClass134_30.method3267();
		}
		local6 = this.aClass134_31;
		synchronized (this.aClass134_31) {
			this.aClass134_31.method3267();
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IZ)V")
	public void method2980() {
		@Pc(12) Class134 local12 = this.aClass134_30;
		synchronized (this.aClass134_30) {
			this.aClass134_30.method3270(5);
		}
		local12 = this.aClass134_31;
		synchronized (this.aClass134_31) {
			this.aClass134_31.method3270(5);
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)V")
	public void method2983() {
		@Pc(2) Class134 local2 = this.aClass134_30;
		synchronized (this.aClass134_30) {
			this.aClass134_30.method3272();
		}
		local2 = this.aClass134_31;
		synchronized (this.aClass134_31) {
			this.aClass134_31.method3272();
		}
	}
}
