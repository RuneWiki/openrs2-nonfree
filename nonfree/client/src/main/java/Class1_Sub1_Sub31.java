import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class1_Sub1_Sub31 extends Class1_Sub1 {

	@OriginalMember(owner = "client!se", name = "K", descriptor = "I")
	private int anInt5560 = 1024;

	@OriginalMember(owner = "client!se", name = "J", descriptor = "I")
	private int anInt5559 = 3072;

	@OriginalMember(owner = "client!se", name = "U", descriptor = "I")
	private int anInt5568 = 2048;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
	@Override
	public void method6008() {
		this.anInt5568 = this.anInt5559 - this.anInt5560;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(21) int[] local21 = this.method6013(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static85.anInt1910; local23++) {
				local11[local23] = (local21[local23] * this.anInt5568 >> 12) + this.anInt5560;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5560 = arg1.method2161();
		} else if (arg0 == 1) {
			this.anInt5559 = arg1.method2161();
		} else if (arg0 == 2) {
			super.aBoolean509 = arg1.method2132() == 1;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(21) int[][] local21 = this.method6006(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static85.anInt1910; local47++) {
				local37[local47] = (local25[local47] * this.anInt5568 >> 12) + this.anInt5560;
				local41[local47] = this.anInt5560 + (this.anInt5568 * local29[local47] >> 12);
				local45[local47] = this.anInt5560 + (this.anInt5568 * local33[local47] >> 12);
			}
		}
		return local11;
	}
}
