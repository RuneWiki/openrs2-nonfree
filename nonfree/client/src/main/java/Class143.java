import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class143 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_44 = new Class307(128);

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "Lclient!ik;")
	private final Class182 aClass182_60;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class143(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_60 = arg2;
		this.aClass182_60.method3970(1);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)V")
	public void method3263() {
		@Pc(6) Class307 local6 = this.aClass307_44;
		synchronized (this.aClass307_44) {
			this.aClass307_44.method6995(5);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
	public void method3264() {
		@Pc(11) Class307 local11 = this.aClass307_44;
		synchronized (this.aClass307_44) {
			this.aClass307_44.method6998();
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
	public void method3266() {
		@Pc(13) Class307 local13 = this.aClass307_44;
		synchronized (this.aClass307_44) {
			this.aClass307_44.method7006();
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZI)Lclient!dj;")
	public Class77 method3267(@OriginalArg(1) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_44;
		@Pc(16) Class77 local16;
		synchronized (this.aClass307_44) {
			local16 = (Class77) this.aClass307_44.method7002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class182 local30 = this.aClass182_60;
		@Pc(46) byte[] local46;
		synchronized (this.aClass182_60) {
			local46 = this.aClass182_60.method3985(arg0, 1);
		}
		local16 = new Class77();
		if (local46 != null) {
			local16.method2187(new Class3_Sub2(local46));
		}
		@Pc(75) Class307 local75 = this.aClass307_44;
		synchronized (this.aClass307_44) {
			this.aClass307_44.method7000(local16, (long) arg0);
			return local16;
		}
	}
}
