import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	public int anInt882;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	public int anInt883;

	@OriginalMember(owner = "client!db", name = "P", descriptor = "I")
	public int anInt887;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!jg;I)V")
	public void method532(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(19) int local19 = arg0.method861();
			if (local19 == 0) {
				return;
			}
			this.method534(local19, arg0);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZILclient!jg;)V")
	private void method534(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt887 = arg1.method878();
			this.anInt883 = arg1.method861();
			this.anInt882 = arg1.method861();
		}
	}
}
