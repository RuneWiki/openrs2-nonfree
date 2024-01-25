import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class285 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Z")
	public boolean aBoolean580 = false;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
	public int anInt8281 = 64;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	public int anInt8280 = -1;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
	public int anInt8289 = 1;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	public int anInt8290 = 2;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "Z")
	public boolean aBoolean581 = false;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	public int anInt8284 = 64;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBLclient!un;)V")
	public void method6848(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method4905();
			if (local5 == 0) {
				return;
			}
			this.method6850(arg0, arg1, local5);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!un;II)V")
	private void method6850(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt8280 = arg1.method4936();
			if (this.anInt8280 == 65535) {
				this.anInt8280 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt8284 = arg1.method4936() + 1;
			this.anInt8281 = arg1.method4936() + 1;
		} else if (arg2 == 3) {
			arg1.method4925();
		} else if (arg2 == 4) {
			this.anInt8290 = arg1.method4905();
		} else if (arg2 == 5) {
			this.anInt8289 = arg1.method4905();
		} else if (arg2 == 6) {
			this.aBoolean581 = true;
		} else if (arg2 == 7) {
			this.aBoolean580 = true;
		}
	}
}
