import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class4_Sub29 extends Class4 {

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
	public int anInt4990;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "[Lclient!ef;")
	public Class41[] aClass41Array2;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(I[Lclient!ef;)V")
	public Class4_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class41[] arg1) {
		this.anInt4990 = arg0;
		this.aClass41Array2 = arg1;
	}
}
