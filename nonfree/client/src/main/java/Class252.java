import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class252 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "Lclient!tl;")
	private final Class227 aClass227_57 = new Class227(64);

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "Lclient!ui;")
	private final Class230 aClass230_93;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;)V")
	public Class252(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2) {
		this.aClass230_93 = arg2;
		this.aClass230_93.method4956(31);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BI)V")
	public void method5568() {
		@Pc(6) Class227 local6 = this.aClass227_57;
		synchronized (this.aClass227_57) {
			this.aClass227_57.method4859(5);
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
	public void method5569() {
		@Pc(14) Class227 local14 = this.aClass227_57;
		synchronized (this.aClass227_57) {
			this.aClass227_57.method4871();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)Lclient!jm;")
	public Class121 method5570(@OriginalArg(0) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_57;
		@Pc(16) Class121 local16;
		synchronized (this.aClass227_57) {
			local16 = (Class121) this.aClass227_57.method4863((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass230_93.method4985(arg0, 31);
		local16 = new Class121();
		if (local33 != null) {
			local16.method2586(new Class1_Sub33(local33));
		}
		@Pc(49) Class227 local49 = this.aClass227_57;
		synchronized (this.aClass227_57) {
			this.aClass227_57.method4865(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
	public void method5574() {
		@Pc(6) Class227 local6 = this.aClass227_57;
		synchronized (this.aClass227_57) {
			this.aClass227_57.method4858();
		}
	}
}
