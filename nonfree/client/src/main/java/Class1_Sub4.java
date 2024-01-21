import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "Lclient!le;")
	protected Class1_Sub9 aClass1_Sub9_3;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "Z")
	protected boolean aBoolean73;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([III)I")
	public abstract int method929(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	public abstract void method930(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()I")
	public int method931() {
		return 255;
	}
}
