import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
	public static int anInt2395;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "Lclient!la;")
	public static final Class136 aClass136_65 = new Class136(83, -2);

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "Lclient!ga;")
	public static Class82 aClass82_9 = null;

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "Lclient!la;")
	public static final Class136 aClass136_66 = new Class136(41, 20);

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray15 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "Lclient!of;")
	public static final Class174 aClass174_71 = new Class174("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)Lclient!kr;")
	public static Class1_Sub3 method2075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static389.aClass227ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub3_2;
	}
}
