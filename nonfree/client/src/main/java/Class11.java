import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class Class11 {

	@OriginalMember(owner = "client!n", name = "IA", descriptor = "(IIIIII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!n", name = "C", descriptor = "(III)V")
	public abstract void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III[I)V")
	public abstract void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!n", name = "SA", descriptor = "(I)V")
	public abstract void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "J", descriptor = "(III)V")
	public abstract void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!n", name = "N", descriptor = "(III[I)V")
	public abstract void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!n", name = "K", descriptor = "()V")
	public abstract void K();

	@OriginalMember(owner = "client!n", name = "M", descriptor = "([I)V")
	public abstract void M(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!n", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "ya", descriptor = "(Lclient!n;)V")
	public abstract void ya(@OriginalArg(0) Class11 arg0);

	@OriginalMember(owner = "client!n", name = "ba", descriptor = "(I)V")
	public abstract void ba(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "CA", descriptor = "(I)V")
	public abstract void CA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "WA", descriptor = "(I)V")
	public abstract void WA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()Lclient!n;")
	public abstract Class11 method2905();
}
