import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class29 {

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
	public int anInt876 = 1;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!ac;)V")
	public void method758(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7974();
			if (local13 == 0) {
				return;
			}
			this.method759(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!ac;IB)V")
	private void method759(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static313.method4655(arg0.method7963());
		} else if (arg1 == 2) {
			this.anInt876 = 0;
		}
	}
}
