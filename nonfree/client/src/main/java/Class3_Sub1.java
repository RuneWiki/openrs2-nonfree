import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!j", name = "y", descriptor = "Z")
	protected boolean aBoolean10;

	@OriginalMember(owner = "client!j", name = "z", descriptor = "Lclient!je;")
	protected Class3_Sub7 aClass3_Sub7_3;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([III)I")
	public abstract int method143(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
	public int method144() {
		return 255;
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
	public abstract void method145(@OriginalArg(0) int arg0);
}
