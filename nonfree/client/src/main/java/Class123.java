import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class123 {

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "[I")
	public static final int[] anIntArray355 = new int[128];

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "Lclient!jda;")
	private final Class165 aClass165_25 = new Class165(256);

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "Lclient!d;")
	private final Interface4 anInterface4_7;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_14;

	static {
		for (@Pc(24) int local24 = 0; local24 < anIntArray355.length; local24++) {
			anIntArray355[local24] = -1;
		}
		for (@Pc(36) int local36 = 65; local36 <= 90; local36++) {
			anIntArray355[local36] = local36 - 65;
		}
		for (@Pc(49) int local49 = 97; local49 <= 122; local49++) {
			anIntArray355[local49] = local49 + 26 - 97;
		}
		for (@Pc(64) int local64 = 48; local64 <= 57; local64++) {
			anIntArray355[local64] = local64 + 52 - 48;
		}
		anIntArray355[45] = anIntArray355[47] = 63;
		anIntArray355[42] = anIntArray355[43] = 62;
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!dia;Lclient!d;)V")
	public Class123(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_7 = arg1;
		this.aClass13_Sub2_14 = arg0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
	public void method3645() {
		this.aClass165_25.method4403();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
	public void method3646() {
		this.aClass165_25.method4394(5);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)Lclient!tca;")
	public Class85_Sub3 method3647(@OriginalArg(0) int arg0) {
		@Pc(10) Object local10 = this.aClass165_25.method4389((long) arg0);
		if (local10 != null) {
			return (Class85_Sub3) local10;
		} else if (this.anInterface4_7.method4672(arg0)) {
			@Pc(29) Class119 local29 = this.anInterface4_7.method4673(arg0);
			@Pc(38) int local38 = local29.aBoolean292 ? 64 : this.aClass13_Sub2_14.anInt2144;
			@Pc(73) Class85_Sub3 local73;
			if (local29.aBoolean297 && this.aClass13_Sub2_14.method8451()) {
				@Pc(55) float[] local55 = this.anInterface4_7.method4675(local38, 0.7F, arg0, local38);
				local73 = new Class85_Sub3(this.aClass13_Sub2_14, 3553, 34842, local38, local38, local29.aByte58 != 0, local55, 6408);
			} else {
				@Pc(93) int[] local93;
				if (local29.anInt3894 != 2 && Static5.method131(local29.aByte54)) {
					local93 = this.anInterface4_7.method4676(local38, true, local38, 0.7F, arg0);
				} else {
					local93 = this.anInterface4_7.method4677(local38, arg0, 0.7F, local38);
				}
				local73 = new Class85_Sub3(this.aClass13_Sub2_14, 3553, 6408, local38, local38, local29.aByte58 != 0, local93, 0, 0, false);
			}
			local73.method5365(local29.aBoolean293, local29.aBoolean296);
			this.aClass165_25.method4392(local73, (long) arg0);
			return local73;
		} else {
			return null;
		}
	}
}
