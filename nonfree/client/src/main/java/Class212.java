import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class212 {

	@OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
	public int anInt5634;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "Z")
	public boolean aBoolean405 = false;

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "Lclient!ad;")
	private Class6 aClass6_40 = new Class6(64);

	@OriginalMember(owner = "client!mo", name = "s", descriptor = "Lclient!ad;")
	public final Class6 aClass6_41 = new Class6(500);

	@OriginalMember(owner = "client!mo", name = "t", descriptor = "Lclient!ad;")
	public final Class6 aClass6_42 = new Class6(30);

	@OriginalMember(owner = "client!mo", name = "u", descriptor = "Lclient!ad;")
	public final Class6 aClass6_43 = new Class6(50);

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "Lclient!tf;")
	private final Class322 aClass322_106;

	@OriginalMember(owner = "client!mo", name = "r", descriptor = "Z")
	public boolean aBoolean406;

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "Lclient!tf;")
	public final Class322 aClass322_105;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!qh;IZLclient!tf;Lclient!tf;)V")
	public Class212(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class322 arg3, @OriginalArg(4) Class322 arg4) {
		this.aClass322_106 = arg3;
		this.aBoolean406 = arg2;
		this.aClass322_105 = arg4;
		if (this.aClass322_106 != null) {
			@Pc(47) int local47 = this.aClass322_106.method6825() - 1;
			this.aClass322_106.method6831(local47);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)V")
	public void method4791(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean406) {
			this.aBoolean406 = arg0;
			this.method4795();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V")
	public void method4792(@OriginalArg(1) int arg0) {
		this.anInt5634 = arg0;
		@Pc(9) Class6 local9 = this.aClass6_41;
		synchronized (this.aClass6_41) {
			this.aClass6_41.method102();
		}
		local9 = this.aClass6_42;
		synchronized (this.aClass6_42) {
			this.aClass6_42.method102();
		}
		local9 = this.aClass6_43;
		synchronized (this.aClass6_43) {
			this.aClass6_43.method102();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)Lclient!qp;")
	public Class280 method4793(@OriginalArg(0) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_40;
		@Pc(16) Class280 local16;
		synchronized (this.aClass6_40) {
			local16 = (Class280) this.aClass6_40.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class322 local29 = this.aClass322_106;
		@Pc(48) byte[] local48;
		synchronized (this.aClass322_106) {
			local48 = this.aClass322_106.method6802(Static174.method3069(arg0), Static241.method3736(arg0));
		}
		local16 = new Class280();
		local16.aClass212_2 = this;
		local16.anInt7369 = arg0;
		if (local48 != null) {
			local16.method6180(new Class3_Sub11(local48));
		}
		local16.method6172();
		if (!this.aBoolean406 && local16.aBoolean559) {
			local16.aStringArray30 = null;
			local16.anIntArray459 = null;
		}
		if (local16.aBoolean556) {
			local16.aBoolean558 = false;
			local16.anInt7359 = 0;
		}
		@Pc(100) Class6 local100 = this.aClass6_40;
		synchronized (this.aClass6_40) {
			this.aClass6_40.method106((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(ZI)V")
	public void method4794() {
		@Pc(2) Class6 local2 = this.aClass6_40;
		synchronized (this.aClass6_40) {
			this.aClass6_40.method97(5);
		}
		local2 = this.aClass6_41;
		synchronized (this.aClass6_41) {
			this.aClass6_41.method97(5);
		}
		local2 = this.aClass6_42;
		synchronized (this.aClass6_42) {
			this.aClass6_42.method97(5);
		}
		local2 = this.aClass6_43;
		synchronized (this.aClass6_43) {
			this.aClass6_43.method97(5);
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
	public void method4795() {
		@Pc(6) Class6 local6 = this.aClass6_40;
		synchronized (this.aClass6_40) {
			this.aClass6_40.method102();
		}
		local6 = this.aClass6_41;
		synchronized (this.aClass6_41) {
			this.aClass6_41.method102();
		}
		local6 = this.aClass6_42;
		synchronized (this.aClass6_42) {
			this.aClass6_42.method102();
		}
		local6 = this.aClass6_43;
		synchronized (this.aClass6_43) {
			this.aClass6_43.method102();
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(IZ)V")
	public void method4796(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean405) {
			this.aBoolean405 = arg0;
			this.method4795();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
	public void method4797() {
		@Pc(11) Class6 local11 = this.aClass6_40;
		synchronized (this.aClass6_40) {
			this.aClass6_40.method94();
		}
		local11 = this.aClass6_41;
		synchronized (this.aClass6_41) {
			this.aClass6_41.method94();
		}
		local11 = this.aClass6_42;
		synchronized (this.aClass6_42) {
			this.aClass6_42.method94();
		}
		local11 = this.aClass6_43;
		synchronized (this.aClass6_43) {
			this.aClass6_43.method94();
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)V")
	public void method4798(@OriginalArg(1) int arg0) {
		this.aClass6_40 = new Class6(arg0);
	}
}
