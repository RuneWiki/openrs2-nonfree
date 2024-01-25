import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class198 {

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "J")
	private long aLong154;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	private int anInt5401 = -1;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!bd;")
	private final Class32 aClass32_26 = new Class32();

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class198(@OriginalArg(0) Class14_Sub21 arg0) {
		this.method4910(arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!jc;I)V")
	private void method4910(@OriginalArg(0) Class14_Sub21 arg0) {
		this.aLong154 = arg0.method7729();
		this.anInt5401 = arg0.method7748();
		for (@Pc(27) int local27 = arg0.method7695(100); local27 != 0; local27 = arg0.method7695(106)) {
			if (Static403.aBoolean494) {
				System.out.println("t:" + local27);
			}
			@Pc(55) Class14_Sub11 local55;
			if (local27 == 3) {
				local55 = new Class14_Sub11_Sub1();
			} else if (local27 == 1) {
				local55 = new Class14_Sub11_Sub9();
			} else if (local27 == 13) {
				local55 = new Class14_Sub11_Sub3();
			} else if (local27 == 4) {
				local55 = new Class14_Sub11_Sub8();
			} else if (local27 == 6) {
				local55 = new Class14_Sub11_Sub10();
			} else if (local27 == 5) {
				local55 = new Class14_Sub11_Sub13();
			} else if (local27 == 2) {
				local55 = new Class14_Sub11_Sub12();
			} else if (local27 == 7) {
				local55 = new Class14_Sub11_Sub4();
			} else if (local27 == 8) {
				local55 = new Class14_Sub11_Sub5();
			} else if (local27 == 9) {
				local55 = new Class14_Sub11_Sub2();
			} else if (local27 == 10) {
				local55 = new Class14_Sub11_Sub11();
			} else if (local27 == 11) {
				local55 = new Class14_Sub11_Sub7();
			} else if (local27 == 12) {
				local55 = new Class14_Sub11_Sub6();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local55.method9160(arg0);
			this.aClass32_26.method582(local55);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!aq;)V")
	public void method4911(@OriginalArg(1) Class23 arg0) {
		if (arg0.aLong18 != this.aLong154 || this.anInt5401 != arg0.anInt317) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static580.method8268(arg0.aLong18) + " updateNum:" + arg0.anInt317 + " delta.owner:" + Static580.method8268(this.aLong154) + " updateNum:" + this.anInt5401);
		}
		for (@Pc(77) Class14_Sub11 local77 = (Class14_Sub11) this.aClass32_26.method584(); local77 != null; local77 = (Class14_Sub11) this.aClass32_26.method577()) {
			local77.method9161(arg0);
		}
		arg0.anInt317++;
	}
}
