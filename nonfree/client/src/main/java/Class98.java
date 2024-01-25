import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eka")
public final class Class98 {

	@OriginalMember(owner = "client!eka", name = "l", descriptor = "Lclient!qfa;")
	private Class307 aClass307_32 = new Class307(64);

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "Lclient!ik;")
	private final Class182 aClass182_39;

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class98(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_39 = arg2;
		if (this.aClass182_39 != null) {
			@Pc(20) int local20 = this.aClass182_39.method3956() - 1;
			this.aClass182_39.method3970(local20);
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(B)V")
	public void method2478() {
		@Pc(14) Class307 local14 = this.aClass307_32;
		synchronized (this.aClass307_32) {
			this.aClass307_32.method7006();
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Z)V")
	public void method2479() {
		@Pc(6) Class307 local6 = this.aClass307_32;
		synchronized (this.aClass307_32) {
			this.aClass307_32.method6998();
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(ZI)V")
	public void method2480(@OriginalArg(1) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_32;
		synchronized (this.aClass307_32) {
			this.aClass307_32.method7006();
			this.aClass307_32 = new Class307(arg0);
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(II)Lclient!vfa;")
	public Class391 method2481(@OriginalArg(0) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_32;
		@Pc(16) Class391 local16;
		synchronized (this.aClass307_32) {
			local16 = (Class391) this.aClass307_32.method7002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class182 local37 = this.aClass182_39;
		@Pc(50) byte[] local50;
		synchronized (this.aClass182_39) {
			local50 = this.aClass182_39.method3985(Static163.method2665(arg0), Static192.method2986(arg0));
		}
		local16 = new Class391();
		if (local50 != null) {
			local16.method9038(new Class3_Sub2(local50));
		}
		@Pc(74) Class307 local74 = this.aClass307_32;
		synchronized (this.aClass307_32) {
			this.aClass307_32.method7000(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(BI)V")
	public void method2485() {
		@Pc(6) Class307 local6 = this.aClass307_32;
		synchronized (this.aClass307_32) {
			this.aClass307_32.method6995(5);
		}
	}
}
