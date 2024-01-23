import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class124 {

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
	public int anInt3943 = 0;

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
	public int anInt3948 = 2048;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
	public int anInt3949 = 2048;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
	public int anInt3950 = 0;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!pi;II)V")
	public void method3205(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method3110();
			if (local5 == 0) {
				return;
			}
			this.method3208(arg0, arg1, local5);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!pi;II)V")
	private void method3208(@OriginalArg(1) Class4_Sub24 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt3943 = arg0.method3110();
		} else if (arg2 == 2) {
			this.anInt3948 = arg0.method3085();
		} else if (arg2 == 3) {
			this.anInt3949 = arg0.method3085();
		} else if (arg2 == 4) {
			this.anInt3950 = arg0.method3072();
		}
	}
}
