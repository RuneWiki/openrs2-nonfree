import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class362 {

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
	public int anInt9712 = 0;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
	public int anInt9716 = 0;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "Lclient!bh;")
	private final Class32 aClass32_85 = new Class32(64);

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Lclient!ph;")
	private Interface20 anInterface20_1 = null;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "Lclient!wu;")
	private final Class380 aClass380_130;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "Lclient!wu;")
	private final Class380 aClass380_129;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(ILclient!wu;Lclient!wu;Lclient!ph;)V")
	public Class362(@OriginalArg(0) int arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) Class380 arg2, @OriginalArg(3) Interface20 arg3) {
		this.aClass380_130 = arg2;
		this.aClass380_129 = arg1;
		this.anInterface20_1 = arg3;
		if (this.aClass380_129 != null) {
			this.anInt9716 = this.aClass380_129.method8631(1);
		}
		if (this.aClass380_130 != null) {
			this.anInt9712 = this.aClass380_130.method8631(1);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)Lclient!ica;")
	public Class2_Sub2_Sub10 method8112(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub2_Sub10 local11 = (Class2_Sub2_Sub10) this.aClass32_85.method630((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = this.aClass380_130.method8620(1, arg0 & 0x7FFF);
		} else {
			local29 = this.aClass380_129.method8620(1, arg0);
		}
		local11 = new Class2_Sub2_Sub10();
		local11.aClass362_1 = this;
		if (local29 != null) {
			local11.method3150(new Class2_Sub22(local29));
		}
		if (arg0 >= 32768) {
			local11.method3155();
		}
		this.aClass32_85.method629(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(J[ILclient!mha;I)Ljava/lang/String;")
	public String method8113(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class222 arg2) {
		if (this.anInterface20_1 != null) {
			@Pc(19) String local19 = this.anInterface20_1.method8030(arg2, arg1, arg0);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg0);
	}
}
