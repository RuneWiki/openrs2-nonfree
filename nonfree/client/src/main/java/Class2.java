import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public abstract class Class2 {

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray21 = new Rectangle[100];

	static {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			aRectangleArray21[local6] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZIIILclient!ai;ILclient!vm;)V")
	public abstract void method5406(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class92 arg5);

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
	public abstract void method5408();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!vm;I)V")
	public abstract void method5409(@OriginalArg(0) Class92 arg0);

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)Z")
	public abstract boolean method5411();

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!vm;Z)Lclient!dn;")
	public abstract Class17_Sub2 method5413(@OriginalArg(0) Class92 arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIILclient!vm;)Z")
	public abstract boolean method5414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class92 arg2);
}
