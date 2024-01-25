import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nha")
public final class Class223 {

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
	public int anInt6887;

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "Ljava/lang/String;")
	public String aString83;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "Z")
	public boolean aBoolean458 = true;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(ZLclient!rg;)V")
	public void method5909(@OriginalArg(1) Class6_Sub40 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8604();
			if (local9 == 0) {
				return;
			}
			this.method5912(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)Z")
	public boolean method5911() {
		return this.aChar3 == 's';
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(ILclient!rg;I)V")
	private void method5912(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub40 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static494.method7395(arg1.method8602());
		} else if (arg0 == 2) {
			this.anInt6887 = arg1.method8579();
		} else if (arg0 == 4) {
			this.aBoolean458 = false;
		} else if (arg0 == 5) {
			this.aString83 = arg1.method8611();
			return;
		}
	}
}
