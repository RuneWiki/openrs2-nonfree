import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public abstract class Class44 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray21 = new Rectangle[100];

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray21[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!ja;)V")
	public abstract void method5775(@OriginalArg(1) Class81 arg0);

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V")
	public abstract void method5777();

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!ja;II)Z")
	public abstract boolean method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLclient!ja;)Lclient!kh;")
	public abstract Class20_Sub6 method5779(@OriginalArg(1) Class81 arg0);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBZIILclient!nf;Lclient!ja;)V")
	public abstract void method5780(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class44 arg4, @OriginalArg(6) Class81 arg5);

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)Z")
	public abstract boolean method5783();
}
