import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vha")
public final class Class366 {

	@OriginalMember(owner = "client!vha", name = "r", descriptor = "I")
	public int anInt10077;

	@OriginalMember(owner = "client!vha", name = "m", descriptor = "Lclient!de;")
	private final Class69 aClass69_70 = new Class69(64);

	@OriginalMember(owner = "client!vha", name = "o", descriptor = "Lclient!de;")
	public final Class69 aClass69_71 = new Class69(50);

	@OriginalMember(owner = "client!vha", name = "q", descriptor = "Lclient!de;")
	public final Class69 aClass69_72 = new Class69(5);

	@OriginalMember(owner = "client!vha", name = "c", descriptor = "Lclient!nd;")
	public final Class238 aClass238_286;

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "Lclient!nd;")
	private final Class238 aClass238_285;

	@OriginalMember(owner = "client!vha", name = "j", descriptor = "Z")
	public boolean aBoolean727;

	@OriginalMember(owner = "client!vha", name = "g", descriptor = "Lclient!al;")
	public final Class17 aClass17_7;

	@OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Lclient!al;IZLclient!nd;Lclient!nd;)V")
	public Class366(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class238 arg3, @OriginalArg(4) Class238 arg4) {
		this.aClass238_286 = arg4;
		this.aClass238_285 = arg3;
		this.aBoolean727 = arg2;
		this.aClass17_7 = arg0;
		if (this.aClass238_285 != null) {
			@Pc(41) int local41 = this.aClass238_285.method5569() - 1;
			this.aClass238_285.method5592(local41);
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)V")
	public void method8550() {
		@Pc(6) Class69 local6 = this.aClass69_70;
		synchronized (this.aClass69_70) {
			this.aClass69_70.method1904();
		}
		local6 = this.aClass69_71;
		synchronized (this.aClass69_71) {
			this.aClass69_71.method1904();
		}
		@Pc(44) Class69 local44 = this.aClass69_72;
		synchronized (this.aClass69_72) {
			this.aClass69_72.method1904();
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IB)Lclient!fg;")
	public Class113 method8551(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_70;
		@Pc(16) Class113 local16;
		synchronized (this.aClass69_70) {
			local16 = (Class113) this.aClass69_70.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class238 local37 = this.aClass238_285;
		@Pc(50) byte[] local50;
		synchronized (this.aClass238_285) {
			local50 = this.aClass238_285.method5567(Static84.method1798(arg0), Static629.method8704(arg0));
		}
		local16 = new Class113();
		local16.anInt3211 = arg0;
		local16.aClass366_2 = this;
		if (local50 != null) {
			local16.method2748(new Class2_Sub17(local50));
		}
		local16.method2741();
		@Pc(81) Class69 local81 = this.aClass69_70;
		synchronized (this.aClass69_70) {
			this.aClass69_70.method1917((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)V")
	public void method8552() {
		@Pc(6) Class69 local6 = this.aClass69_70;
		synchronized (this.aClass69_70) {
			this.aClass69_70.method1905();
		}
		local6 = this.aClass69_71;
		synchronized (this.aClass69_71) {
			this.aClass69_71.method1905();
		}
		local6 = this.aClass69_72;
		synchronized (this.aClass69_72) {
			this.aClass69_72.method1905();
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(ZB)V")
	public void method8554(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean727 != arg0) {
			this.aBoolean727 = arg0;
			this.method8552();
		}
	}

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "(IB)V")
	public void method8555() {
		@Pc(2) Class69 local2 = this.aClass69_70;
		synchronized (this.aClass69_70) {
			this.aClass69_70.method1910(5);
		}
		local2 = this.aClass69_71;
		synchronized (this.aClass69_71) {
			this.aClass69_71.method1910(5);
		}
		local2 = this.aClass69_72;
		synchronized (this.aClass69_72) {
			this.aClass69_72.method1910(5);
		}
	}

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "(I)V")
	public void method8556() {
		@Pc(2) Class69 local2 = this.aClass69_71;
		synchronized (this.aClass69_71) {
			this.aClass69_71.method1905();
		}
		local2 = this.aClass69_72;
		synchronized (this.aClass69_72) {
			this.aClass69_72.method1905();
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(ZI)V")
	public void method8557(@OriginalArg(1) int arg0) {
		this.anInt10077 = arg0;
		@Pc(9) Class69 local9 = this.aClass69_71;
		synchronized (this.aClass69_71) {
			this.aClass69_71.method1905();
		}
		local9 = this.aClass69_72;
		synchronized (this.aClass69_72) {
			this.aClass69_72.method1905();
		}
	}
}
