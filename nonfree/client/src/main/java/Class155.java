import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class155 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_46 = new Class307(64);

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_47 = new Class307(100);

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Lclient!ik;")
	private final Class182 aClass182_64;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;Lclient!ik;Lclient!ik;)V")
	public Class155(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Class182 arg3, @OriginalArg(4) Class182 arg4) {
		this.aClass182_64 = arg2;
		if (this.aClass182_64 != null) {
			@Pc(26) int local26 = this.aClass182_64.method3956() - 1;
			this.aClass182_64.method3970(local26);
		}
		Static458.method5833(arg3, arg4);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Lclient!hba;")
	public Class149 method3422(@OriginalArg(1) int arg0) {
		@Pc(14) Class307 local14 = this.aClass307_46;
		@Pc(24) Class149 local24;
		synchronized (this.aClass307_46) {
			local24 = (Class149) this.aClass307_46.method7002((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Class182 local38 = this.aClass182_64;
		@Pc(51) byte[] local51;
		synchronized (this.aClass182_64) {
			local51 = this.aClass182_64.method3985(Static522.method6994(arg0), Static206.method3542(arg0));
		}
		local24 = new Class149();
		local24.anInt3737 = arg0;
		if (local51 != null) {
			local24.method3377(new Class3_Sub2(local51));
		}
		local24.method3376();
		@Pc(81) Class307 local81 = this.aClass307_46;
		synchronized (this.aClass307_46) {
			this.aClass307_46.method7000(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public void method3426() {
		@Pc(11) Class307 local11 = this.aClass307_46;
		synchronized (this.aClass307_46) {
			this.aClass307_46.method7006();
		}
		local11 = this.aClass307_47;
		synchronized (this.aClass307_47) {
			this.aClass307_47.method7006();
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
	public void method3427() {
		@Pc(11) Class307 local11 = this.aClass307_46;
		synchronized (this.aClass307_46) {
			this.aClass307_46.method6995(5);
		}
		local11 = this.aClass307_47;
		synchronized (this.aClass307_47) {
			this.aClass307_47.method6995(5);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public void method3428() {
		@Pc(2) Class307 local2 = this.aClass307_46;
		synchronized (this.aClass307_46) {
			this.aClass307_46.method6998();
		}
		local2 = this.aClass307_47;
		synchronized (this.aClass307_47) {
			this.aClass307_47.method6998();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)Lclient!dp;")
	public Class3_Sub7_Sub6 method3429(@OriginalArg(1) int arg0) {
		@Pc(12) Class307 local12 = this.aClass307_47;
		synchronized (this.aClass307_47) {
			@Pc(22) Class3_Sub7_Sub6 local22 = (Class3_Sub7_Sub6) this.aClass307_47.method7002((long) arg0);
			if (local22 == null) {
				local22 = new Class3_Sub7_Sub6(arg0);
				this.aClass307_47.method7000(local22, (long) arg0);
			}
			return local22.method2273() ? local22 : null;
		}
	}
}
