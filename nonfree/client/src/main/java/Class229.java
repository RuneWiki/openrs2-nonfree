import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class229 {

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	public int anInt6305 = 0;

	@OriginalMember(owner = "client!t", name = "n", descriptor = "I")
	public int anInt6311 = 0;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!ng;")
	private final Class167 aClass167_87 = new Class167(64);

	@OriginalMember(owner = "client!t", name = "p", descriptor = "Lclient!hn;")
	private Interface6 anInterface6_1 = null;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Lclient!ic;")
	private final Class113 aClass113_115;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Lclient!ic;")
	private final Class113 aClass113_114;

	static {
		new Class151("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(ILclient!ic;Lclient!ic;Lclient!hn;)V")
	public Class229(@OriginalArg(0) int arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) Interface6 arg3) {
		this.aClass113_115 = arg1;
		this.anInterface6_1 = arg3;
		this.aClass113_114 = arg2;
		if (this.aClass113_115 != null) {
			this.anInt6305 = this.aClass113_115.method2271(1);
		}
		if (this.aClass113_114 != null) {
			this.anInt6311 = this.aClass113_114.method2271(1);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)Lclient!ut;")
	public Class1_Sub3_Sub17 method4848(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub3_Sub17 local11 = (Class1_Sub3_Sub17) this.aClass167_87.method3386((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = this.aClass113_114.method2274(1, arg0 & 0x7FFF);
		} else {
			local29 = this.aClass113_115.method2274(1, arg0);
		}
		local11 = new Class1_Sub3_Sub17();
		local11.aClass229_2 = this;
		if (local29 != null) {
			local11.method5203(new Class1_Sub11(local29));
		}
		if (arg0 >= 32768) {
			local11.method5200();
		}
		this.aClass167_87.method3392(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([ILclient!go;BJ)Ljava/lang/String;")
	public String method4851(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface6_1 != null) {
			@Pc(20) String local20 = this.anInterface6_1.method2718(arg2, arg1, arg0);
			if (local20 != null) {
				return local20;
			}
		}
		return Long.toString(arg2);
	}
}
