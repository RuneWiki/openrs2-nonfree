import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class41 {

	@OriginalMember(owner = "client!co", name = "e", descriptor = "I")
	public int anInt978;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "I")
	public int anInt979;

	@OriginalMember(owner = "client!co", name = "i", descriptor = "I")
	public int anInt981;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZLclient!dh;)V")
	public void method830(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4463();
			if (local15 == 0) {
				return;
			}
			this.method832(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IILclient!dh;)V")
	private void method832(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt981 = arg1.method4485();
			this.anInt978 = arg1.method4463();
			this.anInt979 = arg1.method4463();
		}
	}
}
