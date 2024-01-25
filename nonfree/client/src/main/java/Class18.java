import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class18 {

	@OriginalMember(owner = "client!at", name = "x", descriptor = "I")
	public int anInt435;

	@OriginalMember(owner = "client!at", name = "f", descriptor = "Z")
	public boolean aBoolean27 = false;

	@OriginalMember(owner = "client!at", name = "c", descriptor = "Lclient!sw;")
	private Class277 aClass277_6 = new Class277(64);

	@OriginalMember(owner = "client!at", name = "t", descriptor = "Lclient!sw;")
	public final Class277 aClass277_7 = new Class277(500);

	@OriginalMember(owner = "client!at", name = "v", descriptor = "Lclient!sw;")
	public final Class277 aClass277_8 = new Class277(30);

	@OriginalMember(owner = "client!at", name = "w", descriptor = "Lclient!sw;")
	public final Class277 aClass277_9 = new Class277(50);

	@OriginalMember(owner = "client!at", name = "r", descriptor = "Lclient!dn;")
	public final Class69 aClass69_8;

	@OriginalMember(owner = "client!at", name = "g", descriptor = "Z")
	public boolean aBoolean28;

	@OriginalMember(owner = "client!at", name = "k", descriptor = "Lclient!dn;")
	private final Class69 aClass69_7;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!re;IZLclient!dn;Lclient!dn;)V")
	public Class18(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class69 arg3, @OriginalArg(4) Class69 arg4) {
		this.aClass69_8 = arg4;
		this.aBoolean28 = arg2;
		this.aClass69_7 = arg3;
		if (this.aClass69_7 != null) {
			@Pc(47) int local47 = this.aClass69_7.method1895() - 1;
			this.aClass69_7.method1884(local47);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IZ)V")
	public void method597(@OriginalArg(0) int arg0) {
		this.anInt435 = arg0;
		@Pc(9) Class277 local9 = this.aClass277_7;
		synchronized (this.aClass277_7) {
			this.aClass277_7.method7019();
		}
		local9 = this.aClass277_8;
		synchronized (this.aClass277_8) {
			this.aClass277_8.method7019();
		}
		local9 = this.aClass277_9;
		synchronized (this.aClass277_9) {
			this.aClass277_9.method7019();
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
	public void method599() {
		@Pc(6) Class277 local6 = this.aClass277_6;
		synchronized (this.aClass277_6) {
			this.aClass277_6.method7019();
		}
		local6 = this.aClass277_7;
		synchronized (this.aClass277_7) {
			this.aClass277_7.method7019();
		}
		local6 = this.aClass277_8;
		synchronized (this.aClass277_8) {
			this.aClass277_8.method7019();
		}
		local6 = this.aClass277_9;
		synchronized (this.aClass277_9) {
			this.aClass277_9.method7019();
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V")
	public void method600(@OriginalArg(1) int arg0) {
		this.aClass277_6 = new Class277(arg0);
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(IZ)V")
	public void method602(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean28) {
			this.aBoolean28 = arg0;
			this.method599();
		}
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(I)V")
	public void method603() {
		@Pc(2) Class277 local2 = this.aClass277_6;
		synchronized (this.aClass277_6) {
			this.aClass277_6.method7026();
		}
		local2 = this.aClass277_7;
		synchronized (this.aClass277_7) {
			this.aClass277_7.method7026();
		}
		local2 = this.aClass277_8;
		synchronized (this.aClass277_8) {
			this.aClass277_8.method7026();
		}
		local2 = this.aClass277_9;
		synchronized (this.aClass277_9) {
			this.aClass277_9.method7026();
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IB)V")
	public void method604() {
		@Pc(12) Class277 local12 = this.aClass277_6;
		synchronized (this.aClass277_6) {
			this.aClass277_6.method7018(5);
		}
		local12 = this.aClass277_7;
		synchronized (this.aClass277_7) {
			this.aClass277_7.method7018(5);
		}
		local12 = this.aClass277_8;
		synchronized (this.aClass277_8) {
			this.aClass277_8.method7018(5);
		}
		local12 = this.aClass277_9;
		synchronized (this.aClass277_9) {
			this.aClass277_9.method7018(5);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZB)V")
	public void method605(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean27) {
			this.aBoolean27 = arg0;
			this.method599();
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZI)Lclient!cn;")
	public Class51 method609(@OriginalArg(1) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_6;
		@Pc(16) Class51 local16;
		synchronized (this.aClass277_6) {
			local16 = (Class51) this.aClass277_6.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class69 local29 = this.aClass69_7;
		@Pc(42) byte[] local42;
		synchronized (this.aClass69_7) {
			local42 = this.aClass69_7.method1888(Static494.method7577(arg0), Static170.method3195(arg0));
		}
		local16 = new Class51();
		local16.aClass18_1 = this;
		local16.anInt1646 = arg0;
		if (local42 != null) {
			local16.method1614(new Class1_Sub17(local42));
		}
		local16.method1626();
		if (local16.aBoolean139) {
			local16.anInt1649 = 0;
			local16.aBoolean133 = false;
		}
		if (!this.aBoolean28 && local16.aBoolean134) {
			local16.anIntArray106 = null;
			local16.aStringArray5 = null;
		}
		@Pc(94) Class277 local94 = this.aClass277_6;
		synchronized (this.aClass277_6) {
			this.aClass277_6.method7016(local16, (long) arg0);
			return local16;
		}
	}
}
