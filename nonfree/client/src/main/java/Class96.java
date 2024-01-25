import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class96 {

	@OriginalMember(owner = "client!eu", name = "t", descriptor = "I")
	public int anInt2447;

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "Z")
	public boolean aBoolean188 = false;

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "Lclient!mf;")
	private Class222 aClass222_10 = new Class222(64);

	@OriginalMember(owner = "client!eu", name = "q", descriptor = "Lclient!mf;")
	public final Class222 aClass222_11 = new Class222(500);

	@OriginalMember(owner = "client!eu", name = "r", descriptor = "Lclient!mf;")
	public final Class222 aClass222_12 = new Class222(30);

	@OriginalMember(owner = "client!eu", name = "s", descriptor = "Lclient!mf;")
	public final Class222 aClass222_13 = new Class222(50);

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "Lclient!pu;")
	public final Class270 aClass270_26;

	@OriginalMember(owner = "client!eu", name = "m", descriptor = "Lclient!pu;")
	private final Class270 aClass270_27;

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "Z")
	public boolean aBoolean189;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!kr;IZLclient!pu;Lclient!pu;)V")
	public Class96(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class270 arg3, @OriginalArg(4) Class270 arg4) {
		this.aClass270_26 = arg4;
		this.aClass270_27 = arg3;
		this.aBoolean189 = arg2;
		if (this.aClass270_27 != null) {
			@Pc(47) int local47 = this.aClass270_27.method5674() - 1;
			this.aClass270_27.method5685(local47);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
	public void method1924() {
		@Pc(2) Class222 local2 = this.aClass222_10;
		synchronized (this.aClass222_10) {
			this.aClass222_10.method4422();
		}
		local2 = this.aClass222_11;
		synchronized (this.aClass222_11) {
			this.aClass222_11.method4422();
		}
		local2 = this.aClass222_12;
		synchronized (this.aClass222_12) {
			this.aClass222_12.method4422();
		}
		local2 = this.aClass222_13;
		synchronized (this.aClass222_13) {
			this.aClass222_13.method4422();
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI)Lclient!et;")
	public Class95 method1925(@OriginalArg(1) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_10;
		@Pc(16) Class95 local16;
		synchronized (this.aClass222_10) {
			local16 = (Class95) this.aClass222_10.method4430((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class270 local29 = this.aClass270_27;
		@Pc(42) byte[] local42;
		synchronized (this.aClass270_27) {
			local42 = this.aClass270_27.method5704(Static575.method7733(arg0), Static455.method6286(arg0));
		}
		local16 = new Class95();
		local16.lb = arg0;
		local16.aClass96_1 = this;
		if (local42 != null) {
			local16.method1906(new Class1_Sub35(local42));
		}
		local16.method1919();
		if (!this.aBoolean189 && local16.aBoolean174) {
			local16.anIntArray207 = null;
			local16.aStringArray14 = null;
		}
		if (local16.aBoolean186) {
			local16.aBoolean178 = false;
			local16.anInt2428 = 0;
		}
		@Pc(100) Class222 local100 = this.aClass222_10;
		synchronized (this.aClass222_10) {
			this.aClass222_10.method4434(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZ)V")
	public void method1927(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean189) {
			this.aBoolean189 = arg0;
			this.method1929();
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
	public void method1928(@OriginalArg(0) int arg0) {
		this.aClass222_10 = new Class222(arg0);
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
	public void method1929() {
		@Pc(6) Class222 local6 = this.aClass222_10;
		synchronized (this.aClass222_10) {
			this.aClass222_10.method4428();
		}
		local6 = this.aClass222_11;
		synchronized (this.aClass222_11) {
			this.aClass222_11.method4428();
		}
		local6 = this.aClass222_12;
		synchronized (this.aClass222_12) {
			this.aClass222_12.method4428();
		}
		local6 = this.aClass222_13;
		synchronized (this.aClass222_13) {
			this.aClass222_13.method4428();
		}
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(BI)V")
	public void method1930() {
		@Pc(2) Class222 local2 = this.aClass222_10;
		synchronized (this.aClass222_10) {
			this.aClass222_10.method4433(5);
		}
		local2 = this.aClass222_11;
		synchronized (this.aClass222_11) {
			this.aClass222_11.method4433(5);
		}
		local2 = this.aClass222_12;
		synchronized (this.aClass222_12) {
			this.aClass222_12.method4433(5);
		}
		local2 = this.aClass222_13;
		synchronized (this.aClass222_13) {
			this.aClass222_13.method4433(5);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BZ)V")
	public void method1931(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean188) {
			this.aBoolean188 = arg0;
			this.method1929();
		}
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(II)V")
	public void method1932(@OriginalArg(0) int arg0) {
		this.anInt2447 = arg0;
		@Pc(17) Class222 local17 = this.aClass222_11;
		synchronized (this.aClass222_11) {
			this.aClass222_11.method4428();
		}
		local17 = this.aClass222_12;
		synchronized (this.aClass222_12) {
			this.aClass222_12.method4428();
		}
		local17 = this.aClass222_13;
		synchronized (this.aClass222_13) {
			this.aClass222_13.method4428();
		}
	}
}
