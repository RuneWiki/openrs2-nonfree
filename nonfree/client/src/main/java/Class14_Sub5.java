import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class14_Sub5 extends Class14 {

	@OriginalMember(owner = "client!dda", name = "k", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[16384];

	@OriginalMember(owner = "client!dda", name = "m", descriptor = "[F")
	public static final float[] aFloatArray30 = new float[16384];

	static {
		@Pc(12) double local12 = 3.834951969714103E-4D;
		for (@Pc(14) int local14 = 0; local14 < 16384; local14++) {
			aFloatArray29[local14] = (float) Math.sin((double) local14 * local12);
			aFloatArray30[local14] = (float) Math.cos((double) local14 * local12);
		}
	}

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(ILclient!kda;)V")
	public Class14_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub33 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!kda;)V")
	public Class14_Sub5(@OriginalArg(0) Class6_Sub33 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)V")
	@Override
	public void method8572() {
		if (super.aClass6_Sub33_31.aClass14_Sub8_1.method2643() && !Static281.method4940(super.aClass6_Sub33_31.aClass14_Sub8_1.method2640())) {
			super.anInt10543 = 0;
		}
		if (super.anInt10543 < 0 || super.anInt10543 > 1) {
			super.anInt10543 = this.method8573();
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)V")
	@Override
	protected void method8571(@OriginalArg(1) int arg0) {
		super.anInt10543 = arg0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)I")
	@Override
	protected int method8573() {
		return 0;
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(II)I")
	@Override
	public int method8577(@OriginalArg(0) int arg0) {
		return Static281.method4940(super.aClass6_Sub33_31.aClass14_Sub8_1.method2640()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)I")
	public int method2299() {
		return super.anInt10543;
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(I)Z")
	public boolean method2300() {
		return Static281.method4940(super.aClass6_Sub33_31.aClass14_Sub8_1.method2640());
	}
}
