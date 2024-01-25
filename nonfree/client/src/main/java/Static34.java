import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "[Lclient!d;")
	public static Class60[] aClass60Array10;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "Lclient!pq;")
	public static Class251 aClass251_120;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas15;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "Lclient!mca;")
	public static Class195 aClass195_6;

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "[I")
	public static final int[] anIntArray579 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "[Lclient!hba;")
	public static final Class129[] aClass129Array4 = new Class129[8];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!dga;I)Lclient!hp;")
	public static Class135 method6071(@OriginalArg(0) Class6_Sub14 arg0) {
		@Pc(7) int local7 = arg0.method6006();
		return new Class135(local7);
	}
}
