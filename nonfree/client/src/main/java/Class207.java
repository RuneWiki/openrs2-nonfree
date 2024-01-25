import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class207 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
	public final int anInt6523;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
	public int anInt6524;

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "[I")
	public final int[] anIntArray382;

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "[I")
	public final int[] anIntArray383;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
	public Class207() {
		Static538.method7652(16);
		this.anInt6523 = Static538.method7646() == 0 ? 1 : Static538.method7652(4) + 1;
		if (Static538.method7646() != 0) {
			Static538.method7652(8);
		}
		Static538.method7652(2);
		if (this.anInt6523 > 1) {
			this.anInt6524 = Static538.method7652(4);
		}
		this.anIntArray382 = new int[this.anInt6523];
		this.anIntArray383 = new int[this.anInt6523];
		for (@Pc(42) int local42 = 0; local42 < this.anInt6523; local42++) {
			Static538.method7652(8);
			this.anIntArray382[local42] = Static538.method7652(8);
			this.anIntArray383[local42] = Static538.method7652(8);
		}
	}
}
