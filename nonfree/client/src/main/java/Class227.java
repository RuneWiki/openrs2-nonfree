import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class227 {

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "Lclient!of;")
	private final Class188 aClass188_50 = new Class188(64);

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
	public int anInt6582 = 0;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Lclient!mn;")
	private final Class171 aClass171_88;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
	public final int anInt6578;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;)V")
	public Class227(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_88 = arg2;
		this.anInt6578 = this.aClass171_88.method3662(4);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)Lclient!md;")
	public Class168 method5234(@OriginalArg(1) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_50;
		@Pc(16) Class168 local16;
		synchronized (this.aClass188_50) {
			local16 = (Class168) this.aClass188_50.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_88;
		@Pc(38) byte[] local38;
		synchronized (this.aClass171_88) {
			local38 = this.aClass171_88.method3658(4, arg0);
		}
		local16 = new Class168();
		local16.anInt4342 = arg0;
		local16.aClass227_4 = this;
		if (local38 != null) {
			local16.method3489(new Class2_Sub17(local38));
		}
		local16.method3493();
		@Pc(75) Class188 local75 = this.aClass188_50;
		synchronized (this.aClass188_50) {
			this.aClass188_50.method4155((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	public void method5237() {
		@Pc(2) Class188 local2 = this.aClass188_50;
		synchronized (this.aClass188_50) {
			this.aClass188_50.method4154();
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V")
	public void method5238() {
		@Pc(6) Class188 local6 = this.aClass188_50;
		synchronized (this.aClass188_50) {
			this.aClass188_50.method4156();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
	public void method5239() {
		@Pc(6) Class188 local6 = this.aClass188_50;
		synchronized (this.aClass188_50) {
			this.aClass188_50.method4169(5);
		}
	}
}
