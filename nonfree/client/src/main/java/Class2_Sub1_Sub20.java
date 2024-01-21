import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class2_Sub1_Sub20 extends Class2_Sub1 {

	@OriginalMember(owner = "client!oi", name = "P", descriptor = "[B")
	public static final byte[] aByteArray33;

	static {
		@Pc(10) int local10 = 0;
		aByteArray33 = new byte[32896];
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			for (@Pc(18) int local18 = 0; local18 <= local15; local18++) {
				aByteArray33[local10++] = (byte) (255.0D / Math.sqrt((double) ((float) (local18 * local18 + local15 * local15 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean196 = arg0.method260() == 1;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(23) int[][] local23 = this.method3259(arg0, 0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[2];
			@Pc(35) int[] local35 = local23[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			for (@Pc(49) int local49 = 0; local49 < Static135.anInt2897; local49++) {
				local43[local49] = 4096 - local27[local49];
				local47[local49] = 4096 - local35[local49];
				local39[local49] = 4096 - local31[local49];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(26) int[] local26 = this.method3265(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static135.anInt2897; local28++) {
				local16[local28] = 4096 - local26[local28];
			}
		}
		return local16;
	}
}
