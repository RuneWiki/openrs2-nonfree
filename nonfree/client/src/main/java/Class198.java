import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class198 {

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Lclient!fc;")
	private final Class94 aClass94_29 = new Class94(64);

	@OriginalMember(owner = "client!me", name = "l", descriptor = "Lclient!fc;")
	private final Class94 aClass94_30 = new Class94(100);

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Lclient!ni;")
	private final Class223 aClass223_71;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;Lclient!ni;Lclient!ni;)V")
	public Class198(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class223 arg3, @OriginalArg(4) Class223 arg4) {
		this.aClass223_71 = arg2;
		if (this.aClass223_71 != null) {
			@Pc(26) int local26 = this.aClass223_71.method5961() - 1;
			this.aClass223_71.method5970(local26);
		}
		Static498.method7229(arg4, arg3);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
	public void method5701() {
		@Pc(2) Class94 local2 = this.aClass94_29;
		synchronized (this.aClass94_29) {
			this.aClass94_29.method2952();
		}
		local2 = this.aClass94_30;
		synchronized (this.aClass94_30) {
			this.aClass94_30.method2952();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public void method5702() {
		@Pc(2) Class94 local2 = this.aClass94_29;
		synchronized (this.aClass94_29) {
			this.aClass94_29.method2964();
		}
		local2 = this.aClass94_30;
		synchronized (this.aClass94_30) {
			this.aClass94_30.method2964();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	public void method5704() {
		@Pc(6) Class94 local6 = this.aClass94_29;
		synchronized (this.aClass94_29) {
			this.aClass94_29.method2958(5);
		}
		local6 = this.aClass94_30;
		synchronized (this.aClass94_30) {
			this.aClass94_30.method2958(5);
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Lclient!gaa;")
	public Class113 method5706(@OriginalArg(0) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_29;
		@Pc(16) Class113 local16;
		synchronized (this.aClass94_29) {
			local16 = (Class113) this.aClass94_29.method2960((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class223 local29 = this.aClass223_71;
		@Pc(44) byte[] local44;
		synchronized (this.aClass223_71) {
			local44 = this.aClass223_71.method5954(Static516.method7389(arg0), Static578.method8034(arg0));
		}
		local16 = new Class113();
		local16.aClass198_1 = this;
		local16.anInt3854 = arg0;
		if (local44 != null) {
			local16.method3264(new Class6_Sub8(local44));
		}
		local16.method3269();
		@Pc(82) Class94 local82 = this.aClass94_29;
		synchronized (this.aClass94_29) {
			this.aClass94_29.method2963((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(II)Lclient!jea;")
	public Class6_Sub5_Sub18 method5707(@OriginalArg(1) int arg0) {
		@Pc(14) Class94 local14 = this.aClass94_30;
		synchronized (this.aClass94_30) {
			@Pc(24) Class6_Sub5_Sub18 local24 = (Class6_Sub5_Sub18) this.aClass94_30.method2960((long) arg0);
			if (local24 == null) {
				local24 = new Class6_Sub5_Sub18(arg0);
				this.aClass94_30.method2963((long) arg0, local24);
			}
			return local24.method4645() ? local24 : null;
		}
	}
}
