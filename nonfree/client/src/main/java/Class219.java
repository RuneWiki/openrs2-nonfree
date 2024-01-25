import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class219 {

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "Lclient!aj;")
	private final Class10 aClass10_35 = new Class10(64);

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "Lclient!aj;")
	public final Class10 aClass10_36 = new Class10(2);

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "Lclient!om;")
	public final Class246 aClass246_170;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "Lclient!om;")
	private final Class246 aClass246_169;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;Lclient!om;)V")
	public Class219(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) Class246 arg3) {
		this.aClass246_170 = arg3;
		this.aClass246_169 = arg2;
		this.aClass246_169.method5673(33);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)V")
	public void method5177() {
		@Pc(6) Class10 local6 = this.aClass10_35;
		synchronized (this.aClass10_35) {
			this.aClass10_35.method258(5);
		}
		local6 = this.aClass10_36;
		synchronized (this.aClass10_36) {
			this.aClass10_36.method258(5);
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
	public void method5179() {
		@Pc(6) Class10 local6 = this.aClass10_35;
		synchronized (this.aClass10_35) {
			this.aClass10_35.method263();
		}
		local6 = this.aClass10_36;
		synchronized (this.aClass10_36) {
			this.aClass10_36.method263();
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BI)Lclient!ic;")
	public Class142 method5180(@OriginalArg(1) int arg0) {
		@Pc(14) Class10 local14 = this.aClass10_35;
		@Pc(24) Class142 local24;
		synchronized (this.aClass10_35) {
			local24 = (Class142) this.aClass10_35.method250((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class246 local37 = this.aClass246_169;
		@Pc(46) byte[] local46;
		synchronized (this.aClass246_169) {
			local46 = this.aClass246_169.method5653(33, arg0);
		}
		local24 = new Class142();
		local24.aClass219_2 = this;
		if (local46 != null) {
			local24.method3768(new Class3_Sub11(local46));
		}
		@Pc(71) Class10 local71 = this.aClass10_35;
		synchronized (this.aClass10_35) {
			this.aClass10_35.method254(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V")
	public void method5181() {
		@Pc(2) Class10 local2 = this.aClass10_35;
		synchronized (this.aClass10_35) {
			this.aClass10_35.method262();
		}
		local2 = this.aClass10_36;
		synchronized (this.aClass10_36) {
			this.aClass10_36.method262();
		}
	}
}
