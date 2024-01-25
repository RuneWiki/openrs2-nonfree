import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class6_Sub2_Sub13 extends Class6_Sub2 {

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "C")
	private char aChar8;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
	public int anInt3777;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Ljava/lang/String;")
	public String aString161;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ec;IB)V")
	private void method3705(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar8 = Static103.method2106(arg0.method3992());
		} else if (arg1 == 2) {
			this.anInt3777 = arg0.method3979();
		} else if (arg1 == 5) {
			this.aString161 = arg0.method4023();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLclient!ec;)V")
	public void method3706(@OriginalArg(1) Class6_Sub10 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method3972();
			if (local16 == 0) {
				return;
			}
			this.method3705(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(B)Z")
	public boolean method3709() {
		return this.aChar8 == 's';
	}
}
