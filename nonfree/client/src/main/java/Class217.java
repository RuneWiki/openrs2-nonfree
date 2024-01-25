import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class217 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "Lclient!tja;")
	private final Class352 aClass352_45 = new Class352(64);

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
	public int anInt5291 = 0;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "Lclient!bt;")
	private final Class34 aClass34_74;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
	public final int anInt5288;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class217(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_74 = arg2;
		this.anInt5288 = this.aClass34_74.method1233(4);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public void method4671() {
		@Pc(12) Class352 local12 = this.aClass352_45;
		synchronized (this.aClass352_45) {
			this.aClass352_45.method7659();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
	public void method4672() {
		@Pc(6) Class352 local6 = this.aClass352_45;
		synchronized (this.aClass352_45) {
			this.aClass352_45.method7656();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
	public void method4673() {
		@Pc(10) Class352 local10 = this.aClass352_45;
		synchronized (this.aClass352_45) {
			this.aClass352_45.method7663(5);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BI)Lclient!fw;")
	public Class127 method4674(@OriginalArg(1) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_45;
		@Pc(16) Class127 local16;
		synchronized (this.aClass352_45) {
			local16 = (Class127) this.aClass352_45.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class34 local29 = this.aClass34_74;
		@Pc(38) byte[] local38;
		synchronized (this.aClass34_74) {
			local38 = this.aClass34_74.method1239(4, arg0);
		}
		local16 = new Class127();
		local16.aClass217_5 = this;
		local16.anInt3073 = arg0;
		if (local38 != null) {
			local16.method2865(new Class4_Sub11(local38));
		}
		local16.method2862();
		@Pc(75) Class352 local75 = this.aClass352_45;
		synchronized (this.aClass352_45) {
			this.aClass352_45.method7655((long) arg0, local16);
			return local16;
		}
	}
}
