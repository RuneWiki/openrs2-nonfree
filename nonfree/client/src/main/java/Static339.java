import java.awt.Canvas;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static339 {

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "Lclient!rq;")
	public static Class215 aClass215_2;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_136 = new Class119("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
	public static int anInt5788 = 0;

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "Lclient!sd;")
	public static final Class220 aClass220_34 = new Class220(2, 4, 4, 0);

	@OriginalMember(owner = "client!qt", name = "g", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray104 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_146 = new Class12(105, 3);

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILclient!l;Lclient!fq;Ljava/awt/Canvas;I)Lclient!za;")
	public static Class34 method4538(@OriginalArg(1) Interface6 arg0, @OriginalArg(2) Class83 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3) {
		return new w(arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)I")
	public static int method4539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
