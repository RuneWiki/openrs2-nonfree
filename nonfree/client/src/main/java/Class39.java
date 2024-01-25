import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class Class39 {

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Lclient!bt;")
	protected final Class30_Sub1 aClass30_Sub1_42;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class39(@OriginalArg(0) Class30_Sub1 arg0) {
		this.aClass30_Sub1_42 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public abstract void method5994();

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
	public abstract void method5995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)V")
	public abstract void method5996(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ei;II)V")
	public abstract void method5997(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ)V")
	public abstract void method5999(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)Z")
	public abstract boolean method6000();
}
