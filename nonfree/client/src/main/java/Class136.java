import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class136 {

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
	public int anInt5086 = 0;

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
	public int anInt5085 = 0;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "Lclient!gg;")
	private final Class112 aClass112_25 = new Class112(64);

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "Lclient!gia;")
	private Interface9 anInterface9_1 = null;

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "Lclient!kha;")
	private final Class181 aClass181_46;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "Lclient!kha;")
	private final Class181 aClass181_44;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(ILclient!kha;Lclient!kha;Lclient!gia;)V")
	public Class136(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Interface9 arg3) {
		this.anInterface9_1 = arg3;
		this.aClass181_46 = arg2;
		this.aClass181_44 = arg1;
		if (this.aClass181_44 != null) {
			this.anInt5086 = this.aClass181_44.method5025(1);
		}
		if (this.aClass181_46 != null) {
			this.anInt5085 = this.aClass181_46.method5025(1);
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "([IJILclient!fq;)Ljava/lang/String;")
	public String method4288(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(3) Class104 arg2) {
		if (this.anInterface9_1 != null) {
			@Pc(14) String local14 = this.anInterface9_1.method4924(arg2, arg0, arg1);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)Lclient!rk;")
	public Class3_Sub1_Sub19 method4290(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub1_Sub19 local11 = (Class3_Sub1_Sub19) this.aClass112_25.method3640((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass181_44.method5023(1, arg0);
		} else {
			local27 = this.aClass181_46.method5023(1, arg0 & 0x7FFF);
		}
		local11 = new Class3_Sub1_Sub19();
		local11.aClass136_2 = this;
		if (local27 != null) {
			local11.method7186(new Class3_Sub15(local27));
		}
		if (arg0 >= 32768) {
			local11.method7189();
		}
		this.aClass112_25.method3636((long) arg0, local11);
		return local11;
	}
}
