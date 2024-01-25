import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class97 {

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
	public int anInt3116 = 64;

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
	public int anInt3119 = 2;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
	public int anInt3122 = 1;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
	public int anInt3123 = 64;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "Z")
	public boolean aBoolean230 = false;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "Z")
	public boolean aBoolean229 = false;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
	public int anInt3120 = -1;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILclient!ji;)V")
	private void method2761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub21 arg2) {
		if (arg0 == 1) {
			this.anInt3120 = arg2.method6003();
			if (this.anInt3120 == 65535) {
				this.anInt3120 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt3123 = arg2.method6003() + 1;
			this.anInt3116 = arg2.method6003() + 1;
		} else if (arg0 == 3) {
			arg2.method6055();
		} else if (arg0 == 4) {
			this.anInt3119 = arg2.method6069();
		} else if (arg0 == 5) {
			this.anInt3122 = arg2.method6069();
		} else if (arg0 == 6) {
			this.aBoolean230 = true;
		} else if (arg0 == 7) {
			this.aBoolean229 = true;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!ji;I)V")
	public void method2764(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub21 arg1) {
		while (true) {
			@Pc(17) int local17 = arg1.method6069();
			if (local17 == 0) {
				return;
			}
			this.method2761(local17, arg0, arg1);
		}
	}
}
