import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class146 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Lclient!h;")
	private final Class125 aClass125_25 = new Class125(64);

	@OriginalMember(owner = "client!in", name = "h", descriptor = "Lclient!an;")
	private final Class16 aClass16_54;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "I")
	public final int anInt4592;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;)V")
	public Class146(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_54 = arg2;
		if (this.aClass16_54 == null) {
			this.anInt4592 = 0;
		} else {
			this.anInt4592 = this.aClass16_54.method399(16);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
	public void method3864() {
		@Pc(6) Class125 local6 = this.aClass125_25;
		synchronized (this.aClass125_25) {
			this.aClass125_25.method3442();
		}
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(B)V")
	public void method3867() {
		@Pc(2) Class125 local2 = this.aClass125_25;
		synchronized (this.aClass125_25) {
			this.aClass125_25.method3440();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)Lclient!to;")
	public Class286 method3868(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_25;
		@Pc(16) Class286 local16;
		synchronized (this.aClass125_25) {
			local16 = (Class286) this.aClass125_25.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class16 local35 = this.aClass16_54;
		@Pc(44) byte[] local44;
		synchronized (this.aClass16_54) {
			local44 = this.aClass16_54.method408(16, arg0);
		}
		local16 = new Class286();
		if (local44 != null) {
			local16.method7146(new Class12_Sub8(local44));
		}
		@Pc(66) Class125 local66 = this.aClass125_25;
		synchronized (this.aClass125_25) {
			this.aClass125_25.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V")
	public void method3869() {
		@Pc(11) Class125 local11 = this.aClass125_25;
		synchronized (this.aClass125_25) {
			this.aClass125_25.method3447(5);
		}
	}
}
