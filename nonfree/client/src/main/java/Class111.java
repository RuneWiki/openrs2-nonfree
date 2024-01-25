import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class111 {

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Lclient!qfa;")
	private Class307 aClass307_41 = new Class307(128);

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "Lclient!qfa;")
	public Class307 aClass307_42 = new Class307(64);

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!ik;")
	private final Class182 aClass182_45;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "Lclient!ik;")
	public final Class182 aClass182_44;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;Lclient!ik;)V")
	public Class111(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Class182 arg3) {
		this.aClass182_45 = arg2;
		this.aClass182_44 = arg3;
		this.aClass182_45.method3970(36);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Lclient!jo;")
	public Class198 method2739(@OriginalArg(0) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_41;
		@Pc(16) Class198 local16;
		synchronized (this.aClass307_41) {
			local16 = (Class198) this.aClass307_41.method7002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class182 local30 = this.aClass182_45;
		@Pc(39) byte[] local39;
		synchronized (this.aClass182_45) {
			local39 = this.aClass182_45.method3985(arg0, 36);
		}
		local16 = new Class198();
		local16.anInt5151 = arg0;
		local16.aClass111_4 = this;
		if (local39 != null) {
			local16.method4669(new Class3_Sub2(local39));
		}
		local16.method4673();
		@Pc(72) Class307 local72 = this.aClass307_41;
		synchronized (this.aClass307_41) {
			this.aClass307_41.method7000(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	public void method2740() {
		@Pc(2) Class307 local2 = this.aClass307_41;
		synchronized (this.aClass307_41) {
			this.aClass307_41.method7006();
		}
		local2 = this.aClass307_42;
		synchronized (this.aClass307_42) {
			this.aClass307_42.method7006();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V")
	public void method2741() {
		@Pc(2) Class307 local2 = this.aClass307_41;
		synchronized (this.aClass307_41) {
			this.aClass307_41.method6995(5);
		}
		local2 = this.aClass307_42;
		synchronized (this.aClass307_42) {
			this.aClass307_42.method6995(5);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIZ)V")
	public void method2744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass307_41 = new Class307(arg0);
		this.aClass307_42 = new Class307(arg1);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
	public void method2746() {
		@Pc(6) Class307 local6 = this.aClass307_41;
		synchronized (this.aClass307_41) {
			this.aClass307_41.method6998();
		}
		local6 = this.aClass307_42;
		synchronized (this.aClass307_42) {
			this.aClass307_42.method6998();
		}
	}
}
