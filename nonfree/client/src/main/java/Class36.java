import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public final class Class36 {

	@OriginalMember(owner = "client!bha", name = "w", descriptor = "I")
	public int anInt975;

	@OriginalMember(owner = "client!bha", name = "r", descriptor = "Lclient!jda;")
	private final Class165 aClass165_7 = new Class165(64);

	@OriginalMember(owner = "client!bha", name = "s", descriptor = "Lclient!jda;")
	public final Class165 aClass165_8 = new Class165(50);

	@OriginalMember(owner = "client!bha", name = "v", descriptor = "Lclient!jda;")
	public final Class165 aClass165_9 = new Class165(5);

	@OriginalMember(owner = "client!bha", name = "f", descriptor = "Lclient!gia;")
	public final Class118 aClass118_1;

	@OriginalMember(owner = "client!bha", name = "n", descriptor = "Z")
	public boolean aBoolean71;

	@OriginalMember(owner = "client!bha", name = "o", descriptor = "Lclient!aj;")
	private final Class15 aClass15_15;

	@OriginalMember(owner = "client!bha", name = "j", descriptor = "Lclient!aj;")
	public final Class15 aClass15_14;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lclient!gia;IZLclient!aj;Lclient!aj;)V")
	public Class36(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class15 arg3, @OriginalArg(4) Class15 arg4) {
		this.aClass118_1 = arg0;
		this.aBoolean71 = arg2;
		this.aClass15_15 = arg3;
		this.aClass15_14 = arg4;
		if (this.aClass15_15 != null) {
			@Pc(41) int local41 = this.aClass15_15.method516() - 1;
			this.aClass15_15.method512(local41);
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(BI)Lclient!rea;")
	public Class300 method1057(@OriginalArg(1) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_7;
		@Pc(16) Class300 local16;
		synchronized (this.aClass165_7) {
			local16 = (Class300) this.aClass165_7.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class15 local29 = this.aClass15_15;
		@Pc(42) byte[] local42;
		synchronized (this.aClass15_15) {
			local42 = this.aClass15_15.method517(Static122.method2322(arg0), Static117.method2217(arg0));
		}
		local16 = new Class300();
		local16.aClass36_1 = this;
		local16.anInt8333 = arg0;
		if (local42 != null) {
			local16.method7263(new Class3_Sub25(local42));
		}
		local16.method7259();
		@Pc(81) Class165 local81 = this.aClass165_7;
		synchronized (this.aClass165_7) {
			this.aClass165_7.method4392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(II)V")
	public void method1058(@OriginalArg(0) int arg0) {
		this.anInt975 = arg0;
		@Pc(9) Class165 local9 = this.aClass165_8;
		synchronized (this.aClass165_8) {
			this.aClass165_8.method4403();
		}
		local9 = this.aClass165_9;
		synchronized (this.aClass165_9) {
			this.aClass165_9.method4403();
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)V")
	public void method1059() {
		@Pc(2) Class165 local2 = this.aClass165_8;
		synchronized (this.aClass165_8) {
			this.aClass165_8.method4403();
		}
		local2 = this.aClass165_9;
		synchronized (this.aClass165_9) {
			this.aClass165_9.method4403();
		}
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(B)V")
	public void method1061() {
		@Pc(6) Class165 local6 = this.aClass165_7;
		synchronized (this.aClass165_7) {
			this.aClass165_7.method4400();
		}
		local6 = this.aClass165_8;
		synchronized (this.aClass165_8) {
			this.aClass165_8.method4400();
		}
		local6 = this.aClass165_9;
		synchronized (this.aClass165_9) {
			this.aClass165_9.method4400();
		}
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(II)V")
	public void method1062() {
		@Pc(2) Class165 local2 = this.aClass165_7;
		synchronized (this.aClass165_7) {
			this.aClass165_7.method4394(5);
		}
		local2 = this.aClass165_8;
		synchronized (this.aClass165_8) {
			this.aClass165_8.method4394(5);
		}
		local2 = this.aClass165_9;
		synchronized (this.aClass165_9) {
			this.aClass165_9.method4394(5);
		}
	}

	@OriginalMember(owner = "client!bha", name = "c", descriptor = "(I)V")
	public void method1064() {
		@Pc(6) Class165 local6 = this.aClass165_7;
		synchronized (this.aClass165_7) {
			this.aClass165_7.method4403();
		}
		@Pc(29) Class165 local29 = this.aClass165_8;
		synchronized (this.aClass165_8) {
			this.aClass165_8.method4403();
		}
		local29 = this.aClass165_9;
		synchronized (this.aClass165_9) {
			this.aClass165_9.method4403();
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(BZ)V")
	public void method1065(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean71) {
			this.aBoolean71 = arg0;
			this.method1064();
		}
	}
}
