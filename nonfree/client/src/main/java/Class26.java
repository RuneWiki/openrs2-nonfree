import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class26 {

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
	public int anInt497;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Lclient!lh;")
	private final Class151 aClass151_17 = new Class151(64);

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "Lclient!lh;")
	public final Class151 aClass151_18 = new Class151(50);

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "Lclient!lh;")
	public final Class151 aClass151_19 = new Class151(5);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "Z")
	public boolean aBoolean35;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "Lclient!hh;")
	public final Class109 aClass109_16;

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "Lclient!hh;")
	private final Class109 aClass109_17;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!mt;IZLclient!hh;Lclient!hh;)V")
	public Class26(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class109 arg3, @OriginalArg(4) Class109 arg4) {
		this.aBoolean35 = arg2;
		this.aClass109_16 = arg4;
		this.aClass109_17 = arg3;
		if (this.aClass109_17 != null) {
			@Pc(38) int local38 = this.aClass109_17.method2324() - 1;
			this.aClass109_17.method2322(local38);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)Lclient!qb;")
	public Class196 method429(@OriginalArg(1) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_17;
		@Pc(16) Class196 local16;
		synchronized (this.aClass151_17) {
			local16 = (Class196) this.aClass151_17.method3288((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass109_17.method2349(Static221.method5880(arg0), Static343.method4931(arg0));
		local16 = new Class196();
		local16.anInt5566 = arg0;
		local16.aClass26_2 = this;
		if (local37 != null) {
			local16.method4405(new Class1_Sub14(local37));
		}
		local16.method4411();
		@Pc(69) Class151 local69 = this.aClass151_17;
		synchronized (this.aClass151_17) {
			this.aClass151_17.method3291((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	public void method430() {
		@Pc(6) Class151 local6 = this.aClass151_17;
		synchronized (this.aClass151_17) {
			this.aClass151_17.method3299();
		}
		local6 = this.aClass151_18;
		synchronized (this.aClass151_18) {
			this.aClass151_18.method3299();
		}
		local6 = this.aClass151_19;
		synchronized (this.aClass151_19) {
			this.aClass151_19.method3299();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	public void method431() {
		@Pc(2) Class151 local2 = this.aClass151_18;
		synchronized (this.aClass151_18) {
			this.aClass151_18.method3298();
		}
		local2 = this.aClass151_19;
		synchronized (this.aClass151_19) {
			this.aClass151_19.method3298();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
	public void method432(@OriginalArg(1) int arg0) {
		this.anInt497 = arg0;
		@Pc(15) Class151 local15 = this.aClass151_18;
		synchronized (this.aClass151_18) {
			this.aClass151_18.method3298();
		}
		local15 = this.aClass151_19;
		synchronized (this.aClass151_19) {
			this.aClass151_19.method3298();
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V")
	public void method434() {
		@Pc(6) Class151 local6 = this.aClass151_17;
		synchronized (this.aClass151_17) {
			this.aClass151_17.method3297(5);
		}
		local6 = this.aClass151_18;
		synchronized (this.aClass151_18) {
			this.aClass151_18.method3297(5);
		}
		local6 = this.aClass151_19;
		synchronized (this.aClass151_19) {
			this.aClass151_19.method3297(5);
		}
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
	public void method436() {
		@Pc(2) Class151 local2 = this.aClass151_17;
		synchronized (this.aClass151_17) {
			this.aClass151_17.method3298();
		}
		local2 = this.aClass151_18;
		synchronized (this.aClass151_18) {
			this.aClass151_18.method3298();
		}
		local2 = this.aClass151_19;
		synchronized (this.aClass151_19) {
			this.aClass151_19.method3298();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)V")
	public void method437(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean35 != arg0) {
			this.aBoolean35 = arg0;
			this.method436();
		}
	}
}
