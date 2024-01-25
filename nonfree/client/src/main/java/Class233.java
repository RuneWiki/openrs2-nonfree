import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class233 {

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
	public int anInt6397 = 0;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
	public int anInt6394 = 0;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "Lclient!si;")
	private final Class338 aClass338_34 = new Class338(64);

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "Lclient!qla;")
	private Interface21 anInterface21_1 = null;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "Lclient!lb;")
	private final Class221 aClass221_106;

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "Lclient!lb;")
	private final Class221 aClass221_105;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(ILclient!lb;Lclient!lb;Lclient!qla;)V")
	public Class233(@OriginalArg(0) int arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) Class221 arg2, @OriginalArg(3) Interface21 arg3) {
		this.aClass221_106 = arg1;
		this.anInterface21_1 = arg3;
		this.aClass221_105 = arg2;
		if (this.aClass221_106 != null) {
			this.anInt6394 = this.aClass221_106.method5065(1);
		}
		if (this.aClass221_105 != null) {
			this.anInt6397 = this.aClass221_105.method5065(1);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BI)Lclient!es;")
	public Class3_Sub4_Sub6 method5417(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub4_Sub6 local11 = (Class3_Sub4_Sub6) this.aClass338_34.method8049((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(26) byte[] local26;
		if (arg0 < 32768) {
			local26 = this.aClass221_106.method5089(arg0, 1);
		} else {
			local26 = this.aClass221_105.method5089(arg0 & 0x7FFF, 1);
		}
		local11 = new Class3_Sub4_Sub6();
		local11.aClass233_1 = this;
		if (local26 != null) {
			local11.method2551(new Class3_Sub28(local26));
		}
		if (arg0 >= 32768) {
			local11.method2549();
		}
		this.aClass338_34.method8044((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BJ[ILclient!lda;)Ljava/lang/String;")
	public String method5419(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class225 arg2) {
		if (this.anInterface21_1 != null) {
			@Pc(20) String local20 = this.anInterface21_1.method2684(arg0, arg2, arg1);
			if (local20 != null) {
				return local20;
			}
		}
		return Long.toString(arg0);
	}
}
