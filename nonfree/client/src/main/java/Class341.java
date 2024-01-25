import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class341 {

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "J")
	private long aLong328;

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
	private int anInt9607 = -1;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "Lclient!tj;")
	private final Class357 aClass357_55 = new Class357();

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class341(@OriginalArg(0) Class3_Sub28 arg0) {
		this.method8092(arg0);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!rba;I)V")
	private void method8092(@OriginalArg(0) Class3_Sub28 arg0) {
		this.aLong328 = arg0.method5287();
		this.anInt9607 = arg0.method5312();
		for (@Pc(24) int local24 = arg0.method5322(-30); local24 != 0; local24 = arg0.method5322(-119)) {
			if (Static125.aBoolean201) {
				System.out.println("t:" + local24);
			}
			@Pc(71) Class3_Sub11 local71;
			if (local24 == 3) {
				local71 = new Class3_Sub11_Sub5();
			} else if (local24 == 1) {
				local71 = new Class3_Sub11_Sub7();
			} else if (local24 == 13) {
				local71 = new Class3_Sub11_Sub3();
			} else if (local24 == 4) {
				local71 = new Class3_Sub11_Sub4();
			} else if (local24 == 6) {
				local71 = new Class3_Sub11_Sub8();
			} else if (local24 == 5) {
				local71 = new Class3_Sub11_Sub9();
			} else if (local24 == 2) {
				local71 = new Class3_Sub11_Sub2();
			} else if (local24 == 7) {
				local71 = new Class3_Sub11_Sub13();
			} else if (local24 == 8) {
				local71 = new Class3_Sub11_Sub10();
			} else if (local24 == 9) {
				local71 = new Class3_Sub11_Sub12();
			} else if (local24 == 10) {
				local71 = new Class3_Sub11_Sub11();
			} else if (local24 == 11) {
				local71 = new Class3_Sub11_Sub1();
			} else if (local24 == 12) {
				local71 = new Class3_Sub11_Sub6();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local71.method8782(arg0);
			this.aClass357_55.method8401(local71);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLclient!mea;)V")
	public void method8094(@OriginalArg(1) Class237 arg0) {
		if (arg0.aLong228 != this.aLong328 || arg0.anInt6979 != this.anInt9607) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static479.method7005(arg0.aLong228) + " updateNum:" + arg0.anInt6979 + " delta.owner:" + Static479.method7005(this.aLong328) + " updateNum:" + this.anInt9607);
		}
		for (@Pc(73) Class3_Sub11 local73 = (Class3_Sub11) this.aClass357_55.method8391(); local73 != null; local73 = (Class3_Sub11) this.aClass357_55.method8392()) {
			local73.method8783(arg0);
		}
		arg0.anInt6979++;
	}
}
