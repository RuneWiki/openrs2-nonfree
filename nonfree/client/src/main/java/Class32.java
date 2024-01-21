import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class32 {

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
	public final int anInt1143;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public int anInt1142;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "[I")
	public final int[] anIntArray119;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "[I")
	public final int[] anIntArray118;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class32() {
		Static90.method1628(16);
		this.anInt1143 = Static90.method1626() == 0 ? 1 : Static90.method1628(4) + 1;
		if (Static90.method1626() != 0) {
			Static90.method1628(8);
		}
		Static90.method1628(2);
		if (this.anInt1143 > 1) {
			this.anInt1142 = Static90.method1628(4);
		}
		this.anIntArray119 = new int[this.anInt1143];
		this.anIntArray118 = new int[this.anInt1143];
		for (@Pc(42) int local42 = 0; local42 < this.anInt1143; local42++) {
			Static90.method1628(8);
			this.anIntArray119[local42] = Static90.method1628(8);
			this.anIntArray118[local42] = Static90.method1628(8);
		}
	}
}
