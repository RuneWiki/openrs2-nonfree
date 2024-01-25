import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class189 {

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
	public int anInt5965 = 0;

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
	public int anInt5966 = 0;

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "Lclient!me;")
	private final Class211 aClass211_44 = new Class211(64);

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "Lclient!so;")
	private Interface17 anInterface17_1 = null;

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "Lclient!pe;")
	private final Class254 aClass254_82;

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "Lclient!pe;")
	private final Class254 aClass254_83;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(ILclient!pe;Lclient!pe;Lclient!so;)V")
	public Class189(@OriginalArg(0) int arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Interface17 arg3) {
		this.anInterface17_1 = arg3;
		this.aClass254_82 = arg1;
		this.aClass254_83 = arg2;
		if (this.aClass254_82 != null) {
			this.anInt5966 = this.aClass254_82.method6396(1);
		}
		if (this.aClass254_83 != null) {
			this.anInt5965 = this.aClass254_83.method6396(1);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)Lclient!rca;")
	public Class3_Sub4_Sub16 method4916(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub4_Sub16 local11 = (Class3_Sub4_Sub16) this.aClass211_44.method5534((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass254_82.method6401(1, arg0);
		} else {
			local27 = this.aClass254_83.method6401(1, arg0 & 0x7FFF);
		}
		local11 = new Class3_Sub4_Sub16();
		local11.aClass189_2 = this;
		if (local27 != null) {
			local11.method6942(new Class3_Sub7(local27));
		}
		if (arg0 >= 32768) {
			local11.method6949();
		}
		this.aClass211_44.method5529((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!mv;J[IB)Ljava/lang/String;")
	public String method4917(@OriginalArg(0) Class219 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int[] arg2) {
		if (this.anInterface17_1 != null) {
			@Pc(19) String local19 = this.anInterface17_1.method7106(arg1, arg0, arg2);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg1);
	}
}
