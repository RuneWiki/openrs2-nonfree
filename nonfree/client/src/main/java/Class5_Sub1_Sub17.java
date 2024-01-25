import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class5_Sub1_Sub17 extends Class5_Sub1 {

	@OriginalMember(owner = "client!rr", name = "B", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
	public int anInt5597;

	@OriginalMember(owner = "client!rr", name = "H", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!rr", name = "C", descriptor = "Z")
	public boolean aBoolean459 = true;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILclient!rg;)V")
	private void method4949(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static224.method4079(arg1.method5098());
		} else if (arg0 == 2) {
			this.anInt5597 = arg1.method5067();
		} else if (arg0 == 4) {
			this.aBoolean459 = false;
		} else if (arg0 == 5) {
			this.aString55 = arg1.method5064();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!rg;B)V")
	public void method4950(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5115();
			if (local13 == 0) {
				return;
			}
			this.method4949(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "(I)Z")
	public boolean method4951() {
		return this.aChar5 == 's';
	}
}
