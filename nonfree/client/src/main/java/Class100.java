import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class100 {

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
	public int anInt2377;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Z")
	public boolean aBoolean165 = false;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Lclient!vi;")
	private Class332 aClass332_58 = new Class332(64);

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "Lclient!vi;")
	public final Class332 aClass332_59 = new Class332(500);

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "Lclient!vi;")
	public final Class332 aClass332_60 = new Class332(30);

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "Lclient!vi;")
	public final Class332 aClass332_61 = new Class332(50);

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Z")
	public boolean aBoolean164;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "Lclient!pq;")
	private final Class251 aClass251_48;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "Lclient!pq;")
	public final Class251 aClass251_49;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!uea;IZLclient!pq;Lclient!pq;)V")
	public Class100(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class251 arg3, @OriginalArg(4) Class251 arg4) {
		this.aBoolean164 = arg2;
		this.aClass251_48 = arg3;
		this.aClass251_49 = arg4;
		if (this.aClass251_48 != null) {
			@Pc(47) int local47 = this.aClass251_48.method5847() - 1;
			this.aClass251_48.method5849(local47);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public void method2004() {
		@Pc(10) Class332 local10 = this.aClass332_58;
		synchronized (this.aClass332_58) {
			this.aClass332_58.method7510();
		}
		local10 = this.aClass332_59;
		synchronized (this.aClass332_59) {
			this.aClass332_59.method7510();
		}
		local10 = this.aClass332_60;
		synchronized (this.aClass332_60) {
			this.aClass332_60.method7510();
		}
		local10 = this.aClass332_61;
		synchronized (this.aClass332_61) {
			this.aClass332_61.method7510();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V")
	public void method2005(@OriginalArg(1) int arg0) {
		this.aClass332_58 = new Class332(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	public void method2006(@OriginalArg(1) int arg0) {
		this.anInt2377 = arg0;
		@Pc(9) Class332 local9 = this.aClass332_59;
		synchronized (this.aClass332_59) {
			this.aClass332_59.method7510();
		}
		local9 = this.aClass332_60;
		synchronized (this.aClass332_60) {
			this.aClass332_60.method7510();
		}
		local9 = this.aClass332_61;
		synchronized (this.aClass332_61) {
			this.aClass332_61.method7510();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)V")
	public void method2007(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean165 != arg0) {
			this.aBoolean165 = arg0;
			this.method2004();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)Lclient!uca;")
	public Class313 method2008(@OriginalArg(0) int arg0) {
		@Pc(13) Class332 local13 = this.aClass332_58;
		@Pc(23) Class313 local23;
		synchronized (this.aClass332_58) {
			local23 = (Class313) this.aClass332_58.method7502((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class251 local36 = this.aClass251_48;
		@Pc(49) byte[] local49;
		synchronized (this.aClass251_48) {
			local49 = this.aClass251_48.method5860(Static38.method530(arg0), Static491.method6775(arg0));
		}
		local23 = new Class313();
		local23.anInt8480 = arg0;
		local23.aClass100_4 = this;
		if (local49 != null) {
			local23.method6975(new Class6_Sub14(local49));
		}
		local23.method6964();
		if (local23.aBoolean583) {
			local23.aBoolean586 = false;
			local23.anInt8469 = 0;
		}
		if (!this.aBoolean164 && local23.aBoolean589) {
			local23.anIntArray654 = null;
			local23.aStringArray31 = null;
		}
		@Pc(101) Class332 local101 = this.aClass332_58;
		synchronized (this.aClass332_58) {
			this.aClass332_58.method7498((long) arg0, local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(IB)V")
	public void method2009() {
		@Pc(6) Class332 local6 = this.aClass332_58;
		synchronized (this.aClass332_58) {
			this.aClass332_58.method7497(5);
		}
		local6 = this.aClass332_59;
		synchronized (this.aClass332_59) {
			this.aClass332_59.method7497(5);
		}
		local6 = this.aClass332_60;
		synchronized (this.aClass332_60) {
			this.aClass332_60.method7497(5);
		}
		local6 = this.aClass332_61;
		synchronized (this.aClass332_61) {
			this.aClass332_61.method7497(5);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI)V")
	public void method2011(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean164) {
			this.aBoolean164 = arg0;
			this.method2004();
		}
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
	public void method2012() {
		@Pc(2) Class332 local2 = this.aClass332_58;
		synchronized (this.aClass332_58) {
			this.aClass332_58.method7512();
		}
		local2 = this.aClass332_59;
		synchronized (this.aClass332_59) {
			this.aClass332_59.method7512();
		}
		local2 = this.aClass332_60;
		synchronized (this.aClass332_60) {
			this.aClass332_60.method7512();
		}
		local2 = this.aClass332_61;
		synchronized (this.aClass332_61) {
			this.aClass332_61.method7512();
		}
	}
}
