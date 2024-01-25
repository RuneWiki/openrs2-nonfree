import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public class Class7_Sub3_Sub22 extends Class7_Sub3 {

	@OriginalMember(owner = "client!og", name = "E", descriptor = "I")
	protected int anInt6580;

	@OriginalMember(owner = "client!og", name = "G", descriptor = "[I")
	protected int[] anIntArray584;

	@OriginalMember(owner = "client!og", name = "M", descriptor = "I")
	protected int anInt6585;

	@OriginalMember(owner = "client!og", name = "P", descriptor = "I")
	private int anInt6588 = -1;

	static {
		new Class55("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub22() {
		super(0, false);
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(Z)Z")
	protected final boolean method5208() {
		if (this.anIntArray584 != null) {
			return true;
		} else if (this.anInt6588 >= 0) {
			@Pc(30) Class246 local30 = Static151.anInt2825 < 0 ? Static469.method5143(Static164.aClass178_45, this.anInt6588) : Static469.method5145(Static164.aClass178_45, Static151.anInt2825, this.anInt6588);
			local30.method5141();
			this.anIntArray584 = local30.method5138();
			this.anInt6585 = local30.anInt6476;
			this.anInt6580 = local30.anInt6475;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
	@Override
	public final void method5592() {
		super.method5592();
		this.anIntArray584 = null;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402 && this.method5208()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(51) int local51 = (Static383.anInt6175 == this.anInt6580 ? arg0 : this.anInt6580 * arg0 / Static383.anInt6175) * this.anInt6585;
			@Pc(61) int local61;
			@Pc(69) int local69;
			if (this.anInt6585 == Static58.anInt1052) {
				for (local61 = 0; local61 < Static58.anInt1052; local61++) {
					local69 = this.anIntArray584[local51++];
					local31[local61] = (local69 & 0xFF) << 4;
					local27[local61] = local69 >> 4 & 0xFF0;
					local23[local61] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static58.anInt1052; local61++) {
					local69 = local61 * this.anInt6585 / Static58.anInt1052;
					@Pc(121) int local121 = this.anIntArray584[local51 + local69];
					local31[local61] = (local121 & 0xFF) << 4;
					local27[local61] = local121 >> 4 & 0xFF0;
					local23[local61] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)I")
	@Override
	public final int method5598() {
		return this.anInt6588;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public final void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt6588 = arg1.method3943();
		}
	}
}
