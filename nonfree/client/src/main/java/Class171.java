import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class171 {

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "C")
	private char aChar4;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "Ljava/lang/String;")
	public String aString33;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
	public int anInt4865;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "Z")
	public boolean aBoolean302 = true;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!ae;I)V")
	public void method4086(@OriginalArg(0) Class6_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6433();
			if (local5 == 0) {
				return;
			}
			this.method4090(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZLclient!ae;)V")
	private void method4090(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static199.method3102(arg1.method6438());
		} else if (arg0 == 2) {
			this.anInt4865 = arg1.method6442();
		} else if (arg0 == 4) {
			this.aBoolean302 = false;
		} else if (arg0 == 5) {
			this.aString33 = arg1.method6473();
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)Z")
	public boolean method4092() {
		return this.aChar4 == 's';
	}
}
