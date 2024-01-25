import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public abstract class Class3_Sub7_Sub6 extends Class3_Sub7 {

	@OriginalMember(owner = "client!vaa", name = "Z", descriptor = "[Lclient!hl;")
	private static final Class126[] aClass126Array3 = new Class126[32];

	@OriginalMember(owner = "client!vaa", name = "H", descriptor = "I")
	public final int anInt9446;

	static {
		@Pc(91) Class126[] local91 = Static336.method4910();
		for (@Pc(93) int local93 = 0; local93 < local91.length; local93++) {
			aClass126Array3[local91[local93].anInt4274] = local91[local93];
		}
	}

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub7_Sub6(@OriginalArg(0) int arg0) {
		this.anInt9446 = arg0;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)Z")
	public abstract boolean method7412();

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method7415();
}
