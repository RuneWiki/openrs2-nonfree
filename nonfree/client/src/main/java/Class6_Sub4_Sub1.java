import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class6_Sub4_Sub1 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ar", name = "I", descriptor = "I")
	private int anInt441;

	@OriginalMember(owner = "client!ar", name = "M", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!ar", name = "O", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
	private int anInt439 = -1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub1() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	@Override
	public void method8322() {
		super.method8322();
		this.anIntArray24 = null;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(41) int local41 = this.anInt441 * (this.anInt445 == Static429.anInt7811 ? arg0 : this.anInt445 * arg0 / Static429.anInt7811);
			@Pc(45) int[] local45 = local17[0];
			@Pc(49) int[] local49 = local17[1];
			@Pc(53) int[] local53 = local17[2];
			@Pc(63) int local63;
			@Pc(72) int local72;
			if (Static6.anInt111 == this.anInt441) {
				for (local63 = 0; local63 < Static6.anInt111; local63++) {
					local72 = this.anIntArray24[local41++];
					local53[local63] = (local72 & 0xFF) << 4;
					local49[local63] = local72 >> 4 & 0xFF0;
					local45[local63] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static6.anInt111; local63++) {
					local72 = local63 * this.anInt441 / Static6.anInt111;
					@Pc(79) int local79 = this.anIntArray24[local72 + local41];
					local53[local63] = (local79 & 0xFF) << 4;
					local49[local63] = local79 >> 4 & 0xFF0;
					local45[local63] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)V")
	@Override
	public void method8318(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method8318(arg0, arg1);
		if (this.anInt439 >= 0 && Static594.anInterface4_11 != null) {
			@Pc(27) int local27 = Static594.anInterface4_11.method895(this.anInt439).aBoolean633 ? 64 : 128;
			this.anIntArray24 = Static594.anInterface4_11.method894(1.0F, false, this.anInt439, local27, local27);
			this.anInt445 = local27;
			this.anInt441 = local27;
		}
	}

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "(B)I")
	@Override
	public int method8321() {
		return this.anInt439;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt439 = arg1.method8571();
		}
	}
}
