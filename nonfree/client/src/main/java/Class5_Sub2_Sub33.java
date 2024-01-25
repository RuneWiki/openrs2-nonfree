import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class5_Sub2_Sub33 extends Class5_Sub2 {

	@OriginalMember(owner = "client!taa", name = "J", descriptor = "[I")
	private int[] anIntArray693;

	@OriginalMember(owner = "client!taa", name = "O", descriptor = "I")
	private int anInt8959;

	@OriginalMember(owner = "client!taa", name = "P", descriptor = "I")
	private int anInt8960;

	@OriginalMember(owner = "client!taa", name = "C", descriptor = "I")
	private int anInt8951 = -1;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub33() {
		super(0, false);
	}

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "(I)I")
	@Override
	public int method8828() {
		return this.anInt8951;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8824(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method8824(arg0, arg1);
		if (this.anInt8951 >= 0 && Static52.anInterface8_1 != null) {
			@Pc(35) int local35 = Static52.anInterface8_1.method7813(this.anInt8951).aBoolean729 ? 64 : 128;
			this.anIntArray693 = Static52.anInterface8_1.method7812(local35, 1.0F, false, this.anInt8951, local35);
			this.anInt8959 = local35;
			this.anInt8960 = local35;
		}
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(37) int local37 = (Static423.anInt7200 == this.anInt8960 ? arg0 : this.anInt8960 * arg0 / Static423.anInt7200) * this.anInt8959;
			@Pc(41) int[] local41 = local17[0];
			@Pc(45) int[] local45 = local17[1];
			@Pc(49) int[] local49 = local17[2];
			@Pc(59) int local59;
			@Pc(68) int local68;
			if (this.anInt8959 == Static314.anInt6320) {
				for (local59 = 0; local59 < Static314.anInt6320; local59++) {
					local68 = this.anIntArray693[local37++];
					local49[local59] = (local68 & 0xFF) << 4;
					local45[local59] = local68 >> 4 & 0xFF0;
					local41[local59] = local68 >> 12 & 0xFF0;
				}
			} else {
				for (local59 = 0; local59 < Static314.anInt6320; local59++) {
					local68 = local59 * this.anInt8959 / Static314.anInt6320;
					@Pc(76) int local76 = this.anIntArray693[local37 + local68];
					local49[local59] = (local76 & 0xFF) << 4;
					local45[local59] = local76 >> 4 & 0xFF0;
					local41[local59] = local76 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8951 = arg0.method8631();
		}
	}

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "(Z)V")
	@Override
	public void method8829() {
		super.method8829();
		this.anIntArray693 = null;
	}
}
