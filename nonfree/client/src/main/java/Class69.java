import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class69 {

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "Lclient!dka;")
	private final Class85 aClass85_12 = new Class85(64);

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "Lclient!nca;")
	private final Class254 aClass254_38;

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "Lclient!nca;")
	private final Class254 aClass254_39;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(ILclient!nca;Lclient!nca;)V")
	public Class69(@OriginalArg(0) int arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_38 = arg1;
		this.aClass254_39 = arg2;
		if (this.aClass254_38 != null) {
			this.aClass254_38.method6101(0);
		}
		if (this.aClass254_39 != null) {
			this.aClass254_39.method6101(0);
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)Lclient!dt;")
	public Class2_Sub6_Sub3 method1459(@OriginalArg(1) int arg0) {
		@Pc(19) Class2_Sub6_Sub3 local19 = (Class2_Sub6_Sub3) this.aClass85_12.method1737((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(36) byte[] local36;
		if (arg0 >= 32768) {
			local36 = this.aClass254_39.method6087(arg0 & 0x7FFF, 0);
		} else {
			local36 = this.aClass254_38.method6087(arg0, 0);
		}
		local19 = new Class2_Sub6_Sub3();
		if (local36 != null) {
			local19.method1877(new Class2_Sub20(local36));
		}
		if (arg0 >= 32768) {
			local19.method1878();
		}
		this.aClass85_12.method1745((long) arg0, 16383, local19);
		return local19;
	}
}
