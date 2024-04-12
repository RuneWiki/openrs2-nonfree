import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class Class12 {

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
	public static int anInt1850 = 0;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Z")
	public static boolean aBoolean149 = false;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
	public abstract void method1241();

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BII)V")
	public abstract void method1244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public abstract void method1249();

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZB[BI)V")
	public abstract void method1250(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	public abstract void method1251();

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
	public abstract void method1252();
}
