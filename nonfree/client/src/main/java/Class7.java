import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class7 {

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "[I")
	public static final int[] anIntArray1 = new int[32];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Lclient!wi;")
	private final Class268 aClass268_1 = new Class268(64);

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "Lclient!uu;")
	private final Class250 aClass250_4;

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "Lclient!uu;")
	public final Class250 aClass250_3;

	static {
		@Pc(15) int local15 = 2;
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			anIntArray1[local17] = local15 - 1;
			local15 += local15;
		}
	}

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;Lclient!uu;)V")
	public Class7(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Class250 arg3) {
		this.aClass250_4 = arg2;
		this.aClass250_3 = arg3;
		this.aClass250_4.method5815(3);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public void method141() {
		@Pc(2) Class268 local2 = this.aClass268_1;
		synchronized (this.aClass268_1) {
			this.aClass268_1.method6160();
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	public void method142() {
		@Pc(6) Class268 local6 = this.aClass268_1;
		synchronized (this.aClass268_1) {
			this.aClass268_1.method6168();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	public void method143() {
		@Pc(2) Class268 local2 = this.aClass268_1;
		synchronized (this.aClass268_1) {
			this.aClass268_1.method6173(5);
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)Lclient!wc;")
	public Class264 method144(@OriginalArg(1) int arg0) {
		@Pc(11) Class268 local11 = this.aClass268_1;
		@Pc(21) Class264 local21;
		synchronized (this.aClass268_1) {
			local21 = (Class264) this.aClass268_1.method6166((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class250 local34 = this.aClass250_4;
		@Pc(43) byte[] local43;
		synchronized (this.aClass250_4) {
			local43 = this.aClass250_4.method5806(3, arg0);
		}
		local21 = new Class264();
		local21.aClass7_2 = this;
		if (local43 != null) {
			local21.method6093(new Class3_Sub25(local43));
		}
		@Pc(68) Class268 local68 = this.aClass268_1;
		synchronized (this.aClass268_1) {
			this.aClass268_1.method6164(local21, (long) arg0);
			return local21;
		}
	}
}
