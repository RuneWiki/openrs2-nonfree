import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class218 {

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "Lclient!wg;")
	private final Class313 aClass313_40 = new Class313(64);

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "Lclient!wg;")
	private final Class313 aClass313_41 = new Class313(100);

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "Lclient!kr;")
	private final Class171 aClass171_101;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;Lclient!kr;Lclient!kr;)V")
	public Class218(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3, @OriginalArg(4) Class171 arg4) {
		this.aClass171_101 = arg2;
		if (this.aClass171_101 != null) {
			@Pc(26) int local26 = this.aClass171_101.method4331() - 1;
			this.aClass171_101.method4349(local26);
		}
		Static502.method6958(arg3, arg4);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)Lclient!na;")
	public Class199 method5221(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_40;
		@Pc(16) Class199 local16;
		synchronized (this.aClass313_40) {
			local16 = (Class199) this.aClass313_40.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_101;
		@Pc(42) byte[] local42;
		synchronized (this.aClass171_101) {
			local42 = this.aClass171_101.method4339(Static80.method1381(arg0), Static406.method6069(arg0));
		}
		local16 = new Class199();
		local16.aClass218_2 = this;
		local16.anInt5749 = arg0;
		if (local42 != null) {
			local16.method4879(new Class1_Sub6(local42));
		}
		local16.method4880();
		@Pc(73) Class313 local73 = this.aClass313_40;
		synchronized (this.aClass313_40) {
			this.aClass313_40.method7399((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)Lclient!hr;")
	public Class1_Sub1_Sub6 method5222(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_41;
		@Pc(16) Class1_Sub1_Sub6 local16;
		synchronized (this.aClass313_41) {
			local16 = (Class1_Sub1_Sub6) this.aClass313_41.method7406((long) arg0);
			if (local16 == null) {
				local16 = new Class1_Sub1_Sub6(arg0);
				this.aClass313_41.method7399((long) arg0, local16);
			}
		}
		synchronized (local16) {
			return local16.method2967() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	public void method5223() {
		@Pc(11) Class313 local11 = this.aClass313_40;
		synchronized (this.aClass313_40) {
			this.aClass313_40.method7400();
		}
		local11 = this.aClass313_41;
		synchronized (this.aClass313_41) {
			this.aClass313_41.method7400();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
	public void method5224() {
		@Pc(2) Class313 local2 = this.aClass313_40;
		synchronized (this.aClass313_40) {
			this.aClass313_40.method7403(5);
		}
		local2 = this.aClass313_41;
		synchronized (this.aClass313_41) {
			this.aClass313_41.method7403(5);
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
	public void method5225() {
		@Pc(6) Class313 local6 = this.aClass313_40;
		synchronized (this.aClass313_40) {
			this.aClass313_40.method7398();
		}
		local6 = this.aClass313_41;
		synchronized (this.aClass313_41) {
			this.aClass313_41.method7398();
		}
	}
}
