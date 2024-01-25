import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class14_Sub1_Sub28 extends Class14_Sub1 {

	@OriginalMember(owner = "client!oha", name = "H", descriptor = "I")
	private int anInt7652 = 3072;

	@OriginalMember(owner = "client!oha", name = "K", descriptor = "I")
	private int anInt7655 = 2048;

	@OriginalMember(owner = "client!oha", name = "J", descriptor = "I")
	private int anInt7654 = 1024;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(26) int[] local26 = this.method8897(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static371.anInt6835; local28++) {
				local16[local28] = this.anInt7654 + (local26[local28] * this.anInt7655 >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
	@Override
	public void method8899() {
		this.anInt7655 = this.anInt7652 - this.anInt7654;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(21) int[][] local21 = this.method8904(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static371.anInt6835; local47++) {
				local37[local47] = this.anInt7654 + (this.anInt7655 * local25[local47] >> 12);
				local41[local47] = (local29[local47] * this.anInt7655 >> 12) + this.anInt7654;
				local45[local47] = (local33[local47] * this.anInt7655 >> 12) + this.anInt7654;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7654 = arg0.method5900();
		} else if (arg1 == 1) {
			this.anInt7652 = arg0.method5900();
		} else if (arg1 == 2) {
			super.aBoolean734 = arg0.method5866() == 1;
		}
	}
}
