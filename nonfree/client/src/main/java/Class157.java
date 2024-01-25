import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class157 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "Lclient!wm;")
	private Class1_Sub19 aClass1_Sub19_4;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "[Lclient!ib;")
	private Class82_Sub1[] aClass82_Sub1Array2;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "Lclient!kv;")
	private final Class145 aClass145_3;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "Lclient!wd;")
	private final Class269 aClass269_5;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "Lclient!wt;")
	private Class1_Sub3_Sub7_Sub2 aClass1_Sub3_Sub7_Sub2_1;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!wd;Lclient!kv;)V")
	public Class157(@OriginalArg(0) Class269 arg0, @OriginalArg(1) Class145 arg1) {
		this.aClass145_3 = arg1;
		this.aClass269_5 = arg0;
		if (!this.aClass269_5.method5756()) {
			this.aClass1_Sub3_Sub7_Sub2_1 = this.aClass269_5.method5753((byte) 0, 255, true, 255);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZLclient!wk;Lclient!wk;I)Lclient!ib;")
	private Class82_Sub1 method3600(@OriginalArg(2) Class271 arg0, @OriginalArg(3) Class271 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass1_Sub19_4 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub19_4.anInt3698 = arg2 * 8 + 5;
		if (this.aClass1_Sub19_4.anInt3698 >= this.aClass1_Sub19_4.aByteArray38.length) {
			throw new RuntimeException();
		} else if (this.aClass82_Sub1Array2[arg2] == null) {
			@Pc(49) int local49 = this.aClass1_Sub19_4.method2877();
			@Pc(54) int local54 = this.aClass1_Sub19_4.method2877();
			@Pc(68) Class82_Sub1 local68 = new Class82_Sub1(arg2, arg1, arg0, this.aClass269_5, this.aClass145_3, local49, local54, true);
			this.aClass82_Sub1Array2[arg2] = local68;
			return local68;
		} else {
			return this.aClass82_Sub1Array2[arg2];
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	public void method3601() {
		if (this.aClass82_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass82_Sub1Array2.length; local11++) {
			if (this.aClass82_Sub1Array2[local11] != null) {
				this.aClass82_Sub1Array2[local11].method2273();
			}
		}
		for (@Pc(40) int local40 = 0; local40 < this.aClass82_Sub1Array2.length; local40++) {
			if (this.aClass82_Sub1Array2[local40] != null) {
				this.aClass82_Sub1Array2[local40].method2276();
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!wk;IBLclient!wk;)Lclient!ib;")
	public Class82_Sub1 method3603(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class271 arg2) {
		return this.method3600(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)Z")
	public boolean method3607() {
		if (this.aClass1_Sub19_4 != null) {
			return true;
		}
		if (this.aClass1_Sub3_Sub7_Sub2_1 == null) {
			if (this.aClass269_5.method5756()) {
				return false;
			}
			this.aClass1_Sub3_Sub7_Sub2_1 = this.aClass269_5.method5753((byte) 0, 255, true, 255);
		}
		if (this.aClass1_Sub3_Sub7_Sub2_1.aBoolean646) {
			return false;
		} else {
			this.aClass1_Sub19_4 = new Class1_Sub19(this.aClass1_Sub3_Sub7_Sub2_1.method5942());
			this.aClass82_Sub1Array2 = new Class82_Sub1[(this.aClass1_Sub19_4.aByteArray38.length - 5) / 8];
			return true;
		}
	}
}
