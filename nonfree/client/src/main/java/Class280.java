import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class280 {

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "Z")
	public boolean aBoolean605 = false;

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "Z")
	public boolean aBoolean606 = false;

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
	public int anInt8476 = 1;

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
	public int anInt8472 = 64;

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
	public int anInt8474 = 64;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
	public int anInt8471 = -1;

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
	public int anInt8477 = 2;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILclient!cea;B)V")
	private void method7179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub11 arg2) {
		if (arg0 == 1) {
			this.anInt8471 = arg2.method8326();
			if (this.anInt8471 == 65535) {
				this.anInt8471 = -1;
				return;
			}
		} else if (arg0 == 2) {
			this.anInt8472 = arg2.method8326() + 1;
			this.anInt8474 = arg2.method8326() + 1;
		} else if (arg0 == 3) {
			arg2.method8384();
			return;
		} else if (arg0 == 4) {
			this.anInt8477 = arg2.method8383();
			return;
		} else {
			if (arg0 == 5) {
				this.anInt8476 = arg2.method8383();
			} else if (arg0 == 6) {
				this.aBoolean605 = true;
				return;
			} else if (arg0 == 7) {
				this.aBoolean606 = true;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!cea;B)V")
	public void method7180(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		while (true) {
			@Pc(17) int local17 = arg1.method8383();
			if (local17 == 0) {
				return;
			}
			this.method7179(local17, arg0, arg1);
		}
	}
}
