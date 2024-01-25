import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class330 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
	public int anInt9293;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	public int anInt9295;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	private int anInt9296;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	public int anInt9299;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
	public int anInt9301;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
	public int anInt9303;

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
	public int anInt9305;

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "J")
	public long aLong236;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
	public int anInt9306;

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
	public int anInt9308;

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
	public int anInt9309;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "Z")
	private boolean aBoolean696 = false;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
	public int anInt9302 = 0;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
	public int anInt9298 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILclient!iaa;)V")
	private void method7785(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt9296 = arg1.method4999();
		} else if (arg0 == 2) {
			arg1.method4966();
		} else if (arg0 == 3) {
			this.anInt9293 = arg1.method5000();
			this.anInt9295 = arg1.method5000();
			this.anInt9309 = arg1.method5000();
		} else if (arg0 == 4) {
			this.anInt9299 = arg1.method4966();
			this.anInt9305 = arg1.method5000();
		} else if (arg0 == 6) {
			this.anInt9306 = arg1.method4966();
		} else if (arg0 == 8) {
			this.anInt9302 = 1;
		} else if (arg0 == 9) {
			this.anInt9298 = 1;
		} else if (arg0 == 10) {
			this.aBoolean696 = true;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public void method7786() {
		this.anInt9308 = Class179.anIntArray757[this.anInt9296 << 3];
		this.anInt9303 = (int) Math.sqrt((double) (this.anInt9293 * this.anInt9293 + this.anInt9295 * this.anInt9295 + this.anInt9309 * this.anInt9309));
		if (this.anInt9305 == 0) {
			this.anInt9305 = 1;
		}
		if (this.anInt9299 == 0) {
			this.aLong236 = 2147483647L;
		} else if (this.anInt9299 == 1) {
			this.aLong236 = this.anInt9303 * 8 / this.anInt9305;
			this.aLong236 *= this.aLong236;
		} else if (this.anInt9299 == 2) {
			this.aLong236 = this.anInt9303 * 8 / this.anInt9305;
		}
		if (this.aBoolean696) {
			this.anInt9303 *= -1;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!iaa;Z)V")
	public void method7787(@OriginalArg(0) Class6_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4966();
			if (local9 == 0) {
				return;
			}
			this.method7785(local9, arg0);
		}
	}
}
