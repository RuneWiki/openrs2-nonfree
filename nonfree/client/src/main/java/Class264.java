import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class264 {

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!wf;")
	private final Class316 aClass316_57 = new Class316(64);

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "Lclient!kda;")
	private final Class160 aClass160_91;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Lclient!kda;")
	private final Class160 aClass160_90;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(ILclient!kda;Lclient!kda;)V")
	public Class264(@OriginalArg(0) int arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_91 = arg1;
		this.aClass160_90 = arg2;
		if (this.aClass160_91 != null) {
			this.aClass160_91.method4207(0);
		}
		if (this.aClass160_90 != null) {
			this.aClass160_90.method4207(0);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Lclient!mk;")
	public Class1_Sub1_Sub14 method6377(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub1_Sub14 local11 = (Class1_Sub1_Sub14) this.aClass316_57.method7799((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(32) byte[] local32;
		if (arg0 < 32768) {
			local32 = this.aClass160_91.method4198(arg0, 0);
		} else {
			local32 = this.aClass160_90.method4198(arg0 & 0x7FFF, 0);
		}
		local11 = new Class1_Sub1_Sub14();
		if (local32 != null) {
			local11.method5054(new Class1_Sub13(local32));
		}
		if (arg0 >= 32768) {
			local11.method5052();
		}
		this.aClass316_57.method7792((long) arg0, local11);
		return local11;
	}
}
