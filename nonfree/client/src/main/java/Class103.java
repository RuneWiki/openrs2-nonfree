import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class103 {

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "Lclient!ku;")
	private final Class139 aClass139_32 = new Class139(128);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Lclient!b;")
	private final Class20 aClass20_39;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;)V")
	public Class103(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		this.aClass20_39 = arg2;
		if (this.aClass20_39 != null) {
			@Pc(20) int local20 = this.aClass20_39.method229() - 1;
			this.aClass20_39.method231(local20);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Lclient!li;")
	public Class146 method2198(@OriginalArg(0) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_32;
		@Pc(25) Class146 local25;
		synchronized (this.aClass139_32) {
			local25 = (Class146) this.aClass139_32.method3076((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(48) byte[] local48 = this.aClass20_39.method253(Static297.method4591(arg0), Static96.method1620(arg0));
		local25 = new Class146();
		if (local48 != null) {
			local25.method3157(new Class3_Sub5(local48));
		}
		local6 = this.aClass139_32;
		synchronized (this.aClass139_32) {
			this.aClass139_32.method3070(local25, (long) arg0);
			return local25;
		}
	}
}
