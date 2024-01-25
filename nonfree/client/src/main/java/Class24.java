import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public abstract class Class24 {

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
	protected final int anInt9951;

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
	public final int anInt9952;

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
	public final int anInt9953;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(III)V")
	protected Class24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9951 = arg2;
		this.anInt9952 = arg0;
		this.anInt9953 = arg1;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIB)V")
	public abstract void method8409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BII)V")
	public abstract void method8413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IBI)V")
	public abstract void method8414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
