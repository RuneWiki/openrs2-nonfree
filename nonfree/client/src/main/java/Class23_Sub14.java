import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class23_Sub14 extends Class23 {

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "[F")
	public static final float[] aFloatArray48 = new float[16384];

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "[F")
	public static final float[] aFloatArray49 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray48[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray49[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub14(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		return super.aClass3_Sub48_31.method7829() == Static592.aClass62_13 && super.aClass3_Sub48_31.method7828() ? 0 : 1;
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		super.anInt10359 = arg0;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
	@Override
	public void method8506() {
		super.anInt10359 = this.method8501();
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(B)I")
	public int method4252() {
		return super.anInt10359;
	}
}
