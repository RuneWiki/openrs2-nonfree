import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class317 {

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "Lclient!jn;")
	private final Class167 aClass167_57 = new Class167(256);

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "Lclient!fa;")
	private final Interface7 anInterface7_10;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_40;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!kfa;Lclient!fa;)V")
	public Class317(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_10 = arg1;
		this.aClass7_Sub2_40 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
	public void method7319() {
		this.aClass167_57.method3961();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Lclient!il;")
	public Class3_Sub2 method7320(@OriginalArg(0) int arg0) {
		@Pc(20) Object local20 = this.aClass167_57.method3966((long) arg0);
		if (local20 != null) {
			return (Class3_Sub2) local20;
		} else if (this.anInterface7_10.method4463(arg0)) {
			@Pc(39) Class69 local39 = this.anInterface7_10.method4460(arg0);
			@Pc(48) int local48 = local39.aBoolean179 ? 64 : this.aClass7_Sub2_40.anInt5587;
			@Pc(105) Class3_Sub2 local105;
			if (local39.aBoolean184 && this.aClass7_Sub2_40.method7850()) {
				@Pc(117) float[] local117 = this.anInterface7_10.method4459(0.7F, local48, local48, arg0);
				local105 = new Class3_Sub2(this.aClass7_Sub2_40, 3553, 34842, local48, local48, local39.aByte45 != 0, local117, 6408);
			} else {
				@Pc(73) int[] local73;
				if (!local39.aBoolean180 && Static251.method4000(local39.aByte40)) {
					local73 = this.anInterface7_10.method4462(local48, true, arg0, 0.7F, local48);
				} else {
					local73 = this.anInterface7_10.method4464(local48, arg0, 0.7F, local48);
				}
				local105 = new Class3_Sub2(this.aClass7_Sub2_40, 3553, 6408, local48, local48, local39.aByte45 != 0, local73, 0, 0, false);
			}
			local105.method953(local39.aBoolean183, local39.aBoolean178);
			this.aClass167_57.method3974((long) arg0, local105);
			return local105;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
	public void method7321() {
		this.aClass167_57.method3964(5);
	}
}
