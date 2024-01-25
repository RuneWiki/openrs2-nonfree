import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class284 {

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
	public int anInt7408;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "Lclient!aj;")
	private final Class10 aClass10_49 = new Class10(64);

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "Lclient!aj;")
	public final Class10 aClass10_50 = new Class10(50);

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "Lclient!aj;")
	public final Class10 aClass10_51 = new Class10(5);

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!om;")
	private final Class246 aClass246_211;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "Lclient!om;")
	public final Class246 aClass246_212;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "Lclient!mea;")
	public final Class211 aClass211_3;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Z")
	public boolean aBoolean585;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!mea;IZLclient!om;Lclient!om;)V")
	public Class284(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class246 arg3, @OriginalArg(4) Class246 arg4) {
		this.aClass246_211 = arg3;
		this.aClass246_212 = arg4;
		this.aClass211_3 = arg0;
		this.aBoolean585 = arg2;
		if (this.aClass246_211 != null) {
			@Pc(41) int local41 = this.aClass246_211.method5682() - 1;
			this.aClass246_211.method5673(local41);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
	public void method6279(@OriginalArg(0) int arg0) {
		this.anInt7408 = arg0;
		@Pc(9) Class10 local9 = this.aClass10_50;
		synchronized (this.aClass10_50) {
			this.aClass10_50.method263();
		}
		local9 = this.aClass10_51;
		synchronized (this.aClass10_51) {
			this.aClass10_51.method263();
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)Lclient!rr;")
	public Class294 method6281(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_49;
		@Pc(16) Class294 local16;
		synchronized (this.aClass10_49) {
			local16 = (Class294) this.aClass10_49.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class246 local34 = this.aClass246_211;
		@Pc(49) byte[] local49;
		synchronized (this.aClass246_211) {
			local49 = this.aClass246_211.method5653(Static118.method2474(arg0), Static318.method4968(arg0));
		}
		local16 = new Class294();
		local16.anInt7626 = arg0;
		local16.aClass284_1 = this;
		if (local49 != null) {
			local16.method6439(new Class3_Sub11(local49));
		}
		local16.method6431();
		@Pc(82) Class10 local82 = this.aClass10_49;
		synchronized (this.aClass10_49) {
			this.aClass10_49.method254(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)V")
	public void method6282() {
		@Pc(6) Class10 local6 = this.aClass10_49;
		synchronized (this.aClass10_49) {
			this.aClass10_49.method258(5);
		}
		local6 = this.aClass10_50;
		synchronized (this.aClass10_50) {
			this.aClass10_50.method258(5);
		}
		@Pc(46) Class10 local46 = this.aClass10_51;
		synchronized (this.aClass10_51) {
			this.aClass10_51.method258(5);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	public void method6284() {
		@Pc(6) Class10 local6 = this.aClass10_49;
		synchronized (this.aClass10_49) {
			this.aClass10_49.method262();
		}
		local6 = this.aClass10_50;
		synchronized (this.aClass10_50) {
			this.aClass10_50.method262();
		}
		local6 = this.aClass10_51;
		synchronized (this.aClass10_51) {
			this.aClass10_51.method262();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public void method6285() {
		@Pc(2) Class10 local2 = this.aClass10_50;
		synchronized (this.aClass10_50) {
			this.aClass10_50.method263();
		}
		local2 = this.aClass10_51;
		synchronized (this.aClass10_51) {
			this.aClass10_51.method263();
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public void method6286() {
		@Pc(8) Class10 local8 = this.aClass10_49;
		synchronized (this.aClass10_49) {
			this.aClass10_49.method263();
		}
		local8 = this.aClass10_50;
		synchronized (this.aClass10_50) {
			this.aClass10_50.method263();
		}
		local8 = this.aClass10_51;
		synchronized (this.aClass10_51) {
			this.aClass10_51.method263();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BZ)V")
	public void method6287(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean585 != arg0) {
			this.aBoolean585 = arg0;
			this.method6286();
		}
	}
}
