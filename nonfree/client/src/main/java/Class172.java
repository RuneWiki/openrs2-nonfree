import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class172 {

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "Lclient!h;")
	private final Class125 aClass125_37 = new Class125(256);

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "Lclient!an;")
	private final Class16 aClass16_69;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;)V")
	public Class172(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_69 = arg2;
		this.aClass16_69.method399(26);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)Lclient!dca;")
	public Class12_Sub4_Sub2 method4373(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_37;
		@Pc(16) Class12_Sub4_Sub2 local16;
		synchronized (this.aClass125_37) {
			local16 = (Class12_Sub4_Sub2) this.aClass125_37.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class16 local34 = this.aClass16_69;
		@Pc(43) byte[] local43;
		synchronized (this.aClass16_69) {
			local43 = this.aClass16_69.method408(26, arg0);
		}
		local16 = new Class12_Sub4_Sub2();
		if (local43 != null) {
			local16.method1872(new Class12_Sub8(local43));
		}
		@Pc(65) Class125 local65 = this.aClass125_37;
		synchronized (this.aClass125_37) {
			this.aClass125_37.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	public void method4374() {
		@Pc(10) Class125 local10 = this.aClass125_37;
		synchronized (this.aClass125_37) {
			this.aClass125_37.method3440();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)V")
	public void method4375() {
		@Pc(10) Class125 local10 = this.aClass125_37;
		synchronized (this.aClass125_37) {
			this.aClass125_37.method3447(5);
		}
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
	public void method4377() {
		@Pc(6) Class125 local6 = this.aClass125_37;
		synchronized (this.aClass125_37) {
			this.aClass125_37.method3442();
		}
	}
}
