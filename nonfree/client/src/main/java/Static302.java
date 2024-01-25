import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "Lclient!ci;")
	public static Class38 aClass38_63;

	@OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
	public static int anInt5614;

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "Lclient!ah;")
	public static Class9 aClass9_6;

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "Lclient!kj;")
	public static final Class131 aClass131_6 = new Class131("", 10);

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_89 = new Class21("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_174 = new Class214(59, -2);

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
	public static int anInt5615 = -1;

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "[I")
	public static final int[] anIntArray455 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_175 = new Class214(68, 8);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I")
	public static int method4667(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLjava/awt/Frame;Lclient!ul;)V")
	public static void method4668(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class255 arg1) {
		while (true) {
			@Pc(10) Class87 local10 = arg1.method5828(arg0);
			while (local10.anInt2679 == 0) {
				Static77.method1653(10L);
			}
			if (local10.anInt2679 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static77.method1653(100L);
		}
	}
}
