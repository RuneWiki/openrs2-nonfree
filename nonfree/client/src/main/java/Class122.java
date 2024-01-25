import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class122 {

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "Lclient!wi;")
	private final Class268 aClass268_29 = new Class268(256);

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "Lclient!l;")
	private final Interface7 anInterface7_4;

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_17;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!nq;Lclient!l;)V")
	public Class122(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_4 = arg1;
		this.aClass167_Sub1_17 = arg0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
	public void method3078() {
		this.aClass268_29.method6173(5);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	public void method3079() {
		this.aClass268_29.method6160();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BI)Lclient!wv;")
	public Class137_Sub1 method3081(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass268_29.method6166((long) arg0);
		if (local12 != null) {
			return (Class137_Sub1) local12;
		} else if (this.anInterface7_4.method4420(arg0)) {
			@Pc(31) Class105 local31 = this.anInterface7_4.method4417(arg0);
			@Pc(40) int local40 = local31.aBoolean232 ? 64 : this.aClass167_Sub1_17.anInt4887;
			@Pc(80) Class137_Sub1 local80;
			if (local31.aBoolean226 && this.aClass167_Sub1_17.method6019()) {
				@Pc(62) float[] local62 = this.anInterface7_4.method4419(local40, 0.7F, arg0, local40);
				local80 = new Class137_Sub1(this.aClass167_Sub1_17, 3553, 34842, local40, local40, local31.aByte35 != 0, local62, 6408);
			} else {
				@Pc(97) int[] local97;
				if (local31.aBoolean234) {
					local97 = this.anInterface7_4.method4418(arg0, local40, local40, 0.7F);
				} else {
					local97 = this.anInterface7_4.method4416(arg0, false, local40, local40, 0.7F);
				}
				local80 = new Class137_Sub1(this.aClass167_Sub1_17, 3553, 6408, local40, local40, local31.aByte35 != 0, local97, false);
			}
			local80.method3346(local31.aBoolean228, local31.aBoolean230);
			this.aClass268_29.method6164(local80, (long) arg0);
			return local80;
		} else {
			return null;
		}
	}
}
