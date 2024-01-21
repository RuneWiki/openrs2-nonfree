import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class1_Sub2_Sub3_Sub1 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!bf", name = "mb", descriptor = "[I")
	public static int[] anIntArray53 = new int[32];

	@OriginalMember(owner = "client!bf", name = "jb", descriptor = "Z")
	public boolean aBoolean8 = false;

	@OriginalMember(owner = "client!bf", name = "hb", descriptor = "I")
	private int anInt327 = 0;

	@OriginalMember(owner = "client!bf", name = "nb", descriptor = "I")
	private int anInt331 = 0;

	@OriginalMember(owner = "client!bf", name = "ib", descriptor = "I")
	public final int anInt328;

	@OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
	public final int anInt326;

	@OriginalMember(owner = "client!bf", name = "db", descriptor = "I")
	public final int anInt324;

	@OriginalMember(owner = "client!bf", name = "cb", descriptor = "I")
	private final int anInt323;

	@OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
	public final int anInt322;

	@OriginalMember(owner = "client!bf", name = "kb", descriptor = "I")
	public final int anInt329;

	@OriginalMember(owner = "client!bf", name = "eb", descriptor = "Lclient!qe;")
	private Class1_Sub2_Sub17 aClass1_Sub2_Sub17_1;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray53[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIIIII)V")
	public Class1_Sub2_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt328 = arg2;
		this.anInt326 = arg1;
		this.anInt324 = arg6 + arg5;
		this.anInt323 = arg0;
		this.anInt322 = arg4;
		this.anInt329 = arg3;
		@Pc(36) int local36 = Static52.method1009(this.anInt323).anInt2083;
		if (local36 == -1) {
			this.aBoolean8 = true;
		} else {
			this.aBoolean8 = false;
			this.aClass1_Sub2_Sub17_1 = Static34.method755(local36);
		}
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)Lclient!da;")
	@Override
	public Class1_Sub2_Sub3_Sub2 method1969() {
		@Pc(13) Class1_Sub2_Sub15 local13 = Static52.method1009(this.anInt323);
		@Pc(22) Class1_Sub2_Sub3_Sub2 local22;
		if (this.aBoolean8) {
			local22 = local13.method1553(-1);
		} else {
			local22 = local13.method1553(this.anInt327);
		}
		return local22 == null ? null : local22;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
	public void method285(@OriginalArg(0) int arg0) {
		if (this.aBoolean8) {
			return;
		}
		this.anInt331 += arg0;
		while (this.anInt331 > this.aClass1_Sub2_Sub17_1.anIntArray406[this.anInt327]) {
			this.anInt331 -= this.aClass1_Sub2_Sub17_1.anIntArray406[this.anInt327];
			this.anInt327++;
			if (this.aClass1_Sub2_Sub17_1.anIntArray410.length <= this.anInt327) {
				this.aBoolean8 = true;
				return;
			}
		}
	}
}
