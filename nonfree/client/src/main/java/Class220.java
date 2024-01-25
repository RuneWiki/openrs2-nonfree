import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class220 {

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "Lclient!h;")
	private final Class125 aClass125_48 = new Class125(64);

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
	public int anInt6440 = 0;

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "Lclient!an;")
	private final Class16 aClass16_83;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
	public final int anInt6434;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;)V")
	public Class220(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_83 = arg2;
		this.anInt6434 = this.aClass16_83.method399(4);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)Lclient!om;")
	public Class231 method5376(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_48;
		@Pc(16) Class231 local16;
		synchronized (this.aClass125_48) {
			local16 = (Class231) this.aClass125_48.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class16 local29 = this.aClass16_83;
		@Pc(38) byte[] local38;
		synchronized (this.aClass16_83) {
			local38 = this.aClass16_83.method408(4, arg0);
		}
		local16 = new Class231();
		local16.anInt6673 = arg0;
		local16.aClass220_5 = this;
		if (local38 != null) {
			local16.method5571(new Class12_Sub8(local38));
		}
		local16.method5575();
		@Pc(69) Class125 local69 = this.aClass125_48;
		synchronized (this.aClass125_48) {
			this.aClass125_48.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)V")
	public void method5377() {
		@Pc(12) Class125 local12 = this.aClass125_48;
		synchronized (this.aClass125_48) {
			this.aClass125_48.method3447(5);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
	public void method5378() {
		@Pc(14) Class125 local14 = this.aClass125_48;
		synchronized (this.aClass125_48) {
			this.aClass125_48.method3440();
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
	public void method5380() {
		@Pc(6) Class125 local6 = this.aClass125_48;
		synchronized (this.aClass125_48) {
			this.aClass125_48.method3442();
		}
	}
}
