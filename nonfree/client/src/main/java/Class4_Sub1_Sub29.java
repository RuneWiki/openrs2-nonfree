import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class4_Sub1_Sub29 extends Class4_Sub1 {

	@OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
	private int anInt4749 = 2048;

	@OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
	private int anInt4747 = 1024;

	@OriginalMember(owner = "client!sc", name = "ib", descriptor = "I")
	private int anInt4757 = 3072;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(20) int[] local20 = this.method4736(arg0, 0);
			for (@Pc(22) int local22 = 0; local22 < Static73.anInt1626; local22++) {
				local7[local22] = this.anInt4747 + (local20[local22] * this.anInt4749 >> 12);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230) {
			@Pc(23) int[][] local23 = this.method4723(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local13[0];
			@Pc(39) int[] local39 = local13[2];
			@Pc(43) int[] local43 = local13[1];
			@Pc(47) int[] local47 = local23[2];
			for (@Pc(49) int local49 = 0; local49 < Static73.anInt1626; local49++) {
				local35[local49] = (this.anInt4749 * local27[local49] >> 12) + this.anInt4747;
				local43[local49] = this.anInt4747 + (local31[local49] * this.anInt4749 >> 12);
				local39[local49] = this.anInt4747 + (this.anInt4749 * local47[local49] >> 12);
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(B)V")
	@Override
	public void method4737() {
		this.anInt4749 = this.anInt4757 - this.anInt4747;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4747 = arg0.method4653();
		} else if (arg1 == 1) {
			this.anInt4757 = arg0.method4653();
		} else if (arg1 == 2) {
			this.aBoolean398 = arg0.method4666() == 1;
		}
	}
}
