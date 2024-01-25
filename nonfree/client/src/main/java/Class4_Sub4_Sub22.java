import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class4_Sub4_Sub22 extends Class4_Sub4 {

	@OriginalMember(owner = "client!mp", name = "Q", descriptor = "I")
	private int anInt4247;

	@OriginalMember(owner = "client!mp", name = "U", descriptor = "I")
	private int anInt4251;

	@OriginalMember(owner = "client!mp", name = "V", descriptor = "[I")
	private int[] anIntArray363;

	@OriginalMember(owner = "client!mp", name = "S", descriptor = "I")
	private int anInt4249 = -1;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub22() {
		super(0, false);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(41) int local41 = this.anInt4251 * (this.anInt4247 == Static331.anInt6571 ? arg0 : this.anInt4247 * arg0 / Static331.anInt6571);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(63) int local63;
			@Pc(71) int local71;
			if (Static124.anInt3576 == this.anInt4251) {
				for (local63 = 0; local63 < Static124.anInt3576; local63++) {
					local71 = this.anIntArray363[local41++];
					local53[local63] = (local71 & 0xFF) << 4;
					local49[local63] = local71 >> 4 & 0xFF0;
					local45[local63] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static124.anInt3576; local63++) {
					local71 = this.anInt4251 * local63 / Static124.anInt3576;
					@Pc(119) int local119 = this.anIntArray363[local71 + local41];
					local53[local63] = (local119 & 0xFF) << 4;
					local49[local63] = local119 >> 4 & 0xFF0;
					local45[local63] = local119 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(B)V")
	@Override
	public void method5390() {
		super.method5390();
		this.anIntArray363 = null;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V")
	@Override
	public void method5381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method5381(arg0, arg1);
		if (this.anInt4249 >= 0) {
			@Pc(33) int local33 = Static219.anInterface1_5.method5634(this.anInt4249).aBoolean360 ? 64 : 128;
			this.anIntArray363 = Static219.anInterface1_5.method5633(false, local33, local33, 1.0F, this.anInt4249);
			this.anInt4251 = local33;
			this.anInt4247 = local33;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)I")
	@Override
	public int method5379() {
		return this.anInt4249;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt4249 = arg1.method2404();
		}
	}
}
