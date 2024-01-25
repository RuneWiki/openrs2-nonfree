import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public final class Class264 {

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
	public int anInt7961;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
	public int anInt7964;

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
	public int anInt7969;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
	public int anInt7963 = 128;

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
	public int anInt7967 = 128;

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
	public int anInt7968;

	static {
		new Class88("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I)V")
	public Class264(@OriginalArg(0) int arg0) {
		this.anInt7968 = arg0;
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(IIIIII)V")
	private Class264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7967 = arg1;
		this.anInt7963 = arg2;
		this.anInt7968 = arg0;
		this.anInt7969 = arg3;
		this.anInt7964 = arg5;
		this.anInt7961 = arg4;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!rm;)V")
	public void method6590(@OriginalArg(1) Class264 arg0) {
		this.anInt7961 = arg0.anInt7961;
		this.anInt7964 = arg0.anInt7964;
		this.anInt7968 = arg0.anInt7968;
		this.anInt7963 = arg0.anInt7963;
		this.anInt7969 = arg0.anInt7969;
		this.anInt7967 = arg0.anInt7967;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)Lclient!rm;")
	public Class264 method6593() {
		return new Class264(this.anInt7968, this.anInt7967, this.anInt7963, this.anInt7969, this.anInt7961, this.anInt7964);
	}
}
