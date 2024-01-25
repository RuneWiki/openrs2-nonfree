import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class3_Sub2_Sub8 extends Class3_Sub2 {

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
	private int anInt3541;

	@OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
	private int anInt3543;

	@OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
	private int anInt3545 = -1;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub8() {
		super(0, false);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)I")
	@Override
	public int method8713() {
		return this.anInt3545;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)V")
	@Override
	public void method8715() {
		super.method8715();
		this.anIntArray245 = null;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(36) int local36 = (Static157.anInt2964 == this.anInt3543 ? arg0 : arg0 * this.anInt3543 / Static157.anInt2964) * this.anInt3541;
			@Pc(40) int[] local40 = local16[0];
			@Pc(44) int[] local44 = local16[1];
			@Pc(48) int[] local48 = local16[2];
			@Pc(58) int local58;
			@Pc(67) int local67;
			if (Static30.anInt908 == this.anInt3541) {
				for (local58 = 0; local58 < Static30.anInt908; local58++) {
					local67 = this.anIntArray245[local36++];
					local48[local58] = (local67 & 0xFF) << 4;
					local44[local58] = local67 >> 4 & 0xFF0;
					local40[local58] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static30.anInt908; local58++) {
					local67 = local58 * this.anInt3541 / Static30.anInt908;
					@Pc(74) int local74 = this.anIntArray245[local67 + local36];
					local48[local58] = (local74 & 0xFF) << 4;
					local44[local58] = local74 >> 4 & 0xFF0;
					local40[local58] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3545 = arg0.method4858();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
	@Override
	public void method8714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method8714(arg0, arg1);
		if (this.anInt3545 >= 0 && Static454.anInterface5_11 != null) {
			@Pc(32) int local32 = Static454.anInterface5_11.method5193(this.anInt3545).aBoolean695 ? 64 : 128;
			this.anIntArray245 = Static454.anInterface5_11.method5192(1.0F, local32, false, this.anInt3545, local32);
			this.anInt3543 = local32;
			this.anInt3541 = local32;
		}
	}
}
