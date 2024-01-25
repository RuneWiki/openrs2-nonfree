import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class1_Sub1_Sub37 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
	private int anInt6383 = 20;

	@OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
	private int anInt6385 = 0;

	@OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
	private int anInt6386 = 1365;

	@OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
	private int anInt6391 = 0;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6386 = arg1.method2161();
		} else if (arg0 == 1) {
			this.anInt6383 = arg1.method2161();
		} else if (arg0 == 2) {
			this.anInt6391 = arg1.method2161();
		} else if (arg0 == 3) {
			this.anInt6385 = arg1.method2161();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			for (@Pc(17) int local17 = 0; local17 < Static85.anInt1910; local17++) {
				@Pc(31) int local31 = this.anInt6391 + (Static273.anIntArray414[local17] << 12) / this.anInt6386;
				@Pc(43) int local43 = this.anInt6385 + (Static60.anIntArray122[arg0] << 12) / this.anInt6386;
				@Pc(49) int local49 = local31;
				@Pc(51) int local51 = local43;
				@Pc(57) int local57 = local31 * local31 >> 12;
				@Pc(63) int local63 = local43 * local43 >> 12;
				@Pc(65) int local65 = 0;
				while (local63 + local57 < 16384 && this.anInt6383 > local65) {
					local51 = (local51 * local49 >> 12) * 2 + local43;
					local49 = local57 + local31 - local63;
					local57 = local49 * local49 >> 12;
					local65++;
					local63 = local51 * local51 >> 12;
				}
				local11[local17] = local65 >= this.anInt6383 - 1 ? 0 : (local65 << 12) / this.anInt6383;
			}
		}
		return local11;
	}
}
