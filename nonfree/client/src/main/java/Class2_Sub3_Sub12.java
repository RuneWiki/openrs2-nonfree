import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class2_Sub3_Sub12 extends Class2_Sub3 {

	@OriginalMember(owner = "client!fu", name = "P", descriptor = "Lclient!dn;")
	public static final Class50 aClass50_1 = new Class50("stellardawn", 1);

	@OriginalMember(owner = "client!fu", name = "W", descriptor = "[I")
	public static final int[] anIntArray135 = new int[32];

	@OriginalMember(owner = "client!fu", name = "V", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!fu", name = "X", descriptor = "Lclient!h;")
	public static final Class89 aClass89_88 = new Class89(17, 2);

	@OriginalMember(owner = "client!fu", name = "O", descriptor = "I")
	private int anInt2211 = 0;

	@OriginalMember(owner = "client!fu", name = "Q", descriptor = "I")
	private int anInt2212 = 4096;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V", line = 129)
	public Class2_Sub3_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!bt;I)V", line = 3)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt2211 = arg1.method4830();
		} else if (arg0 == 1) {
			this.anInt2212 = arg1.method4830();
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BI)[I", line = 77)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(27) int[] local27 = this.method6474(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static211.anInt4031; local29++) {
				@Pc(35) int local35 = local27[local29];
				local11[local29] = local35 >= this.anInt2211 && local35 <= this.anInt2212 ? 4096 : 0;
			}
		}
		return local11;
	}
}
