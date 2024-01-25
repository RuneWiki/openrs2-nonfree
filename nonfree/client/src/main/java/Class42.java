import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class Class42 {

	@OriginalMember(owner = "client!or", name = "d", descriptor = "Lclient!uca;")
	protected final Class162_Sub3 aClass162_Sub3_44;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!uca;)V")
	public Class42(@OriginalArg(0) Class162_Sub3 arg0) {
		this.aClass162_Sub3_44 = arg0;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Z")
	public abstract boolean method7735();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IZ)V")
	public abstract void method7737(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IBI)V")
	public abstract void method7738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)V")
	public abstract void method7739(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
	public abstract void method7741();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!vaa;B)V")
	public abstract void method7742(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1);
}
