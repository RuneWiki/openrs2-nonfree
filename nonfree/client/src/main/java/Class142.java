import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class142 {

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "Lclient!rl;")
	private final Class317 aClass317_19 = new Class317(16);

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "Lclient!rg;")
	private final Class310 aClass310_45;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class142(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_45 = arg2;
		this.aClass310_45.method7773(29);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)Lclient!cda;")
	private Class57 method3042(@OriginalArg(0) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_19;
		@Pc(18) Class57 local18;
		synchronized (this.aClass317_19) {
			local18 = (Class57) this.aClass317_19.method7882((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(40) Class310 local40 = this.aClass310_45;
		@Pc(51) byte[] local51;
		synchronized (this.aClass310_45) {
			local51 = this.aClass310_45.method7803(arg0, 29);
		}
		local18 = new Class57();
		if (local51 != null) {
			local18.method1073(new Class14_Sub21(local51));
		}
		@Pc(75) Class317 local75 = this.aClass317_19;
		synchronized (this.aClass317_19) {
			this.aClass317_19.method7875((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
	public void method3043() {
		@Pc(6) Class317 local6 = this.aClass317_19;
		synchronized (this.aClass317_19) {
			this.aClass317_19.method7874();
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	public void method3045() {
		@Pc(2) Class317 local2 = this.aClass317_19;
		synchronized (this.aClass317_19) {
			this.aClass317_19.method7873();
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIBLclient!ifa;II)Lclient!uj;")
	public Class366 method3046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class171 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) Class99[] local13 = null;
		@Pc(18) Class57 local18 = this.method3042(arg4);
		if (local18.anIntArray65 != null) {
			local13 = new Class99[local18.anIntArray65.length];
			for (@Pc(28) int local28 = 0; local28 < local13.length; local28++) {
				@Pc(37) Class130 local37 = arg2.method4203(local18.anIntArray65[local28]);
				local13[local28] = new Class99(local37.anInt3200, local37.anInt3212, local37.anInt3211, local37.anInt3202, local37.anInt3214, local37.anInt3215, local37.anInt3207, local37.aBoolean232, local37.anInt3204, local37.anInt3201, local37.anInt3205);
			}
		}
		return new Class366(local18.anInt1041, local13, local18.anInt1040, arg3, arg1, arg0, local18.anInt1039, local18.anInt1042);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI)V")
	public void method3047() {
		@Pc(2) Class317 local2 = this.aClass317_19;
		synchronized (this.aClass317_19) {
			this.aClass317_19.method7870(5);
		}
	}
}
