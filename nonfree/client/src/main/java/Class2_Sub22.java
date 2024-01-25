import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class2_Sub22 extends Class2 {

	@OriginalMember(owner = "client!f", name = "x", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "I")
	public int anInt2720;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	private Class2_Sub22() {
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub22(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString26 = arg0;
		this.anInt2720 = arg1;
	}
}
