import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class78 {

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Ljava/lang/String;")
	public String aString21;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
	public int anInt1998;

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "Z")
	public boolean aBoolean146 = true;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLclient!dh;)V")
	public void method1576(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4463();
			if (local15 == 0) {
				return;
			}
			this.method1577(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!dh;II)V")
	private void method1577(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static276.method3514(arg0.method4452());
		} else if (arg1 == 2) {
			this.anInt1998 = arg0.method4487();
		} else if (arg1 == 4) {
			this.aBoolean146 = false;
		} else if (arg1 == 5) {
			this.aString21 = arg0.method4484();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)Z")
	public boolean method1578() {
		return this.aChar3 == 's';
	}
}
