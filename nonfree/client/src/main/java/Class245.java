import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class245 {

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
	public int anInt6575;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
	public int anInt6576;

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
	public int anInt6577;

	@OriginalMember(owner = "client!nba", name = "f", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILclient!ib;I)V")
	private void method5623(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub23 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static101.method1448(arg1.method8488());
		} else if (arg0 == 2) {
			this.anInt6575 = arg1.method8519();
			this.anInt6577 = arg1.method8529();
			this.anInt6576 = arg1.method8529();
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!ib;I)V")
	public void method5625(@OriginalArg(0) Class5_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8529();
			if (local5 == 0) {
				return;
			}
			this.method5623(local5, arg0);
		}
	}
}
