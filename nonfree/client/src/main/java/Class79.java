import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public abstract class Class79 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "[I")
	public static final int[] anIntArray532 = new int[4096];

	static {
		for (@Pc(14) int local14 = 0; local14 < 4096; local14++) {
			anIntArray532[local14] = Static38.method680(local14);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method5423(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)I")
	public abstract int method5428();

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method5430(@OriginalArg(1) Component arg0);
}
