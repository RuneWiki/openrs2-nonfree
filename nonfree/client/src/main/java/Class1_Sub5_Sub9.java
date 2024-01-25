import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class1_Sub5_Sub9 extends Class1_Sub5 {

	@OriginalMember(owner = "client!jo", name = "R", descriptor = "[I")
	private int[] anIntArray293;

	@OriginalMember(owner = "client!jo", name = "Y", descriptor = "I")
	private int anInt3027;

	@OriginalMember(owner = "client!jo", name = "Z", descriptor = "I")
	private int anInt3028;

	@OriginalMember(owner = "client!jo", name = "W", descriptor = "I")
	private int anInt3025 = -1;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub9() {
		super(0, false);
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V")
	@Override
	public void method5812() {
		super.method5812();
		this.anIntArray293 = null;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3025 = arg0.method5715();
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)V")
	@Override
	public void method5810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method5810(arg0, arg1);
		if (this.anInt3025 >= 0) {
			@Pc(27) int local27 = Static271.anInterface2_5.method951(this.anInt3025).aBoolean223 ? 64 : 128;
			this.anIntArray293 = Static271.anInterface2_5.method949(local27, false, local27, this.anInt3025, 1.0F);
			this.anInt3028 = local27;
			this.anInt3027 = local27;
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)I")
	@Override
	public int method5809() {
		return this.anInt3025;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(41) int local41 = this.anInt3027 * (this.anInt3028 == Static129.anInt2574 ? arg0 : arg0 * this.anInt3028 / Static129.anInt2574);
			@Pc(45) int[] local45 = local17[0];
			@Pc(49) int[] local49 = local17[1];
			@Pc(53) int[] local53 = local17[2];
			@Pc(63) int local63;
			@Pc(71) int local71;
			if (Static75.anInt1566 == this.anInt3027) {
				for (local63 = 0; local63 < Static75.anInt1566; local63++) {
					local71 = this.anIntArray293[local41++];
					local53[local63] = (local71 & 0xFF) << 4;
					local49[local63] = local71 >> 4 & 0xFF0;
					local45[local63] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static75.anInt1566; local63++) {
					local71 = local63 * this.anInt3027 / Static75.anInt1566;
					@Pc(123) int local123 = this.anIntArray293[local71 + local41];
					local53[local63] = (local123 & 0xFF) << 4;
					local49[local63] = local123 >> 4 & 0xFF0;
					local45[local63] = local123 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}
}
