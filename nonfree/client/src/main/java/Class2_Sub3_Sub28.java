import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class2_Sub3_Sub28 extends Class2_Sub3 {

	@OriginalMember(owner = "client!u", name = "ob", descriptor = "[I")
	public static int[] anIntArray334 = new int[32];

	@OriginalMember(owner = "client!u", name = "jb", descriptor = "I")
	private int anInt3572;

	static {
		@Pc(10) int local10 = 2;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			anIntArray334[local12] = local10 - 1;
			local10 += local10;
		}
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub28() {
		this(4096);
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(I)V")
	private Class2_Sub3_Sub28(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3572 = 4096;
		this.anInt3572 = arg0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3572 = (arg1.method1698() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			Static184.method1643(local13, 0, Static54.anInt1423, this.anInt3572);
		}
		return local13;
	}
}
