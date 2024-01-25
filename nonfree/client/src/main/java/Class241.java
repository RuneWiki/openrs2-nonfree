import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class241 {

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
	public int anInt6697;

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "Lclient!pja;")
	private final Class279 aClass279_34 = new Class279(64);

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "Lclient!pja;")
	public final Class279 aClass279_35 = new Class279(50);

	@OriginalMember(owner = "client!mu", name = "q", descriptor = "Lclient!pja;")
	public final Class279 aClass279_36 = new Class279(5);

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "Lclient!gj;")
	public final Class143 aClass143_94;

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "Lclient!gj;")
	private final Class143 aClass143_93;

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "Z")
	public boolean aBoolean507;

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "Lclient!im;")
	public final Class181 aClass181_108;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!im;IZLclient!gj;Lclient!gj;)V")
	public Class241(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class143 arg3, @OriginalArg(4) Class143 arg4) {
		this.aClass143_94 = arg4;
		this.aClass143_93 = arg3;
		this.aBoolean507 = arg2;
		this.aClass181_108 = arg0;
		if (this.aClass143_93 != null) {
			@Pc(41) int local41 = this.aClass143_93.method3116() - 1;
			this.aClass143_93.method3123(local41);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)V")
	public void method5575() {
		@Pc(11) Class279 local11 = this.aClass279_34;
		synchronized (this.aClass279_34) {
			this.aClass279_34.method6630(5);
		}
		local11 = this.aClass279_35;
		synchronized (this.aClass279_35) {
			this.aClass279_35.method6630(5);
		}
		local11 = this.aClass279_36;
		synchronized (this.aClass279_36) {
			this.aClass279_36.method6630(5);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZB)V")
	public void method5576(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean507) {
			this.aBoolean507 = arg0;
			this.method5581();
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BI)V")
	public void method5577(@OriginalArg(1) int arg0) {
		this.anInt6697 = arg0;
		@Pc(13) Class279 local13 = this.aClass279_35;
		synchronized (this.aClass279_35) {
			this.aClass279_35.method6638();
		}
		local13 = this.aClass279_36;
		synchronized (this.aClass279_36) {
			this.aClass279_36.method6638();
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
	public void method5578() {
		@Pc(7) Class279 local7 = this.aClass279_34;
		synchronized (this.aClass279_34) {
			this.aClass279_34.method6637();
		}
		local7 = this.aClass279_35;
		synchronized (this.aClass279_35) {
			this.aClass279_35.method6637();
		}
		local7 = this.aClass279_36;
		synchronized (this.aClass279_36) {
			this.aClass279_36.method6637();
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
	public void method5579() {
		@Pc(6) Class279 local6 = this.aClass279_35;
		synchronized (this.aClass279_35) {
			this.aClass279_35.method6638();
		}
		local6 = this.aClass279_36;
		synchronized (this.aClass279_36) {
			this.aClass279_36.method6638();
		}
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
	public void method5581() {
		@Pc(2) Class279 local2 = this.aClass279_34;
		synchronized (this.aClass279_34) {
			this.aClass279_34.method6638();
		}
		local2 = this.aClass279_35;
		synchronized (this.aClass279_35) {
			this.aClass279_35.method6638();
		}
		local2 = this.aClass279_36;
		synchronized (this.aClass279_36) {
			this.aClass279_36.method6638();
		}
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)Lclient!ac;")
	public Class5 method5582(@OriginalArg(1) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_34;
		@Pc(16) Class5 local16;
		synchronized (this.aClass279_34) {
			local16 = (Class5) this.aClass279_34.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class143 local29 = this.aClass143_93;
		@Pc(42) byte[] local42;
		synchronized (this.aClass143_93) {
			local42 = this.aClass143_93.method3125(Static542.method7493(arg0), Static471.method8498(arg0));
		}
		local16 = new Class5();
		local16.anInt74 = arg0;
		local16.aClass241_1 = this;
		if (local42 != null) {
			local16.method62(new Class3_Sub17(local42));
		}
		local16.method59();
		@Pc(80) Class279 local80 = this.aClass279_34;
		synchronized (this.aClass279_34) {
			this.aClass279_34.method6635(local16, (long) arg0);
			return local16;
		}
	}
}
