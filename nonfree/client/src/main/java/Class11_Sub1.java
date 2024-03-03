import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "Lclient!h;")
	public static final Class89 aClass89_144 = new Class89(103, 0);

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_76 = new Class79("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray25 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_77 = new Class79("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
	protected int anInt3482;

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
	protected final int anInt3480;

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
	public final int anInt3478;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
	protected int anInt3481;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(IIII)V", line = 40)
	protected Class11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3482 = arg0;
		this.anInt3480 = arg1;
		this.anInt3478 = arg3;
		this.anInt3481 = arg2;
	}
}
