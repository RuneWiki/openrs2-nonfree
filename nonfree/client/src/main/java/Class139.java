import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class139 {

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
	public int anInt3715;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "Z")
	public boolean aBoolean292 = false;

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "Lclient!mq;")
	private Class223 aClass223_20 = new Class223(64);

	@OriginalMember(owner = "client!hh", name = "s", descriptor = "Lclient!mq;")
	public final Class223 aClass223_21 = new Class223(500);

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "Lclient!mq;")
	public final Class223 aClass223_22 = new Class223(30);

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "Lclient!mq;")
	public final Class223 aClass223_23 = new Class223(50);

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "Z")
	public boolean aBoolean293;

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "Lclient!jn;")
	private final Class176 aClass176_53;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Lclient!jn;")
	public final Class176 aClass176_52;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!er;IZLclient!jn;Lclient!jn;)V")
	public Class139(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class176 arg3, @OriginalArg(4) Class176 arg4) {
		this.aBoolean293 = arg2;
		this.aClass176_53 = arg3;
		this.aClass176_52 = arg4;
		if (this.aClass176_53 != null) {
			@Pc(47) int local47 = this.aClass176_53.method3973() - 1;
			this.aClass176_53.method3999(local47);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
	public void method3308(@OriginalArg(1) int arg0) {
		this.anInt3715 = arg0;
		@Pc(9) Class223 local9 = this.aClass223_21;
		synchronized (this.aClass223_21) {
			this.aClass223_21.method5398();
		}
		local9 = this.aClass223_22;
		synchronized (this.aClass223_22) {
			this.aClass223_22.method5398();
		}
		local9 = this.aClass223_23;
		synchronized (this.aClass223_23) {
			this.aClass223_23.method5398();
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)Lclient!fga;")
	public Class101 method3309(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_20;
		@Pc(16) Class101 local16;
		synchronized (this.aClass223_20) {
			local16 = (Class101) this.aClass223_20.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class176 local29 = this.aClass176_53;
		@Pc(42) byte[] local42;
		synchronized (this.aClass176_53) {
			local42 = this.aClass176_53.method3994(Static203.method3439(arg0), Static502.method7384(arg0));
		}
		local16 = new Class101();
		local16.anInt2942 = arg0;
		local16.aClass139_3 = this;
		if (local42 != null) {
			local16.method2705(new Class4_Sub11(local42));
		}
		local16.method2709();
		if (local16.aBoolean218) {
			local16.aBoolean222 = false;
			local16.anInt2916 = 0;
		}
		if (!this.aBoolean293 && local16.aBoolean221) {
			local16.aStringArray18 = null;
			local16.anIntArray135 = null;
		}
		@Pc(107) Class223 local107 = this.aClass223_20;
		synchronized (this.aClass223_20) {
			this.aClass223_20.method5394(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)V")
	public void method3310() {
		@Pc(2) Class223 local2 = this.aClass223_20;
		synchronized (this.aClass223_20) {
			this.aClass223_20.method5399(5);
		}
		local2 = this.aClass223_21;
		synchronized (this.aClass223_21) {
			this.aClass223_21.method5399(5);
		}
		local2 = this.aClass223_22;
		synchronized (this.aClass223_22) {
			this.aClass223_22.method5399(5);
		}
		local2 = this.aClass223_23;
		synchronized (this.aClass223_23) {
			this.aClass223_23.method5399(5);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V")
	public void method3311(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean292 != arg0) {
			this.aBoolean292 = arg0;
			this.method3313();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
	public void method3312(@OriginalArg(0) int arg0) {
		this.aClass223_20 = new Class223(arg0);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public void method3313() {
		@Pc(2) Class223 local2 = this.aClass223_20;
		synchronized (this.aClass223_20) {
			this.aClass223_20.method5398();
		}
		local2 = this.aClass223_21;
		synchronized (this.aClass223_21) {
			this.aClass223_21.method5398();
		}
		local2 = this.aClass223_22;
		synchronized (this.aClass223_22) {
			this.aClass223_22.method5398();
		}
		local2 = this.aClass223_23;
		synchronized (this.aClass223_23) {
			this.aClass223_23.method5398();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public void method3315() {
		@Pc(2) Class223 local2 = this.aClass223_20;
		synchronized (this.aClass223_20) {
			this.aClass223_20.method5400();
		}
		local2 = this.aClass223_21;
		synchronized (this.aClass223_21) {
			this.aClass223_21.method5400();
		}
		local2 = this.aClass223_22;
		synchronized (this.aClass223_22) {
			this.aClass223_22.method5400();
		}
		local2 = this.aClass223_23;
		synchronized (this.aClass223_23) {
			this.aClass223_23.method5400();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BZ)V")
	public void method3316(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean293) {
			this.aBoolean293 = arg0;
			this.method3313();
		}
	}
}
