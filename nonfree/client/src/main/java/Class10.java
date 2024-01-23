import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class10 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
	public int anInt255 = 8;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
	public int anInt257 = 128;

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
	public int anInt262 = 0;

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "Z")
	public boolean aBoolean19 = true;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "Z")
	public boolean aBoolean21 = false;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "Z")
	public boolean aBoolean20 = true;

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
	public int anInt264 = -1;

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
	public int anInt266 = 1190717;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
	public int anInt259 = -1;

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
	public int anInt265 = 16;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BILclient!cg;I)V")
	private void method282(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub11 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt262 = Static75.method1313(arg1.method2681());
		} else if (arg2 == 2) {
			this.anInt264 = arg1.method2690();
		} else if (arg2 == 3) {
			this.anInt264 = arg1.method2691();
			if (this.anInt264 == 65535) {
				this.anInt264 = -1;
			}
		} else if (arg2 == 5) {
			this.aBoolean19 = false;
		} else if (arg2 == 7) {
			this.anInt259 = Static75.method1313(arg1.method2681());
		} else if (arg2 == 8) {
			Static56.anInt1236 = arg0;
		} else if (arg2 == 9) {
			this.anInt257 = arg1.method2691();
		} else if (arg2 == 10) {
			this.aBoolean20 = false;
		} else if (arg2 == 11) {
			this.anInt255 = arg1.method2690();
		} else if (arg2 == 12) {
			this.aBoolean21 = true;
		} else if (arg2 == 13) {
			this.anInt266 = arg1.method2681();
		} else if (arg2 == 14) {
			this.anInt265 = arg1.method2690();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILclient!cg;)V")
	public void method283(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method2690();
			if (local14 == 0) {
				return;
			}
			this.method282(arg0, arg1, local14);
		}
	}
}
