import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public abstract class Class94 {

	@OriginalMember(owner = "client!om", name = "e", descriptor = "I")
	public int anInt3369;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "I")
	protected int anInt3366;

	@OriginalMember(owner = "client!om", name = "j", descriptor = "I")
	public int anInt3373;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(III)V")
	protected Class94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3369 = arg0;
		this.anInt3366 = arg2;
		this.anInt3373 = arg1;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IBI)V")
	public abstract void method2964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZI)V")
	public abstract void method2965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIB)V")
	public abstract void method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
