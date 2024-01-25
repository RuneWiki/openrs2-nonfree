import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class214 {

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Lclient!tl;")
	private final Class227 aClass227_43 = new Class227(128);

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "Lclient!ui;")
	private final Class230 aClass230_72;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;)V")
	public Class214(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2) {
		this.aClass230_72 = arg2;
		this.aClass230_72.method4956(1);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB)Lclient!wr;")
	public Class251 method4732(@OriginalArg(0) int arg0) {
		@Pc(14) Class227 local14 = this.aClass227_43;
		@Pc(24) Class251 local24;
		synchronized (this.aClass227_43) {
			local24 = (Class251) this.aClass227_43.method4863((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aClass230_72.method4985(arg0, 1);
		local24 = new Class251();
		if (local41 != null) {
			local24.method5566(new Class1_Sub33(local41));
		}
		@Pc(57) Class227 local57 = this.aClass227_43;
		synchronized (this.aClass227_43) {
			this.aClass227_43.method4865(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	public void method4733() {
		@Pc(2) Class227 local2 = this.aClass227_43;
		synchronized (this.aClass227_43) {
			this.aClass227_43.method4858();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
	public void method4735() {
		@Pc(12) Class227 local12 = this.aClass227_43;
		synchronized (this.aClass227_43) {
			this.aClass227_43.method4859(5);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V")
	public void method4739() {
		@Pc(6) Class227 local6 = this.aClass227_43;
		synchronized (this.aClass227_43) {
			this.aClass227_43.method4871();
		}
	}
}
