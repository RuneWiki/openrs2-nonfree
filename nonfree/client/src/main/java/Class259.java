import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class259 {

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	public int anInt7216 = 0;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "I")
	public int anInt7220 = 0;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "Lclient!wq;")
	private final Class391 aClass391_38 = new Class391(64);

	@OriginalMember(owner = "client!og", name = "j", descriptor = "Lclient!jaa;")
	private Interface8 anInterface8_1 = null;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "Lclient!la;")
	private final Class208 aClass208_99;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "Lclient!la;")
	private final Class208 aClass208_100;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(ILclient!la;Lclient!la;Lclient!jaa;)V")
	public Class259(@OriginalArg(0) int arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class208 arg2, @OriginalArg(3) Interface8 arg3) {
		this.aClass208_99 = arg1;
		this.aClass208_100 = arg2;
		this.anInterface8_1 = arg3;
		if (this.aClass208_99 != null) {
			this.anInt7216 = this.aClass208_99.method5005(1);
		}
		if (this.aClass208_100 != null) {
			this.anInt7220 = this.aClass208_100.method5005(1);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!dv;J[I)Ljava/lang/String;")
	public String method6239(@OriginalArg(1) Class96 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2) {
		if (this.anInterface8_1 != null) {
			@Pc(14) String local14 = this.anInterface8_1.method7404(arg1, arg2, arg0);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)Lclient!be;")
	public Class5_Sub5_Sub1 method6241(@OriginalArg(0) int arg0) {
		@Pc(11) Class5_Sub5_Sub1 local11 = (Class5_Sub5_Sub1) this.aClass391_38.method9275((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(30) byte[] local30;
		if (arg0 >= 32768) {
			local30 = this.aClass208_100.method4991(1, arg0 & 0x7FFF, 79);
		} else {
			local30 = this.aClass208_99.method4991(1, arg0, -23);
		}
		local11 = new Class5_Sub5_Sub1();
		local11.aClass259_1 = this;
		if (local30 != null) {
			local11.method681(new Class5_Sub23(local30));
		}
		if (arg0 >= 32768) {
			local11.method678();
		}
		this.aClass391_38.method9273((long) arg0, local11, 1);
		return local11;
	}
}
