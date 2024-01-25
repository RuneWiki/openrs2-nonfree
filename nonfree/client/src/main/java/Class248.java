import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class248 {

	@OriginalMember(owner = "client!or", name = "d", descriptor = "Lclient!tb;")
	private final Class313 aClass313_41 = new Class313(64);

	@OriginalMember(owner = "client!or", name = "j", descriptor = "Lclient!pl;")
	private final Class259 aClass259_126;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Lclient!pl;")
	private final Class259 aClass259_125;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(ILclient!pl;Lclient!pl;)V")
	public Class248(@OriginalArg(0) int arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_126 = arg2;
		this.aClass259_125 = arg1;
		if (this.aClass259_125 != null) {
			this.aClass259_125.method5969(0);
		}
		if (this.aClass259_126 != null) {
			this.aClass259_126.method5969(0);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)Lclient!qt;")
	public Class2_Sub3_Sub14 method5765(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub3_Sub14 local11 = (Class2_Sub3_Sub14) this.aClass313_41.method6989((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(34) byte[] local34;
		if (arg0 < 32768) {
			local34 = this.aClass259_125.method5985(arg0, 0);
		} else {
			local34 = this.aClass259_126.method5985(arg0 & 0x7FFF, 0);
		}
		local11 = new Class2_Sub3_Sub14();
		if (local34 != null) {
			local11.method6401(new Class2_Sub15(local34));
		}
		if (arg0 >= 32768) {
			local11.method6398();
		}
		this.aClass313_41.method6980((long) arg0, local11);
		return local11;
	}
}
