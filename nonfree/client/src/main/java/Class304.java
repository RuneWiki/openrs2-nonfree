import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class304 {

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "J")
	private long aLong230;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
	private int anInt7971 = -1;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "Lclient!at;")
	private final Class20 aClass20_44 = new Class20();

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!wq;)V")
	public Class304(@OriginalArg(0) Class5_Sub36 arg0) {
		this.method6900(arg0);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!wq;I)V")
	private void method6900(@OriginalArg(0) Class5_Sub36 arg0) {
		this.aLong230 = arg0.method7304();
		this.anInt7971 = arg0.method7268();
		for (@Pc(19) int local19 = arg0.method7291(); local19 != 0; local19 = arg0.method7291()) {
			if (Static354.aBoolean391) {
				System.out.println("t:" + local19);
			}
			@Pc(67) Class5_Sub15 local67;
			if (local19 == 3) {
				local67 = new Class5_Sub15_Sub2();
			} else if (local19 == 1) {
				local67 = new Class5_Sub15_Sub3();
			} else if (local19 == 4) {
				local67 = new Class5_Sub15_Sub10();
			} else if (local19 == 6) {
				local67 = new Class5_Sub15_Sub11();
			} else if (local19 == 5) {
				local67 = new Class5_Sub15_Sub1();
			} else if (local19 == 2) {
				local67 = new Class5_Sub15_Sub9();
			} else if (local19 == 7) {
				local67 = new Class5_Sub15_Sub8();
			} else if (local19 == 8) {
				local67 = new Class5_Sub15_Sub4();
			} else if (local19 == 9) {
				local67 = new Class5_Sub15_Sub5();
			} else if (local19 == 10) {
				local67 = new Class5_Sub15_Sub6();
			} else if (local19 == 11) {
				local67 = new Class5_Sub15_Sub7();
			} else if (local19 == 12) {
				local67 = new Class5_Sub15_Sub12();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local67.method9163(arg0);
			this.aClass20_44.method370(local67);
		}
		if (7 != 7) {
			Static492.method6899(-12, false, 118, (String) null);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!sca;I)V")
	public void method6901(@OriginalArg(0) Class325 arg0) {
		if (this.aLong230 != arg0.aLong247 || this.anInt7971 != arg0.anInt8575) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static508.method7013(arg0.aLong247) + " updateNum:" + arg0.anInt8575 + " delta.owner:" + Static508.method7013(this.aLong230) + " updateNum:" + this.anInt7971);
		}
		for (@Pc(70) Class5_Sub15 local70 = (Class5_Sub15) this.aClass20_44.method378(); local70 != null; local70 = (Class5_Sub15) this.aClass20_44.method366()) {
			local70.method9164(arg0);
		}
		if (32 != 32) {
			Static492.method6897(-89, false);
		}
		arg0.anInt8575++;
	}
}
