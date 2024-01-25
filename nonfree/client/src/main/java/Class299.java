import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qha")
public final class Class299 {

	@OriginalMember(owner = "client!qha", name = "h", descriptor = "Lclient!aq;")
	private final Class22 aClass22_44 = new Class22(16);

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "Lclient!gga;")
	private final Class124 aClass124_103;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class299(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_103 = arg2;
		this.aClass124_103.method3629(29);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIILclient!jba;I)Lclient!no;")
	public Class251 method7742(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class176 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class304[] local7 = null;
		@Pc(12) Class17 local12 = this.method7744(arg0);
		if (local12.anIntArray37 != null) {
			local7 = new Class304[local12.anIntArray37.length];
			for (@Pc(22) int local22 = 0; local22 < local7.length; local22++) {
				@Pc(32) Class115 local32 = arg3.method4652(local12.anIntArray37[local22]);
				local7[local22] = new Class304(local32.anInt3823, local32.anInt3813, local32.anInt3819, local32.anInt3815, local32.anInt3817, local32.anInt3816, local32.anInt3820, local32.aBoolean300);
			}
		}
		return new Class251(local12.anInt387, local7, local12.anInt385, arg2, arg4, arg1);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(II)V")
	public void method7743() {
		@Pc(10) Class22 local10 = this.aClass22_44;
		synchronized (this.aClass22_44) {
			this.aClass22_44.method468(5);
		}
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(II)Lclient!aka;")
	private Class17 method7744(@OriginalArg(1) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_44;
		@Pc(16) Class17 local16;
		synchronized (this.aClass22_44) {
			local16 = (Class17) this.aClass22_44.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_103;
		@Pc(38) byte[] local38;
		synchronized (this.aClass124_103) {
			local38 = this.aClass124_103.method3641(29, arg0);
		}
		local16 = new Class17();
		if (local38 != null) {
			local16.method404(new Class2_Sub8(local38));
		}
		@Pc(62) Class22 local62 = this.aClass22_44;
		synchronized (this.aClass22_44) {
			this.aClass22_44.method470((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(B)V")
	public void method7745() {
		@Pc(10) Class22 local10 = this.aClass22_44;
		synchronized (this.aClass22_44) {
			this.aClass22_44.method473();
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Z)V")
	public void method7747() {
		@Pc(12) Class22 local12 = this.aClass22_44;
		synchronized (this.aClass22_44) {
			this.aClass22_44.method461();
		}
	}
}
