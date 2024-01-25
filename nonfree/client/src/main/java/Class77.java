import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class77 {

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
	public int anInt2263 = 0;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
	public int anInt2266 = 0;

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "Lclient!jda;")
	private final Class165 aClass165_18 = new Class165(64);

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "Lclient!aea;")
	private Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "Lclient!aj;")
	private final Class15 aClass15_30;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "Lclient!aj;")
	private final Class15 aClass15_31;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(ILclient!aj;Lclient!aj;Lclient!aea;)V")
	public Class77(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) Interface1 arg3) {
		this.aClass15_30 = arg2;
		this.aClass15_31 = arg1;
		this.anInterface1_1 = arg3;
		if (this.aClass15_31 != null) {
			this.anInt2263 = this.aClass15_31.method512(1);
		}
		if (this.aClass15_30 != null) {
			this.anInt2266 = this.aClass15_30.method512(1);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "([IBLclient!mt;J)Ljava/lang/String;")
	public String method2078(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class228 arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface1_1 != null) {
			@Pc(19) String local19 = this.anInterface1_1.method6189(arg0, arg2, arg1);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)Lclient!tr;")
	public Class3_Sub11_Sub18 method2082(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub11_Sub18 local13 = (Class3_Sub11_Sub18) this.aClass165_18.method4389((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(31) byte[] local31;
		if (arg0 < 32768) {
			local31 = this.aClass15_31.method517(arg0, 1);
		} else {
			local31 = this.aClass15_30.method517(arg0 & 0x7FFF, 1);
		}
		local13 = new Class3_Sub11_Sub18();
		local13.aClass77_2 = this;
		if (local31 != null) {
			local13.method8277(new Class3_Sub25(local31));
		}
		if (arg0 >= 32768) {
			local13.method8270();
		}
		this.aClass165_18.method4392(local13, (long) arg0);
		return local13;
	}
}
