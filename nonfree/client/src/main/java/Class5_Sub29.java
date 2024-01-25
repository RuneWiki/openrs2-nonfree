import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class5_Sub29 extends Class5 {

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
	public int anInt3941;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
	public final int anInt3940;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(II)V")
	public Class5_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3941 = arg1;
		this.anInt3940 = arg0;
	}
}
