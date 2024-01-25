import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class113 {

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "[F")
	public static final float[] aFloatArray9 = new float[16384];

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "[F")
	public static final float[] aFloatArray10 = new float[16384];

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "Lclient!au;")
	private final Class21 aClass21_23 = new Class21(64);

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "Lclient!mv;")
	private final Class229 aClass229_30;

	static {
		@Pc(21) double local21 = 3.834951969714103E-4D;
		for (@Pc(23) int local23 = 0; local23 < 16384; local23++) {
			aFloatArray9[local23] = (float) Math.sin(local21 * (double) local23);
			aFloatArray10[local23] = (float) Math.cos(local21 * (double) local23);
		}
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class113(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_30 = arg2;
		this.aClass229_30.method4981(5);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)Lclient!rr;")
	public Class2_Sub2_Sub17 method2089(@OriginalArg(1) int arg0) {
		@Pc(11) Class21 local11 = this.aClass21_23;
		@Pc(23) Class2_Sub2_Sub17 local23;
		synchronized (this.aClass21_23) {
			local23 = (Class2_Sub2_Sub17) this.aClass21_23.method324((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class229 local36 = this.aClass229_30;
		@Pc(47) byte[] local47;
		synchronized (this.aClass229_30) {
			local47 = this.aClass229_30.method4980(5, arg0);
		}
		local23 = new Class2_Sub2_Sub17();
		if (local47 != null) {
			local23.method6140(new Class2_Sub7(local47));
		}
		@Pc(69) Class21 local69 = this.aClass21_23;
		synchronized (this.aClass21_23) {
			this.aClass21_23.method317(local23, (long) arg0);
			return local23;
		}
	}
}
