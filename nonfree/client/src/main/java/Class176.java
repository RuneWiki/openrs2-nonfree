import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class176 {

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
	public final int anInt5254;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
	public int anInt5253;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "[I")
	public final int[] anIntArray402;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "[I")
	public final int[] anIntArray403;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
	public Class176() {
		Static23.method648(16);
		this.anInt5254 = Static23.method653() == 0 ? 1 : Static23.method648(4) + 1;
		if (Static23.method653() != 0) {
			Static23.method648(8);
		}
		Static23.method648(2);
		if (this.anInt5254 > 1) {
			this.anInt5253 = Static23.method648(4);
		}
		this.anIntArray402 = new int[this.anInt5254];
		this.anIntArray403 = new int[this.anInt5254];
		for (@Pc(42) int local42 = 0; local42 < this.anInt5254; local42++) {
			Static23.method648(8);
			this.anIntArray402[local42] = Static23.method648(8);
			this.anIntArray403[local42] = Static23.method648(8);
		}
	}
}
