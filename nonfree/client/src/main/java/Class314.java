import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class314 {

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "Lclient!ka;")
	public Class181 aClass181_6;

	@OriginalMember(owner = "client!tca", name = "j", descriptor = "I")
	public int anInt8501;

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "I")
	public int anInt8497 = 0;

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
	public int anInt8495 = 64;

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
	public int anInt8498 = 127;

	@OriginalMember(owner = "client!tca", name = "l", descriptor = "Z")
	public boolean aBoolean659 = false;

	@OriginalMember(owner = "client!tca", name = "h", descriptor = "Z")
	public boolean aBoolean658 = true;

	@OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
	public int anInt8500 = -1;

	@OriginalMember(owner = "client!tca", name = "m", descriptor = "I")
	public int anInt8503 = 512;

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "I")
	public int anInt8502 = -1;

	@OriginalMember(owner = "client!tca", name = "o", descriptor = "I")
	public int anInt8505 = 1190717;

	@OriginalMember(owner = "client!tca", name = "p", descriptor = "Z")
	public boolean aBoolean660 = true;

	@OriginalMember(owner = "client!tca", name = "q", descriptor = "I")
	public int anInt8506 = 8;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!mo;BI)V")
	private void method6888(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8497 = Static343.method4697(arg0.method5797());
		} else if (arg1 == 2) {
			this.anInt8500 = arg0.method5750();
		} else if (arg1 == 3) {
			this.anInt8500 = arg0.method5771();
			if (this.anInt8500 == 65535) {
				this.anInt8500 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean660 = false;
		} else if (arg1 == 7) {
			this.anInt8502 = Static343.method4697(arg0.method5797());
		} else if (arg1 == 8) {
			this.aClass181_6.anInt4644 = this.anInt8501;
		} else if (arg1 == 9) {
			this.anInt8503 = arg0.method5771() << 2;
		} else if (arg1 == 10) {
			this.aBoolean658 = false;
		} else if (arg1 == 11) {
			this.anInt8506 = arg0.method5750();
		} else if (arg1 == 12) {
			this.aBoolean659 = true;
		} else if (arg1 == 13) {
			this.anInt8505 = arg0.method5797();
		} else if (arg1 == 14) {
			this.anInt8495 = arg0.method5750() << 2;
		} else if (arg1 == 16) {
			this.anInt8498 = arg0.method5750();
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V")
	public void method6889() {
		this.anInt8506 = this.anInt8501 | this.anInt8506 << 8;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!mo;I)V")
	public void method6890(@OriginalArg(0) Class1_Sub35 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5750();
			if (local11 == 0) {
				return;
			}
			this.method6888(arg0, local11);
		}
	}
}
