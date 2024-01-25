import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class114 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	public int anInt2850;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	public int anInt2854;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "I")
	public int anInt2857;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	public int anInt2852 = 128;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public int anInt2859 = 128;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "I")
	public int anInt2856;

	static {
		new Class142("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
	public Class114(@OriginalArg(0) int arg0) {
		this.anInt2856 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIII)V")
	private Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2850 = arg3;
		this.anInt2857 = arg4;
		this.anInt2854 = arg5;
		this.anInt2859 = arg2;
		this.anInt2856 = arg0;
		this.anInt2852 = arg1;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Lclient!id;")
	public Class114 method2284() {
		return new Class114(this.anInt2856, this.anInt2852, this.anInt2859, this.anInt2850, this.anInt2857, this.anInt2854);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!id;)V")
	public void method2285(@OriginalArg(1) Class114 arg0) {
		this.anInt2859 = arg0.anInt2859;
		this.anInt2856 = arg0.anInt2856;
		this.anInt2857 = arg0.anInt2857;
		this.anInt2850 = arg0.anInt2850;
		this.anInt2852 = arg0.anInt2852;
		this.anInt2854 = arg0.anInt2854;
	}
}
