import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class Class170 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	protected final int anInt7389;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	public final int anInt7392;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	public final int anInt7390;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(III)V")
	protected Class170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7389 = arg2;
		this.anInt7392 = arg1;
		this.anInt7390 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)V")
	public abstract void method6128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIB)V")
	public abstract void method6129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public abstract void method6131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
