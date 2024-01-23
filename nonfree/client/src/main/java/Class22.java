import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public abstract class Class22 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public abstract void method4639();

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIB)I")
	public abstract int method4640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)J")
	public abstract long method4643();
}
