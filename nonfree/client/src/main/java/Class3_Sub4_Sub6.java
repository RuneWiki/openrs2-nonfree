import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class3_Sub4_Sub6 extends Class3_Sub4 {

	@OriginalMember(owner = "client!dm", name = "D", descriptor = "Ljava/lang/String;")
	public String aString44;

	@OriginalMember(owner = "client!dm", name = "H", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
	public int anInt1108;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBLclient!ug;)V")
	private void method940(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static270.method4464(arg1.method3920());
		} else if (arg0 == 2) {
			this.anInt1108 = arg1.method3896();
		} else if (arg0 == 5) {
			this.aString44 = arg1.method3931();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z")
	public boolean method942() {
		return this.aChar3 == 's';
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!ug;Z)V")
	public void method945(@OriginalArg(0) Class3_Sub26 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method3915();
			if (local12 == 0) {
				return;
			}
			this.method940(local12, arg0);
		}
	}
}
