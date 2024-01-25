import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class297 {

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_79 = new Class307(16);

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "Lclient!ik;")
	private final Class182 aClass182_102;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class297(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_102 = arg2;
		this.aClass182_102.method3970(30);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BI)Lclient!kja;")
	public Class212 method6919(@OriginalArg(1) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_79;
		@Pc(16) Class212 local16;
		synchronized (this.aClass307_79) {
			local16 = (Class212) this.aClass307_79.method7002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class182 local30 = this.aClass182_102;
		@Pc(39) byte[] local39;
		synchronized (this.aClass182_102) {
			local39 = this.aClass182_102.method3985(arg0, 30);
		}
		local16 = new Class212();
		if (local39 != null) {
			local16.method4916(new Class3_Sub2(local39));
		}
		@Pc(63) Class307 local63 = this.aClass307_79;
		synchronized (this.aClass307_79) {
			this.aClass307_79.method7000(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)V")
	public void method6920() {
		@Pc(11) Class307 local11 = this.aClass307_79;
		synchronized (this.aClass307_79) {
			this.aClass307_79.method6995(5);
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
	public void method6923() {
		@Pc(2) Class307 local2 = this.aClass307_79;
		synchronized (this.aClass307_79) {
			this.aClass307_79.method7006();
		}
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(I)V")
	public void method6925() {
		@Pc(7) Class307 local7 = this.aClass307_79;
		synchronized (this.aClass307_79) {
			this.aClass307_79.method6998();
		}
	}
}
