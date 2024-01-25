import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class274 {

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "[F")
	public static final float[] aFloatArray64 = new float[16384];

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "[F")
	public static final float[] aFloatArray65 = new float[16384];

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Lclient!vh;")
	private Class330 aClass330_55 = new Class330(64);

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "Lclient!vh;")
	public Class330 aClass330_56 = new Class330(64);

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Lclient!pj;")
	public final Class248 aClass248_86;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!pj;")
	private final Class248 aClass248_85;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray65[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray64[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;Lclient!pj;)V")
	public Class274(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2, @OriginalArg(3) Class248 arg3) {
		this.aClass248_86 = arg3;
		this.aClass248_85 = arg2;
		this.aClass248_85.method5793(34);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
	public void method6286() {
		@Pc(12) Class330 local12 = this.aClass330_55;
		synchronized (this.aClass330_55) {
			this.aClass330_55.method7678();
		}
		local12 = this.aClass330_56;
		synchronized (this.aClass330_56) {
			this.aClass330_56.method7678();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	public void method6287() {
		@Pc(6) Class330 local6 = this.aClass330_55;
		synchronized (this.aClass330_55) {
			this.aClass330_55.method7688();
		}
		local6 = this.aClass330_56;
		synchronized (this.aClass330_56) {
			this.aClass330_56.method7688();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIB)V")
	public void method6289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass330_55 = new Class330(arg0);
		this.aClass330_56 = new Class330(arg1);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
	public void method6291() {
		@Pc(6) Class330 local6 = this.aClass330_55;
		synchronized (this.aClass330_55) {
			this.aClass330_55.method7680(5);
		}
		local6 = this.aClass330_56;
		synchronized (this.aClass330_56) {
			this.aClass330_56.method7680(5);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)Lclient!jm;")
	public Class158 method6292(@OriginalArg(0) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_55;
		@Pc(16) Class158 local16;
		synchronized (this.aClass330_55) {
			local16 = (Class158) this.aClass330_55.method7677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class248 local29 = this.aClass248_85;
		@Pc(47) byte[] local47;
		synchronized (this.aClass248_85) {
			local47 = this.aClass248_85.method5797(34, arg0);
		}
		local16 = new Class158();
		local16.aClass274_4 = this;
		if (local47 != null) {
			local16.method3896(new Class6_Sub12(local47));
		}
		@Pc(72) Class330 local72 = this.aClass330_55;
		synchronized (this.aClass330_55) {
			this.aClass330_55.method7676(local16, (long) arg0);
			return local16;
		}
	}
}
