import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class6 {

	@OriginalMember(owner = "client!aca", name = "h", descriptor = "J")
	private long aLong4;

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "I")
	private int anInt80 = -1;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_1 = new Class163();

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class6(@OriginalArg(0) Class4_Sub11 arg0) {
		this.method115(arg0);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILclient!oga;)V")
	public void method111(@OriginalArg(1) Class267 arg0) {
		if (this.aLong4 != arg0.aLong196 || arg0.anInt6792 != this.anInt80) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static414.method5217(arg0.aLong196) + " updateNum:" + arg0.anInt6792 + " delta.owner:" + Static414.method5217(this.aLong4) + " updateNum:" + this.anInt80);
		}
		for (@Pc(61) Class4_Sub1 local61 = (Class4_Sub1) this.aClass163_1.method3639(); local61 != null; local61 = (Class4_Sub1) this.aClass163_1.method3640()) {
			local61.method8329(arg0);
		}
		arg0.anInt6792++;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILclient!es;)V")
	private void method115(@OriginalArg(1) Class4_Sub11 arg0) {
		this.aLong4 = arg0.method8830();
		this.anInt80 = arg0.method8850();
		for (@Pc(27) int local27 = arg0.method8865(); local27 != 0; local27 = arg0.method8865()) {
			if (Static149.aBoolean199) {
				System.out.println("t:" + local27);
			}
			@Pc(58) Class4_Sub1 local58;
			if (local27 == 3) {
				local58 = new Class4_Sub1_Sub2();
			} else if (local27 == 1) {
				local58 = new Class4_Sub1_Sub4();
			} else if (local27 == 4) {
				local58 = new Class4_Sub1_Sub8();
			} else if (local27 == 6) {
				local58 = new Class4_Sub1_Sub5();
			} else if (local27 == 5) {
				local58 = new Class4_Sub1_Sub3();
			} else if (local27 == 2) {
				local58 = new Class4_Sub1_Sub7();
			} else if (local27 == 7) {
				local58 = new Class4_Sub1_Sub6();
			} else if (local27 == 8) {
				local58 = new Class4_Sub1_Sub1();
			} else if (local27 == 9) {
				local58 = new Class4_Sub1_Sub11();
			} else if (local27 == 10) {
				local58 = new Class4_Sub1_Sub12();
			} else if (local27 == 11) {
				local58 = new Class4_Sub1_Sub9();
			} else if (local27 == 12) {
				local58 = new Class4_Sub1_Sub10();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local58.method8334(arg0);
			this.aClass163_1.method3646(local58);
		}
	}
}
