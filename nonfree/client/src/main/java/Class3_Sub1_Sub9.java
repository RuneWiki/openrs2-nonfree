import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!eg", name = "Q", descriptor = "Z")
	private boolean aBoolean132 = true;

	@OriginalMember(owner = "client!eg", name = "R", descriptor = "Z")
	private boolean aBoolean133 = true;

	static {
		new Class57("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(34) int[][] local34 = this.method5551(0, this.aBoolean132 ? Static300.anInt5187 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean133) {
				for (local63 = 0; local63 < Static238.anInt4221; local63++) {
					local50[local63] = local38[Static171.anInt3000 - local63];
					local54[local63] = local42[Static171.anInt3000 - local63];
					local58[local63] = local46[Static171.anInt3000 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static238.anInt4221; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean133 = arg0.method2739() == 1;
		} else if (arg1 == 1) {
			this.aBoolean132 = arg0.method2739() == 1;
		} else if (arg1 == 2) {
			super.aBoolean487 = arg0.method2739() == 1;
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(36) int[] local36 = this.method5547(this.aBoolean132 ? Static300.anInt5187 - arg0 : arg0, 0);
			if (this.aBoolean133) {
				for (@Pc(49) int local49 = 0; local49 < Static238.anInt4221; local49++) {
					local19[local49] = local36[Static171.anInt3000 - local49];
				}
			} else {
				Static400.method1874(local36, 0, local19, 0, Static238.anInt4221);
			}
		}
		return local19;
	}
}
