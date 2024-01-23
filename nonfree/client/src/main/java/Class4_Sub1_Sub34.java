import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class4_Sub1_Sub34 extends Class4_Sub1 {

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean398 = arg0.method4666() == 1;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(24) int[] local24 = this.method4736(arg0, 0);
			for (@Pc(26) int local26 = 0; local26 < Static73.anInt1626; local26++) {
				local11[local26] = 4096 - local24[local26];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230) {
			@Pc(23) int[][] local23 = this.method4723(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[2];
			@Pc(35) int[] local35 = local13[0];
			@Pc(39) int[] local39 = local23[1];
			@Pc(43) int[] local43 = local13[1];
			@Pc(47) int[] local47 = local13[2];
			for (@Pc(49) int local49 = 0; local49 < Static73.anInt1626; local49++) {
				local35[local49] = 4096 - local27[local49];
				local43[local49] = 4096 - local39[local49];
				local47[local49] = 4096 - local31[local49];
			}
		}
		return local13;
	}
}
