import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class229 {

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "Lclient!tl;")
	private final Class227 aClass227_44 = new Class227(64);

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "Lclient!ui;")
	private final Class230 aClass230_77;

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
	public final int anInt5674;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;)V")
	public Class229(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2) {
		this.aClass230_77 = arg2;
		if (this.aClass230_77 == null) {
			this.anInt5674 = 0;
		} else {
			this.anInt5674 = this.aClass230_77.method4956(16);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	public void method4879() {
		@Pc(6) Class227 local6 = this.aClass227_44;
		synchronized (this.aClass227_44) {
			this.aClass227_44.method4858();
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)V")
	public void method4881() {
		@Pc(16) Class227 local16 = this.aClass227_44;
		synchronized (this.aClass227_44) {
			this.aClass227_44.method4859(5);
		}
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(II)Lclient!sg;")
	public Class210 method4882(@OriginalArg(0) int arg0) {
		@Pc(11) Class227 local11 = this.aClass227_44;
		@Pc(21) Class210 local21;
		synchronized (this.aClass227_44) {
			local21 = (Class210) this.aClass227_44.method4863((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass230_77.method4985(arg0, 16);
		local21 = new Class210();
		if (local38 != null) {
			local21.method4701(new Class1_Sub33(local38));
		}
		@Pc(54) Class227 local54 = this.aClass227_44;
		synchronized (this.aClass227_44) {
			this.aClass227_44.method4865(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V")
	public void method4885() {
		@Pc(6) Class227 local6 = this.aClass227_44;
		synchronized (this.aClass227_44) {
			this.aClass227_44.method4871();
		}
	}
}
