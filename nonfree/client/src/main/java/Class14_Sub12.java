import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class14_Sub12 extends Class14 {

	@OriginalMember(owner = "client!kba", name = "q", descriptor = "[F")
	public static final float[] aFloatArray52 = new float[16384];

	@OriginalMember(owner = "client!kba", name = "s", descriptor = "[F")
	public static final float[] aFloatArray53 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray52[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray53[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class14_Sub12(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(ILclient!dh;)V")
	public Class14_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)V")
	@Override
	public void method9035() {
		if (super.aClass2_Sub13_31.method2600() != Static195.aClass316_2) {
			super.anInt10835 = 1;
		} else if (super.aClass2_Sub13_31.method2603()) {
			super.anInt10835 = 0;
		}
		if (super.anInt10835 != 0 && super.anInt10835 != 1) {
			super.anInt10835 = this.method9029();
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)V")
	@Override
	protected void method9031(@OriginalArg(1) int arg0) {
		super.anInt10835 = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)Z")
	public boolean method5128() {
		if (super.aClass2_Sub13_31.method2603()) {
			return false;
		} else {
			return super.aClass2_Sub13_31.method2600() == Static195.aClass316_2;
		}
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)I")
	@Override
	protected int method9029() {
		return 1;
	}

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "(I)I")
	public int method5129() {
		return super.anInt10835;
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(II)I")
	@Override
	public int method9033(@OriginalArg(1) int arg0) {
		if (super.aClass2_Sub13_31.method2603()) {
			return 3;
		} else if (super.aClass2_Sub13_31.method2600() == Static195.aClass316_2) {
			return 1;
		} else {
			return 3;
		}
	}
}
