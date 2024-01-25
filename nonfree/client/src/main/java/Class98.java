import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class98 {

	@OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
	public int anInt2775;

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "Lclient!jo;")
	private final Class126 aClass126_20 = new Class126(64);

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "Lclient!jo;")
	public final Class126 aClass126_21 = new Class126(50);

	@OriginalMember(owner = "client!gu", name = "p", descriptor = "Lclient!jo;")
	public final Class126 aClass126_22 = new Class126(5);

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "Lclient!kr;")
	public final Class137 aClass137_2;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "Z")
	public boolean aBoolean170;

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "Lclient!ok;")
	private final Class178 aClass178_42;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "Lclient!ok;")
	public final Class178 aClass178_43;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!kr;IZLclient!ok;Lclient!ok;)V")
	public Class98(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class178 arg3, @OriginalArg(4) Class178 arg4) {
		this.aClass137_2 = arg0;
		this.aBoolean170 = arg2;
		this.aClass178_42 = arg3;
		this.aClass178_43 = arg4;
		if (this.aClass178_42 != null) {
			@Pc(41) int local41 = this.aClass178_42.method3832() - 1;
			this.aClass178_42.method3833(local41);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BZ)V")
	public void method2235(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean170) {
			this.aBoolean170 = arg0;
			this.method2239();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZ)V")
	public void method2236() {
		@Pc(2) Class126 local2 = this.aClass126_20;
		synchronized (this.aClass126_20) {
			this.aClass126_20.method2828(5);
		}
		local2 = this.aClass126_21;
		synchronized (this.aClass126_21) {
			this.aClass126_21.method2828(5);
		}
		local2 = this.aClass126_22;
		synchronized (this.aClass126_22) {
			this.aClass126_22.method2828(5);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
	public void method2237() {
		@Pc(6) Class126 local6 = this.aClass126_20;
		synchronized (this.aClass126_20) {
			this.aClass126_20.method2821();
		}
		local6 = this.aClass126_21;
		synchronized (this.aClass126_21) {
			this.aClass126_21.method2821();
		}
		local6 = this.aClass126_22;
		synchronized (this.aClass126_22) {
			this.aClass126_22.method2821();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	public void method2239() {
		@Pc(6) Class126 local6 = this.aClass126_20;
		synchronized (this.aClass126_20) {
			this.aClass126_20.method2827();
		}
		local6 = this.aClass126_21;
		synchronized (this.aClass126_21) {
			this.aClass126_21.method2827();
		}
		local6 = this.aClass126_22;
		synchronized (this.aClass126_22) {
			this.aClass126_22.method2827();
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
	public void method2240() {
		@Pc(2) Class126 local2 = this.aClass126_21;
		synchronized (this.aClass126_21) {
			this.aClass126_21.method2827();
		}
		local2 = this.aClass126_22;
		synchronized (this.aClass126_22) {
			this.aClass126_22.method2827();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)Lclient!up;")
	public Class249 method2241(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_20;
		@Pc(16) Class249 local16;
		synchronized (this.aClass126_20) {
			local16 = (Class249) this.aClass126_20.method2822((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class178 local37 = this.aClass178_42;
		@Pc(50) byte[] local50;
		synchronized (this.aClass178_42) {
			local50 = this.aClass178_42.method3838(Static195.method2809(arg0), Static92.method1636(arg0));
		}
		local16 = new Class249();
		local16.lb = this;
		local16.anInt6539 = arg0;
		if (local50 != null) {
			local16.method5170(new Class7_Sub14(local50));
		}
		local16.method5171();
		@Pc(81) Class126 local81 = this.aClass126_20;
		synchronized (this.aClass126_20) {
			this.aClass126_20.method2824((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)V")
	public void method2242(@OriginalArg(1) int arg0) {
		this.anInt2775 = arg0;
		@Pc(9) Class126 local9 = this.aClass126_21;
		synchronized (this.aClass126_21) {
			this.aClass126_21.method2827();
		}
		local9 = this.aClass126_22;
		synchronized (this.aClass126_22) {
			this.aClass126_22.method2827();
		}
	}
}
