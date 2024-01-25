import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class242 {

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "Lclient!tl;")
	private final Class227 aClass227_48 = new Class227(128);

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "Lclient!ui;")
	private final Class230 aClass230_83;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;)V")
	public Class242(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2) {
		this.aClass230_83 = arg2;
		if (this.aClass230_83 != null) {
			@Pc(20) int local20 = this.aClass230_83.method4969() - 1;
			this.aClass230_83.method4956(local20);
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IB)Lclient!qb;")
	public Class187 method5294(@OriginalArg(0) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_48;
		@Pc(16) Class187 local16;
		synchronized (this.aClass227_48) {
			local16 = (Class187) this.aClass227_48.method4863((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass230_83.method4985(Static381.method5302(arg0), Static315.method4654(arg0));
		local16 = new Class187();
		if (local37 != null) {
			local16.method4301(new Class1_Sub33(local37));
		}
		@Pc(61) Class227 local61 = this.aClass227_48;
		synchronized (this.aClass227_48) {
			this.aClass227_48.method4865(local16, (long) arg0);
			return local16;
		}
	}
}
