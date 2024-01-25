import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public class Class3_Sub1_Sub17 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qm", name = "L", descriptor = "[I")
	protected int[] anIntArray347;

	@OriginalMember(owner = "client!qm", name = "S", descriptor = "I")
	protected int anInt5802;

	@OriginalMember(owner = "client!qm", name = "T", descriptor = "I")
	protected int anInt5803;

	@OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
	private int anInt5797 = -1;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub17() {
		super(0, false);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
	@Override
	public final void method8364() {
		super.method8364();
		this.anIntArray347 = null;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public final void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5797 = arg1.method6535();
		}
	}

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "(I)Z")
	protected final boolean method4776() {
		if (this.anIntArray347 != null) {
			return true;
		} else if (this.anInt5797 >= 0) {
			@Pc(27) Class20 local27 = Static158.anInt3416 < 0 ? Static599.method806(Static430.aClass254_110, this.anInt5797) : Static599.method814(Static430.aClass254_110, Static158.anInt3416, this.anInt5797);
			local27.method816();
			this.anIntArray347 = local27.method812();
			this.anInt5802 = local27.anInt706;
			this.anInt5803 = local27.anInt707;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587 && this.method4776()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(59) int local59 = this.anInt5803 * (this.anInt5802 == Static331.anInt6903 ? arg0 : arg0 * this.anInt5802 / Static331.anInt6903);
			@Pc(65) int local65;
			@Pc(74) int local74;
			if (Static131.anInt2935 == this.anInt5803) {
				for (local65 = 0; local65 < Static131.anInt2935; local65++) {
					local74 = this.anIntArray347[local59++];
					local39[local65] = (local74 & 0xFF) << 4;
					local35[local65] = local74 >> 4 & 0xFF0;
					local31[local65] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static131.anInt2935; local65++) {
					local74 = this.anInt5803 * local65 / Static131.anInt2935;
					@Pc(81) int local81 = this.anIntArray347[local59 + local74];
					local39[local65] = (local81 & 0xFF) << 4;
					local35[local65] = local81 >> 4 & 0xFF0;
					local31[local65] = local81 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(B)I")
	@Override
	public final int method8367() {
		return this.anInt5797;
	}
}
