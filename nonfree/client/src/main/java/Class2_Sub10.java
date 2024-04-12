import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "Lclient!rc;")
	protected Class2_Sub4 aClass2_Sub4_3;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "Z")
	protected boolean aBoolean153;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()I", line = 5)
	public int method1288() {
		return 255;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([III)I")
	public abstract int method1286(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	public abstract void method1287(@OriginalArg(0) int arg0);
}
