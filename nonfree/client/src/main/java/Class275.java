import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class275 {

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "Lclient!wf;")
	private final Class316 aClass316_58 = new Class316(256);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_40;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Lclient!n;")
	private final Interface8 anInterface8_12;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!te;Lclient!n;)V")
	public Class275(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Interface8 arg1) {
		this.aClass9_Sub3_40 = arg0;
		this.anInterface8_12 = arg1;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public void method6787() {
		this.aClass316_58.method7794();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lclient!ea;")
	public Class20_Sub3 method6790(@OriginalArg(0) int arg0) {
		@Pc(10) Object local10 = this.aClass316_58.method7799((long) arg0);
		if (local10 != null) {
			return (Class20_Sub3) local10;
		} else if (this.anInterface8_12.method7084(arg0)) {
			@Pc(34) Class175 local34 = this.anInterface8_12.method7085(arg0);
			@Pc(43) int local43 = local34.aBoolean354 ? 64 : this.aClass9_Sub3_40.anInt7871;
			@Pc(95) Class20_Sub3 local95;
			if (local34.aBoolean352 && this.aClass9_Sub3_40.method7591()) {
				@Pc(106) float[] local106 = this.anInterface8_12.method7083(arg0, 0.7F, local43, local43);
				local95 = new Class20_Sub3(this.aClass9_Sub3_40, 3553, 34842, local43, local43, local34.aByte55 != 0, local106, 6408);
			} else {
				@Pc(63) int[] local63;
				if (local34.aBoolean353) {
					local63 = this.anInterface8_12.method7086(local43, local43, arg0, 0.7F);
				} else {
					local63 = this.anInterface8_12.method7088(local43, true, local43, 0.7F, arg0);
				}
				local95 = new Class20_Sub3(this.aClass9_Sub3_40, 3553, 6408, local43, local43, local34.aByte55 != 0, local63, false);
			}
			local95.method6253(local34.aBoolean357, local34.aBoolean358);
			this.aClass316_58.method7792((long) arg0, local95);
			return local95;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
	public void method6792() {
		this.aClass316_58.method7791(5);
	}
}
