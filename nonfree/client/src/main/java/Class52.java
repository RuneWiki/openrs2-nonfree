import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class52 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Lclient!tl;")
	private final Class227 aClass227_7 = new Class227(64);

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!tl;")
	public final Class227 aClass227_8 = new Class227(2);

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!ui;")
	private final Class230 aClass230_21;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!ui;")
	public final Class230 aClass230_20;

	static {
		new Class169(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;Lclient!ui;)V")
	public Class52(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2, @OriginalArg(3) Class230 arg3) {
		this.aClass230_21 = arg2;
		this.aClass230_20 = arg3;
		this.aClass230_21.method4956(33);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)V")
	public void method968() {
		@Pc(2) Class227 local2 = this.aClass227_7;
		synchronized (this.aClass227_7) {
			this.aClass227_7.method4859(5);
		}
		local2 = this.aClass227_8;
		synchronized (this.aClass227_8) {
			this.aClass227_8.method4859(5);
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(BI)Lclient!kb;")
	public Class129 method969(@OriginalArg(1) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_7;
		@Pc(16) Class129 local16;
		synchronized (this.aClass227_7) {
			local16 = (Class129) this.aClass227_7.method4863((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass230_21.method4985(arg0, 33);
		local16 = new Class129();
		local16.aClass52_2 = this;
		if (local33 != null) {
			local16.method2660(new Class1_Sub33(local33));
		}
		@Pc(52) Class227 local52 = this.aClass227_7;
		synchronized (this.aClass227_7) {
			this.aClass227_7.method4865(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public void method972() {
		@Pc(11) Class227 local11 = this.aClass227_7;
		synchronized (this.aClass227_7) {
			this.aClass227_7.method4871();
		}
		local11 = this.aClass227_8;
		synchronized (this.aClass227_8) {
			this.aClass227_8.method4871();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public void method973() {
		@Pc(6) Class227 local6 = this.aClass227_7;
		synchronized (this.aClass227_7) {
			this.aClass227_7.method4858();
		}
		local6 = this.aClass227_8;
		synchronized (this.aClass227_8) {
			this.aClass227_8.method4858();
		}
	}
}
