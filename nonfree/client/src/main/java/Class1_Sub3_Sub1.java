import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!al", name = "I", descriptor = "Z")
	private boolean aBoolean58 = true;

	@OriginalMember(owner = "client!al", name = "F", descriptor = "Z")
	private boolean aBoolean57 = true;

	static {
		new Class114("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(29) int[] local29 = this.method7911(this.aBoolean57 ? Static226.anInt4534 - arg0 : arg0, 0);
			if (this.aBoolean58) {
				for (@Pc(42) int local42 = 0; local42 < Static236.anInt4609; local42++) {
					local11[local42] = local29[Static36.anInt1319 - local42];
				}
			} else {
				Static555.method5094(local29, 0, local11, 0, Static236.anInt4609);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean58 = arg0.method3043() == 1;
		} else if (arg1 == 1) {
			this.aBoolean57 = arg0.method3043() == 1;
		} else if (arg1 == 2) {
			super.aBoolean652 = arg0.method3043() == 1;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(34) int[][] local34 = this.method7910(0, this.aBoolean57 ? Static226.anInt4534 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			@Pc(63) int local63;
			if (this.aBoolean58) {
				for (local63 = 0; local63 < Static236.anInt4609; local63++) {
					local50[local63] = local38[Static36.anInt1319 - local63];
					local54[local63] = local42[Static36.anInt1319 - local63];
					local58[local63] = local46[Static36.anInt1319 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static236.anInt4609; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local11;
	}
}
