import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class240 {

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "[F")
	public static final float[] aFloatArray30 = new float[16384];

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[16384];

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "Lclient!mt;")
	private Class1_Sub3 aClass1_Sub3_50 = new Class1_Sub3();

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!wf;")
	private final Class260 aClass260_9 = new Class260();

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
	private final int anInt6527;

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
	private int anInt6528;

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "Lclient!wa;")
	private final Class257 aClass257_30;

	static {
		@Pc(17) double local17 = 3.834951969714103E-4D;
		for (@Pc(19) int local19 = 0; local19 < 16384; local19++) {
			aFloatArray30[local19] = (float) Math.sin(local17 * (double) local19);
			aFloatArray29[local19] = (float) Math.cos((double) local19 * local17);
		}
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
	public Class240(@OriginalArg(0) int arg0) {
		this.anInt6527 = arg0;
		this.anInt6528 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass257_30 = new Class257(local19);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(JB)Lclient!mt;")
	public Class1_Sub3 method5015(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub3 local10 = (Class1_Sub3) this.aClass257_30.method5503(arg0);
		if (local10 != null) {
			this.aClass260_9.method5557(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public void method5019() {
		this.aClass260_9.method5551();
		this.aClass257_30.method5499();
		this.aClass1_Sub3_50 = new Class1_Sub3();
		this.anInt6528 = this.anInt6527;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!mt;J)V")
	public void method5021(@OriginalArg(1) Class1_Sub3 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt6528 == 0) {
			@Pc(7) Class1_Sub3 local7 = this.aClass260_9.method5550();
			local7.method5617();
			local7.method5312();
			if (local7 == this.aClass1_Sub3_50) {
				local7 = this.aClass260_9.method5550();
				local7.method5617();
				local7.method5312();
			}
		} else {
			this.anInt6528--;
		}
		this.aClass257_30.method5504(arg0, arg1);
		this.aClass260_9.method5557(arg0);
	}
}
