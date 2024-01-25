import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class125 {

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "[I")
	public static final int[] anIntArray381 = new int[16384];

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "[I")
	public static final int[] anIntArray382 = new int[16384];

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!qc;")
	private final Class231 aClass231_36 = new Class231(64);

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!dda;")
	private final Class53 aClass53_63;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!dda;")
	public final Class53 aClass53_64;

	static {
		@Pc(12) double local12 = 3.834951969714103E-4D;
		for (@Pc(14) int local14 = 0; local14 < 16384; local14++) {
			anIntArray381[local14] = (int) (Math.sin(local12 * (double) local14) * 32768.0D);
			anIntArray382[local14] = (int) (Math.cos((double) local14 * local12) * 32768.0D);
		}
		new Class202("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;Lclient!dda;)V")
	public Class125(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) Class53 arg3) {
		this.aClass53_63 = arg2;
		this.aClass53_64 = arg3;
		this.aClass53_63.method1592(3);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V")
	public void method3171() {
		@Pc(6) Class231 local6 = this.aClass231_36;
		synchronized (this.aClass231_36) {
			this.aClass231_36.method6231(5);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Lclient!uv;")
	public Class290 method3173(@OriginalArg(1) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_36;
		@Pc(18) Class290 local18;
		synchronized (this.aClass231_36) {
			local18 = (Class290) this.aClass231_36.method6228((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(41) Class53 local41 = this.aClass53_63;
		@Pc(50) byte[] local50;
		synchronized (this.aClass53_63) {
			local50 = this.aClass53_63.method1616(arg0, 3);
		}
		local18 = new Class290();
		local18.aClass125_2 = this;
		if (local50 != null) {
			local18.method7325(new Class2_Sub29(local50));
		}
		@Pc(75) Class231 local75 = this.aClass231_36;
		synchronized (this.aClass231_36) {
			this.aClass231_36.method6232(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public void method3175() {
		@Pc(6) Class231 local6 = this.aClass231_36;
		synchronized (this.aClass231_36) {
			this.aClass231_36.method6227();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method3176() {
		@Pc(2) Class231 local2 = this.aClass231_36;
		synchronized (this.aClass231_36) {
			this.aClass231_36.method6240();
		}
	}
}
