import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class213 {

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "Lclient!qj;")
	private final Class295 aClass295_34 = new Class295(64);

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "Lclient!qj;")
	private final Class295 aClass295_35 = new Class295(100);

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "Lclient!uq;")
	private final Class362 aClass362_71;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;Lclient!uq;Lclient!uq;)V")
	public Class213(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2, @OriginalArg(3) Class362 arg3, @OriginalArg(4) Class362 arg4) {
		this.aClass362_71 = arg2;
		if (this.aClass362_71 != null) {
			@Pc(26) int local26 = this.aClass362_71.method8373() - 1;
			this.aClass362_71.method8355(local26);
		}
		Static472.method6290(arg4, arg3);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)Lclient!bea;")
	public Class3_Sub5_Sub3 method5001(@OriginalArg(1) int arg0) {
		@Pc(11) Class295 local11 = this.aClass295_35;
		synchronized (this.aClass295_35) {
			@Pc(21) Class3_Sub5_Sub3 local21 = (Class3_Sub5_Sub3) this.aClass295_35.method6470((long) arg0);
			if (local21 == null) {
				local21 = new Class3_Sub5_Sub3(arg0);
				this.aClass295_35.method6469((long) arg0, local21);
			}
			return local21.method768() ? local21 : null;
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
	public void method5004() {
		@Pc(6) Class295 local6 = this.aClass295_34;
		synchronized (this.aClass295_34) {
			this.aClass295_34.method6474();
		}
		local6 = this.aClass295_35;
		synchronized (this.aClass295_35) {
			this.aClass295_35.method6474();
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)V")
	public void method5005() {
		@Pc(10) Class295 local10 = this.aClass295_34;
		synchronized (this.aClass295_34) {
			this.aClass295_34.method6464();
		}
		local10 = this.aClass295_35;
		synchronized (this.aClass295_35) {
			this.aClass295_35.method6464();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V")
	public void method5006() {
		@Pc(6) Class295 local6 = this.aClass295_34;
		synchronized (this.aClass295_34) {
			this.aClass295_34.method6462(5);
		}
		local6 = this.aClass295_35;
		synchronized (this.aClass295_35) {
			this.aClass295_35.method6462(5);
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)Lclient!mu;")
	public Class239 method5008(@OriginalArg(0) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_34;
		@Pc(16) Class239 local16;
		synchronized (this.aClass295_34) {
			local16 = (Class239) this.aClass295_34.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class362 local29 = this.aClass362_71;
		@Pc(42) byte[] local42;
		synchronized (this.aClass362_71) {
			local42 = this.aClass362_71.method8368(Static36.method723(arg0), Static224.method3293(arg0));
		}
		local16 = new Class239();
		local16.aClass213_2 = this;
		local16.anInt6410 = arg0;
		if (local42 != null) {
			local16.method5386(new Class3_Sub4(local42));
		}
		local16.method5385();
		@Pc(75) Class295 local75 = this.aClass295_34;
		synchronized (this.aClass295_34) {
			this.aClass295_34.method6469((long) arg0, local16);
			return local16;
		}
	}
}
