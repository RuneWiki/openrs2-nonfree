import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "[I")
	public static final int[] anIntArray161 = new int[14];

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_92 = new Class145(36, 3);

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "Z")
	public static boolean aBoolean180;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "[I")
	public static final int[] anIntArray162;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
	public static int anInt2465;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Ljava/lang/Throwable;")
	public final Throwable aThrowable1;

	static {
		new Class79("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
		aBoolean180 = false;
		anIntArray162 = new int[100];
		anInt2465 = -2;
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 46)
	public RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString23 = arg1;
		this.aThrowable1 = arg0;
	}
}
