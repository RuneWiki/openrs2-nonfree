import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public abstract class Class303 {

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "()V")
	protected Class303() {
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)Lclient!ot;")
	public abstract Class250 method6950();

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)V")
	public abstract void method6951(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(II)[B")
	public abstract byte[] method6952(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(BI)I")
	public abstract int method6953(@OriginalArg(1) int arg0);
}
