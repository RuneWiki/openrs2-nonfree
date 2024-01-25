import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class305 {

	@OriginalMember(owner = "client!sfa", name = "j", descriptor = "Lclient!aj;")
	private final Class10 aClass10_55 = new Class10(64);

	@OriginalMember(owner = "client!sfa", name = "m", descriptor = "I")
	public int anInt7787 = 0;

	@OriginalMember(owner = "client!sfa", name = "h", descriptor = "Lclient!om;")
	private final Class246 aClass246_227;

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "I")
	public final int anInt7782;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class305(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_227 = arg2;
		this.anInt7782 = this.aClass246_227.method5673(4);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(BI)Lclient!er;")
	public Class83 method6565(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_55;
		@Pc(16) Class83 local16;
		synchronized (this.aClass10_55) {
			local16 = (Class83) this.aClass10_55.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_227;
		@Pc(38) byte[] local38;
		synchronized (this.aClass246_227) {
			local38 = this.aClass246_227.method5653(4, arg0);
		}
		local16 = new Class83();
		local16.anInt2795 = arg0;
		local16.aClass305_4 = this;
		if (local38 != null) {
			local16.method2541(new Class3_Sub11(local38));
		}
		local16.method2540();
		@Pc(74) Class10 local74 = this.aClass10_55;
		synchronized (this.aClass10_55) {
			this.aClass10_55.method254(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(Z)V")
	public void method6566() {
		@Pc(2) Class10 local2 = this.aClass10_55;
		synchronized (this.aClass10_55) {
			this.aClass10_55.method263();
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ZI)V")
	public void method6567() {
		@Pc(2) Class10 local2 = this.aClass10_55;
		synchronized (this.aClass10_55) {
			this.aClass10_55.method258(5);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)V")
	public void method6569() {
		@Pc(8) Class10 local8 = this.aClass10_55;
		synchronized (this.aClass10_55) {
			this.aClass10_55.method262();
		}
	}
}
