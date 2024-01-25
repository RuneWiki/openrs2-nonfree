import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public abstract class Class193 {

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
	protected Class193() {
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I")
	public abstract int method4419(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)Lclient!to;")
	public abstract Class232 method4422();

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(II)V")
	public abstract void method4424(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI)[B")
	public abstract byte[] method4425(@OriginalArg(1) int arg0);
}
