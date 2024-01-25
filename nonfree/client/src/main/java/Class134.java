import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class134 {

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
	public int anInt4335;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "Ljava/lang/String;")
	public String aString28;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "Z")
	public boolean aBoolean261 = true;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!gw;II)V")
	private void method3776(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static455.method6568(arg0.method3073());
		} else if (arg1 == 2) {
			this.anInt4335 = arg0.method3037();
		} else if (arg1 == 4) {
			this.aBoolean261 = false;
		} else if (arg1 == 5) {
			this.aString28 = arg0.method3034();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!gw;I)V")
	public void method3778(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method3043();
			if (local3 == 0) {
				return;
			}
			this.method3776(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)Z")
	public boolean method3781() {
		return this.aChar1 == 's';
	}
}
