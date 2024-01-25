import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class141 {

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
	public int anInt3649 = 2;

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
	public int anInt3653 = 64;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
	public int anInt3648 = -1;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
	public int anInt3654 = 64;

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
	public int anInt3658 = 1;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "Z")
	public boolean aBoolean242 = false;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "Z")
	public boolean aBoolean243 = false;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!ha;BI)V")
	public void method3261(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method3111();
			if (local9 == 0) {
				return;
			}
			this.method3264(arg0, arg1, local9);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!ha;III)V")
	private void method3264(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt3648 = arg0.method3108();
			if (this.anInt3648 == 65535) {
				this.anInt3648 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt3653 = arg0.method3108() + 1;
			this.anInt3654 = arg0.method3108() + 1;
		} else if (arg2 == 3) {
			arg0.method3116();
		} else if (arg2 == 4) {
			this.anInt3649 = arg0.method3111();
		} else if (arg2 == 5) {
			this.anInt3658 = arg0.method3111();
		} else if (arg2 == 6) {
			this.aBoolean243 = true;
		} else if (arg2 == 7) {
			this.aBoolean242 = true;
		}
	}
}
