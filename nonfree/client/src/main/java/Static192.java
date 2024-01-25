import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
	public static int anInt3073;

	@OriginalMember(owner = "client!jj", name = "R", descriptor = "Lclient!so;")
	public static final Class224 aClass224_13 = new Class224(8, 7);

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)Lclient!nf;")
	public static Class13_Sub4 method2550(@OriginalArg(0) int arg0) {
		@Pc(11) Class227[] local11 = Class20_Sub1_Sub2.aClass227Array1;
		synchronized (Class20_Sub1_Sub2.aClass227Array1) {
			@Pc(36) Class13_Sub4 local36;
			if (Class20_Sub1_Sub2.aClass227Array1.length <= arg0 || Class20_Sub1_Sub2.aClass227Array1[arg0].method4831()) {
				local36 = new Class13_Sub4();
				local36.aClass13_Sub8Array1 = new Class13_Sub8[arg0];
				for (@Pc(58) int local58 = 0; local58 < arg0; local58++) {
					local36.aClass13_Sub8Array1[local58] = new Class13_Sub8();
				}
			} else {
				local36 = (Class13_Sub4) Class20_Sub1_Sub2.aClass227Array1[arg0].method4828();
				local36.method5413();
				@Pc(43) int local43 = Static339.anIntArray335[arg0]--;
			}
			return local36;
		}
	}
}
