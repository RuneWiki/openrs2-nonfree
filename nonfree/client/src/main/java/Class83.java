import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class83 {

	@OriginalMember(owner = "client!er", name = "e", descriptor = "Lclient!sfa;")
	public Class305 aClass305_4;

	@OriginalMember(owner = "client!er", name = "n", descriptor = "I")
	public int anInt2795;

	@OriginalMember(owner = "client!er", name = "b", descriptor = "I")
	public int anInt2787 = 64;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "Z")
	public boolean aBoolean235 = true;

	@OriginalMember(owner = "client!er", name = "k", descriptor = "I")
	public int anInt2793 = 8;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "Z")
	public boolean aBoolean236 = true;

	@OriginalMember(owner = "client!er", name = "m", descriptor = "Z")
	public boolean aBoolean237 = false;

	@OriginalMember(owner = "client!er", name = "h", descriptor = "I")
	public int anInt2790 = 1190717;

	@OriginalMember(owner = "client!er", name = "l", descriptor = "I")
	public int anInt2794 = -1;

	@OriginalMember(owner = "client!er", name = "g", descriptor = "I")
	public int anInt2789 = 512;

	@OriginalMember(owner = "client!er", name = "o", descriptor = "I")
	public int anInt2796 = 127;

	@OriginalMember(owner = "client!er", name = "i", descriptor = "I")
	public int anInt2791 = -1;

	@OriginalMember(owner = "client!er", name = "q", descriptor = "I")
	public int anInt2798 = 0;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
	public void method2540() {
		this.anInt2793 = this.anInt2793 << 8 | this.anInt2795;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!qh;B)V")
	public void method2541(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3118();
			if (local5 == 0) {
				return;
			}
			this.method2542(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IZLclient!qh;)V")
	private void method2542(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt2798 = Static258.method4311(arg1.method3126());
		} else if (arg0 == 2) {
			this.anInt2794 = arg1.method3118();
		} else if (arg0 == 3) {
			this.anInt2794 = arg1.method3109();
			if (this.anInt2794 == 65535) {
				this.anInt2794 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean235 = false;
		} else if (arg0 == 7) {
			this.anInt2791 = Static258.method4311(arg1.method3126());
		} else if (arg0 == 8) {
			this.aClass305_4.anInt7787 = this.anInt2795;
		} else if (arg0 == 9) {
			this.anInt2789 = arg1.method3109() << 2;
		} else if (arg0 == 10) {
			this.aBoolean236 = false;
		} else if (arg0 == 11) {
			this.anInt2793 = arg1.method3118();
		} else if (arg0 == 12) {
			this.aBoolean237 = true;
		} else if (arg0 == 13) {
			this.anInt2790 = arg1.method3126();
		} else if (arg0 == 14) {
			this.anInt2787 = arg1.method3118() << 2;
		} else if (arg0 == 16) {
			this.anInt2796 = arg1.method3118();
		}
	}
}
