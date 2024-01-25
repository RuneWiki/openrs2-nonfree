import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class159 {

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	public int anInt4891 = 1;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILclient!ek;)V")
	private void method3756(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static320.method5004(arg1.method7011());
		} else if (arg0 == 2) {
			this.anInt4891 = 0;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!ek;)V")
	public void method3758(@OriginalArg(1) Class4_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7004();
			if (local13 == 0) {
				return;
			}
			this.method3756(local13, arg0);
		}
	}
}
