import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class150 {

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_45 = new Class307(64);

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!ik;")
	private final Class182 aClass182_62;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class150(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_62 = arg2;
		if (this.aClass182_62 != null) {
			this.aClass182_62.method3970(11);
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	public void method3381() {
		@Pc(6) Class307 local6 = this.aClass307_45;
		synchronized (this.aClass307_45) {
			this.aClass307_45.method7006();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)Lclient!qda;")
	public Class303 method3385(@OriginalArg(1) int arg0) {
		@Pc(16) Class307 local16 = this.aClass307_45;
		@Pc(26) Class303 local26;
		synchronized (this.aClass307_45) {
			local26 = (Class303) this.aClass307_45.method7002((long) arg0);
		}
		if (local26 != null) {
			return local26;
		}
		@Pc(40) Class182 local40 = this.aClass182_62;
		@Pc(49) byte[] local49;
		synchronized (this.aClass182_62) {
			local49 = this.aClass182_62.method3985(arg0, 11);
		}
		local26 = new Class303();
		if (local49 != null) {
			local26.method6977(new Class3_Sub2(local49));
		}
		@Pc(73) Class307 local73 = this.aClass307_45;
		synchronized (this.aClass307_45) {
			this.aClass307_45.method7000(local26, (long) arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public void method3386() {
		@Pc(10) Class307 local10 = this.aClass307_45;
		synchronized (this.aClass307_45) {
			this.aClass307_45.method6998();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)V")
	public void method3387() {
		@Pc(2) Class307 local2 = this.aClass307_45;
		synchronized (this.aClass307_45) {
			this.aClass307_45.method6995(5);
		}
	}
}
