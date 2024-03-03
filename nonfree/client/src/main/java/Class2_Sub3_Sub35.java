import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class2_Sub3_Sub35 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_134 = new Class79("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!ub", name = "X", descriptor = "Z")
	public static boolean aBoolean434 = false;

	@OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
	public static int anInt6429 = 0;

	@OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
	public static int anInt6431 = 0;

	@OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
	public static int anInt6430 = 0;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	private int anInt6421;

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
	private int anInt6423;

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
	private int anInt6424 = -1;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 8)
	public Class2_Sub3_Sub35() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)V", line = 12)
	@Override
	public void method6476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method6476(arg0, arg1);
		if (this.anInt6424 >= 0 && Static239.anInterface2_6 != null) {
			@Pc(28) int local28 = Static239.anInterface2_6.method2660(this.anInt6424).aBoolean441 ? 64 : 128;
			this.anIntArray435 = Static239.anInterface2_6.method2661(this.anInt6424, false, local28, 1.0F, local28);
			this.anInt6423 = local28;
			this.anInt6421 = local28;
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)I", line = 32)
	@Override
	public int method6483() {
		return this.anInt6424;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 43)
	@Override
	public void method6478() {
		super.method6478();
		this.anIntArray435 = null;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IB)[[I", line = 96)
	@Override
	public int[][] method6480(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6278(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(35) int local35 = this.anInt6423 * (Static23.anInt638 == this.anInt6421 ? arg0 : arg0 * this.anInt6421 / Static23.anInt638);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (this.anInt6423 == Static211.anInt4031) {
				for (local57 = 0; local57 < Static211.anInt4031; local57++) {
					local65 = this.anIntArray435[local35++];
					local47[local57] = (local65 & 0xFF) << 4;
					local43[local57] = local65 >> 4 & 0xFF0;
					local39[local57] = local65 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static211.anInt4031; local57++) {
					local65 = this.anInt6423 * local57 / Static211.anInt4031;
					@Pc(117) int local117 = this.anIntArray435[local35 + local65];
					local47[local57] = (local117 & 0xFF) << 4;
					local43[local57] = local117 >> 4 & 0xFF0;
					local39[local57] = local117 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!bt;I)V", line = 173)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt6424 = arg1.method4830();
		}
	}
}
