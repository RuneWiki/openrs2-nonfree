import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public class Class1_Sub5_Sub12 extends Class1_Sub5 {

	@OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
	protected int anInt3282;

	@OriginalMember(owner = "client!uo", name = "Q", descriptor = "[I")
	protected int[] anIntArray322;

	@OriginalMember(owner = "client!uo", name = "T", descriptor = "I")
	protected int anInt3287;

	@OriginalMember(owner = "client!uo", name = "P", descriptor = "I")
	private int anInt3285 = -1;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub12() {
		super(0, false);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public final void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3285 = arg0.method5715();
		}
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V")
	@Override
	public final void method5812() {
		super.method5812();
		this.anIntArray322 = null;
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(Z)Z")
	protected final boolean method2793() {
		if (this.anIntArray322 != null) {
			return true;
		} else if (this.anInt3285 >= 0) {
			@Pc(32) Class201 local32 = Static191.anInt3978 < 0 ? Static369.method5467(Static153.aClass134_72, this.anInt3285) : Static369.method5469(Static153.aClass134_72, Static191.anInt3978, this.anInt3285);
			local32.method5459();
			this.anIntArray322 = local32.method5466();
			this.anInt3287 = local32.anInt6357;
			this.anInt3282 = local32.anInt6354;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)I")
	@Override
	public final int method5806() {
		return this.anInt3285;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368 && this.method2793()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(56) int local56 = (Static129.anInt2574 == this.anInt3282 ? arg0 : arg0 * this.anInt3282 / Static129.anInt2574) * this.anInt3287;
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (Static75.anInt1566 == this.anInt3287) {
				for (local62 = 0; local62 < Static75.anInt1566; local62++) {
					local71 = this.anIntArray322[local56++];
					local36[local62] = (local71 & 0xFF) << 4;
					local32[local62] = local71 >> 4 & 0xFF0;
					local28[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static75.anInt1566; local62++) {
					local71 = local62 * this.anInt3287 / Static75.anInt1566;
					@Pc(79) int local79 = this.anIntArray322[local56 + local71];
					local36[local62] = (local79 & 0xFF) << 4;
					local32[local62] = local79 >> 4 & 0xFF0;
					local28[local62] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
