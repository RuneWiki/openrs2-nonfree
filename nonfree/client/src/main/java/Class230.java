import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class230 {

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "Lclient!bh;")
	private final Class32 aClass32_61 = new Class32(64);

	@OriginalMember(owner = "client!naa", name = "h", descriptor = "Lclient!wu;")
	private final Class380 aClass380_89;

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "Lclient!wu;")
	private final Class380 aClass380_88;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(ILclient!wu;Lclient!wu;)V")
	public Class230(@OriginalArg(0) int arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_89 = arg2;
		this.aClass380_88 = arg1;
		if (this.aClass380_88 != null) {
			this.aClass380_88.method8631(0);
		}
		if (this.aClass380_89 != null) {
			this.aClass380_89.method8631(0);
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)Lclient!mu;")
	public Class2_Sub2_Sub14 method4940(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub2_Sub14 local11 = (Class2_Sub2_Sub14) this.aClass32_61.method630((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(34) byte[] local34;
		if (arg0 < 32768) {
			local34 = this.aClass380_88.method8620(0, arg0);
		} else {
			local34 = this.aClass380_89.method8620(0, arg0 & 0x7FFF);
		}
		local11 = new Class2_Sub2_Sub14();
		if (local34 != null) {
			local11.method4888(new Class2_Sub22(local34));
		}
		if (arg0 >= 32768) {
			local11.method4891();
		}
		this.aClass32_61.method629(local11, (long) arg0);
		return local11;
	}
}
