import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class42 {

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "Lclient!kh;")
	private final Class134 aClass134_10 = new Class134(64);

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
	public int anInt1455 = 0;

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "Lclient!ul;")
	private final Class246 aClass246_40;

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
	public final int anInt1453;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;)V")
	public Class42(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_40 = arg2;
		this.anInt1453 = this.aClass246_40.method5492(4);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
	public void method1290() {
		@Pc(2) Class134 local2 = this.aClass134_10;
		synchronized (this.aClass134_10) {
			this.aClass134_10.method3267();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	public void method1291() {
		@Pc(6) Class134 local6 = this.aClass134_10;
		synchronized (this.aClass134_10) {
			this.aClass134_10.method3272();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)Lclient!st;")
	public Class226 method1292(@OriginalArg(0) int arg0) {
		@Pc(11) Class134 local11 = this.aClass134_10;
		@Pc(21) Class226 local21;
		synchronized (this.aClass134_10) {
			local21 = (Class226) this.aClass134_10.method3266((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class246 local34 = this.aClass246_40;
		@Pc(43) byte[] local43;
		synchronized (this.aClass246_40) {
			local43 = this.aClass246_40.method5477(4, arg0);
		}
		local21 = new Class226();
		local21.anInt6135 = arg0;
		local21.aClass42_6 = this;
		if (local43 != null) {
			local21.method5100(new Class1_Sub5(local43));
		}
		local21.method5098();
		@Pc(74) Class134 local74 = this.aClass134_10;
		synchronized (this.aClass134_10) {
			this.aClass134_10.method3263((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(IB)V")
	public void method1294() {
		@Pc(6) Class134 local6 = this.aClass134_10;
		synchronized (this.aClass134_10) {
			this.aClass134_10.method3270(5);
		}
	}
}
