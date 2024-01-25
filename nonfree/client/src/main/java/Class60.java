import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class60 {

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "Lclient!h;")
	private final Class125 aClass125_9 = new Class125(16);

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "Lclient!an;")
	private final Class16 aClass16_15;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;)V")
	public Class60(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_15 = arg2;
		this.aClass16_15.method399(30);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZI)V")
	public void method1675() {
		@Pc(2) Class125 local2 = this.aClass125_9;
		synchronized (this.aClass125_9) {
			this.aClass125_9.method3447(5);
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
	public void method1676() {
		@Pc(2) Class125 local2 = this.aClass125_9;
		synchronized (this.aClass125_9) {
			this.aClass125_9.method3440();
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)Lclient!ab;")
	public Class3 method1677(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_9;
		@Pc(16) Class3 local16;
		synchronized (this.aClass125_9) {
			local16 = (Class3) this.aClass125_9.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class16 local35 = this.aClass16_15;
		@Pc(44) byte[] local44;
		synchronized (this.aClass16_15) {
			local44 = this.aClass16_15.method408(30, arg0);
		}
		local16 = new Class3();
		if (local44 != null) {
			local16.method196(new Class12_Sub8(local44));
		}
		@Pc(66) Class125 local66 = this.aClass125_9;
		synchronized (this.aClass125_9) {
			this.aClass125_9.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V")
	public void method1678() {
		@Pc(6) Class125 local6 = this.aClass125_9;
		synchronized (this.aClass125_9) {
			this.aClass125_9.method3442();
		}
	}
}
