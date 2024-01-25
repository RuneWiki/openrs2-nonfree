import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class61 {

	@OriginalMember(owner = "client!em", name = "f", descriptor = "I")
	public int anInt1706 = 0;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "I")
	public int anInt1703 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "Lclient!wi;")
	private final Class268 aClass268_18 = new Class268(64);

	@OriginalMember(owner = "client!em", name = "l", descriptor = "Lclient!an;")
	private Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "Lclient!uu;")
	private final Class250 aClass250_32;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "Lclient!uu;")
	private final Class250 aClass250_33;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(ILclient!uu;Lclient!uu;Lclient!an;)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Interface1 arg3) {
		this.aClass250_32 = arg2;
		this.anInterface1_1 = arg3;
		this.aClass250_33 = arg1;
		if (this.aClass250_33 != null) {
			this.anInt1706 = this.aClass250_33.method5815(1);
		}
		if (this.aClass250_32 != null) {
			this.anInt1703 = this.aClass250_32.method5815(1);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Lclient!wd;")
	public Class3_Sub3_Sub18 method1599(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub3_Sub18 local11 = (Class3_Sub3_Sub18) this.aClass268_18.method6166((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = this.aClass250_33.method5806(1, arg0);
		} else {
			local25 = this.aClass250_32.method5806(1, arg0 & 0x7FFF);
		}
		local11 = new Class3_Sub3_Sub18();
		local11.aClass61_2 = this;
		if (local25 != null) {
			local11.method6107(new Class3_Sub25(local25));
		}
		if (arg0 >= 32768) {
			local11.method6114();
		}
		this.aClass268_18.method6164(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!fg;IJ[I)Ljava/lang/String;")
	public String method1601(@OriginalArg(0) Class70 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2) {
		if (this.anInterface1_1 != null) {
			@Pc(19) String local19 = this.anInterface1_1.method1218(arg0, arg1, arg2);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg1);
	}
}
