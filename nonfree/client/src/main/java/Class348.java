import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class348 {

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	public int anInt9885;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Ljava/lang/String;")
	public String aString92;

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "Z")
	public boolean aBoolean669 = true;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!jr;I)V")
	public void method7863(@OriginalArg(0) Class6_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6019();
			if (local15 == 0) {
				return;
			}
			this.method7866(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)Z")
	public boolean method7864() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILclient!jr;)V")
	private void method7866(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub12 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static58.method838(arg1.method6049());
		} else if (arg0 == 2) {
			this.anInt9885 = arg1.method6015();
		} else if (arg0 == 4) {
			this.aBoolean669 = false;
		} else if (arg0 == 5) {
			this.aString92 = arg1.method6040();
		}
	}
}
