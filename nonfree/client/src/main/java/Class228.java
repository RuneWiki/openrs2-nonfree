import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class228 {

	@OriginalMember(owner = "client!te", name = "b", descriptor = "I")
	public int anInt6698 = 0;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	public int anInt6699 = 0;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "Lclient!jp;")
	private final Class129 aClass129_60 = new Class129(64);

	@OriginalMember(owner = "client!te", name = "h", descriptor = "Lclient!lu;")
	private Interface7 anInterface7_1 = null;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!pc;")
	private final Class188 aClass188_105;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "Lclient!pc;")
	private final Class188 aClass188_106;

	static {
		new Class256("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(ILclient!pc;Lclient!pc;Lclient!lu;)V")
	public Class228(@OriginalArg(0) int arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) Class188 arg2, @OriginalArg(3) Interface7 arg3) {
		this.anInterface7_1 = arg3;
		this.aClass188_105 = arg1;
		this.aClass188_106 = arg2;
		if (this.aClass188_105 != null) {
			this.anInt6698 = this.aClass188_105.method4285(1);
		}
		if (this.aClass188_106 != null) {
			this.anInt6699 = this.aClass188_106.method4285(1);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([IIJLclient!ra;)Ljava/lang/String;")
	public String method5259(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class208 arg2) {
		if (this.anInterface7_1 != null) {
			@Pc(16) String local16 = this.anInterface7_1.method1255(arg0, arg2, arg1);
			if (local16 != null) {
				return local16;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Lclient!rn;")
	public Class2_Sub2_Sub14 method5261(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub2_Sub14 local11 = (Class2_Sub2_Sub14) this.aClass129_60.method3023((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(32) byte[] local32;
		if (arg0 >= 32768) {
			local32 = this.aClass188_106.method4283(1, arg0 & 0x7FFF);
		} else {
			local32 = this.aClass188_105.method4283(1, arg0);
		}
		local11 = new Class2_Sub2_Sub14();
		local11.aClass228_1 = this;
		if (local32 != null) {
			local11.method4849(new Class2_Sub20(local32));
		}
		if (arg0 >= 32768) {
			local11.method4844();
		}
		this.aClass129_60.method3029(local11, (long) arg0);
		return local11;
	}
}
