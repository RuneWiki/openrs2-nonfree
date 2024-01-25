import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kia")
public final class Class194 {

	@OriginalMember(owner = "client!kia", name = "l", descriptor = "Lclient!af;")
	private final Class10 aClass10_31 = new Class10(16);

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "Lclient!ae;")
	private final Class8 aClass8_84;

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class194(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_84 = arg2;
		this.aClass8_84.method280(29);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIIIILclient!hka;)Lclient!eq;")
	public Class93 method4409(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class147 arg4) {
		@Pc(7) Class51[] local7 = null;
		@Pc(17) Class365 local17 = this.method4410(arg0);
		if (local17.anIntArray671 != null) {
			local7 = new Class51[local17.anIntArray671.length];
			for (@Pc(27) int local27 = 0; local27 < local7.length; local27++) {
				@Pc(37) Class139 local37 = arg4.method3207(local17.anIntArray671[local27]);
				local7[local27] = new Class51(local37.anInt3630, local37.anInt3629, local37.anInt3622, local37.anInt3623, local37.anInt3624, local37.anInt3626, local37.anInt3625, local37.aBoolean215);
			}
		}
		return new Class93(local17.anInt10173, local7, local17.anInt10178, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(II)Lclient!vca;")
	private Class365 method4410(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_31;
		@Pc(16) Class365 local16;
		synchronized (this.aClass10_31) {
			local16 = (Class365) this.aClass10_31.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class8 local29 = this.aClass8_84;
		@Pc(38) byte[] local38;
		synchronized (this.aClass8_84) {
			local38 = this.aClass8_84.method262(arg0, 29);
		}
		local16 = new Class365();
		if (local38 != null) {
			local16.method8611(new Class6_Sub23(local38));
		}
		@Pc(60) Class10 local60 = this.aClass10_31;
		synchronized (this.aClass10_31) {
			this.aClass10_31.method366(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "(II)V")
	public void method4411() {
		@Pc(11) Class10 local11 = this.aClass10_31;
		synchronized (this.aClass10_31) {
			this.aClass10_31.method369(5);
		}
	}

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "(I)V")
	public void method4414() {
		@Pc(2) Class10 local2 = this.aClass10_31;
		synchronized (this.aClass10_31) {
			this.aClass10_31.method380();
		}
	}

	@OriginalMember(owner = "client!kia", name = "c", descriptor = "(I)V")
	public void method4415() {
		@Pc(14) Class10 local14 = this.aClass10_31;
		synchronized (this.aClass10_31) {
			this.aClass10_31.method375();
		}
	}
}
