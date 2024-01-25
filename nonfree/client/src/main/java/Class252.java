import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class252 {

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "Lclient!h;")
	private final Class125 aClass125_54 = new Class125(16);

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Lclient!an;")
	private final Class16 aClass16_98;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;)V")
	public Class252(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_98 = arg2;
		this.aClass16_98.method399(29);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)V")
	public void method6261() {
		@Pc(6) Class125 local6 = this.aClass125_54;
		synchronized (this.aClass125_54) {
			this.aClass125_54.method3447(5);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!cu;IIIII)Lclient!le;")
	public Class186 method6262(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class15[] local7 = null;
		@Pc(12) Class193 local12 = this.method6266(arg4);
		if (local12.anIntArray397 != null) {
			local7 = new Class15[local12.anIntArray397.length];
			for (@Pc(22) int local22 = 0; local22 < local7.length; local22++) {
				@Pc(32) Class3 local32 = arg0.method1677(local12.anIntArray397[local22]);
				local7[local22] = new Class15(local32.anInt68, local32.anInt60, local32.anInt65, local32.anInt63, local32.anInt70, local32.anInt67, local32.anInt64, local32.aBoolean3);
			}
		}
		return new Class186(local12.anInt5562, local7, local12.anInt5561, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public void method6263() {
		@Pc(7) Class125 local7 = this.aClass125_54;
		synchronized (this.aClass125_54) {
			this.aClass125_54.method3442();
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	public void method6265() {
		@Pc(2) Class125 local2 = this.aClass125_54;
		synchronized (this.aClass125_54) {
			this.aClass125_54.method3440();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)Lclient!lo;")
	private Class193 method6266(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_54;
		@Pc(16) Class193 local16;
		synchronized (this.aClass125_54) {
			local16 = (Class193) this.aClass125_54.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class16 local29 = this.aClass16_98;
		@Pc(38) byte[] local38;
		synchronized (this.aClass16_98) {
			local38 = this.aClass16_98.method408(29, arg0);
		}
		local16 = new Class193();
		if (local38 != null) {
			local16.method4671(new Class12_Sub8(local38));
		}
		@Pc(65) Class125 local65 = this.aClass125_54;
		synchronized (this.aClass125_54) {
			this.aClass125_54.method3437(local16, (long) arg0);
			return local16;
		}
	}
}
