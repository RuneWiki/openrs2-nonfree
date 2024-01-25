import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class161 {

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
	public final int anInt4866;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
	public final int anInt4868;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
	public final int anInt4865;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
	public final int anInt4867;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(IIII)V")
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4866 = arg0;
		this.anInt4868 = arg3;
		this.anInt4865 = arg2;
		this.anInt4867 = arg1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)Lclient!ig;")
	public Class161 method4413(@OriginalArg(1) int arg0) {
		return new Class161(this.anInt4866, arg0, this.anInt4865, this.anInt4868);
	}
}
