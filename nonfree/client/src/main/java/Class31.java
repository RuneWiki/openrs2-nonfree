import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class31 {

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "Lclient!tl;")
	private final Class227 aClass227_3 = new Class227(16);

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "Lclient!ui;")
	private final Class230 aClass230_10;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;)V")
	public Class31(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2) {
		this.aClass230_10 = arg2;
		this.aClass230_10.method4956(30);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	public void method518() {
		@Pc(8) Class227 local8 = this.aClass227_3;
		synchronized (this.aClass227_3) {
			this.aClass227_3.method4871();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V")
	public void method519() {
		@Pc(6) Class227 local6 = this.aClass227_3;
		synchronized (this.aClass227_3) {
			this.aClass227_3.method4859(5);
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V")
	public void method521() {
		@Pc(6) Class227 local6 = this.aClass227_3;
		synchronized (this.aClass227_3) {
			this.aClass227_3.method4858();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BI)Lclient!wc;")
	public Class244 method523(@OriginalArg(1) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_3;
		@Pc(16) Class244 local16;
		synchronized (this.aClass227_3) {
			local16 = (Class244) this.aClass227_3.method4863((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass230_10.method4985(arg0, 30);
		local16 = new Class244();
		if (local33 != null) {
			local16.method5418(new Class1_Sub33(local33));
		}
		@Pc(57) Class227 local57 = this.aClass227_3;
		synchronized (this.aClass227_3) {
			this.aClass227_3.method4865(local16, (long) arg0);
			return local16;
		}
	}
}
