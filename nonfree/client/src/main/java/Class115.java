import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class115 {

	@OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
	public int anInt2888;

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "Lclient!jk;")
	private final Class137 aClass137_25 = new Class137(64);

	@OriginalMember(owner = "client!hp", name = "p", descriptor = "Lclient!jk;")
	public final Class137 aClass137_26 = new Class137(50);

	@OriginalMember(owner = "client!hp", name = "r", descriptor = "Lclient!jk;")
	public final Class137 aClass137_27 = new Class137(5);

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "Lclient!qn;")
	public final Class211 aClass211_39;

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "Lclient!qn;")
	private final Class211 aClass211_40;

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "Lclient!ae;")
	public final Class6 aClass6_4;

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "Z")
	public boolean aBoolean217;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!ae;IZLclient!qn;Lclient!qn;)V")
	public Class115(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class211 arg3, @OriginalArg(4) Class211 arg4) {
		this.aClass211_39 = arg4;
		this.aClass211_40 = arg3;
		this.aClass6_4 = arg0;
		this.aBoolean217 = arg2;
		if (this.aClass211_40 != null) {
			@Pc(41) int local41 = this.aClass211_40.method4368() - 1;
			this.aClass211_40.method4365(local41);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V")
	public void method2198() {
		@Pc(6) Class137 local6 = this.aClass137_25;
		synchronized (this.aClass137_25) {
			this.aClass137_25.method2745(5);
		}
		local6 = this.aClass137_26;
		synchronized (this.aClass137_26) {
			this.aClass137_26.method2745(5);
		}
		local6 = this.aClass137_27;
		synchronized (this.aClass137_27) {
			this.aClass137_27.method2745(5);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI)V")
	public void method2200(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean217) {
			this.aBoolean217 = arg0;
			this.method2203();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)Lclient!fb;")
	public Class78 method2201(@OriginalArg(0) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_25;
		@Pc(16) Class78 local16;
		synchronized (this.aClass137_25) {
			local16 = (Class78) this.aClass137_25.method2744((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_40;
		@Pc(49) byte[] local49;
		synchronized (this.aClass211_40) {
			local49 = this.aClass211_40.method4377(Static290.method3784(arg0), Static321.method4248(arg0));
		}
		local16 = new Class78();
		local16.aClass115_1 = this;
		local16.anInt1899 = arg0;
		if (local49 != null) {
			local16.method1544(new Class4_Sub9(local49));
		}
		local16.method1545();
		@Pc(80) Class137 local80 = this.aClass137_25;
		synchronized (this.aClass137_25) {
			this.aClass137_25.method2732((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
	public void method2202() {
		@Pc(6) Class137 local6 = this.aClass137_26;
		synchronized (this.aClass137_26) {
			this.aClass137_26.method2739();
		}
		local6 = this.aClass137_27;
		synchronized (this.aClass137_27) {
			this.aClass137_27.method2739();
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
	public void method2203() {
		@Pc(2) Class137 local2 = this.aClass137_25;
		synchronized (this.aClass137_25) {
			this.aClass137_25.method2739();
		}
		local2 = this.aClass137_26;
		synchronized (this.aClass137_26) {
			this.aClass137_26.method2739();
		}
		local2 = this.aClass137_27;
		synchronized (this.aClass137_27) {
			this.aClass137_27.method2739();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)V")
	public void method2204(@OriginalArg(1) int arg0) {
		this.anInt2888 = arg0;
		@Pc(13) Class137 local13 = this.aClass137_26;
		synchronized (this.aClass137_26) {
			this.aClass137_26.method2739();
		}
		local13 = this.aClass137_27;
		synchronized (this.aClass137_27) {
			this.aClass137_27.method2739();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
	public void method2206() {
		@Pc(2) Class137 local2 = this.aClass137_25;
		synchronized (this.aClass137_25) {
			this.aClass137_25.method2737();
		}
		local2 = this.aClass137_26;
		synchronized (this.aClass137_26) {
			this.aClass137_26.method2737();
		}
		local2 = this.aClass137_27;
		synchronized (this.aClass137_27) {
			this.aClass137_27.method2737();
		}
	}
}
