import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class2_Sub7_Sub12 extends Class2_Sub7 {

	@OriginalMember(owner = "client!oda", name = "r", descriptor = "I")
	public int anInt6884 = 0;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BLclient!sl;)V")
	public void method6004(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2859();
			if (local3 == 0) {
				return;
			}
			this.method6005(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILclient!sl;I)V")
	private void method6005(@OriginalArg(1) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt6884 = arg0.method2825();
		}
	}
}
