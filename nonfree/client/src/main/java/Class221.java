import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class221 {

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
	public int anInt6489 = 0;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
	public int anInt6495 = 0;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Lclient!er;")
	private final Class69 aClass69_66 = new Class69(64);

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "Lclient!gk;")
	private Interface7 anInterface7_1 = null;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "Lclient!ns;")
	private final Class166 aClass166_254;

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "Lclient!ns;")
	private final Class166 aClass166_255;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(ILclient!ns;Lclient!ns;Lclient!gk;)V")
	public Class221(@OriginalArg(0) int arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(2) Class166 arg2, @OriginalArg(3) Interface7 arg3) {
		this.anInterface7_1 = arg3;
		this.aClass166_254 = arg2;
		this.aClass166_255 = arg1;
		if (this.aClass166_255 != null) {
			this.anInt6489 = this.aClass166_255.method3691(1);
		}
		if (this.aClass166_254 != null) {
			this.anInt6495 = this.aClass166_254.method3691(1);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Lclient!mq;")
	public Class4_Sub1_Sub10 method5054(@OriginalArg(1) int arg0) {
		@Pc(11) Class4_Sub1_Sub10 local11 = (Class4_Sub1_Sub10) this.aClass69_66.method1591((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(32) byte[] local32;
		if (arg0 < 32768) {
			local32 = this.aClass166_255.method3696(arg0, 1);
		} else {
			local32 = this.aClass166_254.method3696(arg0 & 0x7FFF, 1);
		}
		local11 = new Class4_Sub1_Sub10();
		local11.aClass221_1 = this;
		if (local32 != null) {
			local11.method3457(new Class4_Sub30(local32));
		}
		if (arg0 >= 32768) {
			local11.method3460();
		}
		this.aClass69_66.method1590((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(JLclient!wi;[II)Ljava/lang/String;")
	public String method5055(@OriginalArg(0) long arg0, @OriginalArg(1) Class263 arg1, @OriginalArg(2) int[] arg2) {
		if (this.anInterface7_1 != null) {
			@Pc(24) String local24 = this.anInterface7_1.method3648(arg2, arg0, arg1);
			if (local24 != null) {
				return local24;
			}
		}
		return Long.toString(arg0);
	}
}
