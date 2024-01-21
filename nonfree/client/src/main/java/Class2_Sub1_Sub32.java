import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class2_Sub1_Sub32 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
	private int anInt3918 = 3072;

	@OriginalMember(owner = "client!ui", name = "ab", descriptor = "I")
	private int anInt3924 = 1024;

	@OriginalMember(owner = "client!ui", name = "cb", descriptor = "I")
	private int anInt3925 = 2048;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(21) int[][] local21 = this.method3259(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local7[0];
			@Pc(41) int[] local41 = local7[1];
			@Pc(45) int[] local45 = local7[2];
			for (@Pc(47) int local47 = 0; local47 < Static135.anInt2897; local47++) {
				local37[local47] = this.anInt3924 + (this.anInt3925 * local25[local47] >> 12);
				local41[local47] = this.anInt3924 + (local29[local47] * this.anInt3925 >> 12);
				local45[local47] = (this.anInt3925 * local33[local47] >> 12) + this.anInt3924;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
	@Override
	public void method3260() {
		this.anInt3925 = this.anInt3918 - this.anInt3924;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(21) int[] local21 = this.method3265(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static135.anInt2897; local23++) {
				local11[local23] = this.anInt3924 + (this.anInt3925 * local21[local23] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3924 = arg0.method269();
		} else if (arg1 == 1) {
			this.anInt3918 = arg0.method269();
		} else if (arg1 == 2) {
			super.aBoolean196 = arg0.method260() == 1;
		}
	}
}
