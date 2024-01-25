import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class101 {

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Lclient!tl;")
	private final Class227 aClass227_19 = new Class227(64);

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "Lclient!ui;")
	private final Class230 aClass230_38;

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
	public final int anInt2671;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;)V")
	public Class101(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2) {
		this.aClass230_38 = arg2;
		this.anInt2671 = this.aClass230_38.method4956(19);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)Lclient!ad;")
	public Class4 method2167(@OriginalArg(1) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_19;
		@Pc(16) Class4 local16;
		synchronized (this.aClass227_19) {
			local16 = (Class4) this.aClass227_19.method4863((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass230_38.method4985(arg0, 19);
		local16 = new Class4();
		if (local38 != null) {
			local16.method53(new Class1_Sub33(local38));
		}
		@Pc(54) Class227 local54 = this.aClass227_19;
		synchronized (this.aClass227_19) {
			this.aClass227_19.method4865(local16, (long) arg0);
			return local16;
		}
	}
}
