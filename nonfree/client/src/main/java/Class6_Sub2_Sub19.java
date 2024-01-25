import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class6_Sub2_Sub19 extends Class6_Sub2 {

	@OriginalMember(owner = "client!sba", name = "B", descriptor = "I")
	public int anInt8760 = 0;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IILclient!rg;)V")
	private void method7531(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 2) {
			this.anInt8760 = arg1.method8571();
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BLclient!rg;)V")
	public void method7532(@OriginalArg(1) Class6_Sub40 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8604();
			if (local9 == 0) {
				return;
			}
			this.method7531(local9, arg0);
		}
	}
}
