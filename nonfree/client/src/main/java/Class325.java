import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class325 {

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
	public int anInt8836;

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "Z")
	public boolean aBoolean685;

	@OriginalMember(owner = "client!uca", name = "g", descriptor = "I")
	public int anInt8841;

	@OriginalMember(owner = "client!uca", name = "h", descriptor = "I")
	public int anInt8842;

	@OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
	public int anInt8844;

	@OriginalMember(owner = "client!uca", name = "n", descriptor = "I")
	public int anInt8845;

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "I")
	public int anInt8838 = 8;

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "I")
	public int anInt8839 = 16777215;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLclient!mo;)V")
	public void method7231(@OriginalArg(1) Class1_Sub35 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5750();
			if (local13 == 0) {
				return;
			}
			this.method7232(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILclient!mo;I)V")
	private void method7232(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub35 arg1) {
		if (arg0 == 1) {
			this.anInt8838 = arg1.method5771();
		} else if (arg0 == 2) {
			this.aBoolean685 = true;
		} else if (arg0 == 3) {
			this.anInt8842 = arg1.method5738();
			this.anInt8841 = arg1.method5738();
			this.anInt8836 = arg1.method5738();
		} else if (arg0 == 4) {
			this.anInt8844 = arg1.method5750();
		} else if (arg0 == 5) {
			this.anInt8845 = arg1.method5771();
		} else if (arg0 == 6) {
			this.anInt8839 = arg1.method5797();
		}
	}
}
