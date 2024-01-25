import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class122 {

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
	public int anInt3854 = 0;

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
	public int anInt3855 = 0;

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "Lclient!h;")
	private final Class125 aClass125_22 = new Class125(64);

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "Lclient!sp;")
	private Interface16 anInterface16_1 = null;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "Lclient!an;")
	private final Class16 aClass16_45;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "Lclient!an;")
	private final Class16 aClass16_46;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(ILclient!an;Lclient!an;Lclient!sp;)V")
	public Class122(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) Interface16 arg3) {
		this.aClass16_45 = arg1;
		this.anInterface16_1 = arg3;
		this.aClass16_46 = arg2;
		if (this.aClass16_45 != null) {
			this.anInt3854 = this.aClass16_45.method399(1);
		}
		if (this.aClass16_46 != null) {
			this.anInt3855 = this.aClass16_46.method399(1);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)Lclient!sf;")
	public Class12_Sub4_Sub17 method3365(@OriginalArg(0) int arg0) {
		@Pc(11) Class12_Sub4_Sub17 local11 = (Class12_Sub4_Sub17) this.aClass125_22.method3446((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(34) byte[] local34;
		if (arg0 >= 32768) {
			local34 = this.aClass16_46.method408(1, arg0 & 0x7FFF);
		} else {
			local34 = this.aClass16_45.method408(1, arg0);
		}
		local11 = new Class12_Sub4_Sub17();
		local11.aClass122_2 = this;
		if (local34 != null) {
			local11.method6781(new Class12_Sub8(local34));
		}
		if (arg0 >= 32768) {
			local11.method6777();
		}
		this.aClass125_22.method3437(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!oca;[IBJ)Ljava/lang/String;")
	public String method3368(@OriginalArg(0) Class225 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface16_1 != null) {
			@Pc(14) String local14 = this.anInterface16_1.method2686(arg0, arg2, arg1);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg2);
	}
}
