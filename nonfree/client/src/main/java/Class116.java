import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class116 {

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "[I")
	public static final int[] anIntArray226 = new int[120];

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "Lclient!jt;")
	private final Class166 aClass166_18 = new Class166(64);

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "Lclient!vd;")
	private final Class353 aClass353_35;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
	public final int anInt3785;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray226[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class116(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_35 = arg2;
		this.anInt3785 = this.aClass353_35.method8422(19);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)Lclient!ai;")
	public Class14 method3353(@OriginalArg(0) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_18;
		@Pc(16) Class14 local16;
		synchronized (this.aClass166_18) {
			local16 = (Class14) this.aClass166_18.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class353 local29 = this.aClass353_35;
		@Pc(43) byte[] local43;
		synchronized (this.aClass353_35) {
			local43 = this.aClass353_35.method8404(19, arg0);
		}
		local16 = new Class14();
		if (local43 != null) {
			local16.method291(new Class6_Sub40(local43));
		}
		@Pc(65) Class166 local65 = this.aClass166_18;
		synchronized (this.aClass166_18) {
			this.aClass166_18.method4803(local16, (long) arg0);
			return local16;
		}
	}
}
