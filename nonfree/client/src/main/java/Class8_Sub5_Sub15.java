import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class8_Sub5_Sub15 extends Class8_Sub5 {

	@OriginalMember(owner = "client!qga", name = "w", descriptor = "I")
	public int anInt8340 = 0;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(BLclient!ig;)V")
	public void method6887(@OriginalArg(1) Class8_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8525();
			if (local5 == 0) {
				return;
			}
			this.method6888(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZILclient!ig;)V")
	private void method6888(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub8 arg1) {
		if (arg0 == 2) {
			this.anInt8340 = arg1.method8578();
		}
	}
}
