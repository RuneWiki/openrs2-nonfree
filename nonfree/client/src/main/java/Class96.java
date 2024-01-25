import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class96 {

	@OriginalMember(owner = "client!gv", name = "t", descriptor = "I")
	public int anInt2929;

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "Lclient!jv;")
	private final Class126 aClass126_16 = new Class126(64);

	@OriginalMember(owner = "client!gv", name = "r", descriptor = "Lclient!jv;")
	public final Class126 aClass126_17 = new Class126(50);

	@OriginalMember(owner = "client!gv", name = "s", descriptor = "Lclient!jv;")
	public final Class126 aClass126_18 = new Class126(5);

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "Lclient!bu;")
	public final Class32 aClass32_39;

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "Z")
	public boolean aBoolean267;

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "Lclient!bu;")
	private final Class32 aClass32_40;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!oq;IZLclient!bu;Lclient!bu;)V")
	public Class96(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class32 arg3, @OriginalArg(4) Class32 arg4) {
		this.aClass32_39 = arg4;
		this.aBoolean267 = arg2;
		this.aClass32_40 = arg3;
		if (this.aClass32_40 != null) {
			@Pc(38) int local38 = this.aClass32_40.method809() - 1;
			this.aClass32_40.method790(local38);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZZ)V")
	public void method2193(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean267 != arg0) {
			this.aBoolean267 = arg0;
			this.method2195();
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
	public void method2195() {
		@Pc(6) Class126 local6 = this.aClass126_16;
		synchronized (this.aClass126_16) {
			this.aClass126_16.method3135();
		}
		local6 = this.aClass126_17;
		synchronized (this.aClass126_17) {
			this.aClass126_17.method3135();
		}
		local6 = this.aClass126_18;
		synchronized (this.aClass126_18) {
			this.aClass126_18.method3135();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V")
	public void method2196() {
		@Pc(6) Class126 local6 = this.aClass126_16;
		synchronized (this.aClass126_16) {
			this.aClass126_16.method3140(5);
		}
		local6 = this.aClass126_17;
		synchronized (this.aClass126_17) {
			this.aClass126_17.method3140(5);
		}
		local6 = this.aClass126_18;
		synchronized (this.aClass126_18) {
			this.aClass126_18.method3140(5);
		}
	}

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "(I)V")
	public void method2197() {
		@Pc(6) Class126 local6 = this.aClass126_16;
		synchronized (this.aClass126_16) {
			this.aClass126_16.method3131();
		}
		local6 = this.aClass126_17;
		synchronized (this.aClass126_17) {
			this.aClass126_17.method3131();
		}
		local6 = this.aClass126_18;
		synchronized (this.aClass126_18) {
			this.aClass126_18.method3131();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BI)V")
	public void method2198(@OriginalArg(1) int arg0) {
		this.anInt2929 = arg0;
		@Pc(9) Class126 local9 = this.aClass126_17;
		synchronized (this.aClass126_17) {
			this.aClass126_17.method3135();
		}
		local9 = this.aClass126_18;
		synchronized (this.aClass126_18) {
			this.aClass126_18.method3135();
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(II)Lclient!da;")
	public Class47 method2199(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_16;
		@Pc(25) Class47 local25;
		synchronized (this.aClass126_16) {
			local25 = (Class47) this.aClass126_16.method3141((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(46) byte[] local46 = this.aClass32_40.method785(Static25.method591(arg0), Static140.method2192(arg0));
		local25 = new Class47();
		local25.anInt1584 = arg0;
		local25.aClass96_1 = this;
		if (local46 != null) {
			local25.method1248(new Class3_Sub7(local46));
		}
		local25.method1250();
		local6 = this.aClass126_16;
		synchronized (this.aClass126_16) {
			this.aClass126_16.method3132((long) arg0, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "(I)V")
	public void method2200() {
		@Pc(14) Class126 local14 = this.aClass126_17;
		synchronized (this.aClass126_17) {
			this.aClass126_17.method3135();
		}
		local14 = this.aClass126_18;
		synchronized (this.aClass126_18) {
			this.aClass126_18.method3135();
		}
	}
}
