import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "[I")
	public static final int[] anIntArray4 = new int[13];

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
	public static int anInt158 = 0;

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
	public static int anInt159 = 0;

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "Lclient!h;")
	public static final Class89 aClass89_9 = new Class89(97, 7);

	@OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 4)
	public Class2_Sub3_Sub1() {
		this(4096);
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V", line = 202)
	public Class2_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt164 = 4096;
		this.anInt164 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!bt;I)V", line = 24)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt164 = (arg1.method4816() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)[I", line = 85)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			Static390.method4611(local14, 0, Static211.anInt4031, this.anInt164);
		}
		return local14;
	}
}
