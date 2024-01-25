import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class116 {

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
	public int anInt3075;

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
	public int anInt3079;

	@OriginalMember(owner = "client!haa", name = "h", descriptor = "Z")
	public boolean aBoolean213;

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
	public int anInt3080;

	@OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
	public int anInt3081;

	@OriginalMember(owner = "client!haa", name = "m", descriptor = "I")
	public int anInt3084;

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
	public int anInt3076 = 16777215;

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
	public int anInt3077 = 8;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!ge;B)V")
	public void method2610(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3922();
			if (local5 == 0) {
				return;
			}
			this.method2612(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BLclient!ge;I)V")
	private void method2612(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3077 = arg0.method3967();
		} else if (arg1 == 2) {
			this.aBoolean213 = true;
		} else if (arg1 == 3) {
			this.anInt3080 = arg0.method3964();
			this.anInt3081 = arg0.method3964();
			this.anInt3079 = arg0.method3964();
		} else if (arg1 == 4) {
			this.anInt3075 = arg0.method3922();
		} else if (arg1 == 5) {
			this.anInt3084 = arg0.method3967();
		} else if (arg1 == 6) {
			this.anInt3076 = arg0.method3920();
		}
	}
}
