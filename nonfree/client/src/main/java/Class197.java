import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class197 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Z")
	public boolean aBoolean524;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	public int anInt6204;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	public int anInt6206;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
	public int anInt6208;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
	public int anInt6209;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
	public int anInt6214;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
	public int anInt6211 = 8;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
	public int anInt6213 = 16777215;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!tn;)V")
	public void method5253(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8401();
			if (local13 == 0) {
				return;
			}
			this.method5256(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILclient!tn;)V")
	private void method5256(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt6211 = arg1.method8414();
		} else if (arg0 == 2) {
			this.aBoolean524 = true;
		} else if (arg0 == 3) {
			this.anInt6204 = arg1.method8444();
			this.anInt6209 = arg1.method8444();
			this.anInt6206 = arg1.method8444();
		} else if (arg0 == 4) {
			this.anInt6214 = arg1.method8401();
			return;
		} else if (arg0 == 5) {
			this.anInt6208 = arg1.method8414();
			return;
		} else if (arg0 == 6) {
			this.anInt6213 = arg1.method8421();
			return;
		}
	}
}
