import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class329 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "J")
	private long aLong261;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	private int anInt9377 = -1;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!ow;")
	private final Class271 aClass271_56 = new Class271();

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!ol;)V")
	public Class329(@OriginalArg(0) Class2_Sub8 arg0) {
		this.method8267(arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ol;I)V")
	private void method8267(@OriginalArg(0) Class2_Sub8 arg0) {
		this.aLong261 = arg0.method5213();
		this.anInt9377 = arg0.method5172();
		for (@Pc(27) int local27 = arg0.method5203(); local27 != 0; local27 = arg0.method5203()) {
			if (Static656.aBoolean799) {
				System.out.println("t:" + local27);
			}
			@Pc(52) Class2_Sub3 local52;
			if (local27 == 3) {
				local52 = new Class2_Sub3_Sub5();
			} else if (local27 == 1) {
				local52 = new Class2_Sub3_Sub6();
			} else if (local27 == 4) {
				local52 = new Class2_Sub3_Sub4();
			} else if (local27 == 6) {
				local52 = new Class2_Sub3_Sub3();
			} else if (local27 == 5) {
				local52 = new Class2_Sub3_Sub10();
			} else if (local27 == 2) {
				local52 = new Class2_Sub3_Sub2();
			} else if (local27 == 7) {
				local52 = new Class2_Sub3_Sub12();
			} else if (local27 == 8) {
				local52 = new Class2_Sub3_Sub11();
			} else if (local27 == 9) {
				local52 = new Class2_Sub3_Sub9();
			} else if (local27 == 10) {
				local52 = new Class2_Sub3_Sub8();
			} else if (local27 == 11) {
				local52 = new Class2_Sub3_Sub7();
			} else if (local27 == 12) {
				local52 = new Class2_Sub3_Sub1();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local52.method9470(arg0);
			this.aClass271_56.method7174(local52);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!lm;I)V")
	public void method8268(@OriginalArg(0) Class219 arg0) {
		if (this.aLong261 != arg0.aLong174 || arg0.anInt6728 != this.anInt9377) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static538.method8270(arg0.aLong174) + " updateNum:" + arg0.anInt6728 + " delta.owner:" + Static538.method8270(this.aLong261) + " updateNum:" + this.anInt9377);
		}
		for (@Pc(61) Class2_Sub3 local61 = (Class2_Sub3) this.aClass271_56.method7177(); local61 != null; local61 = (Class2_Sub3) this.aClass271_56.method7175()) {
			local61.method9472(arg0);
		}
		arg0.anInt6728++;
	}
}
