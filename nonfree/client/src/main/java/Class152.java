import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class152 {

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "Lclient!of;")
	private final Class188 aClass188_36 = new Class188(64);

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "Lclient!mn;")
	private final Class171 aClass171_48;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;)V")
	public Class152(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_48 = arg2;
		this.aClass171_48.method3662(31);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public void method3071() {
		@Pc(2) Class188 local2 = this.aClass188_36;
		synchronized (this.aClass188_36) {
			this.aClass188_36.method4154();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZ)V")
	public void method3073() {
		@Pc(10) Class188 local10 = this.aClass188_36;
		synchronized (this.aClass188_36) {
			this.aClass188_36.method4169(5);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)Lclient!kl;")
	public Class146 method3074(@OriginalArg(1) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_36;
		@Pc(16) Class146 local16;
		synchronized (this.aClass188_36) {
			local16 = (Class146) this.aClass188_36.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_48;
		@Pc(38) byte[] local38;
		synchronized (this.aClass171_48) {
			local38 = this.aClass171_48.method3658(31, arg0);
		}
		local16 = new Class146();
		if (local38 != null) {
			local16.method3045(new Class2_Sub17(local38));
		}
		@Pc(60) Class188 local60 = this.aClass188_36;
		synchronized (this.aClass188_36) {
			this.aClass188_36.method4155((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
	public void method3075() {
		@Pc(2) Class188 local2 = this.aClass188_36;
		synchronized (this.aClass188_36) {
			this.aClass188_36.method4156();
		}
	}
}
