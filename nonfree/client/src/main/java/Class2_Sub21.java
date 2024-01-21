import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!t", name = "u", descriptor = "I")
	public final int anInt3241;

	@OriginalMember(owner = "client!t", name = "w", descriptor = "I")
	public final int anInt3243;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class2_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3241 = arg1;
		this.anInt3243 = arg0;
	}
}
