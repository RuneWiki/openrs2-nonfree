import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class2_Sub9_Sub12 extends Class2_Sub9 {

	@OriginalMember(owner = "client!kn", name = "P", descriptor = "I")
	public int anInt3891 = 0;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!ef;I)V")
	private void method3392(@OriginalArg(1) Class2_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt3891 = arg0.method3104();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZLclient!ef;)V")
	public void method3393(@OriginalArg(1) Class2_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3124();
			if (local5 == 0) {
				return;
			}
			this.method3392(arg0, local5);
		}
	}
}
