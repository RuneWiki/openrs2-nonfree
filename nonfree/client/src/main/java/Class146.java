import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class146 {

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "Lclient!tl;")
	private final Class227 aClass227_22 = new Class227(64);

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "Lclient!ui;")
	public final Class230 aClass230_51;

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "Lclient!ui;")
	private final Class230 aClass230_52;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;Lclient!ui;)V")
	public Class146(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2, @OriginalArg(3) Class230 arg3) {
		this.aClass230_51 = arg3;
		this.aClass230_52 = arg2;
		this.aClass230_52.method4956(3);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
	public void method2949() {
		@Pc(2) Class227 local2 = this.aClass227_22;
		synchronized (this.aClass227_22) {
			this.aClass227_22.method4871();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)Lclient!uo;")
	public Class231 method2950(@OriginalArg(1) int arg0) {
		@Pc(11) Class227 local11 = this.aClass227_22;
		@Pc(21) Class231 local21;
		synchronized (this.aClass227_22) {
			local21 = (Class231) this.aClass227_22.method4863((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass230_52.method4985(arg0, 3);
		local21 = new Class231();
		local21.aClass146_3 = this;
		if (local38 != null) {
			local21.method5023(new Class1_Sub33(local38));
		}
		@Pc(57) Class227 local57 = this.aClass227_22;
		synchronized (this.aClass227_22) {
			this.aClass227_22.method4865(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)V")
	public void method2951() {
		@Pc(2) Class227 local2 = this.aClass227_22;
		synchronized (this.aClass227_22) {
			this.aClass227_22.method4859(5);
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
	public void method2953() {
		@Pc(11) Class227 local11 = this.aClass227_22;
		synchronized (this.aClass227_22) {
			this.aClass227_22.method4858();
		}
	}
}
