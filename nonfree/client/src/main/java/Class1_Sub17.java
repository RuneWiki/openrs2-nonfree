import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
	public final int anInt3068;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public final int anInt3063;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II)V")
	public Class1_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3068 = arg1;
		this.anInt3063 = arg0;
	}
}
