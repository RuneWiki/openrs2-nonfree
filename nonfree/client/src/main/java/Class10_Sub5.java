import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class Class10_Sub5 extends Class10 {

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "Lclient!ld;")
	protected Class10_Sub9 aClass10_Sub9_3;

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "Z")
	protected boolean aBoolean77;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([III)I")
	public abstract int method879(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "()I")
	public int method880() {
		return 255;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public abstract void method881(@OriginalArg(0) int arg0);
}
