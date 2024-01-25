import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wga")
public final class Class2_Sub5_Sub21 extends Class2_Sub5 {

	@OriginalMember(owner = "client!wga", name = "I", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!wga", name = "x", descriptor = "[I")
	public int[] anIntArray724;

	@OriginalMember(owner = "client!wga", name = "y", descriptor = "I")
	public int anInt10116;

	@OriginalMember(owner = "client!wga", name = "z", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray43;

	@OriginalMember(owner = "client!wga", name = "A", descriptor = "I")
	public int anInt10117;

	@OriginalMember(owner = "client!wga", name = "C", descriptor = "I")
	public int anInt10119;

	@OriginalMember(owner = "client!wga", name = "D", descriptor = "[I")
	public int[] anIntArray725;

	@OriginalMember(owner = "client!wga", name = "F", descriptor = "Ljava/lang/String;")
	public String aString102;

	@OriginalMember(owner = "client!wga", name = "G", descriptor = "Lclient!kg;")
	public Class188 aClass188_10;

	@OriginalMember(owner = "client!wga", name = "H", descriptor = "I")
	public int anInt10121;

	@OriginalMember(owner = "client!wga", name = "J", descriptor = "[Lclient!mp;")
	public Class222[] aClass222Array1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray2[local4] = new Rectangle();
		}
	}
}
