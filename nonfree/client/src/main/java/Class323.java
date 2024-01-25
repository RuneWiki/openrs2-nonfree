import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class323 {

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "J")
	private long aLong283;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	private int anInt8472 = -1;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "Lclient!sja;")
	private final Class342 aClass342_67 = new Class342();

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class323(@OriginalArg(0) Class3_Sub2 arg0) {
		this.method7221(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ika;I)V")
	private void method7221(@OriginalArg(0) Class3_Sub2 arg0) {
		this.aLong283 = arg0.method2063();
		this.anInt8472 = arg0.method2036();
		for (@Pc(21) int local21 = arg0.method2048(255); local21 != 0; local21 = arg0.method2048(255)) {
			if (Static35.aBoolean85) {
				System.out.println("t:" + local21);
			}
			@Pc(54) Class3_Sub17 local54;
			if (local21 == 3) {
				local54 = new Class3_Sub17_Sub10();
			} else if (local21 == 1) {
				local54 = new Class3_Sub17_Sub7();
			} else if (local21 == 13) {
				local54 = new Class3_Sub17_Sub3();
			} else if (local21 == 4) {
				local54 = new Class3_Sub17_Sub12();
			} else if (local21 == 6) {
				local54 = new Class3_Sub17_Sub5();
			} else if (local21 == 5) {
				local54 = new Class3_Sub17_Sub8();
			} else if (local21 == 2) {
				local54 = new Class3_Sub17_Sub4();
			} else if (local21 == 7) {
				local54 = new Class3_Sub17_Sub1();
			} else if (local21 == 8) {
				local54 = new Class3_Sub17_Sub11();
			} else if (local21 == 9) {
				local54 = new Class3_Sub17_Sub6();
			} else if (local21 == 10) {
				local54 = new Class3_Sub17_Sub2();
			} else if (local21 == 11) {
				local54 = new Class3_Sub17_Sub9();
			} else if (local21 == 12) {
				local54 = new Class3_Sub17_Sub13();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local54.method9119(arg0);
			this.aClass342_67.method7654(local54);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!eaa;)V")
	public void method7222(@OriginalArg(1) Class84 arg0) {
		if (arg0.aLong94 != this.aLong283 || this.anInt8472 != arg0.anInt2556) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static248.method3508(arg0.aLong94, -120) + " updateNum:" + arg0.anInt2556 + " delta.owner:" + Static248.method3508(this.aLong283, -120) + " updateNum:" + this.anInt8472);
		}
		for (@Pc(69) Class3_Sub17 local69 = (Class3_Sub17) this.aClass342_67.method7644(); local69 != null; local69 = (Class3_Sub17) this.aClass342_67.method7650()) {
			local69.method9118(arg0);
		}
		arg0.anInt2556++;
	}
}
