import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class162 {

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "Lclient!co;")
	private final Class41 aClass41_52 = new Class41(16);

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "Lclient!g;")
	private final Class83 aClass83_81;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;)V")
	public Class162(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_81 = arg2;
		this.aClass83_81.method1955(30);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Lclient!ee;")
	public Class63 method4134(@OriginalArg(1) int arg0) {
		@Pc(11) Class41 local11 = this.aClass41_52;
		@Pc(21) Class63 local21;
		synchronized (this.aClass41_52) {
			local21 = (Class63) this.aClass41_52.method823((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass83_81.method1968(arg0, 30);
		local21 = new Class63();
		if (local38 != null) {
			local21.method1417(new Class2_Sub24(local38));
		}
		@Pc(54) Class41 local54 = this.aClass41_52;
		synchronized (this.aClass41_52) {
			this.aClass41_52.method832((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
	public void method4135() {
		@Pc(6) Class41 local6 = this.aClass41_52;
		synchronized (this.aClass41_52) {
			this.aClass41_52.method829();
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public void method4137() {
		@Pc(2) Class41 local2 = this.aClass41_52;
		synchronized (this.aClass41_52) {
			this.aClass41_52.method825();
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V")
	public void method4139() {
		@Pc(6) Class41 local6 = this.aClass41_52;
		synchronized (this.aClass41_52) {
			this.aClass41_52.method826(5);
		}
	}
}
