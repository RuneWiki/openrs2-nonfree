import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class125 {

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	public int anInt3703;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "Lclient!hm;")
	private final Class136 aClass136_39 = new Class136(64);

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "Lclient!hm;")
	public final Class136 aClass136_40 = new Class136(50);

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "Lclient!hm;")
	public final Class136 aClass136_41 = new Class136(5);

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_53;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Lclient!pfa;")
	public final Class251 aClass251_54;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "Z")
	public boolean aBoolean253;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "Lclient!bs;")
	public final Class37 aClass37_1;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!bs;IZLclient!pfa;Lclient!pfa;)V")
	public Class125(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class251 arg3, @OriginalArg(4) Class251 arg4) {
		this.aClass251_53 = arg3;
		this.aClass251_54 = arg4;
		this.aBoolean253 = arg2;
		this.aClass37_1 = arg0;
		if (this.aClass251_53 != null) {
			@Pc(41) int local41 = this.aClass251_53.method5755() - 1;
			this.aClass251_53.method5768(local41);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
	public void method3227() {
		@Pc(6) Class136 local6 = this.aClass136_39;
		synchronized (this.aClass136_39) {
			this.aClass136_39.method3474(5);
		}
		local6 = this.aClass136_40;
		synchronized (this.aClass136_40) {
			this.aClass136_40.method3474(5);
		}
		local6 = this.aClass136_41;
		synchronized (this.aClass136_41) {
			this.aClass136_41.method3474(5);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lclient!ql;")
	public Class273 method3229(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_39;
		@Pc(16) Class273 local16;
		synchronized (this.aClass136_39) {
			local16 = (Class273) this.aClass136_39.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_53;
		@Pc(42) byte[] local42;
		synchronized (this.aClass251_53) {
			local42 = this.aClass251_53.method5772(Static557.method7545(arg0), Static104.method1871(arg0));
		}
		local16 = new Class273();
		local16.anInt7462 = arg0;
		local16.aClass125_1 = this;
		if (local42 != null) {
			local16.method6158(new Class6_Sub21(local42));
		}
		local16.method6165();
		@Pc(73) Class136 local73 = this.aClass136_39;
		synchronized (this.aClass136_39) {
			this.aClass136_39.method3482((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BZ)V")
	public void method3230(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean253 != arg0) {
			this.aBoolean253 = arg0;
			this.method3233();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public void method3231() {
		@Pc(6) Class136 local6 = this.aClass136_40;
		synchronized (this.aClass136_40) {
			this.aClass136_40.method3470();
		}
		local6 = this.aClass136_41;
		synchronized (this.aClass136_41) {
			this.aClass136_41.method3470();
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V")
	public void method3233() {
		@Pc(2) Class136 local2 = this.aClass136_39;
		synchronized (this.aClass136_39) {
			this.aClass136_39.method3470();
		}
		local2 = this.aClass136_40;
		synchronized (this.aClass136_40) {
			this.aClass136_40.method3470();
		}
		@Pc(44) Class136 local44 = this.aClass136_41;
		synchronized (this.aClass136_41) {
			this.aClass136_41.method3470();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V")
	public void method3234(@OriginalArg(0) int arg0) {
		this.anInt3703 = arg0;
		@Pc(15) Class136 local15 = this.aClass136_40;
		synchronized (this.aClass136_40) {
			this.aClass136_40.method3470();
		}
		local15 = this.aClass136_41;
		synchronized (this.aClass136_41) {
			this.aClass136_41.method3470();
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	public void method3235() {
		@Pc(6) Class136 local6 = this.aClass136_39;
		synchronized (this.aClass136_39) {
			this.aClass136_39.method3476();
		}
		@Pc(29) Class136 local29 = this.aClass136_40;
		synchronized (this.aClass136_40) {
			this.aClass136_40.method3476();
		}
		local29 = this.aClass136_41;
		synchronized (this.aClass136_41) {
			this.aClass136_41.method3476();
		}
	}
}
