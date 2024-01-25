import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public final class Class6_Sub49 extends Class6 {

	@OriginalMember(owner = "client!vfa", name = "m", descriptor = "I")
	public final int anInt10168;

	@OriginalMember(owner = "client!vfa", name = "r", descriptor = "I")
	public final int anInt10173;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(II)V")
	public Class6_Sub49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10168 = arg0;
		this.anInt10173 = arg1;
	}
}
