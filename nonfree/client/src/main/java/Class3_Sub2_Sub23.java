import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class3_Sub2_Sub23 extends Class3_Sub2 {

	@OriginalMember(owner = "client!nj", name = "L", descriptor = "[I")
	private int[] anIntArray415;

	@OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
	private int anInt7139;

	@OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
	private int anInt7142;

	@OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
	private int anInt7138 = -1;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub23() {
		super(0, false);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
	@Override
	public int method8329() {
		return this.anInt7138;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
	@Override
	public void method8333(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method8333(arg0, arg1);
		if (this.anInt7138 >= 0 && Static226.anInterface5_8 != null) {
			@Pc(27) int local27 = Static226.anInterface5_8.method6869(this.anInt7138).aBoolean494 ? 64 : 128;
			this.anIntArray415 = Static226.anInterface5_8.method6868(false, 1.0F, local27, this.anInt7138, local27);
			this.anInt7139 = local27;
			this.anInt7142 = local27;
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
	@Override
	public void method8339() {
		super.method8339();
		this.anIntArray415 = null;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt7138 = arg1.method8414();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(43) int local43 = (this.anInt7139 == Static638.anInt10476 ? arg0 : arg0 * this.anInt7139 / Static638.anInt10476) * this.anInt7142;
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local11[2];
			@Pc(61) int local61;
			@Pc(70) int local70;
			if (this.anInt7142 == Static164.anInt8839) {
				for (local61 = 0; local61 < Static164.anInt8839; local61++) {
					local70 = this.anIntArray415[local43++];
					local55[local61] = (local70 & 0xFF) << 4;
					local51[local61] = local70 >> 4 & 0xFF0;
					local47[local61] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static164.anInt8839; local61++) {
					local70 = local61 * this.anInt7142 / Static164.anInt8839;
					@Pc(78) int local78 = this.anIntArray415[local43 + local70];
					local55[local61] = (local78 & 0xFF) << 4;
					local51[local61] = local78 >> 4 & 0xFF0;
					local47[local61] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
