import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class100 {

	@OriginalMember(owner = "client!em", name = "j", descriptor = "I")
	public int anInt2275 = 0;

	@OriginalMember(owner = "client!em", name = "l", descriptor = "I")
	public int anInt2277 = 0;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "Lclient!pa;")
	private final Class265 aClass265_5 = new Class265(64);

	@OriginalMember(owner = "client!em", name = "n", descriptor = "Lclient!uj;")
	private Interface25 anInterface25_1 = null;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "Lclient!cb;")
	private final Class50 aClass50_37;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "Lclient!cb;")
	private final Class50 aClass50_38;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(ILclient!cb;Lclient!cb;Lclient!uj;)V")
	public Class100(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) Interface25 arg3) {
		this.anInterface25_1 = arg3;
		this.aClass50_37 = arg2;
		this.aClass50_38 = arg1;
		if (this.aClass50_38 != null) {
			this.anInt2275 = this.aClass50_38.method913(1);
		}
		if (this.aClass50_37 != null) {
			this.anInt2277 = this.aClass50_37.method913(1);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)Lclient!aga;")
	public Class5_Sub2_Sub2 method2047(@OriginalArg(0) int arg0) {
		@Pc(21) Class5_Sub2_Sub2 local21 = (Class5_Sub2_Sub2) this.aClass265_5.method6577((long) arg0);
		if (local21 != null) {
			return local21;
		}
		@Pc(39) byte[] local39;
		if (arg0 >= 32768) {
			local39 = this.aClass50_37.method916(arg0 & 0x7FFF, 1);
		} else {
			local39 = this.aClass50_38.method916(arg0, 1);
		}
		local21 = new Class5_Sub2_Sub2();
		local21.aClass100_1 = this;
		if (local39 != null) {
			local21.method201(new Class5_Sub15(local39));
		}
		if (arg0 >= 32768) {
			local21.method200();
		}
		this.aClass265_5.method6566(local21, (long) arg0);
		return local21;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([IJLclient!rh;B)Ljava/lang/String;")
	public String method2050(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class307 arg2) {
		if (this.anInterface25_1 != null) {
			@Pc(19) String local19 = this.anInterface25_1.method270(arg1, arg0, arg2);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg1);
	}
}
