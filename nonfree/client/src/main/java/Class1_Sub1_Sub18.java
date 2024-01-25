import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
	public int anInt5480;

	@OriginalMember(owner = "client!sf", name = "C", descriptor = "Ljava/lang/String;")
	public String aString220;

	@OriginalMember(owner = "client!sf", name = "D", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)Z")
	public boolean method4869() {
		return this.aChar2 == 's';
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BILclient!eb;)V")
	private void method4872(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static307.method5174(arg1.method3130());
		} else if (arg0 == 2) {
			this.anInt5480 = arg1.method3125();
		} else if (arg0 == 5) {
			this.aString220 = arg1.method3134();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!eb;B)V")
	public void method4875(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3141();
			if (local9 == 0) {
				return;
			}
			this.method4872(local9, arg0);
		}
	}
}
