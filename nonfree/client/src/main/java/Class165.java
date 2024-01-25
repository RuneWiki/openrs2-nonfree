import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class165 {

	@OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
	public int anInt4722;

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "Z")
	public boolean aBoolean340 = false;

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "Lclient!nj;")
	private Class171 aClass171_41 = new Class171(64);

	@OriginalMember(owner = "client!mq", name = "s", descriptor = "Lclient!nj;")
	public final Class171 aClass171_42 = new Class171(500);

	@OriginalMember(owner = "client!mq", name = "t", descriptor = "Lclient!nj;")
	public final Class171 aClass171_43 = new Class171(30);

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "Lclient!nj;")
	public final Class171 aClass171_44 = new Class171(50);

	@OriginalMember(owner = "client!mq", name = "r", descriptor = "Lclient!mg;")
	public final Class160 aClass160_52;

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "Z")
	public boolean aBoolean341;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "Lclient!mg;")
	private final Class160 aClass160_51;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!al;IZLclient!mg;Lclient!mg;)V")
	public Class165(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class160 arg3, @OriginalArg(4) Class160 arg4) {
		this.aClass160_52 = arg4;
		this.aBoolean341 = arg2;
		this.aClass160_51 = arg3;
		if (this.aClass160_51 != null) {
			@Pc(47) int local47 = this.aClass160_51.method3715() - 1;
			this.aClass160_51.method3722(local47);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
	public void method3798() {
		@Pc(2) Class171 local2 = this.aClass171_41;
		synchronized (this.aClass171_41) {
			this.aClass171_41.method3933(5);
		}
		local2 = this.aClass171_42;
		synchronized (this.aClass171_42) {
			this.aClass171_42.method3933(5);
		}
		local2 = this.aClass171_43;
		synchronized (this.aClass171_43) {
			this.aClass171_43.method3933(5);
		}
		local2 = this.aClass171_44;
		synchronized (this.aClass171_44) {
			this.aClass171_44.method3933(5);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZ)Lclient!jo;")
	public Class134 method3799(@OriginalArg(0) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_41;
		@Pc(16) Class134 local16;
		synchronized (this.aClass171_41) {
			local16 = (Class134) this.aClass171_41.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass160_51.method3696(Static136.method2316(arg0), Static267.method5787(arg0));
		local16 = new Class134();
		local16.anInt3648 = arg0;
		local16.aClass165_3 = this;
		if (local37 != null) {
			local16.method2967(new Class2_Sub23(local37));
		}
		local16.method2982();
		if (local16.lb) {
			local16.aBoolean279 = false;
			local16.anInt3672 = 0;
		}
		if (!this.aBoolean341 && local16.aBoolean274) {
			local16.aStringArray25 = null;
			local16.anIntArray323 = null;
		}
		@Pc(83) Class171 local83 = this.aClass171_41;
		synchronized (this.aClass171_41) {
			this.aClass171_41.method3940((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)V")
	public void method3800(@OriginalArg(1) int arg0) {
		this.aClass171_41 = new Class171(arg0);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	public void method3801() {
		@Pc(2) Class171 local2 = this.aClass171_41;
		synchronized (this.aClass171_41) {
			this.aClass171_41.method3936();
		}
		local2 = this.aClass171_42;
		synchronized (this.aClass171_42) {
			this.aClass171_42.method3936();
		}
		local2 = this.aClass171_43;
		synchronized (this.aClass171_43) {
			this.aClass171_43.method3936();
		}
		local2 = this.aClass171_44;
		synchronized (this.aClass171_44) {
			this.aClass171_44.method3936();
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IB)V")
	public void method3802(@OriginalArg(0) int arg0) {
		this.anInt4722 = arg0;
		@Pc(9) Class171 local9 = this.aClass171_42;
		synchronized (this.aClass171_42) {
			this.aClass171_42.method3936();
		}
		local9 = this.aClass171_43;
		synchronized (this.aClass171_43) {
			this.aClass171_43.method3936();
		}
		@Pc(47) Class171 local47 = this.aClass171_44;
		synchronized (this.aClass171_44) {
			this.aClass171_44.method3936();
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
	public void method3803() {
		@Pc(2) Class171 local2 = this.aClass171_41;
		synchronized (this.aClass171_41) {
			this.aClass171_41.method3934();
		}
		local2 = this.aClass171_42;
		synchronized (this.aClass171_42) {
			this.aClass171_42.method3934();
		}
		local2 = this.aClass171_43;
		synchronized (this.aClass171_43) {
			this.aClass171_43.method3934();
		}
		local2 = this.aClass171_44;
		synchronized (this.aClass171_44) {
			this.aClass171_44.method3934();
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZI)V")
	public void method3805(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean341) {
			this.aBoolean341 = arg0;
			this.method3801();
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZB)V")
	public void method3806(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean340 != arg0) {
			this.aBoolean340 = arg0;
			this.method3801();
		}
	}
}
