import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class55 {

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
	public int anInt1614;

	@OriginalMember(owner = "client!cda", name = "k", descriptor = "Lclient!ud;")
	public Class352 aClass352_1;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
	public int anInt1613 = -1;

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
	public int anInt1618 = 0;

	@OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
	public int anInt1617 = 1190717;

	@OriginalMember(owner = "client!cda", name = "l", descriptor = "Z")
	public boolean aBoolean146 = true;

	@OriginalMember(owner = "client!cda", name = "o", descriptor = "I")
	public int anInt1622 = 512;

	@OriginalMember(owner = "client!cda", name = "m", descriptor = "I")
	public int anInt1621 = -1;

	@OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
	public int anInt1620 = 127;

	@OriginalMember(owner = "client!cda", name = "h", descriptor = "Z")
	public boolean aBoolean145 = true;

	@OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
	public int anInt1619 = 64;

	@OriginalMember(owner = "client!cda", name = "q", descriptor = "I")
	public int anInt1623 = 8;

	@OriginalMember(owner = "client!cda", name = "n", descriptor = "Z")
	public boolean aBoolean147 = false;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILclient!fca;I)V")
	private void method1564(@OriginalArg(1) Class3_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1618 = Static663.method8650(arg0.method4862());
		} else if (arg1 == 2) {
			this.anInt1621 = arg0.method4888();
		} else if (arg1 == 3) {
			this.anInt1621 = arg0.method4858();
			if (this.anInt1621 == 65535) {
				this.anInt1621 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean146 = false;
		} else if (arg1 == 7) {
			this.anInt1613 = Static663.method8650(arg0.method4862());
		} else if (arg1 == 8) {
			this.aClass352_1.anInt9429 = this.anInt1614;
		} else if (arg1 == 9) {
			this.anInt1622 = arg0.method4858() << 2;
		} else if (arg1 == 10) {
			this.aBoolean145 = false;
		} else if (arg1 == 11) {
			this.anInt1623 = arg0.method4888();
		} else if (arg1 == 12) {
			this.aBoolean147 = true;
		} else if (arg1 == 13) {
			this.anInt1617 = arg0.method4862();
		} else if (arg1 == 14) {
			this.anInt1619 = arg0.method4888() << 2;
		} else if (arg1 == 16) {
			this.anInt1620 = arg0.method4888();
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILclient!fca;)V")
	public void method1565(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4888();
			if (local5 == 0) {
				return;
			}
			this.method1564(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
	public void method1568() {
		this.anInt1623 = this.anInt1614 | this.anInt1623 << 8;
	}
}
