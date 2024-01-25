import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class80 {

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
	private int anInt2045 = -1;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Lclient!qw;")
	private final Class302 aClass302_10 = new Class302();

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!dt;)V")
	public Class80(@OriginalArg(0) Class3_Sub4 arg0) {
		this.method1718(arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!tn;I)V")
	public void method1717(@OriginalArg(0) Class342 arg0) {
		if (arg0.aLong269 != this.aLong58 || arg0.anInt9495 != this.anInt2045) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static611.method8283(arg0.aLong269) + " updateNum:" + arg0.anInt9495 + " delta.owner:" + Static611.method8283(this.aLong58) + " updateNum:" + this.anInt2045);
		}
		for (@Pc(61) Class3_Sub2 local61 = (Class3_Sub2) this.aClass302_10.method6603(); local61 != null; local61 = (Class3_Sub2) this.aClass302_10.method6605()) {
			local61.method8290(arg0);
		}
		arg0.anInt9495++;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!dt;B)V")
	private void method1718(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aLong58 = arg0.method7946();
		this.anInt2045 = arg0.method7895();
		for (@Pc(28) int local28 = arg0.method7954(); local28 != 0; local28 = arg0.method7954()) {
			if (Static501.aBoolean552) {
				System.out.println("t:" + local28);
			}
			@Pc(58) Class3_Sub2 local58;
			if (local28 == 3) {
				local58 = new Class3_Sub2_Sub9();
			} else if (local28 == 1) {
				local58 = new Class3_Sub2_Sub5();
			} else if (local28 == 4) {
				local58 = new Class3_Sub2_Sub2();
			} else if (local28 == 6) {
				local58 = new Class3_Sub2_Sub6();
			} else if (local28 == 5) {
				local58 = new Class3_Sub2_Sub1();
			} else if (local28 == 2) {
				local58 = new Class3_Sub2_Sub11();
			} else if (local28 == 7) {
				local58 = new Class3_Sub2_Sub8();
			} else if (local28 == 8) {
				local58 = new Class3_Sub2_Sub4();
			} else if (local28 == 9) {
				local58 = new Class3_Sub2_Sub12();
			} else if (local28 == 10) {
				local58 = new Class3_Sub2_Sub7();
			} else if (local28 == 11) {
				local58 = new Class3_Sub2_Sub10();
			} else if (local28 == 12) {
				local58 = new Class3_Sub2_Sub3();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local58.method8291(arg0);
			this.aClass302_10.method6613(local58);
		}
	}
}
