import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class48 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!mq;")
	private final Class223 aClass223_10 = new Class223(64);

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "Lclient!mq;")
	private final Class223 aClass223_11 = new Class223(100);

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Lclient!jn;")
	private final Class176 aClass176_24;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;Lclient!jn;Lclient!jn;)V")
	public Class48(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) Class176 arg3, @OriginalArg(4) Class176 arg4) {
		this.aClass176_24 = arg2;
		if (this.aClass176_24 != null) {
			@Pc(26) int local26 = this.aClass176_24.method3973() - 1;
			this.aClass176_24.method3999(local26);
		}
		Static350.method5650(arg3, arg4);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public void method1011() {
		@Pc(2) Class223 local2 = this.aClass223_10;
		synchronized (this.aClass223_10) {
			this.aClass223_10.method5398();
		}
		local2 = this.aClass223_11;
		synchronized (this.aClass223_11) {
			this.aClass223_11.method5398();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
	public void method1012() {
		@Pc(2) Class223 local2 = this.aClass223_10;
		synchronized (this.aClass223_10) {
			this.aClass223_10.method5400();
		}
		local2 = this.aClass223_11;
		synchronized (this.aClass223_11) {
			this.aClass223_11.method5400();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lclient!bca;")
	public Class4_Sub5_Sub2 method1013(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_11;
		synchronized (this.aClass223_11) {
			@Pc(16) Class4_Sub5_Sub2 local16 = (Class4_Sub5_Sub2) this.aClass223_11.method5388((long) arg0);
			if (local16 == null) {
				local16 = new Class4_Sub5_Sub2(arg0);
				this.aClass223_11.method5394(local16, (long) arg0);
			}
			return local16.method440() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V")
	public void method1014() {
		@Pc(2) Class223 local2 = this.aClass223_10;
		synchronized (this.aClass223_10) {
			this.aClass223_10.method5399(5);
		}
		local2 = this.aClass223_11;
		synchronized (this.aClass223_11) {
			this.aClass223_11.method5399(5);
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)Lclient!wt;")
	public Class365 method1016(@OriginalArg(0) int arg0) {
		@Pc(11) Class223 local11 = this.aClass223_10;
		@Pc(21) Class365 local21;
		synchronized (this.aClass223_10) {
			local21 = (Class365) this.aClass223_10.method5388((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class176 local34 = this.aClass176_24;
		@Pc(47) byte[] local47;
		synchronized (this.aClass176_24) {
			local47 = this.aClass176_24.method3994(Static84.method1553(arg0), Static386.method6102(arg0));
		}
		local21 = new Class365();
		local21.aClass48_2 = this;
		local21.anInt10214 = arg0;
		if (local47 != null) {
			local21.method8359(new Class4_Sub11(local47));
		}
		local21.method8363();
		@Pc(78) Class223 local78 = this.aClass223_10;
		synchronized (this.aClass223_10) {
			this.aClass223_10.method5394(local21, (long) arg0);
			return local21;
		}
	}
}
