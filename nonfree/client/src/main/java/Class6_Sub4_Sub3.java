import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class6_Sub4_Sub3 extends Class6_Sub4 {

	@OriginalMember(owner = "client!dfa", name = "w", descriptor = "I")
	public int anInt2211 = 0;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IILclient!iaa;)V")
	private void method2005(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub26 arg1) {
		if (arg0 == 2) {
			this.anInt2211 = arg1.method4999();
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!iaa;B)V")
	public void method2006(@OriginalArg(0) Class6_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4966();
			if (local5 == 0) {
				return;
			}
			this.method2005(local5, arg0);
		}
	}
}
