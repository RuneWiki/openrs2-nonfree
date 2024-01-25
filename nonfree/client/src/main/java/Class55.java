import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class55 {

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "Lclient!of;")
	private final Class188 aClass188_15 = new Class188(256);

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "Lclient!mn;")
	private final Class171 aClass171_19;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;)V")
	public Class55(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_19 = arg2;
		this.aClass171_19.method3662(26);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
	public void method1132() {
		@Pc(12) Class188 local12 = this.aClass188_15;
		synchronized (this.aClass188_15) {
			this.aClass188_15.method4169(5);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	public void method1133() {
		@Pc(2) Class188 local2 = this.aClass188_15;
		synchronized (this.aClass188_15) {
			this.aClass188_15.method4156();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)Lclient!dj;")
	public Class2_Sub1_Sub4 method1135(@OriginalArg(0) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_15;
		@Pc(24) Class2_Sub1_Sub4 local24;
		synchronized (this.aClass188_15) {
			local24 = (Class2_Sub1_Sub4) this.aClass188_15.method4158((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class171 local37 = this.aClass171_19;
		@Pc(46) byte[] local46;
		synchronized (this.aClass171_19) {
			local46 = this.aClass171_19.method3658(26, arg0);
		}
		local24 = new Class2_Sub1_Sub4();
		if (local46 != null) {
			local24.method1118(new Class2_Sub17(local46));
		}
		@Pc(68) Class188 local68 = this.aClass188_15;
		synchronized (this.aClass188_15) {
			this.aClass188_15.method4155((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
	public void method1138() {
		@Pc(2) Class188 local2 = this.aClass188_15;
		synchronized (this.aClass188_15) {
			this.aClass188_15.method4154();
		}
	}
}
