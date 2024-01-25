import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class370 {

	@OriginalMember(owner = "client!uda", name = "e", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_90 = new Class307(64);

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "Lclient!qfa;")
	public final Class307 aClass307_91 = new Class307(2);

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "Lclient!ik;")
	private final Class182 aClass182_119;

	@OriginalMember(owner = "client!uda", name = "l", descriptor = "Lclient!ik;")
	public final Class182 aClass182_120;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;Lclient!ik;)V")
	public Class370(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Class182 arg3) {
		this.aClass182_119 = arg2;
		this.aClass182_120 = arg3;
		this.aClass182_119.method3970(33);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
	public void method8504() {
		@Pc(2) Class307 local2 = this.aClass307_90;
		synchronized (this.aClass307_90) {
			this.aClass307_90.method7006();
		}
		local2 = this.aClass307_91;
		synchronized (this.aClass307_91) {
			this.aClass307_91.method7006();
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
	public void method8508() {
		@Pc(2) Class307 local2 = this.aClass307_90;
		synchronized (this.aClass307_90) {
			this.aClass307_90.method6998();
		}
		local2 = this.aClass307_91;
		synchronized (this.aClass307_91) {
			this.aClass307_91.method6998();
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZI)Lclient!tf;")
	public Class356 method8509(@OriginalArg(1) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_90;
		@Pc(16) Class356 local16;
		synchronized (this.aClass307_90) {
			local16 = (Class356) this.aClass307_90.method7002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class182 local30 = this.aClass182_119;
		@Pc(39) byte[] local39;
		synchronized (this.aClass182_119) {
			local39 = this.aClass182_119.method3985(arg0, 33);
		}
		local16 = new Class356();
		local16.aClass370_2 = this;
		if (local39 != null) {
			local16.method7924(new Class3_Sub2(local39));
		}
		@Pc(66) Class307 local66 = this.aClass307_90;
		synchronized (this.aClass307_90) {
			this.aClass307_90.method7000(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)V")
	public void method8511() {
		@Pc(6) Class307 local6 = this.aClass307_90;
		synchronized (this.aClass307_90) {
			this.aClass307_90.method6995(5);
		}
		local6 = this.aClass307_91;
		synchronized (this.aClass307_91) {
			this.aClass307_91.method6995(5);
		}
	}
}
