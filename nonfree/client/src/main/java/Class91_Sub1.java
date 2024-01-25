import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public final class Class91_Sub1 extends Class91 {

	@OriginalMember(owner = "client!et", name = "Z", descriptor = "[I")
	public final int[] anIntArray185 = new int[Static31.anInt8721 + 8191];

	@OriginalMember(owner = "client!et", name = "db", descriptor = "[I")
	public final int[] anIntArray187 = new int[2200];

	@OriginalMember(owner = "client!et", name = "eb", descriptor = "[I")
	public final int[] anIntArray188 = new int[Static31.anInt8722];

	@OriginalMember(owner = "client!et", name = "bb", descriptor = "[I")
	public final int[] anIntArray186 = new int[12];

	@OriginalMember(owner = "client!et", name = "ib", descriptor = "[[I")
	public final int[][] anIntArrayArray25 = new int[12][Static31.anInt8721 + 8191];

	@OriginalMember(owner = "client!et", name = "fb", descriptor = "[I")
	public final int[] anIntArray189 = new int[Static31.anInt8721 + 8191];

	@OriginalMember(owner = "client!et", name = "kb", descriptor = "[[I")
	public final int[][] anIntArrayArray26 = new int[2200][64];

	@OriginalMember(owner = "client!et", name = "nb", descriptor = "[I")
	public final int[] anIntArray191 = new int[12];

	@OriginalMember(owner = "client!et", name = "mb", descriptor = "[I")
	public final int[] anIntArray190 = new int[32];

	@OriginalMember(owner = "client!et", name = "ob", descriptor = "[[I")
	public final int[][] anIntArrayArray27 = new int[32][512];

	@OriginalMember(owner = "client!et", name = "jb", descriptor = "Lclient!lr;")
	public Class204 aClass204_1;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class91_Sub1(@OriginalArg(0) Class15_Sub1 arg0) {
		super(arg0);
		this.aClass204_1 = new Class204(arg0);
		super.aClass21_Sub1_37 = new Class21_Sub1_Sub1(super.aClass15_Sub1_10);
		super.aClass21_Sub1_34 = new Class21_Sub1_Sub1(super.aClass15_Sub1_10);
		super.aClass21_Sub1_35 = new Class21_Sub1_Sub1(super.aClass15_Sub1_10);
		super.aClass21_Sub1_31 = new Class21_Sub1_Sub1(super.aClass15_Sub1_10);
		super.aClass21_Sub1_32 = new Class21_Sub1_Sub1(super.aClass15_Sub1_10);
		super.aClass21_Sub1_39 = new Class21_Sub1_Sub1(super.aClass15_Sub1_10);
		super.aClass21_Sub1_38 = new Class21_Sub1_Sub1(super.aClass15_Sub1_10);
		super.aClass21_Sub1_36 = new Class21_Sub1_Sub1(super.aClass15_Sub1_10);
		super.aClass21_Sub1_33 = new Class21_Sub1_Sub1(super.aClass15_Sub1_10);
		super.aClass21_Sub1_40 = new Class21_Sub1_Sub1(super.aClass15_Sub1_10);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
	@Override
	public void method3266() {
		this.aClass204_1 = new Class204(super.aClass15_Sub1_10);
	}
}
