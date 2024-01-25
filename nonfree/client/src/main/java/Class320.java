import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class320 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
	public int anInt8653;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Ljava/lang/String;")
	public String aString96;

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "Z")
	public boolean aBoolean630 = true;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method7082(@OriginalArg(0) Class6_Sub21 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6069();
			if (local13 == 0) {
				return;
			}
			this.method7088(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Z")
	public boolean method7085() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!ji;Z)V")
	private void method7088(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub21 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static439.method6249(arg1.method6055());
		} else if (arg0 == 2) {
			this.anInt8653 = arg1.method6036();
		} else if (arg0 == 4) {
			this.aBoolean630 = false;
			return;
		} else if (arg0 == 5) {
			this.aString96 = arg1.method6044();
			return;
		}
	}
}
