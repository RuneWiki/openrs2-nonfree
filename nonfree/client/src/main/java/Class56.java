import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class Class56 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!ht;")
	protected final Class109_Sub1 aClass109_Sub1_41;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!ht;)V")
	public Class56(@OriginalArg(0) Class109_Sub1 arg0) {
		this.aClass109_Sub1_41 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI)V")
	public abstract void method5079(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(III)V")
	public abstract void method5083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public abstract void method5084();

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Z")
	public abstract boolean method5085();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILclient!ao;)V")
	public abstract void method5086(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZZ)V")
	public abstract void method5087(@OriginalArg(1) boolean arg0);
}
