import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class5_Sub1_Sub20 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ke", name = "S", descriptor = "[I")
	public static final int[] anIntArray209 = new int[32];

	@OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
	private int anInt2145;

	static {
		@Pc(8) int local8 = 2;
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			anIntArray209[local10] = local8 - 1;
			local8 += local8;
		}
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V")
	private Class5_Sub1_Sub20(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2145 = 4096;
		this.anInt2145 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub20() {
		this(4096);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(5) int[] local5 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			Static220.method48(local5, 0, Static174.anInt3489, this.anInt2145);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2145 = (arg0.method3062() << 12) / 255;
		}
	}
}
