import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class363 {

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
	public int anInt9833 = 0;

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
	public int anInt9836 = 0;

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "Lclient!mga;")
	private final Class223 aClass223_69 = new Class223(64);

	@OriginalMember(owner = "client!ww", name = "i", descriptor = "Lclient!rj;")
	private Interface20 anInterface20_1 = null;

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "Lclient!bi;")
	private final Class31 aClass31_125;

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "Lclient!bi;")
	private final Class31 aClass31_126;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(ILclient!bi;Lclient!bi;Lclient!rj;)V")
	public Class363(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Interface20 arg3) {
		this.aClass31_125 = arg1;
		this.anInterface20_1 = arg3;
		this.aClass31_126 = arg2;
		if (this.aClass31_125 != null) {
			this.anInt9836 = this.aClass31_125.method657(1);
		}
		if (this.aClass31_126 != null) {
			this.anInt9833 = this.aClass31_126.method657(1);
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!lj;J[II)Ljava/lang/String;")
	public String method8037(@OriginalArg(0) Class210 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int[] arg2) {
		if (this.anInterface20_1 != null) {
			@Pc(21) String local21 = this.anInterface20_1.method4574(arg2, arg1, arg0);
			if (local21 != null) {
				return local21;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IZ)Lclient!tfa;")
	public Class4_Sub7_Sub16 method8038(@OriginalArg(0) int arg0) {
		@Pc(23) Class4_Sub7_Sub16 local23 = (Class4_Sub7_Sub16) this.aClass223_69.method4943((long) arg0);
		if (local23 != null) {
			return local23;
		}
		@Pc(43) byte[] local43;
		if (arg0 >= 32768) {
			local43 = this.aClass31_126.method667(1, arg0 & 0x7FFF);
		} else {
			local43 = this.aClass31_125.method667(1, arg0);
		}
		local23 = new Class4_Sub7_Sub16();
		local23.aClass363_2 = this;
		if (local43 != null) {
			local23.method7160(new Class4_Sub9(local43));
		}
		if (arg0 >= 32768) {
			local23.method7168();
		}
		this.aClass223_69.method4938((long) arg0, local23);
		return local23;
	}
}
