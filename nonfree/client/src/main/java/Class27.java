import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class27 {

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
	public int anInt617;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!vh;")
	private Class330 aClass330_9 = new Class330(64);

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "Lclient!vh;")
	public final Class330 aClass330_10 = new Class330(500);

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "Lclient!vh;")
	public final Class330 aClass330_11 = new Class330(30);

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "Lclient!vh;")
	public final Class330 aClass330_12 = new Class330(50);

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Z")
	public boolean aBoolean34;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "Lclient!pj;")
	public final Class248 aClass248_7;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Lclient!pj;")
	private final Class248 aClass248_6;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!dd;IZLclient!pj;Lclient!pj;)V")
	public Class27(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class248 arg3, @OriginalArg(4) Class248 arg4) {
		this.aBoolean34 = arg2;
		this.aClass248_7 = arg4;
		this.aClass248_6 = arg3;
		if (this.aClass248_6 != null) {
			@Pc(47) int local47 = this.aClass248_6.method5774() - 1;
			this.aClass248_6.method5793(local47);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public void method515() {
		@Pc(2) Class330 local2 = this.aClass330_9;
		synchronized (this.aClass330_9) {
			this.aClass330_9.method7688();
		}
		local2 = this.aClass330_10;
		synchronized (this.aClass330_10) {
			this.aClass330_10.method7688();
		}
		local2 = this.aClass330_11;
		synchronized (this.aClass330_11) {
			this.aClass330_11.method7688();
		}
		local2 = this.aClass330_12;
		synchronized (this.aClass330_12) {
			this.aClass330_12.method7688();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)Lclient!lt;")
	public Class192 method516(@OriginalArg(0) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_9;
		@Pc(16) Class192 local16;
		synchronized (this.aClass330_9) {
			local16 = (Class192) this.aClass330_9.method7677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class248 local29 = this.aClass248_6;
		@Pc(42) byte[] local42;
		synchronized (this.aClass248_6) {
			local42 = this.aClass248_6.method5797(Static29.method7390(arg0), Static92.method1385(arg0));
		}
		local16 = new Class192();
		local16.anInt5600 = arg0;
		local16.aClass27_4 = this;
		if (local42 != null) {
			local16.method4595(new Class6_Sub12(local42));
		}
		local16.method4583();
		if (!this.aBoolean34 && local16.aBoolean393) {
			local16.aStringArray25 = null;
			local16.anIntArray426 = null;
		}
		if (local16.aBoolean387) {
			local16.aBoolean396 = false;
			local16.anInt5604 = 0;
		}
		@Pc(94) Class330 local94 = this.aClass330_9;
		synchronized (this.aClass330_9) {
			this.aClass330_9.method7676(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	public void method517() {
		@Pc(6) Class330 local6 = this.aClass330_9;
		synchronized (this.aClass330_9) {
			this.aClass330_9.method7680(5);
		}
		local6 = this.aClass330_10;
		synchronized (this.aClass330_10) {
			this.aClass330_10.method7680(5);
		}
		local6 = this.aClass330_11;
		synchronized (this.aClass330_11) {
			this.aClass330_11.method7680(5);
		}
		local6 = this.aClass330_12;
		synchronized (this.aClass330_12) {
			this.aClass330_12.method7680(5);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BZ)V")
	public void method518(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean35 != arg0) {
			this.aBoolean35 = arg0;
			this.method515();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZB)V")
	public void method520(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean34) {
			this.aBoolean34 = arg0;
			this.method515();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V")
	public void method521(@OriginalArg(1) int arg0) {
		this.anInt617 = arg0;
		@Pc(9) Class330 local9 = this.aClass330_10;
		synchronized (this.aClass330_10) {
			this.aClass330_10.method7688();
		}
		local9 = this.aClass330_11;
		synchronized (this.aClass330_11) {
			this.aClass330_11.method7688();
		}
		local9 = this.aClass330_12;
		synchronized (this.aClass330_12) {
			this.aClass330_12.method7688();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public void method522() {
		@Pc(2) Class330 local2 = this.aClass330_9;
		synchronized (this.aClass330_9) {
			this.aClass330_9.method7678();
		}
		local2 = this.aClass330_10;
		synchronized (this.aClass330_10) {
			this.aClass330_10.method7678();
		}
		local2 = this.aClass330_11;
		synchronized (this.aClass330_11) {
			this.aClass330_11.method7678();
		}
		local2 = this.aClass330_12;
		synchronized (this.aClass330_12) {
			this.aClass330_12.method7678();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
	public void method523(@OriginalArg(1) int arg0) {
		this.aClass330_9 = new Class330(arg0);
	}
}
