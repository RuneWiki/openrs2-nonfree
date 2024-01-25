import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class94 {

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
	public int anInt2658;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Z")
	public boolean aBoolean201 = true;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLclient!ac;)V")
	public void method2326(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7974();
			if (local5 == 0) {
				return;
			}
			this.method2328(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLclient!ac;I)V")
	private void method2328(@OriginalArg(1) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static313.method4655(arg0.method7963());
		} else if (arg1 == 2) {
			this.anInt2658 = arg0.method7940();
		} else if (arg1 == 4) {
			this.aBoolean201 = false;
		} else if (arg1 == 5) {
			this.aString24 = arg0.method7951();
			return;
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z")
	public boolean method2329() {
		return this.aChar2 == 's';
	}
}
