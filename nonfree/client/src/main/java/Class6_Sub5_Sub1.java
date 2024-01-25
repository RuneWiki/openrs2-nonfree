import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public abstract class Class6_Sub5_Sub1 extends Class6_Sub5 {

	@OriginalMember(owner = "client!naa", name = "v", descriptor = "[I")
	public static final int[] anIntArray504 = new int[32];

	@OriginalMember(owner = "client!naa", name = "x", descriptor = "I")
	public final int anInt9491;

	@OriginalMember(owner = "client!naa", name = "w", descriptor = "Lclient!sn;")
	public final Interface23 anInterface23_3;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray504[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lclient!sn;I)V")
	protected Class6_Sub5_Sub1(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		this.anInt9491 = arg1;
		this.anInterface23_3 = arg0;
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method7751();

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "(I)Z")
	public abstract boolean method7754();
}
