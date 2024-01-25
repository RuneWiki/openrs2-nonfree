import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class205 {

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_58 = new Class307(64);

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "Lclient!ik;")
	private final Class182 aClass182_77;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class205(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_77 = arg2;
		this.aClass182_77.method3970(31);
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(II)Lclient!rk;")
	public Class327 method4781(@OriginalArg(0) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_58;
		@Pc(16) Class327 local16;
		synchronized (this.aClass307_58) {
			local16 = (Class327) this.aClass307_58.method7002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class182 local30 = this.aClass182_77;
		@Pc(39) byte[] local39;
		synchronized (this.aClass182_77) {
			local39 = this.aClass182_77.method3985(arg0, 31);
		}
		local16 = new Class327();
		if (local39 != null) {
			local16.method7350(new Class3_Sub2(local39));
		}
		@Pc(63) Class307 local63 = this.aClass307_58;
		synchronized (this.aClass307_58) {
			this.aClass307_58.method7000(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)V")
	public void method4782() {
		@Pc(2) Class307 local2 = this.aClass307_58;
		synchronized (this.aClass307_58) {
			this.aClass307_58.method6995(5);
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V")
	public void method4783() {
		@Pc(2) Class307 local2 = this.aClass307_58;
		synchronized (this.aClass307_58) {
			this.aClass307_58.method6998();
		}
	}

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)V")
	public void method4785() {
		@Pc(2) Class307 local2 = this.aClass307_58;
		synchronized (this.aClass307_58) {
			this.aClass307_58.method7006();
		}
	}
}
