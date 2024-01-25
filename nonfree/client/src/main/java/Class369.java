import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class369 {

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
	public int anInt9963;

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "Lclient!iha;")
	private final Class168 aClass168_90 = new Class168(64);

	@OriginalMember(owner = "client!uv", name = "p", descriptor = "Lclient!iha;")
	public final Class168 aClass168_91 = new Class168(50);

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "Lclient!iha;")
	public final Class168 aClass168_92 = new Class168(5);

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "Z")
	public boolean aBoolean696;

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "Lclient!po;")
	public final Class290 aClass290_7;

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "Lclient!gda;")
	public final Class126 aClass126_281;

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "Lclient!gda;")
	private final Class126 aClass126_282;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!po;IZLclient!gda;Lclient!gda;)V")
	public Class369(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class126 arg3, @OriginalArg(4) Class126 arg4) {
		this.aBoolean696 = arg2;
		this.aClass290_7 = arg0;
		this.aClass126_281 = arg4;
		this.aClass126_282 = arg3;
		if (this.aClass126_282 != null) {
			@Pc(41) int local41 = this.aClass126_282.method3082() - 1;
			this.aClass126_282.method3062(local41);
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZB)V")
	public void method8463(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean696 != arg0) {
			this.aBoolean696 = arg0;
			this.method8468();
		}
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
	public void method8464() {
		@Pc(6) Class168 local6 = this.aClass168_90;
		synchronized (this.aClass168_90) {
			this.aClass168_90.method3856();
		}
		local6 = this.aClass168_91;
		synchronized (this.aClass168_91) {
			this.aClass168_91.method3856();
		}
		local6 = this.aClass168_92;
		synchronized (this.aClass168_92) {
			this.aClass168_92.method3856();
		}
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)V")
	public void method8465() {
		@Pc(2) Class168 local2 = this.aClass168_91;
		synchronized (this.aClass168_91) {
			this.aClass168_91.method3862();
		}
		local2 = this.aClass168_92;
		synchronized (this.aClass168_92) {
			this.aClass168_92.method3862();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V")
	public void method8466(@OriginalArg(0) int arg0) {
		this.anInt9963 = arg0;
		@Pc(9) Class168 local9 = this.aClass168_91;
		synchronized (this.aClass168_91) {
			this.aClass168_91.method3862();
		}
		local9 = this.aClass168_92;
		synchronized (this.aClass168_92) {
			this.aClass168_92.method3862();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
	public void method8468() {
		@Pc(2) Class168 local2 = this.aClass168_90;
		synchronized (this.aClass168_90) {
			this.aClass168_90.method3862();
		}
		local2 = this.aClass168_91;
		synchronized (this.aClass168_91) {
			this.aClass168_91.method3862();
		}
		local2 = this.aClass168_92;
		synchronized (this.aClass168_92) {
			this.aClass168_92.method3862();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZI)V")
	public void method8469() {
		@Pc(2) Class168 local2 = this.aClass168_90;
		synchronized (this.aClass168_90) {
			this.aClass168_90.method3852(5);
		}
		local2 = this.aClass168_91;
		synchronized (this.aClass168_91) {
			this.aClass168_91.method3852(5);
		}
		local2 = this.aClass168_92;
		synchronized (this.aClass168_92) {
			this.aClass168_92.method3852(5);
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)Lclient!faa;")
	public Class105 method8471(@OriginalArg(0) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_90;
		@Pc(18) Class105 local18;
		synchronized (this.aClass168_90) {
			local18 = (Class105) this.aClass168_90.method3860((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class126 local32 = this.aClass126_282;
		@Pc(45) byte[] local45;
		synchronized (this.aClass126_282) {
			local45 = this.aClass126_282.method3086(Static664.method9097(arg0), Static273.method4459(arg0));
		}
		local18 = new Class105();
		local18.aClass369_1 = this;
		local18.anInt2836 = arg0;
		if (local45 != null) {
			local18.method2615(new Class5_Sub36(local45));
		}
		local18.method2610();
		@Pc(85) Class168 local85 = this.aClass168_90;
		synchronized (this.aClass168_90) {
			this.aClass168_90.method3853((long) arg0, local18);
			return local18;
		}
	}
}
