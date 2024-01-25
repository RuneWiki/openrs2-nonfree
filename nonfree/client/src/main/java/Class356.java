import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class356 {

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "[I")
	public static final int[] anIntArray597 = new int[16384];

	@OriginalMember(owner = "client!wba", name = "e", descriptor = "[I")
	public static final int[] anIntArray598 = new int[16384];

	@OriginalMember(owner = "client!wba", name = "h", descriptor = "Lclient!ad;")
	private final Class6 aClass6_63 = new Class6(16);

	@OriginalMember(owner = "client!wba", name = "i", descriptor = "Lclient!tf;")
	private final Class322 aClass322_155;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray597[local9] = (int) (Math.sin(local7 * (double) local9) * 16384.0D);
			anIntArray598[local9] = (int) (Math.cos((double) local9 * local7) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class356(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_155 = arg2;
		this.aClass322_155.method6831(29);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)V")
	public void method7701() {
		@Pc(2) Class6 local2 = this.aClass6_63;
		synchronized (this.aClass6_63) {
			this.aClass6_63.method97(5);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V")
	public void method7703() {
		@Pc(2) Class6 local2 = this.aClass6_63;
		synchronized (this.aClass6_63) {
			this.aClass6_63.method94();
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIILclient!oa;II)Lclient!vfa;")
	public Class350 method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class232 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class171[] local7 = null;
		@Pc(12) Class95 local12 = this.method7708(arg0);
		if (local12.anIntArray143 != null) {
			local7 = new Class171[local12.anIntArray143.length];
			for (@Pc(22) int local22 = 0; local22 < local7.length; local22++) {
				@Pc(32) Class293 local32 = arg2.method5415(local12.anIntArray143[local22]);
				local7[local22] = new Class171(local32.anInt7731, local32.anInt7728, local32.anInt7729, local32.anInt7735, local32.anInt7732, local32.anInt7736, local32.anInt7730, local32.aBoolean603);
			}
		}
		return new Class350(local12.anInt3097, local7, local12.anInt3096, arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(II)Lclient!ff;")
	private Class95 method7708(@OriginalArg(1) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_63;
		@Pc(18) Class95 local18;
		synchronized (this.aClass6_63) {
			local18 = (Class95) this.aClass6_63.method92((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class322 local31 = this.aClass322_155;
		@Pc(40) byte[] local40;
		synchronized (this.aClass322_155) {
			local40 = this.aClass322_155.method6802(29, arg0);
		}
		local18 = new Class95();
		if (local40 != null) {
			local18.method2791(new Class3_Sub11(local40));
		}
		@Pc(62) Class6 local62 = this.aClass6_63;
		synchronized (this.aClass6_63) {
			this.aClass6_63.method106((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Z)V")
	public void method7709() {
		@Pc(2) Class6 local2 = this.aClass6_63;
		synchronized (this.aClass6_63) {
			this.aClass6_63.method102();
		}
	}
}
