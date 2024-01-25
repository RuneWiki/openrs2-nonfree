import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class161 {

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "J")
	private long aLong126;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
	private int anInt4378 = -1;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!ok;")
	private final Class262 aClass262_21 = new Class262();

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!so;)V")
	public Class161(@OriginalArg(0) Class14_Sub29 arg0) {
		this.method3623(arg0);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!so;B)V")
	private void method3623(@OriginalArg(0) Class14_Sub29 arg0) {
		this.aLong126 = arg0.method5907();
		this.anInt4378 = arg0.method5878();
		for (@Pc(19) int local19 = arg0.method5866(); local19 != 0; local19 = arg0.method5866()) {
			if (Static265.aBoolean318) {
				System.out.println("t:" + local19);
			}
			@Pc(47) Class14_Sub2 local47;
			if (local19 == 3) {
				local47 = new Class14_Sub2_Sub2();
			} else if (local19 == 1) {
				local47 = new Class14_Sub2_Sub10();
			} else if (local19 == 4) {
				local47 = new Class14_Sub2_Sub1();
			} else if (local19 == 6) {
				local47 = new Class14_Sub2_Sub12();
			} else if (local19 == 5) {
				local47 = new Class14_Sub2_Sub4();
			} else if (local19 == 2) {
				local47 = new Class14_Sub2_Sub11();
			} else if (local19 == 7) {
				local47 = new Class14_Sub2_Sub7();
			} else if (local19 == 8) {
				local47 = new Class14_Sub2_Sub5();
			} else if (local19 == 9) {
				local47 = new Class14_Sub2_Sub3();
			} else if (local19 == 10) {
				local47 = new Class14_Sub2_Sub6();
			} else if (local19 == 11) {
				local47 = new Class14_Sub2_Sub8();
			} else if (local19 == 12) {
				local47 = new Class14_Sub2_Sub9();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local47.method9310(arg0);
			this.aClass262_21.method6314(local47);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!mda;I)V")
	public void method3626(@OriginalArg(0) Class229 arg0) {
		if (arg0.aLong183 != this.aLong126 || this.anInt4378 != arg0.anInt6613) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static627.method8803(arg0.aLong183) + " updateNum:" + arg0.anInt6613 + " delta.owner:" + Static627.method8803(this.aLong126) + " updateNum:" + this.anInt4378);
		}
		for (@Pc(57) Class14_Sub2 local57 = (Class14_Sub2) this.aClass262_21.method6318(); local57 != null; local57 = (Class14_Sub2) this.aClass262_21.method6311()) {
			local57.method9307(arg0);
		}
		arg0.anInt6613++;
	}
}
