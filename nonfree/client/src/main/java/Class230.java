import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class230 {

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "J")
	private long aLong199;

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
	private int anInt6100 = -1;

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "Lclient!tm;")
	private final Class338 aClass338_153 = new Class338();

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!jp;)V")
	public Class230(@OriginalArg(0) Class3_Sub25 arg0) {
		this.method5514(arg0);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!jp;I)V")
	private void method5514(@OriginalArg(0) Class3_Sub25 arg0) {
		this.aLong199 = arg0.method8600();
		this.anInt6100 = arg0.method8618();
		for (@Pc(23) int local23 = arg0.method8632(); local23 != 0; local23 = arg0.method8632()) {
			if (Static356.aBoolean417) {
				System.out.println("t:" + local23);
			}
			@Pc(52) Class3_Sub12 local52;
			if (local23 == 3) {
				local52 = new Class3_Sub12_Sub6();
			} else if (local23 == 1) {
				local52 = new Class3_Sub12_Sub1();
			} else if (local23 == 4) {
				local52 = new Class3_Sub12_Sub8();
			} else if (local23 == 6) {
				local52 = new Class3_Sub12_Sub3();
			} else if (local23 == 5) {
				local52 = new Class3_Sub12_Sub4();
			} else if (local23 == 2) {
				local52 = new Class3_Sub12_Sub5();
			} else if (local23 == 7) {
				local52 = new Class3_Sub12_Sub2();
			} else if (local23 == 8) {
				local52 = new Class3_Sub12_Sub12();
			} else if (local23 == 9) {
				local52 = new Class3_Sub12_Sub9();
			} else if (local23 == 10) {
				local52 = new Class3_Sub12_Sub10();
			} else if (local23 == 11) {
				local52 = new Class3_Sub12_Sub11();
			} else if (local23 == 12) {
				local52 = new Class3_Sub12_Sub7();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local52.method8886(arg0);
			this.aClass338_153.method8171(local52);
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!ke;I)V")
	public void method5516(@OriginalArg(0) Class185 arg0) {
		if (arg0.aLong159 != this.aLong199 || this.anInt6100 != arg0.anInt5071) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static28.method669(arg0.aLong159) + " updateNum:" + arg0.anInt5071 + " delta.owner:" + Static28.method669(this.aLong199) + " updateNum:" + this.anInt6100);
		}
		for (@Pc(53) Class3_Sub12 local53 = (Class3_Sub12) this.aClass338_153.method8177(); local53 != null; local53 = (Class3_Sub12) this.aClass338_153.method8168()) {
			local53.method8885(arg0);
		}
		arg0.anInt5071++;
	}
}
