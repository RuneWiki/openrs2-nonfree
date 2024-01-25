import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class88 {

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "[I")
	public static final int[] anIntArray253 = new int[128];

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
	public int anInt3124 = 0;

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray253.length; local4++) {
			anIntArray253[local4] = -1;
		}
		for (@Pc(16) int local16 = 65; local16 <= 90; local16++) {
			anIntArray253[local16] = local16 - 65;
		}
		for (@Pc(31) int local31 = 97; local31 <= 122; local31++) {
			anIntArray253[local31] = local31 + 26 - 97;
		}
		for (@Pc(48) int local48 = 48; local48 <= 57; local48++) {
			anIntArray253[local48] = local48 + 52 - 48;
		}
		anIntArray253[45] = anIntArray253[47] = 63;
		anIntArray253[42] = anIntArray253[43] = 62;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZILclient!gw;)V")
	private void method2852(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if (arg0 == 5) {
			this.anInt3124 = arg1.method3056();
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!gw;I)V")
	public void method2854(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3043();
			if (local7 == 0) {
				return;
			}
			this.method2852(local7, arg0);
		}
	}
}
