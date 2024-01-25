import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class9 {

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "Z")
	public boolean aBoolean16 = true;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
	public int anInt194 = 1190717;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Z")
	public boolean aBoolean15 = true;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	public int anInt192 = -1;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "Z")
	public boolean aBoolean17 = false;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	public int anInt193 = 16;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
	public int anInt199 = 8;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
	public int anInt200 = 0;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
	public int anInt202 = -1;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
	public int anInt198 = 128;

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
	public int anInt205 = -1;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIILclient!rg;)V")
	private void method175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub12 arg2) {
		if (arg1 == 1) {
			this.anInt200 = Static76.method1402(arg2.method5072());
		} else if (arg1 == 2) {
			this.anInt202 = arg2.method5115();
			return;
		} else if (arg1 == 3) {
			this.anInt202 = arg2.method5106();
			if (this.anInt202 == 65535) {
				this.anInt202 = -1;
				return;
			}
		} else if (arg1 == 5) {
			this.aBoolean15 = false;
			return;
		} else if (arg1 == 7) {
			this.anInt205 = Static76.method1402(arg2.method5072());
			return;
		} else if (arg1 == 8) {
			Static242.anInt4870 = arg0;
			return;
		} else if (arg1 == 9) {
			this.anInt198 = arg2.method5106();
			return;
		} else if (arg1 == 10) {
			this.aBoolean16 = false;
			return;
		} else if (arg1 == 11) {
			this.anInt199 = arg2.method5115();
			return;
		} else if (arg1 == 12) {
			this.aBoolean17 = true;
			return;
		} else if (arg1 == 13) {
			this.anInt194 = arg2.method5072();
			return;
		} else {
			if (arg1 == 14) {
				this.anInt193 = arg2.method5115();
			} else if (arg1 == 15) {
				this.anInt192 = arg2.method5106();
				if (this.anInt192 == 65535) {
					this.anInt192 = -1;
					return;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	public void method177(@OriginalArg(0) int arg0) {
		this.anInt199 = arg0 | this.anInt199 << 8;
		if (this.anInt192 == -1) {
			this.anInt192 = this.anInt202;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBLclient!rg;)V")
	public void method180(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method5115();
			if (local14 == 0) {
				return;
			}
			this.method175(arg0, local14, arg1);
		}
	}
}
