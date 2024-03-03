import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class103 {

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_63 = new Class79("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
	public static int anInt2700 = 0;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
	public static int anInt2703 = 0;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public static int anInt2702 = 2;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Lclient!h;")
	public static final Class89 aClass89_113 = new Class89(85, -2);

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
	public int anInt2699;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "[I")
	public final int[] anIntArray171;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "[I")
	public final int[] anIntArray170;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V", line = 85)
	public Class103(@OriginalArg(0) int arg0) {
		this.anInt2699 = arg0;
		this.anIntArray171 = new int[this.anInt2699];
		this.anIntArray170 = new int[this.anInt2699];
	}
}
