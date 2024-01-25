import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ab", name = "E", descriptor = "Lclient!nn;")
	private Class65_Sub3 aClass65_Sub3_1;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
	private final int anInt41;

	@OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
	private final int anInt48;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
	private final int anInt45;

	@OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
	private final int anInt51;

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
	private final int anInt46;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
	private final int anInt40;

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_1;

	static {
		new Class15(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!ug;IIIIII)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt41 = arg5;
		this.anInt48 = arg2;
		this.anInt45 = arg6;
		this.anInt51 = arg1;
		this.anInt46 = arg4;
		this.anInt40 = arg3;
		this.aClass135_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)Lclient!nn;")
	@Override
	public Class65_Sub3 method4133() {
		if (this.aClass65_Sub3_1 == null) {
			Static144.anIntArray212[0] = this.anInt51;
			Static144.anIntArray212[4] = this.anInt41;
			Static144.anIntArray212[2] = this.anInt40;
			Static144.anIntArray212[1] = this.anInt48;
			Static144.anIntArray212[3] = this.anInt46;
			Static144.anIntArray212[5] = this.anInt45;
			@Pc(42) Interface5 local42 = this.aClass135_Sub2_1.anInterface5_7;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local42.method4075(Static144.anIntArray212[local48])) {
					return null;
				}
				@Pc(66) Class112 local66 = local42.method4079(Static144.anIntArray212[local48]);
				@Pc(73) int local73 = local66.aBoolean188 ? 64 : 128;
				if (local66.aByte52 > 0) {
					local44 = true;
				}
				if (local46 < local73) {
					local46 = local73;
				}
			}
			for (@Pc(92) int local92 = 0; local92 < 6; local92++) {
				Static49.anIntArrayArray11[local92] = local42.method4078(false, local46, 1.0F, local46, Static144.anIntArray212[local92]);
			}
			this.aClass65_Sub3_1 = new Class65_Sub3(this.aClass135_Sub2_1, 6407, local46, local44, Static49.anIntArrayArray11);
		}
		return this.aClass65_Sub3_1;
	}
}
