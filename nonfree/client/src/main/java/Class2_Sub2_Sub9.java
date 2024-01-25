import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cv", name = "O", descriptor = "[I")
	public static final int[] anIntArray80 = new int[256];

	@OriginalMember(owner = "client!cv", name = "P", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1;

	@OriginalMember(owner = "client!cv", name = "I", descriptor = "I")
	private int anInt1115 = 4096;

	@OriginalMember(owner = "client!cv", name = "J", descriptor = "I")
	private int anInt1116 = 0;

	static {
		@Pc(7) int local7;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray80[local4] = local7;
		}
		aRectangleArray1 = new Rectangle[100];
		for (local7 = 0; local7 < 100; local7++) {
			aRectangleArray1[local7] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub9() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1116 = arg0.method6148();
		} else if (arg1 == 1) {
			this.anInt1115 = arg0.method6148();
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(26) int[] local26 = this.method6266(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static398.anInt6955; local28++) {
				@Pc(34) int local34 = local26[local28];
				local11[local28] = local34 >= this.anInt1116 && this.anInt1115 >= local34 ? 4096 : 0;
			}
		}
		return local11;
	}
}
