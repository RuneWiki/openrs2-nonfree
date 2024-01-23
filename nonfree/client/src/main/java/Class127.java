import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class127 {

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
	public int anInt4270 = 128;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
	public int anInt4271 = 8;

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "Z")
	public boolean aBoolean288 = true;

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
	public int anInt4282 = 1190717;

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
	public int anInt4281 = 0;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
	public int anInt4280 = -1;

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "Z")
	public boolean aBoolean289 = true;

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "Z")
	public boolean aBoolean290 = false;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
	public int anInt4274 = 16;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
	public int anInt4275 = -1;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBLclient!oe;)V")
	public void method3470(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method2146();
			if (local5 == 0) {
				return;
			}
			this.method3474(arg1, arg0, local5);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!oe;II)V")
	private void method3474(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4281 = Static228.method3720(arg0.method2166());
		} else if (arg2 == 2) {
			this.anInt4280 = arg0.method2146();
		} else if (arg2 == 3) {
			this.anInt4280 = arg0.method2130();
			if (this.anInt4280 == 65535) {
				this.anInt4280 = -1;
			}
		} else if (arg2 == 5) {
			this.aBoolean289 = false;
		} else if (arg2 == 7) {
			this.anInt4275 = Static228.method3720(arg0.method2166());
		} else if (arg2 == 8) {
			Static275.anInt5452 = arg1;
		} else if (arg2 == 9) {
			this.anInt4270 = arg0.method2130();
		} else if (arg2 == 10) {
			this.aBoolean288 = false;
		} else if (arg2 == 11) {
			this.anInt4271 = arg0.method2146();
		} else if (arg2 == 12) {
			this.aBoolean290 = true;
		} else if (arg2 == 13) {
			this.anInt4282 = arg0.method2166();
		} else if (arg2 == 14) {
			this.anInt4274 = arg0.method2146();
		}
	}
}
