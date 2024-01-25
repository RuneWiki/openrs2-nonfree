import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!ev", name = "s", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "Ljava/lang/String;")
	public String aString28;

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "Lclient!ria;")
	public Class303 aClass303_4;

	@OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
	public int anInt3014;

	@OriginalMember(owner = "client!ev", name = "p", descriptor = "I")
	public int anInt3015;

	@OriginalMember(owner = "client!ev", name = "q", descriptor = "Lclient!ria;")
	public Class303 aClass303_5;

	@OriginalMember(owner = "client!ev", name = "r", descriptor = "Z")
	public boolean aBoolean237;

	@OriginalMember(owner = "client!ev", name = "t", descriptor = "I")
	public int anInt3016;

	@OriginalMember(owner = "client!ev", name = "v", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray1;

	@OriginalMember(owner = "client!ev", name = "w", descriptor = "I")
	public int anInt3018;

	@OriginalMember(owner = "client!ev", name = "x", descriptor = "I")
	public int anInt3019;

	@OriginalMember(owner = "client!ev", name = "A", descriptor = "I")
	public int anInt3021;

	static {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			aRectangleArray1[local6] = new Rectangle();
		}
	}
}
