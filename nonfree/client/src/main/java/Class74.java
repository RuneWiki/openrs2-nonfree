import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class74 {

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "Lclient!vg;")
	public Class367 aClass367_3;

	@OriginalMember(owner = "client!daa", name = "k", descriptor = "I")
	public int anInt2144;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
	public int anInt2136 = 127;

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
	public int anInt2138 = 1190717;

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
	public int anInt2137 = -1;

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "Z")
	public boolean aBoolean201 = false;

	@OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
	public int anInt2139 = 512;

	@OriginalMember(owner = "client!daa", name = "m", descriptor = "I")
	public int anInt2146 = 0;

	@OriginalMember(owner = "client!daa", name = "l", descriptor = "I")
	public int anInt2145 = 64;

	@OriginalMember(owner = "client!daa", name = "p", descriptor = "Z")
	public boolean aBoolean203 = true;

	@OriginalMember(owner = "client!daa", name = "q", descriptor = "I")
	public int anInt2148 = -1;

	@OriginalMember(owner = "client!daa", name = "o", descriptor = "I")
	public int anInt2147 = 8;

	@OriginalMember(owner = "client!daa", name = "n", descriptor = "Z")
	public boolean aBoolean202 = true;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V")
	public void method1936() {
		this.anInt2147 = this.anInt2144 | this.anInt2147 << 8;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILclient!mc;)V")
	public void method1938(@OriginalArg(1) Class5_Sub41 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method7816();
			if (local11 == 0) {
				return;
			}
			this.method1940(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IILclient!mc;)V")
	private void method1940(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub41 arg1) {
		if (arg0 == 1) {
			this.anInt2146 = Static237.method3652(arg1.method7807());
		} else if (arg0 == 2) {
			this.anInt2137 = arg1.method7816();
		} else if (arg0 == 3) {
			this.anInt2137 = arg1.method7860();
			if (this.anInt2137 == 65535) {
				this.anInt2137 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean203 = false;
		} else if (arg0 == 7) {
			this.anInt2148 = Static237.method3652(arg1.method7807());
		} else if (arg0 == 8) {
			this.aClass367_3.anInt10264 = this.anInt2144;
		} else if (arg0 == 9) {
			this.anInt2139 = arg1.method7860() << 2;
		} else if (arg0 == 10) {
			this.aBoolean202 = false;
		} else if (arg0 == 11) {
			this.anInt2147 = arg1.method7816();
		} else if (arg0 == 12) {
			this.aBoolean201 = true;
		} else if (arg0 == 13) {
			this.anInt2138 = arg1.method7807();
		} else if (arg0 == 14) {
			this.anInt2145 = arg1.method7816() << 2;
		} else if (arg0 == 16) {
			this.anInt2136 = arg1.method7816();
		}
	}
}
