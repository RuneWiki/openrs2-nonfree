import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class146 {

	@OriginalMember(owner = "client!il", name = "u", descriptor = "I")
	public int anInt4650;

	@OriginalMember(owner = "client!il", name = "m", descriptor = "Z")
	public boolean aBoolean300 = false;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "Lclient!vg;")
	private Class342 aClass342_84 = new Class342(64);

	@OriginalMember(owner = "client!il", name = "r", descriptor = "Lclient!vg;")
	public final Class342 aClass342_85 = new Class342(500);

	@OriginalMember(owner = "client!il", name = "s", descriptor = "Lclient!vg;")
	public final Class342 aClass342_86 = new Class342(30);

	@OriginalMember(owner = "client!il", name = "t", descriptor = "Lclient!vg;")
	public final Class342 aClass342_87 = new Class342(50);

	@OriginalMember(owner = "client!il", name = "k", descriptor = "Z")
	public boolean aBoolean299;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "Lclient!ri;")
	public final Class284 aClass284_70;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "Lclient!ri;")
	private final Class284 aClass284_71;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!ei;IZLclient!ri;Lclient!ri;)V")
	public Class146(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class284 arg3, @OriginalArg(4) Class284 arg4) {
		this.aBoolean299 = arg2;
		this.aClass284_70 = arg4;
		this.aClass284_71 = arg3;
		if (this.aClass284_71 != null) {
			@Pc(47) int local47 = this.aClass284_71.method6322() - 1;
			this.aClass284_71.method6354(local47);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
	public void method3719() {
		@Pc(6) Class342 local6 = this.aClass342_84;
		synchronized (this.aClass342_84) {
			this.aClass342_84.method7697(5);
		}
		local6 = this.aClass342_85;
		synchronized (this.aClass342_85) {
			this.aClass342_85.method7697(5);
		}
		local6 = this.aClass342_86;
		synchronized (this.aClass342_86) {
			this.aClass342_86.method7697(5);
		}
		local6 = this.aClass342_87;
		synchronized (this.aClass342_87) {
			this.aClass342_87.method7697(5);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)Lclient!lr;")
	public Class194 method3721(@OriginalArg(0) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_84;
		@Pc(16) Class194 local16;
		synchronized (this.aClass342_84) {
			local16 = (Class194) this.aClass342_84.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class284 local29 = this.aClass284_71;
		@Pc(46) byte[] local46;
		synchronized (this.aClass284_71) {
			local46 = this.aClass284_71.method6331(Static245.method3871(arg0), Static194.method3401(arg0));
		}
		local16 = new Class194();
		local16.anInt5827 = arg0;
		local16.aClass146_3 = this;
		if (local46 != null) {
			local16.method4705(new Class3_Sub26(local46));
		}
		local16.method4701();
		if (!this.aBoolean299 && local16.aBoolean395) {
			local16.aStringArray25 = null;
			local16.anIntArray284 = null;
		}
		if (local16.aBoolean394) {
			local16.aBoolean405 = false;
			local16.anInt5839 = 0;
		}
		@Pc(103) Class342 local103 = this.aClass342_84;
		synchronized (this.aClass342_84) {
			this.aClass342_84.method7683(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZB)V")
	public void method3722(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean300) {
			this.aBoolean300 = arg0;
			this.method3728();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)V")
	public void method3723(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean299 != arg0) {
			this.aBoolean299 = arg0;
			this.method3728();
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(IB)V")
	public void method3724(@OriginalArg(0) int arg0) {
		this.aClass342_84 = new Class342(arg0);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(II)V")
	public void method3725(@OriginalArg(1) int arg0) {
		this.anInt4650 = arg0;
		@Pc(9) Class342 local9 = this.aClass342_85;
		synchronized (this.aClass342_85) {
			this.aClass342_85.method7693();
		}
		local9 = this.aClass342_86;
		synchronized (this.aClass342_86) {
			this.aClass342_86.method7693();
		}
		local9 = this.aClass342_87;
		synchronized (this.aClass342_87) {
			this.aClass342_87.method7693();
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	public void method3727() {
		@Pc(6) Class342 local6 = this.aClass342_84;
		synchronized (this.aClass342_84) {
			this.aClass342_84.method7687();
		}
		local6 = this.aClass342_85;
		synchronized (this.aClass342_85) {
			this.aClass342_85.method7687();
		}
		local6 = this.aClass342_86;
		synchronized (this.aClass342_86) {
			this.aClass342_86.method7687();
		}
		local6 = this.aClass342_87;
		synchronized (this.aClass342_87) {
			this.aClass342_87.method7687();
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V")
	public void method3728() {
		@Pc(2) Class342 local2 = this.aClass342_84;
		synchronized (this.aClass342_84) {
			this.aClass342_84.method7693();
		}
		local2 = this.aClass342_85;
		synchronized (this.aClass342_85) {
			this.aClass342_85.method7693();
		}
		local2 = this.aClass342_86;
		synchronized (this.aClass342_86) {
			this.aClass342_86.method7693();
		}
		local2 = this.aClass342_87;
		synchronized (this.aClass342_87) {
			this.aClass342_87.method7693();
		}
	}
}
