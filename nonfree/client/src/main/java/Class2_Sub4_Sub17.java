import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public class Class2_Sub4_Sub17 extends Class2_Sub4 {

	@OriginalMember(owner = "client!jq", name = "T", descriptor = "I")
	protected int anInt5334;

	@OriginalMember(owner = "client!jq", name = "W", descriptor = "[I")
	protected int[] anIntArray1055;

	@OriginalMember(owner = "client!jq", name = "bb", descriptor = "I")
	protected int anInt5338;

	@OriginalMember(owner = "client!jq", name = "U", descriptor = "I")
	private int anInt5335 = -1;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub17() {
		super(0, false);
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309 && this.method4639()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(56) int local56 = (Static193.anInt3629 == this.anInt5338 ? arg0 : arg0 * this.anInt5338 / Static193.anInt3629) * this.anInt5334;
			@Pc(62) int local62;
			@Pc(70) int local70;
			if (this.anInt5334 == Static76.anInt1458) {
				for (local62 = 0; local62 < Static76.anInt1458; local62++) {
					local70 = this.anIntArray1055[local56++];
					local36[local62] = (local70 & 0xFF) << 4;
					local32[local62] = local70 >> 4 & 0xFF0;
					local28[local62] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static76.anInt1458; local62++) {
					local70 = local62 * this.anInt5334 / Static76.anInt1458;
					@Pc(122) int local122 = this.anIntArray1055[local56 + local70];
					local36[local62] = (local122 & 0xFF) << 4;
					local32[local62] = local122 >> 4 & 0xFF0;
					local28[local62] = local122 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)Z")
	protected final boolean method4639() {
		if (this.anIntArray1055 != null) {
			return true;
		} else if (this.anInt5335 >= 0) {
			@Pc(27) Class86 local27 = Static135.anInt3519 < 0 ? Static397.method2333(Static57.aClass171_48, this.anInt5335) : Static397.method2330(Static57.aClass171_48, Static135.anInt3519, this.anInt5335);
			local27.method2335();
			this.anIntArray1055 = local27.method2337();
			this.anInt5334 = local27.anInt2411;
			this.anInt5338 = local27.anInt2410;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)V")
	@Override
	public final void method5587() {
		super.method5587();
		this.anIntArray1055 = null;
	}

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "(I)I")
	@Override
	public final int method5595() {
		return this.anInt5335;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public final void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5335 = arg0.method5312();
		}
	}
}
