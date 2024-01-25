import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class253 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Lclient!vt;")
	private final Class306 aClass306_9;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
	private final int anInt7458;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
	public final int anInt7456;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
	public final int anInt7453;

	static {
		new Class40("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IILclient!vt;)V")
	public Class253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class306 arg2) {
		this.aClass306_9 = arg2;
		this.anInt7458 = arg1;
		this.anInt7456 = arg0;
		this.anInt7453 = this.anInt7458 * this.aClass306_9.anInt8854;
		if (this.anInt7456 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
