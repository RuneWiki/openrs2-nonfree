import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class57_Sub2_Sub1 extends Class57_Sub2 {

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "Lclient!maa;")
	private Class80_Sub4 aClass80_Sub4_1;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
	private final int anInt2190;

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_3;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
	private final int anInt2189;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
	private final int anInt2188;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
	private final int anInt2192;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
	private final int anInt2195;

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
	private final int anInt2196;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!ck;IIIIII)V")
	public Class57_Sub2_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2190 = arg5;
		this.aClass65_Sub1_3 = arg0;
		this.anInt2189 = arg2;
		this.anInt2188 = arg1;
		this.anInt2192 = arg3;
		this.anInt2195 = arg4;
		this.anInt2196 = arg6;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Lclient!maa;")
	@Override
	public Class80_Sub4 method5798() {
		if (this.aClass80_Sub4_1 == null) {
			Static424.anIntArray427[2] = this.anInt2192;
			Static424.anIntArray427[5] = this.anInt2196;
			@Pc(22) Interface4 local22 = this.aClass65_Sub1_3.anInterface4_11;
			Static424.anIntArray427[0] = this.anInt2188;
			Static424.anIntArray427[3] = this.anInt2195;
			Static424.anIntArray427[4] = this.anInt2190;
			Static424.anIntArray427[1] = this.anInt2189;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local22.method359(Static424.anIntArray427[local48])) {
					return null;
				}
				@Pc(66) Class136 local66 = local22.method358(Static424.anIntArray427[local48]);
				@Pc(73) int local73 = local66.aBoolean312 ? 64 : 128;
				if (local66.aByte54 > 0) {
					local44 = true;
				}
				if (local73 > local46) {
					local46 = local73;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static148.anIntArrayArray9[local98] = local22.method363(Static424.anIntArray427[local98], local46, 1.0F, false, local46);
			}
			this.aClass80_Sub4_1 = new Class80_Sub4(this.aClass65_Sub1_3, 6407, local46, local44, Static148.anIntArrayArray9);
		}
		return this.aClass80_Sub4_1;
	}
}
