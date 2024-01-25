import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class87 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!sg;")
	public Class226 aClass226_3;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
	public int anInt2660;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
	public int anInt2661 = 16;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
	public int anInt2663 = 0;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
	public int anInt2667 = 8;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	public int anInt2668 = -1;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "Z")
	public boolean aBoolean234 = true;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	public int anInt2666 = 1190717;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
	public int anInt2669 = -1;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "Z")
	public boolean aBoolean233 = true;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	public int anInt2664 = 127;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	public int anInt2662 = -1;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
	public int anInt2670 = 128;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "Z")
	public boolean aBoolean235 = false;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public void method2011() {
		this.anInt2667 = this.anInt2667 << 8 | this.anInt2660;
		if (this.anInt2668 == -1) {
			this.anInt2668 = this.anInt2669;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!cu;)V")
	public void method2012(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2582();
			if (local9 == 0) {
				return;
			}
			this.method2013(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!cu;II)V")
	private void method2013(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2663 = Static273.method3886(arg0.method2604());
		} else if (arg1 == 2) {
			this.anInt2669 = arg0.method2582();
		} else if (arg1 == 3) {
			this.anInt2669 = arg0.method2588();
			if (this.anInt2669 == 65535) {
				this.anInt2669 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean233 = false;
		} else if (arg1 == 7) {
			this.anInt2662 = Static273.method3886(arg0.method2604());
		} else if (arg1 == 8) {
			this.aClass226_3.anInt6180 = this.anInt2660;
		} else if (arg1 == 9) {
			this.anInt2670 = arg0.method2588() << 0;
		} else if (arg1 == 10) {
			this.aBoolean234 = false;
		} else if (arg1 == 11) {
			this.anInt2667 = arg0.method2582();
		} else if (arg1 == 12) {
			this.aBoolean235 = true;
		} else if (arg1 == 13) {
			this.anInt2666 = arg0.method2604();
		} else if (arg1 == 14) {
			this.anInt2661 = arg0.method2582();
		} else if (arg1 == 15) {
			this.anInt2668 = arg0.method2588();
			if (this.anInt2668 == 65535) {
				this.anInt2668 = -1;
			}
		} else if (arg1 == 16) {
			this.anInt2664 = arg0.method2582();
		}
	}
}
