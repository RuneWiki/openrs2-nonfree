import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class13 {

	@OriginalMember(owner = "client!aga", name = "A", descriptor = "I")
	public int anInt97;

	@OriginalMember(owner = "client!aga", name = "p", descriptor = "Z")
	public boolean aBoolean8 = false;

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "Lclient!oo;")
	private Class264 aClass264_1 = new Class264(64);

	@OriginalMember(owner = "client!aga", name = "t", descriptor = "Lclient!oo;")
	public final Class264 aClass264_3 = new Class264(500);

	@OriginalMember(owner = "client!aga", name = "w", descriptor = "Lclient!oo;")
	public final Class264 aClass264_4 = new Class264(30);

	@OriginalMember(owner = "client!aga", name = "z", descriptor = "Lclient!oo;")
	public final Class264 aClass264_5 = new Class264(50);

	@OriginalMember(owner = "client!aga", name = "k", descriptor = "Lclient!wia;")
	public final Class386 aClass386_1;

	@OriginalMember(owner = "client!aga", name = "j", descriptor = "Z")
	public boolean aBoolean7;

	@OriginalMember(owner = "client!aga", name = "l", descriptor = "Lclient!wia;")
	private final Class386 aClass386_2;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!dt;IZLclient!wia;Lclient!wia;)V")
	public Class13(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class386 arg3, @OriginalArg(4) Class386 arg4) {
		this.aClass386_1 = arg4;
		this.aBoolean7 = arg2;
		this.aClass386_2 = arg3;
		if (this.aClass386_2 != null) {
			@Pc(47) int local47 = this.aClass386_2.method9189() - 1;
			this.aClass386_2.method9210(local47);
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZB)V")
	public void method77(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean8) {
			this.aBoolean8 = arg0;
			this.method82();
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)V")
	public void method78(@OriginalArg(1) int arg0) {
		this.anInt97 = arg0;
		@Pc(9) Class264 local9 = this.aClass264_3;
		synchronized (this.aClass264_3) {
			this.aClass264_3.method6360();
		}
		local9 = this.aClass264_4;
		synchronized (this.aClass264_4) {
			this.aClass264_4.method6360();
		}
		local9 = this.aClass264_5;
		synchronized (this.aClass264_5) {
			this.aClass264_5.method6360();
		}
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(ZB)V")
	public void method79(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean7 != arg0) {
			this.aBoolean7 = arg0;
			this.method82();
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(BI)V")
	public void method81() {
		@Pc(6) Class264 local6 = this.aClass264_1;
		synchronized (this.aClass264_1) {
			this.aClass264_1.method6366(5);
		}
		local6 = this.aClass264_3;
		synchronized (this.aClass264_3) {
			this.aClass264_3.method6366(5);
		}
		local6 = this.aClass264_4;
		synchronized (this.aClass264_4) {
			this.aClass264_4.method6366(5);
		}
		local6 = this.aClass264_5;
		synchronized (this.aClass264_5) {
			this.aClass264_5.method6366(5);
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V")
	public void method82() {
		@Pc(6) Class264 local6 = this.aClass264_1;
		synchronized (this.aClass264_1) {
			this.aClass264_1.method6360();
		}
		local6 = this.aClass264_3;
		synchronized (this.aClass264_3) {
			this.aClass264_3.method6360();
		}
		local6 = this.aClass264_4;
		synchronized (this.aClass264_4) {
			this.aClass264_4.method6360();
		}
		local6 = this.aClass264_5;
		synchronized (this.aClass264_5) {
			this.aClass264_5.method6360();
		}
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V")
	public void method83() {
		@Pc(2) Class264 local2 = this.aClass264_1;
		synchronized (this.aClass264_1) {
			this.aClass264_1.method6368();
		}
		local2 = this.aClass264_3;
		synchronized (this.aClass264_3) {
			this.aClass264_3.method6368();
		}
		local2 = this.aClass264_4;
		synchronized (this.aClass264_4) {
			this.aClass264_4.method6368();
		}
		local2 = this.aClass264_5;
		synchronized (this.aClass264_5) {
			this.aClass264_5.method6368();
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IB)V")
	public void method85(@OriginalArg(0) int arg0) {
		this.aClass264_1 = new Class264(arg0);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZI)Lclient!kv;")
	public Class203 method86(@OriginalArg(1) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_1;
		@Pc(16) Class203 local16;
		synchronized (this.aClass264_1) {
			local16 = (Class203) this.aClass264_1.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_2;
		@Pc(42) byte[] local42;
		synchronized (this.aClass386_2) {
			local42 = this.aClass386_2.method9196(Static189.method2975(arg0), Static431.method6330(arg0));
		}
		local16 = new Class203();
		local16.aClass13_3 = this;
		local16.anInt6014 = arg0;
		if (local42 != null) {
			local16.method5015(new Class14_Sub29(local42));
		}
		local16.method5025();
		if (local16.aBoolean416) {
			local16.anInt6016 = 0;
			local16.aBoolean414 = false;
		}
		if (!this.aBoolean7 && local16.aBoolean422) {
			local16.anIntArray444 = null;
			local16.aStringArray20 = null;
		}
		@Pc(99) Class264 local99 = this.aClass264_1;
		synchronized (this.aClass264_1) {
			this.aClass264_1.method6364((long) arg0, local16);
			return local16;
		}
	}
}
