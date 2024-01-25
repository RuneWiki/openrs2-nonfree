import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class Class3_Sub7_Sub15 extends Class3_Sub7 {

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
	public final int anInt7718;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub7_Sub15(@OriginalArg(0) int arg0) {
		this.anInt7718 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)Z")
	public abstract boolean method6724();

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method6730();
}
