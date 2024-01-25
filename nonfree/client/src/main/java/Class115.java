import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class115 {

	@OriginalMember(owner = "client!ip", name = "B", descriptor = "I")
	public int anInt3197;

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "Z")
	public boolean aBoolean192 = false;

	@OriginalMember(owner = "client!ip", name = "s", descriptor = "Lclient!kh;")
	private Class134 aClass134_21 = new Class134(64);

	@OriginalMember(owner = "client!ip", name = "y", descriptor = "Lclient!kh;")
	public final Class134 aClass134_22 = new Class134(500);

	@OriginalMember(owner = "client!ip", name = "z", descriptor = "Lclient!kh;")
	public final Class134 aClass134_23 = new Class134(30);

	@OriginalMember(owner = "client!ip", name = "A", descriptor = "Lclient!kh;")
	public final Class134 aClass134_24 = new Class134(50);

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "Lclient!ul;")
	public final Class246 aClass246_101;

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "Z")
	public boolean aBoolean193;

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "Lclient!ul;")
	private final Class246 aClass246_100;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!ee;IZLclient!ul;Lclient!ul;)V")
	public Class115(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class246 arg3, @OriginalArg(4) Class246 arg4) {
		this.aClass246_101 = arg4;
		this.aBoolean193 = arg2;
		this.aClass246_100 = arg3;
		if (this.aClass246_100 != null) {
			@Pc(47) int local47 = this.aClass246_100.method5502() - 1;
			this.aClass246_100.method5492(local47);
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
	public void method2759() {
		@Pc(16) Class134 local16 = this.aClass134_21;
		synchronized (this.aClass134_21) {
			this.aClass134_21.method3272();
		}
		local16 = this.aClass134_22;
		synchronized (this.aClass134_22) {
			this.aClass134_22.method3272();
		}
		local16 = this.aClass134_23;
		synchronized (this.aClass134_23) {
			this.aClass134_23.method3272();
		}
		local16 = this.aClass134_24;
		synchronized (this.aClass134_24) {
			this.aClass134_24.method3272();
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IZ)V")
	public void method2761(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean193) {
			this.aBoolean193 = arg0;
			this.method2759();
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(II)Lclient!jt;")
	public Class129 method2766(@OriginalArg(1) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_21;
		@Pc(16) Class129 local16;
		synchronized (this.aClass134_21) {
			local16 = (Class129) this.aClass134_21.method3266((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_100;
		@Pc(42) byte[] local42;
		synchronized (this.aClass246_100) {
			local42 = this.aClass246_100.method5477(Static124.method5871(arg0), Static201.method3257(arg0));
		}
		local16 = new Class129();
		local16.anInt3530 = arg0;
		local16.aClass115_3 = this;
		if (local42 != null) {
			local16.method3020(new Class1_Sub5(local42));
		}
		local16.method3021();
		if (local16.aBoolean224) {
			local16.anInt3506 = 0;
			local16.aBoolean215 = false;
		}
		if (!this.aBoolean193 && local16.aBoolean223) {
			local16.anIntArray308 = null;
			local16.aStringArray24 = null;
		}
		@Pc(99) Class134 local99 = this.aClass134_21;
		synchronized (this.aClass134_21) {
			this.aClass134_21.method3263((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BI)V")
	public void method2768(@OriginalArg(1) int arg0) {
		this.anInt3197 = arg0;
		@Pc(17) Class134 local17 = this.aClass134_22;
		synchronized (this.aClass134_22) {
			this.aClass134_22.method3272();
		}
		local17 = this.aClass134_23;
		synchronized (this.aClass134_23) {
			this.aClass134_23.method3272();
		}
		local17 = this.aClass134_24;
		synchronized (this.aClass134_24) {
			this.aClass134_24.method3272();
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(BI)V")
	public void method2769() {
		@Pc(6) Class134 local6 = this.aClass134_21;
		synchronized (this.aClass134_21) {
			this.aClass134_21.method3270(5);
		}
		local6 = this.aClass134_22;
		synchronized (this.aClass134_22) {
			this.aClass134_22.method3270(5);
		}
		local6 = this.aClass134_23;
		synchronized (this.aClass134_23) {
			this.aClass134_23.method3270(5);
		}
		local6 = this.aClass134_24;
		synchronized (this.aClass134_24) {
			this.aClass134_24.method3270(5);
		}
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(BI)V")
	public void method2770(@OriginalArg(1) int arg0) {
		this.aClass134_21 = new Class134(arg0);
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)V")
	public void method2771() {
		@Pc(2) Class134 local2 = this.aClass134_21;
		synchronized (this.aClass134_21) {
			this.aClass134_21.method3267();
		}
		local2 = this.aClass134_22;
		synchronized (this.aClass134_22) {
			this.aClass134_22.method3267();
		}
		local2 = this.aClass134_23;
		synchronized (this.aClass134_23) {
			this.aClass134_23.method3267();
		}
		local2 = this.aClass134_24;
		synchronized (this.aClass134_24) {
			this.aClass134_24.method3267();
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(IZ)V")
	public void method2773(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean192) {
			this.aBoolean192 = arg0;
			this.method2759();
		}
	}
}
