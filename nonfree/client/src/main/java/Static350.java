import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!lq", name = "u", descriptor = "Lclient!ju;")
	public static final Class201 aClass201_16 = new Class201(13, 7);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIILclient!gj;)Lclient!jf;")
	public static Class3_Sub6_Sub13 method5260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class143 arg2) {
		@Pc(19) Class3_Sub17 local19 = new Class3_Sub17(arg2.method3125(arg1, arg0));
		@Pc(52) Class3_Sub6_Sub13 local52 = new Class3_Sub6_Sub13(arg1, local19.method4847(), local19.method4847(), local19.method4868(), local19.method4868(), local19.method4888() == 1, local19.method4888(), local19.method4888());
		@Pc(56) int local56 = local19.method4888();
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			local52.aClass193_28.method4462(new Class3_Sub46(local19.method4888(), local19.method4858(), local19.method4858(), local19.method4858(), local19.method4858(), local19.method4858(), local19.method4858(), local19.method4858(), local19.method4858()));
		}
		local52.method4384();
		return local52;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!uv;II)V")
	public static void method5261(@OriginalArg(0) Class23_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray651 == null) {
			return;
		}
		@Pc(16) int local16 = arg0.anIntArray651[arg1 + 1];
		if (arg0.anInt10135 == local16) {
			return;
		}
		arg0.anInt10163 = 0;
		arg0.anInt10149 = 0;
		arg0.anInt10189 = arg0.anInt10190;
		arg0.anInt10143 = 1;
		arg0.anInt10140 = 0;
		arg0.anInt10135 = local16;
		if (arg0.anInt10135 != -1) {
			Static4.method49(arg0, Static483.aClass373_2.method8323(arg0.anInt10135), arg0.anInt10163);
		}
	}
}
