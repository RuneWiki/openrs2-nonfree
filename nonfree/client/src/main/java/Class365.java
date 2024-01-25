import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class365 {

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "J")
	private long aLong293;

	@OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
	private int anInt10202 = -1;

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "Lclient!ef;")
	private final Class102 aClass102_73 = new Class102();

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!ib;)V")
	public Class365(@OriginalArg(0) Class5_Sub23 arg0) {
		this.method8772(arg0);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILclient!ib;)V")
	private void method8772(@OriginalArg(1) Class5_Sub23 arg0) {
		this.aLong293 = arg0.method8509();
		this.anInt10202 = arg0.method8527();
		for (@Pc(27) int local27 = arg0.method8529(); local27 != 0; local27 = arg0.method8529()) {
			if (Static628.aBoolean762) {
				System.out.println("t:" + local27);
			}
			@Pc(70) Class5_Sub2 local70;
			if (local27 == 3) {
				local70 = new Class5_Sub2_Sub9();
			} else if (local27 == 1) {
				local70 = new Class5_Sub2_Sub2();
			} else if (local27 == 4) {
				local70 = new Class5_Sub2_Sub8();
			} else if (local27 == 6) {
				local70 = new Class5_Sub2_Sub10();
			} else if (local27 == 5) {
				local70 = new Class5_Sub2_Sub3();
			} else if (local27 == 2) {
				local70 = new Class5_Sub2_Sub11();
			} else if (local27 == 7) {
				local70 = new Class5_Sub2_Sub7();
			} else if (local27 == 8) {
				local70 = new Class5_Sub2_Sub4();
			} else if (local27 == 9) {
				local70 = new Class5_Sub2_Sub12();
			} else if (local27 == 10) {
				local70 = new Class5_Sub2_Sub5();
			} else if (local27 == 11) {
				local70 = new Class5_Sub2_Sub1();
			} else if (local27 == 12) {
				local70 = new Class5_Sub2_Sub6();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local70.method8188(arg0);
			this.aClass102_73.method1921(local70);
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!kp;I)V")
	public void method8773(@OriginalArg(0) Class205 arg0) {
		if (this.aLong293 != arg0.aLong175 || this.anInt10202 != arg0.anInt5737) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static447.method6658(arg0.aLong175) + " updateNum:" + arg0.anInt5737 + " delta.owner:" + Static447.method6658(this.aLong293) + " updateNum:" + this.anInt10202);
		}
		for (@Pc(79) Class5_Sub2 local79 = (Class5_Sub2) this.aClass102_73.method1916(); local79 != null; local79 = (Class5_Sub2) this.aClass102_73.method1915()) {
			local79.method8190(arg0);
		}
		arg0.anInt5737++;
	}
}
