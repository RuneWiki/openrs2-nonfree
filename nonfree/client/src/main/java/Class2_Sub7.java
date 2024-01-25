import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
	public final int anInt698;

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
	public final int anInt699;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(II)V")
	public Class2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt698 = arg0;
		this.anInt699 = arg1;
	}
}
