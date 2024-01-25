import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public abstract class Class1 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZILclient!qa;)Z")
	public abstract boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLclient!rn;ZIILclient!qa;I)V")
	public abstract void method5836(@OriginalArg(1) Class1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(Lclient!qa;B)Lclient!vs;")
	public abstract Class13_Sub7 method5837(@OriginalArg(0) Class75 arg0);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
	public abstract void method5838();

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)Z")
	public abstract boolean method5839();

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLclient!qa;)V")
	public abstract void method5840(@OriginalArg(1) Class75 arg0);
}
