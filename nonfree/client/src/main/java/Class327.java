import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tia")
public final class Class327 {

	@OriginalMember(owner = "client!tia", name = "c", descriptor = "I")
	public int anInt9384 = 0;

	@OriginalMember(owner = "client!tia", name = "h", descriptor = "I")
	public int anInt9386 = 0;

	@OriginalMember(owner = "client!tia", name = "e", descriptor = "Lclient!jt;")
	private final Class166 aClass166_53 = new Class166(64);

	@OriginalMember(owner = "client!tia", name = "l", descriptor = "Lclient!rw;")
	private Interface23 anInterface23_1 = null;

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "Lclient!vd;")
	private final Class353 aClass353_114;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "Lclient!vd;")
	private final Class353 aClass353_113;

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(ILclient!vd;Lclient!vd;Lclient!rw;)V")
	public Class327(@OriginalArg(0) int arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) Class353 arg2, @OriginalArg(3) Interface23 arg3) {
		this.aClass353_114 = arg2;
		this.anInterface23_1 = arg3;
		this.aClass353_113 = arg1;
		if (this.aClass353_113 != null) {
			this.anInt9384 = this.aClass353_113.method8422(1);
		}
		if (this.aClass353_114 != null) {
			this.anInt9386 = this.aClass353_114.method8422(1);
		}
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "([ILclient!fa;JI)Ljava/lang/String;")
	public String method7978(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface23_1 != null) {
			@Pc(22) String local22 = this.anInterface23_1.method7898(arg0, arg1, arg2);
			if (local22 != null) {
				return local22;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(II)Lclient!lq;")
	public Class6_Sub2_Sub14 method7979(@OriginalArg(0) int arg0) {
		@Pc(11) Class6_Sub2_Sub14 local11 = (Class6_Sub2_Sub14) this.aClass166_53.method4805((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = this.aClass353_113.method8404(1, arg0);
		} else {
			local25 = this.aClass353_114.method8404(1, arg0 & 0x7FFF);
		}
		local11 = new Class6_Sub2_Sub14();
		local11.aClass327_1 = this;
		if (local25 != null) {
			local11.method5405(new Class6_Sub40(local25));
		}
		if (arg0 >= 32768) {
			local11.method5398();
		}
		this.aClass166_53.method4803(local11, (long) arg0);
		return local11;
	}
}
