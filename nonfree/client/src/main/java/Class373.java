import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class373 {

	@OriginalMember(owner = "client!un", name = "h", descriptor = "J")
	private long aLong319;

	@OriginalMember(owner = "client!un", name = "b", descriptor = "I")
	private int anInt10225 = -1;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "Lclient!cga;")
	private final Class60 aClass60_215 = new Class60();

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class373(@OriginalArg(0) Class2_Sub20 arg0) {
		this.method8960(arg0);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!wc;B)V")
	public void method8959(@OriginalArg(0) Class394 arg0) {
		if (this.aLong319 != arg0.aLong340 || arg0.anInt10743 != this.anInt10225) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static580.method8080(arg0.aLong340) + " updateNum:" + arg0.anInt10743 + " delta.owner:" + Static580.method8080(this.aLong319) + " updateNum:" + this.anInt10225);
		}
		for (@Pc(72) Class2_Sub10 local72 = (Class2_Sub10) this.aClass60_215.method1226(7); local72 != null; local72 = (Class2_Sub10) this.aClass60_215.method1228()) {
			local72.method9198(arg0);
		}
		arg0.anInt10743++;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!et;B)V")
	private void method8960(@OriginalArg(0) Class2_Sub20 arg0) {
		this.aLong319 = arg0.method8590();
		this.anInt10225 = arg0.method8555(-9372);
		for (@Pc(27) int local27 = arg0.method8581(-17416); local27 != 0; local27 = arg0.method8581(-17416)) {
			if (Static479.aBoolean670) {
				System.out.println("t:" + local27);
			}
			@Pc(60) Class2_Sub10 local60;
			if (local27 == 3) {
				local60 = new Class2_Sub10_Sub4();
			} else if (local27 == 1) {
				local60 = new Class2_Sub10_Sub11();
			} else if (local27 == 13) {
				local60 = new Class2_Sub10_Sub8();
			} else if (local27 == 4) {
				local60 = new Class2_Sub10_Sub13();
			} else if (local27 == 6) {
				local60 = new Class2_Sub10_Sub10();
			} else if (local27 == 5) {
				local60 = new Class2_Sub10_Sub12();
			} else if (local27 == 2) {
				local60 = new Class2_Sub10_Sub2();
			} else if (local27 == 7) {
				local60 = new Class2_Sub10_Sub5();
			} else if (local27 == 8) {
				local60 = new Class2_Sub10_Sub1();
			} else if (local27 == 9) {
				local60 = new Class2_Sub10_Sub7();
			} else if (local27 == 10) {
				local60 = new Class2_Sub10_Sub6();
			} else if (local27 == 11) {
				local60 = new Class2_Sub10_Sub9();
			} else if (local27 == 12) {
				local60 = new Class2_Sub10_Sub3();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local60.method9199(arg0);
			this.aClass60_215.method1233(local60);
		}
	}
}
