import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class143 {

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "Z")
	public boolean aBoolean334;

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
	public int anInt4179;

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
	public int anInt4180;

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
	public int anInt4182;

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
	public int anInt4183;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
	public int anInt4184;

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
	public int anInt4187;

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
	public int anInt4189;

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
	public int anInt4190;

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
	public int anInt4181 = 8;

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
	public int anInt4192 = 16777215;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BLclient!jc;)V")
	public void method3841(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method3030();
			if (local10 == 0) {
				return;
			}
			this.method3842(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!jc;BI)V")
	private void method3842(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4181 = arg0.method3018();
		} else if (arg1 == 2) {
			this.aBoolean334 = true;
		} else if (arg1 == 3) {
			this.anInt4180 = arg0.method2989();
			this.anInt4189 = arg0.method2989();
			this.anInt4184 = arg0.method2989();
		} else if (arg1 == 4) {
			this.anInt4182 = arg0.method3030();
		} else if (arg1 == 5) {
			this.anInt4183 = arg0.method3018();
		} else if (arg1 == 6) {
			this.anInt4192 = arg0.method2987();
		} else if (arg1 == 7) {
			this.anInt4190 = arg0.method2989();
			this.anInt4179 = arg0.method2989();
			this.anInt4187 = arg0.method2989();
		}
	}
}
