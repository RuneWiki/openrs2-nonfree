import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class6_Sub1_Sub25 extends Class6_Sub1 {

	@OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
	private int anInt6808;

	@OriginalMember(owner = "client!nu", name = "M", descriptor = "[I")
	private int[] anIntArray427;

	@OriginalMember(owner = "client!nu", name = "Q", descriptor = "I")
	private int anInt6816;

	@OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
	private int anInt6812 = -1;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub25() {
		super(0, false);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
	@Override
	public void method8952() {
		super.method8952();
		this.anIntArray427 = null;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8955(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method8955(arg0, arg1);
		if (this.anInt6812 >= 0 && Static608.anInterface6_12 != null) {
			@Pc(27) int local27 = Static608.anInterface6_12.method7088(this.anInt6812).aBoolean574 ? 64 : 128;
			this.anIntArray427 = Static608.anInterface6_12.method7085(local27, false, this.anInt6812, 1.0F, local27);
			this.anInt6808 = local27;
			this.anInt6816 = local27;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)I")
	@Override
	public int method8956() {
		return this.anInt6812;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6812 = arg0.method8363();
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(36) int local36 = (this.anInt6816 == Static434.anInt7425 ? arg0 : this.anInt6816 * arg0 / Static434.anInt7425) * this.anInt6808;
			@Pc(40) int[] local40 = local16[0];
			@Pc(44) int[] local44 = local16[1];
			@Pc(48) int[] local48 = local16[2];
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (Static479.anInt8231 == this.anInt6808) {
				for (local58 = 0; local58 < Static479.anInt8231; local58++) {
					local66 = this.anIntArray427[local36++];
					local48[local58] = (local66 & 0xFF) << 4;
					local44[local58] = local66 >> 4 & 0xFF0;
					local40[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static479.anInt8231; local58++) {
					local66 = this.anInt6808 * local58 / Static479.anInt8231;
					@Pc(115) int local115 = this.anIntArray427[local36 + local66];
					local48[local58] = (local115 & 0xFF) << 4;
					local44[local58] = local115 >> 4 & 0xFF0;
					local40[local58] = local115 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}
