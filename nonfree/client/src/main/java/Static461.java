import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
	public static int anInt7790;

	@OriginalMember(owner = "client!qfa", name = "y", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_157 = new Class136(27, 2);

	@OriginalMember(owner = "client!qfa", name = "B", descriptor = "I")
	public static int anInt7805 = 7000;

	@OriginalMember(owner = "client!qfa", name = "rb", descriptor = "[[B")
	public static final byte[][] aByteArrayArray19 = new byte[250][];

	@OriginalMember(owner = "client!qfa", name = "Ib", descriptor = "I")
	public static int anInt7840 = anInt7805;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IB)V")
	public static void method6856(@OriginalArg(0) int arg0) {
		if (!Static567.method8019(arg0)) {
			return;
		}
		@Pc(19) Class357[] local19 = Static441.aClass357ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class357 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt9800 = 0;
				local27.anInt9827 = 1;
				local27.anInt9798 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(BI)V")
	public static void method6862(@OriginalArg(1) int arg0) {
		Static340.anInt5872 = 3;
		Static299.anInt4748 = -1;
		Static95.anInt1501 = arg0;
		Static10.anInt161 = 100;
	}
}
