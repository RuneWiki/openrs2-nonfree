import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class47 {

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
	public int anInt1781;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Ljava/lang/String;")
	public String aString14;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Z")
	public boolean aBoolean154 = true;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!md;I)V")
	private void method1268(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static82.method1460(arg1.method3693());
		} else if (arg0 == 2) {
			this.anInt1781 = arg1.method3731();
		} else if (arg0 == 4) {
			this.aBoolean154 = false;
		} else if (arg0 == 5) {
			this.aString14 = arg1.method3717();
			return;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!md;B)V")
	public void method1270(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3737();
			if (local15 == 0) {
				return;
			}
			this.method1268(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Z")
	public boolean method1271() {
		return this.aChar2 == 's';
	}
}
