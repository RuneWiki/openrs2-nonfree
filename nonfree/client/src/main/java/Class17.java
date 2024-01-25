import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class17 {

	@OriginalMember(owner = "client!as", name = "f", descriptor = "Lclient!ku;")
	private final Class139 aClass139_2 = new Class139(64);

	@OriginalMember(owner = "client!as", name = "h", descriptor = "Lclient!b;")
	private final Class20 aClass20_6;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "I")
	public final int anInt214;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;)V")
	public Class17(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		this.aClass20_6 = arg2;
		this.anInt214 = this.aClass20_6.method231(19);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BI)Lclient!tn;")
	public Class226 method208(@OriginalArg(1) int arg0) {
		@Pc(14) Class139 local14 = this.aClass139_2;
		@Pc(24) Class226 local24;
		synchronized (this.aClass139_2) {
			local24 = (Class226) this.aClass139_2.method3076((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aClass20_6.method253(arg0, 19);
		local24 = new Class226();
		if (local41 != null) {
			local24.method5119(new Class3_Sub5(local41));
		}
		@Pc(57) Class139 local57 = this.aClass139_2;
		synchronized (this.aClass139_2) {
			this.aClass139_2.method3070(local24, (long) arg0);
			return local24;
		}
	}
}
