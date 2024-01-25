import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eja")
public final class Class97 {

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_30 = new Class307(64);

	@OriginalMember(owner = "client!eja", name = "i", descriptor = "Lclient!ik;")
	private final Class182 aClass182_38;

	@OriginalMember(owner = "client!eja", name = "e", descriptor = "Lclient!ft;")
	public final Class124 aClass124_1;

	@OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;Lclient!ft;)V")
	public Class97(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Class124 arg3) {
		this.aClass182_38 = arg2;
		this.aClass182_38.method3970(32);
		this.aClass124_1 = arg3;
	}

	@OriginalMember(owner = "client!eja", name = "b", descriptor = "(II)Lclient!lg;")
	public Class226 method2458(@OriginalArg(1) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_30;
		@Pc(18) Class226 local18;
		synchronized (this.aClass307_30) {
			local18 = (Class226) this.aClass307_30.method7002((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class182 local32 = this.aClass182_38;
		@Pc(41) byte[] local41;
		synchronized (this.aClass182_38) {
			local41 = this.aClass182_38.method3985(arg0, 32);
		}
		local18 = new Class226();
		local18.aClass97_2 = this;
		if (local41 != null) {
			local18.method5087(new Class3_Sub2(local41));
		}
		@Pc(68) Class307 local68 = this.aClass307_30;
		synchronized (this.aClass307_30) {
			this.aClass307_30.method7000(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(II)V")
	public void method2461() {
		@Pc(6) Class307 local6 = this.aClass307_30;
		synchronized (this.aClass307_30) {
			this.aClass307_30.method6995(5);
		}
	}

	@OriginalMember(owner = "client!eja", name = "c", descriptor = "(I)V")
	public void method2462() {
		@Pc(14) Class307 local14 = this.aClass307_30;
		synchronized (this.aClass307_30) {
			this.aClass307_30.method6998();
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(I)V")
	public void method2464() {
		@Pc(14) Class307 local14 = this.aClass307_30;
		synchronized (this.aClass307_30) {
			this.aClass307_30.method7006();
		}
	}
}
