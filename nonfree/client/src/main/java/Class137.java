import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class137 {

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
	public int anInt3893 = 0;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!ek;)V")
	public void method3082(@OriginalArg(1) Class4_Sub13 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method7004();
			if (local14 == 0) {
				return;
			}
			this.method3087(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!ek;I)V")
	private void method3087(@OriginalArg(1) Class4_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt3893 = arg0.method7054();
		}
	}
}
