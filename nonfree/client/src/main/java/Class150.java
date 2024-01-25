import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class150 {

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
	public int anInt4711 = 1;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!ie;)V")
	public void method3763(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6814();
			if (local9 == 0) {
				return;
			}
			this.method3765(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BILclient!ie;)V")
	private void method3765(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static135.method2636(arg1.method6825());
		} else if (arg0 == 2) {
			this.anInt4711 = 0;
		}
	}
}
