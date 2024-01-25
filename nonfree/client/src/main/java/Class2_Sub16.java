import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "[I")
	public static final int[] anIntArray217 = new int[4096];

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "S")
	public short aShort33;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray217[local4] = Static216.method6830(local4);
		}
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	private Class2_Sub16() {
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(S)V")
	public Class2_Sub16(@OriginalArg(0) short arg0) {
		this.aShort33 = arg0;
	}
}
