import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class75 {

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
	public int anInt1954;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Z")
	public boolean aBoolean228 = false;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!hn;")
	private Class102 aClass102_14 = new Class102(64);

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "Lclient!hn;")
	public final Class102 aClass102_15 = new Class102(500);

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Lclient!hn;")
	public final Class102 aClass102_16 = new Class102(30);

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "Lclient!hn;")
	public final Class102 aClass102_17 = new Class102(50);

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Z")
	public boolean aBoolean227;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Lclient!fo;")
	private final Class82 aClass82_26;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "Lclient!fo;")
	public final Class82 aClass82_25;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!d;IZLclient!fo;Lclient!fo;)V")
	public Class75(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class82 arg3, @OriginalArg(4) Class82 arg4) {
		this.aBoolean227 = arg2;
		this.aClass82_26 = arg3;
		this.aClass82_25 = arg4;
		if (this.aClass82_26 != null) {
			@Pc(47) int local47 = this.aClass82_26.method1825() - 1;
			this.aClass82_26.method1823(local47);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public void method1608() {
		@Pc(2) Class102 local2 = this.aClass102_14;
		synchronized (this.aClass102_14) {
			this.aClass102_14.method2260();
		}
		local2 = this.aClass102_15;
		synchronized (this.aClass102_15) {
			this.aClass102_15.method2260();
		}
		local2 = this.aClass102_16;
		synchronized (this.aClass102_16) {
			this.aClass102_16.method2260();
		}
		local2 = this.aClass102_17;
		synchronized (this.aClass102_17) {
			this.aClass102_17.method2260();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public void method1610() {
		@Pc(6) Class102 local6 = this.aClass102_14;
		synchronized (this.aClass102_14) {
			this.aClass102_14.method2262(5);
		}
		local6 = this.aClass102_15;
		synchronized (this.aClass102_15) {
			this.aClass102_15.method2262(5);
		}
		local6 = this.aClass102_16;
		synchronized (this.aClass102_16) {
			this.aClass102_16.method2262(5);
		}
		local6 = this.aClass102_17;
		synchronized (this.aClass102_17) {
			this.aClass102_17.method2262(5);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)V")
	public void method1612(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean228 != arg0) {
			this.aBoolean228 = arg0;
			this.method1618();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)V")
	public void method1614(@OriginalArg(1) int arg0) {
		this.aClass102_14 = new Class102(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)V")
	public void method1615(@OriginalArg(0) int arg0) {
		this.anInt1954 = arg0;
		@Pc(9) Class102 local9 = this.aClass102_15;
		synchronized (this.aClass102_15) {
			this.aClass102_15.method2271();
		}
		local9 = this.aClass102_16;
		synchronized (this.aClass102_16) {
			this.aClass102_16.method2271();
		}
		local9 = this.aClass102_17;
		synchronized (this.aClass102_17) {
			this.aClass102_17.method2271();
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(II)Lclient!er;")
	public Class68 method1616(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_14;
		@Pc(18) Class68 local18;
		synchronized (this.aClass102_14) {
			local18 = (Class68) this.aClass102_14.method2258((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class82 local31 = this.aClass82_26;
		@Pc(46) byte[] local46;
		synchronized (this.aClass82_26) {
			local46 = this.aClass82_26.method1817(Static420.method5577(arg0), Static294.method4025(arg0));
		}
		local18 = new Class68();
		local18.anInt1787 = arg0;
		local18.aClass75_1 = this;
		if (local46 != null) {
			local18.method1544(new Class1_Sub28(local46));
		}
		local18.method1546();
		if (local18.aBoolean213) {
			local18.aBoolean212 = false;
			local18.anInt1831 = 0;
		}
		if (!this.aBoolean227 && local18.aBoolean215) {
			local18.aStringArray12 = null;
			local18.anIntArray126 = null;
		}
		@Pc(106) Class102 local106 = this.aClass102_14;
		synchronized (this.aClass102_14) {
			this.aClass102_14.method2272((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZZ)V")
	public void method1617(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean227) {
			this.aBoolean227 = arg0;
			this.method1618();
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	public void method1618() {
		@Pc(2) Class102 local2 = this.aClass102_14;
		synchronized (this.aClass102_14) {
			this.aClass102_14.method2271();
		}
		local2 = this.aClass102_15;
		synchronized (this.aClass102_15) {
			this.aClass102_15.method2271();
		}
		local2 = this.aClass102_16;
		synchronized (this.aClass102_16) {
			this.aClass102_16.method2271();
		}
		local2 = this.aClass102_17;
		synchronized (this.aClass102_17) {
			this.aClass102_17.method2271();
		}
	}
}
