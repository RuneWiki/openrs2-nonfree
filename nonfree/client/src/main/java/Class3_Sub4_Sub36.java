import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class3_Sub4_Sub36 extends Class3_Sub4 {

	@OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
	private int anInt7233 = 0;

	@OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
	private int anInt7241 = 0;

	@OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
	private int anInt7239 = 1;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt7233 = arg1.method6053();
		} else if (arg0 == 1) {
			this.anInt7241 = arg1.method6053();
		} else if (arg0 == 3) {
			this.anInt7239 = arg1.method6053();
		}
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
	@Override
	public void method5963() {
		Static251.method3833();
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(27) int local27 = Static285.anIntArray401[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static106.anInt2356; local35++) {
				@Pc(41) int local41 = Static382.anIntArray476[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(61) int local61;
				if (this.anInt7233 == 0) {
					local61 = this.anInt7239 * (local41 - local27);
				} else {
					@Pc(74) int local74 = local47 * local47 + local33 * local33 >> 12;
					local61 = (int) (Math.sqrt((double) ((float) local74 / 4096.0F)) * 4096.0D);
					local61 = (int) ((double) (local61 * this.anInt7239) * 3.141592653589793D);
				}
				local61 -= local61 & 0xFFFFF000;
				if (this.anInt7241 == 0) {
					local61 = Static441.anIntArray571[local61 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt7241 == 2) {
					local61 -= 2048;
					if (local61 < 0) {
						local61 = -local61;
					}
					local61 = 2048 - local61 << 1;
				}
				local11[local35] = local61;
			}
		}
		return local11;
	}
}
