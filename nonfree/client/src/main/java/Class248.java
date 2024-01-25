import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class248 {

	@OriginalMember(owner = "client!op", name = "l", descriptor = "I")
	public int anInt6668;

	@OriginalMember(owner = "client!op", name = "f", descriptor = "Lclient!aj;")
	private final Class10 aClass10_39 = new Class10(64);

	@OriginalMember(owner = "client!op", name = "k", descriptor = "Lclient!aj;")
	public final Class10 aClass10_40 = new Class10(60);

	@OriginalMember(owner = "client!op", name = "h", descriptor = "Lclient!om;")
	public final Class246 aClass246_186;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "Lclient!om;")
	private final Class246 aClass246_185;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;Lclient!om;)V")
	public Class248(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) Class246 arg3) {
		this.aClass246_186 = arg3;
		this.aClass246_185 = arg2;
		@Pc(26) int local26 = this.aClass246_185.method5682() - 1;
		this.aClass246_185.method5673(local26);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
	public void method5704(@OriginalArg(0) int arg0) {
		this.anInt6668 = arg0;
		@Pc(9) Class10 local9 = this.aClass10_40;
		synchronized (this.aClass10_40) {
			this.aClass10_40.method263();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public void method5705() {
		@Pc(6) Class10 local6 = this.aClass10_39;
		synchronized (this.aClass10_39) {
			this.aClass10_39.method263();
		}
		local6 = this.aClass10_40;
		synchronized (this.aClass10_40) {
			this.aClass10_40.method263();
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	public void method5706() {
		@Pc(2) Class10 local2 = this.aClass10_39;
		synchronized (this.aClass10_39) {
			this.aClass10_39.method262();
		}
		local2 = this.aClass10_40;
		synchronized (this.aClass10_40) {
			this.aClass10_40.method262();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IZ)V")
	public void method5707() {
		@Pc(2) Class10 local2 = this.aClass10_39;
		synchronized (this.aClass10_39) {
			this.aClass10_39.method258(5);
		}
		local2 = this.aClass10_40;
		synchronized (this.aClass10_40) {
			this.aClass10_40.method258(5);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BI)Lclient!k;")
	public Class175 method5708(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_39;
		@Pc(16) Class175 local16;
		synchronized (this.aClass10_39) {
			local16 = (Class175) this.aClass10_39.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_185;
		@Pc(42) byte[] local42;
		synchronized (this.aClass246_185) {
			local42 = this.aClass246_185.method5653(Static547.method7326(arg0), Static545.method7268(arg0));
		}
		local16 = new Class175();
		local16.aClass248_1 = this;
		local16.anInt4953 = arg0;
		if (local42 != null) {
			local16.method4328(new Class3_Sub11(local42));
		}
		@Pc(76) Class10 local76 = this.aClass10_39;
		synchronized (this.aClass10_39) {
			this.aClass10_39.method254(local16, (long) arg0);
			return local16;
		}
	}
}
