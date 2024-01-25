import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public abstract class Class29 {

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	public abstract void method7537();

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	public abstract Class330 method7539(@OriginalArg(1) Class121 arg0);

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)Z")
	public abstract boolean method7540();

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIILclient!oa;)Z")
	public abstract boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!bo;ILclient!oa;IIIZ)V")
	public abstract void method7543(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(BLclient!oa;)V")
	public abstract void method7544(@OriginalArg(1) Class121 arg0);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	public abstract Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0);
}
