import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tka")
public final class Class358 {

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_86 = new Class307(64);

	@OriginalMember(owner = "client!tka", name = "g", descriptor = "Lclient!ik;")
	private final Class182 aClass182_114;

	@OriginalMember(owner = "client!tka", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class358(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_114 = arg2;
		if (this.aClass182_114 != null) {
			this.aClass182_114.method3970(35);
		}
	}

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(II)V")
	public void method8251() {
		@Pc(9) Class307 local9 = this.aClass307_86;
		synchronized (this.aClass307_86) {
			this.aClass307_86.method6995(5);
		}
	}

	@OriginalMember(owner = "client!tka", name = "b", descriptor = "(I)V")
	public void method8252() {
		@Pc(14) Class307 local14 = this.aClass307_86;
		synchronized (this.aClass307_86) {
			this.aClass307_86.method7006();
		}
	}

	@OriginalMember(owner = "client!tka", name = "b", descriptor = "(B)V")
	public void method8253() {
		@Pc(10) Class307 local10 = this.aClass307_86;
		synchronized (this.aClass307_86) {
			this.aClass307_86.method6998();
		}
	}

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(IB)Lclient!k;")
	public Class202 method8255(@OriginalArg(0) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_86;
		@Pc(16) Class202 local16;
		synchronized (this.aClass307_86) {
			local16 = (Class202) this.aClass307_86.method7002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class182 local37 = this.aClass182_114;
		@Pc(46) byte[] local46;
		synchronized (this.aClass182_114) {
			local46 = this.aClass182_114.method3985(arg0, 35);
		}
		local16 = new Class202();
		if (local46 != null) {
			local16.method4761(new Class3_Sub2(local46));
		}
		local16.method4762();
		@Pc(73) Class307 local73 = this.aClass307_86;
		synchronized (this.aClass307_86) {
			this.aClass307_86.method7000(local16, (long) arg0);
			return local16;
		}
	}
}
