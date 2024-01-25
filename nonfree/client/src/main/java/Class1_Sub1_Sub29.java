import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class1_Sub1_Sub29 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sa", name = "J", descriptor = "[I")
	public static final int[] anIntArray527 = new int[256];

	@OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
	private int anInt8009 = 4096;

	@OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
	private int anInt8007 = 0;

	static {
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(10) int local10 = local7;
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if ((local10 & 0x1) == 1) {
					local10 = local10 >>> 1 ^ 0xEDB88320;
				} else {
					local10 >>>= 0x1;
				}
			}
			anIntArray527[local7] = local10;
		}
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(26) int[][] local26 = this.method7880(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static87.anInt1964; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (this.anInt8007 > local58) {
					local42[local52] = this.anInt8007;
				} else if (this.anInt8009 < local58) {
					local42[local52] = this.anInt8009;
				} else {
					local42[local52] = local58;
				}
				if (local62 < this.anInt8007) {
					local46[local52] = this.anInt8007;
				} else if (local62 > this.anInt8009) {
					local46[local52] = this.anInt8009;
				} else {
					local46[local52] = local62;
				}
				if (this.anInt8007 > local66) {
					local50[local52] = this.anInt8007;
				} else if (local66 <= this.anInt8009) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt8009;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt8007 = arg1.method4426();
		} else if (arg0 == 1) {
			this.anInt8009 = arg1.method4426();
		} else if (arg0 == 2) {
			super.aBoolean696 = arg1.method4393() == 1;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(26) int[] local26 = this.method7882(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static87.anInt1964; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt8007 > local34) {
					local16[local28] = this.anInt8007;
				} else if (local34 > this.anInt8009) {
					local16[local28] = this.anInt8009;
				} else {
					local16[local28] = local34;
				}
			}
		}
		return local16;
	}
}
