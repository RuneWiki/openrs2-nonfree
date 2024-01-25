import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class174 {

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "Lclient!of;")
	private final Class188 aClass188_38 = new Class188(64);

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "Lclient!mn;")
	public final Class171 aClass171_62;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "Lclient!mn;")
	private final Class171 aClass171_61;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;Lclient!mn;)V")
	public Class174(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		this.aClass171_62 = arg3;
		this.aClass171_61 = arg2;
		this.aClass171_61.method3662(3);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BI)V")
	public void method3694() {
		@Pc(2) Class188 local2 = this.aClass188_38;
		synchronized (this.aClass188_38) {
			this.aClass188_38.method4169(5);
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(BI)Lclient!jo;")
	public Class138 method3695(@OriginalArg(1) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_38;
		@Pc(16) Class138 local16;
		synchronized (this.aClass188_38) {
			local16 = (Class138) this.aClass188_38.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_61;
		@Pc(38) byte[] local38;
		synchronized (this.aClass171_61) {
			local38 = this.aClass171_61.method3658(3, arg0);
		}
		local16 = new Class138();
		local16.aClass174_1 = this;
		if (local38 != null) {
			local16.method2825(new Class2_Sub17(local38));
		}
		@Pc(63) Class188 local63 = this.aClass188_38;
		synchronized (this.aClass188_38) {
			this.aClass188_38.method4155((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
	public void method3699() {
		@Pc(2) Class188 local2 = this.aClass188_38;
		synchronized (this.aClass188_38) {
			this.aClass188_38.method4156();
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(Z)V")
	public void method3700() {
		@Pc(2) Class188 local2 = this.aClass188_38;
		synchronized (this.aClass188_38) {
			this.aClass188_38.method4154();
		}
	}
}
