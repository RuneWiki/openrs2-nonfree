import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class23_Sub1_Sub2 extends Class23_Sub1 {

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "Lclient!rd;")
	private Class112_Sub4 aClass112_Sub4_2;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
	private final int anInt6070;

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
	private final int anInt6071;

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
	private final int anInt6072;

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
	private final int anInt6076;

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
	private final int anInt6069;

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_31;

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
	private final int anInt6077;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!vj;IIIIII)V")
	public Class23_Sub1_Sub2(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6070 = arg3;
		this.anInt6071 = arg5;
		this.anInt6072 = arg4;
		this.anInt6076 = arg1;
		this.anInt6069 = arg6;
		this.aClass172_Sub2_31 = arg0;
		this.anInt6077 = arg2;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)Lclient!rd;")
	@Override
	public Class112_Sub4 method4740() {
		if (this.aClass112_Sub4_2 == null) {
			Static206.anIntArray259[4] = this.anInt6071;
			Static206.anIntArray259[5] = this.anInt6069;
			Static206.anIntArray259[0] = this.anInt6076;
			Static206.anIntArray259[1] = this.anInt6077;
			Static206.anIntArray259[2] = this.anInt6070;
			Static206.anIntArray259[3] = this.anInt6072;
			@Pc(42) Interface5 local42 = this.aClass172_Sub2_31.anInterface5_8;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local42.method3921(Static206.anIntArray259[local48])) {
					return null;
				}
				@Pc(66) Class76 local66 = local42.method3918(Static206.anIntArray259[local48]);
				@Pc(73) int local73 = local66.aBoolean208 ? 64 : 128;
				if (local66.aByte43 > 0) {
					local44 = true;
				}
				if (local46 < local73) {
					local46 = local73;
				}
			}
			for (@Pc(89) int local89 = 0; local89 < 6; local89++) {
				Static116.anIntArrayArray36[local89] = local42.method3920(Static206.anIntArray259[local89], local46, local46, false, 1.0F);
			}
			this.aClass112_Sub4_2 = new Class112_Sub4(this.aClass172_Sub2_31, 6407, local46, local44, Static116.anIntArrayArray36);
		}
		return this.aClass112_Sub4_2;
	}
}
