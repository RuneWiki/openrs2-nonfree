import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class187 {

	@OriginalMember(owner = "client!jt", name = "i", descriptor = "Lclient!aq;")
	private final Class22 aClass22_26 = new Class22(64);

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "Lclient!gga;")
	private final Class124 aClass124_67;

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
	public final int anInt5395;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class187(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_67 = arg2;
		if (this.aClass124_67 == null) {
			this.anInt5395 = 0;
		} else {
			this.anInt5395 = this.aClass124_67.method3629(16);
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BI)Lclient!fp;")
	public Class111 method4891(@OriginalArg(1) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_26;
		@Pc(16) Class111 local16;
		synchronized (this.aClass22_26) {
			local16 = (Class111) this.aClass22_26.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_67;
		@Pc(38) byte[] local38;
		synchronized (this.aClass124_67) {
			local38 = this.aClass124_67.method3641(16, arg0);
		}
		local16 = new Class111();
		if (local38 != null) {
			local16.method3356(new Class2_Sub8(local38));
		}
		@Pc(60) Class22 local60 = this.aClass22_26;
		synchronized (this.aClass22_26) {
			this.aClass22_26.method470((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V")
	public void method4892() {
		@Pc(2) Class22 local2 = this.aClass22_26;
		synchronized (this.aClass22_26) {
			this.aClass22_26.method468(5);
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
	public void method4893() {
		@Pc(6) Class22 local6 = this.aClass22_26;
		synchronized (this.aClass22_26) {
			this.aClass22_26.method461();
		}
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)V")
	public void method4896() {
		@Pc(2) Class22 local2 = this.aClass22_26;
		synchronized (this.aClass22_26) {
			this.aClass22_26.method473();
		}
	}
}
