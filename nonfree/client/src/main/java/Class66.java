import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class66 {

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	public int anInt1718;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!hm;")
	private final Class136 aClass136_20 = new Class136(64);

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!hm;")
	public final Class136 aClass136_21 = new Class136(30);

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!pfa;")
	public final Class251 aClass251_21;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_22;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;Lclient!pfa;)V")
	public Class66(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Class251 arg3) {
		this.aClass251_21 = arg3;
		this.aClass251_22 = arg2;
		@Pc(26) int local26 = this.aClass251_22.method5755() - 1;
		this.aClass251_22.method5768(local26);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public void method1649() {
		@Pc(2) Class136 local2 = this.aClass136_20;
		synchronized (this.aClass136_20) {
			this.aClass136_20.method3470();
		}
		local2 = this.aClass136_21;
		synchronized (this.aClass136_21) {
			this.aClass136_21.method3470();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
	public void method1650(@OriginalArg(1) int arg0) {
		this.anInt1718 = arg0;
		@Pc(9) Class136 local9 = this.aClass136_21;
		synchronized (this.aClass136_21) {
			this.aClass136_21.method3470();
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V")
	public void method1651() {
		@Pc(2) Class136 local2 = this.aClass136_20;
		synchronized (this.aClass136_20) {
			this.aClass136_20.method3474(5);
		}
		local2 = this.aClass136_21;
		synchronized (this.aClass136_21) {
			this.aClass136_21.method3474(5);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)Lclient!ai;")
	public Class10 method1652(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_20;
		@Pc(16) Class10 local16;
		synchronized (this.aClass136_20) {
			local16 = (Class10) this.aClass136_20.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_22;
		@Pc(42) byte[] local42;
		synchronized (this.aClass251_22) {
			local42 = this.aClass251_22.method5772(Static374.method5575(arg0), Static320.method5066(arg0));
		}
		local16 = new Class10();
		local16.aClass66_1 = this;
		local16.anInt322 = arg0;
		if (local42 != null) {
			local16.method255(new Class6_Sub21(local42));
		}
		@Pc(70) Class136 local70 = this.aClass136_20;
		synchronized (this.aClass136_20) {
			this.aClass136_20.method3482((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public void method1653() {
		@Pc(2) Class136 local2 = this.aClass136_20;
		synchronized (this.aClass136_20) {
			this.aClass136_20.method3476();
		}
		local2 = this.aClass136_21;
		synchronized (this.aClass136_21) {
			this.aClass136_21.method3476();
		}
	}
}
