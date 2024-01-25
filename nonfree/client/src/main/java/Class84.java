import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class84 {

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "Lclient!co;")
	private final Class41 aClass41_26 = new Class41(128);

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "Lclient!g;")
	private final Class83 aClass83_51;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;)V")
	public Class84(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_51 = arg2;
		if (this.aClass83_51 != null) {
			@Pc(20) int local20 = this.aClass83_51.method1956() - 1;
			this.aClass83_51.method1955(local20);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Lclient!ea;")
	public Class61 method1984(@OriginalArg(0) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_26;
		@Pc(16) Class61 local16;
		synchronized (this.aClass41_26) {
			local16 = (Class61) this.aClass41_26.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(45) byte[] local45 = this.aClass83_51.method1968(Static131.method2288(arg0), Static371.method5906(arg0));
		local16 = new Class61();
		if (local45 != null) {
			local16.method1372(new Class2_Sub24(local45));
		}
		@Pc(61) Class41 local61 = this.aClass41_26;
		synchronized (this.aClass41_26) {
			this.aClass41_26.method832((long) arg0, local16);
			return local16;
		}
	}
}
