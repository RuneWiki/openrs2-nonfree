import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class134 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "Lclient!ku;")
	private final Class139 aClass139_38 = new Class139(64);

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
	public int anInt3294 = 0;

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "Lclient!b;")
	private final Class20 aClass20_45;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
	public final int anInt3292;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;)V")
	public Class134(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		this.aClass20_45 = arg2;
		this.anInt3292 = this.aClass20_45.method231(4);
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
	public void method2925() {
		@Pc(6) Class139 local6 = this.aClass139_38;
		synchronized (this.aClass139_38) {
			this.aClass139_38.method3072();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V")
	public void method2927() {
		@Pc(6) Class139 local6 = this.aClass139_38;
		synchronized (this.aClass139_38) {
			this.aClass139_38.method3083(5);
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)Lclient!hc;")
	public Class100 method2930(@OriginalArg(1) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_38;
		@Pc(16) Class100 local16;
		synchronized (this.aClass139_38) {
			local16 = (Class100) this.aClass139_38.method3076((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass20_45.method253(arg0, 4);
		local16 = new Class100();
		local16.aClass134_4 = this;
		local16.anInt2433 = arg0;
		if (local33 != null) {
			local16.method2049(new Class3_Sub5(local33));
		}
		local16.method2050();
		@Pc(60) Class139 local60 = this.aClass139_38;
		synchronized (this.aClass139_38) {
			this.aClass139_38.method3070(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
	public void method2931() {
		@Pc(2) Class139 local2 = this.aClass139_38;
		synchronized (this.aClass139_38) {
			this.aClass139_38.method3075();
		}
	}
}
