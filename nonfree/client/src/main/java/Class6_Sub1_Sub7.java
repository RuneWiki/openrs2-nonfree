import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class6_Sub1_Sub7 extends Class6_Sub1 {

	@OriginalMember(owner = "client!eea", name = "F", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray2[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(26) int[] local26 = this.method8963(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static479.anInt8231; local28++) {
				local11[local28] = 4096 - local26[local28];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean736 = arg0.method8374() == 1;
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(25) int[][] local25 = this.method8959(arg0, 0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local11[2];
			for (@Pc(51) int local51 = 0; local51 < Static479.anInt8231; local51++) {
				local41[local51] = 4096 - local29[local51];
				local45[local51] = 4096 - local33[local51];
				local49[local51] = 4096 - local37[local51];
			}
		}
		return local11;
	}
}
