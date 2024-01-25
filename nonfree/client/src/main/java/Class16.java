import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class16 {

	@OriginalMember(owner = "client!av", name = "i", descriptor = "I")
	public int anInt300;

	@OriginalMember(owner = "client!av", name = "u", descriptor = "Lclient!tj;")
	public Class237 aClass237_3;

	@OriginalMember(owner = "client!av", name = "b", descriptor = "I")
	public int anInt294 = 127;

	@OriginalMember(owner = "client!av", name = "f", descriptor = "I")
	public int anInt297 = -1;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "I")
	public int anInt293 = 0;

	@OriginalMember(owner = "client!av", name = "g", descriptor = "I")
	public int anInt298 = 1190717;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "I")
	public int anInt296 = 128;

	@OriginalMember(owner = "client!av", name = "h", descriptor = "I")
	public int anInt299 = -1;

	@OriginalMember(owner = "client!av", name = "m", descriptor = "Z")
	public boolean aBoolean16 = true;

	@OriginalMember(owner = "client!av", name = "o", descriptor = "I")
	public int anInt304 = -1;

	@OriginalMember(owner = "client!av", name = "q", descriptor = "Z")
	public boolean aBoolean17 = true;

	@OriginalMember(owner = "client!av", name = "j", descriptor = "Z")
	public boolean aBoolean15 = false;

	@OriginalMember(owner = "client!av", name = "t", descriptor = "I")
	public int anInt307 = 8;

	@OriginalMember(owner = "client!av", name = "r", descriptor = "I")
	public int anInt305 = 16;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!nj;II)V")
	private void method330(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt293 = Static143.method2209(arg0.method4099());
		} else if (arg1 == 2) {
			this.anInt299 = arg0.method4096();
		} else if (arg1 == 3) {
			this.anInt299 = arg0.method4083();
			if (this.anInt299 == 65535) {
				this.anInt299 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean17 = false;
		} else if (arg1 == 7) {
			this.anInt304 = Static143.method2209(arg0.method4099());
		} else if (arg1 == 8) {
			this.aClass237_3.anInt6575 = this.anInt300;
		} else if (arg1 == 9) {
			this.anInt296 = arg0.method4083() << 0;
		} else if (arg1 == 10) {
			this.aBoolean16 = false;
		} else if (arg1 == 11) {
			this.anInt307 = arg0.method4096();
		} else if (arg1 == 12) {
			this.aBoolean15 = true;
		} else if (arg1 == 13) {
			this.anInt298 = arg0.method4099();
		} else if (arg1 == 14) {
			this.anInt305 = arg0.method4096() << 0;
		} else if (arg1 == 15) {
			this.anInt297 = arg0.method4083();
			if (this.anInt297 == 65535) {
				this.anInt297 = -1;
			}
		} else if (arg1 == 16) {
			this.anInt294 = arg0.method4096();
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
	public void method331() {
		this.anInt307 = this.anInt307 << 8 | this.anInt300;
		if (this.anInt297 == -1) {
			this.anInt297 = this.anInt299;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method332(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4096();
			if (local11 == 0) {
				return;
			}
			this.method330(arg0, local11);
		}
	}
}
