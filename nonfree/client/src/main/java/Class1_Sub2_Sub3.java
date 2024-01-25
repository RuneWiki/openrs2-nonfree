import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bm", name = "I", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!bm", name = "H", descriptor = "Z")
	private boolean aBoolean69 = true;

	@OriginalMember(owner = "client!bm", name = "K", descriptor = "Z")
	private boolean aBoolean70 = true;

	static {
		for (@Pc(13) int local13 = 0; local13 < 100; local13++) {
			aRectangleArray1[local13] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.aBoolean69 = arg1.method3141() == 1;
		} else if (arg0 == 1) {
			this.aBoolean70 = arg1.method3141() == 1;
		} else if (arg0 == 2) {
			super.aBoolean583 = arg1.method3141() == 1;
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(34) int[][] local34 = this.method5659(this.aBoolean70 ? Static206.anInt4136 - arg0 : arg0, 0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean69) {
				for (local63 = 0; local63 < Static251.anInt6509; local63++) {
					local50[local63] = local38[Static260.anInt5056 - local63];
					local54[local63] = local42[Static260.anInt5056 - local63];
					local58[local63] = local46[Static260.anInt5056 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static251.anInt6509; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(34) int[] local34 = this.method5654(0, this.aBoolean70 ? Static206.anInt4136 - arg0 : arg0);
			if (this.aBoolean69) {
				for (@Pc(39) int local39 = 0; local39 < Static251.anInt6509; local39++) {
					local16[local39] = local34[Static260.anInt5056 - local39];
				}
			} else {
				Static367.method5380(local34, 0, local16, 0, Static251.anInt6509);
			}
		}
		return local16;
	}
}
