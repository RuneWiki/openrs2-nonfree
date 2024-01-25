import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class71 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Lclient!aj;")
	private final Class10 aClass10_11 = new Class10(256);

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Lclient!om;")
	private final Class246 aClass246_60;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class71(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_60 = arg2;
		this.aClass246_60.method5673(26);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)Lclient!oi;")
	public Class3_Sub3_Sub14 method2252(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_11;
		@Pc(16) Class3_Sub3_Sub14 local16;
		synchronized (this.aClass10_11) {
			local16 = (Class3_Sub3_Sub14) this.aClass10_11.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class246 local34 = this.aClass246_60;
		@Pc(43) byte[] local43;
		synchronized (this.aClass246_60) {
			local43 = this.aClass246_60.method5653(26, arg0);
		}
		local16 = new Class3_Sub3_Sub14();
		if (local43 != null) {
			local16.method5619(new Class3_Sub11(local43));
		}
		@Pc(65) Class10 local65 = this.aClass10_11;
		synchronized (this.aClass10_11) {
			this.aClass10_11.method254(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
	public void method2253() {
		@Pc(2) Class10 local2 = this.aClass10_11;
		synchronized (this.aClass10_11) {
			this.aClass10_11.method263();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public void method2254() {
		@Pc(2) Class10 local2 = this.aClass10_11;
		synchronized (this.aClass10_11) {
			this.aClass10_11.method262();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)V")
	public void method2255() {
		@Pc(2) Class10 local2 = this.aClass10_11;
		synchronized (this.aClass10_11) {
			this.aClass10_11.method258(5);
		}
	}
}
