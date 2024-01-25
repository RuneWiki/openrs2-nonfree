import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class128 {

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!lga;")
	private final Class207 aClass207_20 = new Class207(64);

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!sea;")
	private final Class308 aClass308_77;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!sea;")
	private final Class308 aClass308_75;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(ILclient!sea;Lclient!sea;)V")
	public Class128(@OriginalArg(0) int arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_77 = arg1;
		this.aClass308_75 = arg2;
		if (this.aClass308_77 != null) {
			this.aClass308_77.method6568(0);
		}
		if (this.aClass308_75 != null) {
			this.aClass308_75.method6568(0);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Lclient!daa;")
	public Class1_Sub8_Sub3 method2975(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub8_Sub3 local11 = (Class1_Sub8_Sub3) this.aClass207_20.method4390((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 < 32768) {
			local29 = this.aClass308_77.method6569(0, arg0);
		} else {
			local29 = this.aClass308_75.method6569(0, arg0 & 0x7FFF);
		}
		local11 = new Class1_Sub8_Sub3();
		if (local29 != null) {
			local11.method1326(new Class1_Sub3(local29));
		}
		if (arg0 >= 32768) {
			local11.method1324();
		}
		this.aClass207_20.method4391((long) arg0, local11);
		return local11;
	}
}
