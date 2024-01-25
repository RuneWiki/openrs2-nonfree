import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class1_Sub3_Sub26 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pt", name = "E", descriptor = "I")
	private int anInt6668;

	@OriginalMember(owner = "client!pt", name = "H", descriptor = "I")
	private int anInt6671;

	@OriginalMember(owner = "client!pt", name = "O", descriptor = "[I")
	private int[] anIntArray499;

	@OriginalMember(owner = "client!pt", name = "D", descriptor = "I")
	private int anInt6667 = -1;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub26() {
		super(0, false);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6667 = arg0.method3056();
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(41) int local41 = (Static95.anInt2365 == this.anInt6668 ? arg0 : this.anInt6668 * arg0 / Static95.anInt2365) * this.anInt6671;
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(63) int local63;
			@Pc(72) int local72;
			if (Static236.anInt4609 == this.anInt6671) {
				for (local63 = 0; local63 < Static236.anInt4609; local63++) {
					local72 = this.anIntArray499[local41++];
					local53[local63] = (local72 & 0xFF) << 4;
					local49[local63] = local72 >> 4 & 0xFF0;
					local45[local63] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static236.anInt4609; local63++) {
					local72 = this.anInt6671 * local63 / Static236.anInt4609;
					@Pc(79) int local79 = this.anIntArray499[local72 + local41];
					local53[local63] = (local79 & 0xFF) << 4;
					local49[local63] = local79 >> 4 & 0xFF0;
					local45[local63] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "(I)V")
	@Override
	public void method7908() {
		super.method7908();
		this.anIntArray499 = null;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)I")
	@Override
	public int method7903() {
		return this.anInt6667;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method7902(arg0, arg1);
		if (this.anInt6667 >= 0 && Static29.anInterface8_6 != null) {
			@Pc(35) int local35 = Static29.anInterface8_6.method7085(this.anInt6667).aBoolean354 ? 64 : 128;
			this.anIntArray499 = Static29.anInterface8_6.method7088(local35, false, local35, 1.0F, this.anInt6667);
			this.anInt6668 = local35;
			this.anInt6671 = local35;
		}
	}
}
