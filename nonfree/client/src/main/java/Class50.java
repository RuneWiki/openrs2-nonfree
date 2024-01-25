import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class Class50 {

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
	protected Class50() {
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)[B")
	public abstract byte[] method1825(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)I")
	public abstract int method1826(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(BI)V")
	public abstract void method1828(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Lclient!jc;")
	public abstract Class118 method1829();
}
