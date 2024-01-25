import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class127 {

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "[Lclient!ne;")
	private Class138_Sub1[] aClass138_Sub1Array1;

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "Lclient!kh;")
	private Class11_Sub25 aClass11_Sub25_4;

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "Lclient!rb;")
	private final Class172 aClass172_1;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "Lclient!cl;")
	private final Class40 aClass40_2;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "Lclient!bg;")
	private Class11_Sub4_Sub1_Sub1 aClass11_Sub4_Sub1_Sub1_1;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!rb;Lclient!cl;)V")
	public Class127(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class40 arg1) {
		this.aClass172_1 = arg0;
		this.aClass40_2 = arg1;
		if (!this.aClass172_1.method4571()) {
			this.aClass11_Sub4_Sub1_Sub1_1 = this.aClass172_1.method4566(255, true, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZBLclient!r;Lclient!r;I)Lclient!ne;")
	private Class138_Sub1 method3184(@OriginalArg(2) Class171 arg0, @OriginalArg(3) Class171 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass11_Sub25_4 == null) {
			throw new RuntimeException();
		}
		this.aClass11_Sub25_4.anInt6076 = arg2 * 8 + 5;
		if (this.aClass11_Sub25_4.anInt6076 >= this.aClass11_Sub25_4.aByteArray93.length) {
			throw new RuntimeException();
		} else if (this.aClass138_Sub1Array1[arg2] == null) {
			@Pc(45) int local45 = this.aClass11_Sub25_4.method5198();
			@Pc(50) int local50 = this.aClass11_Sub25_4.method5198();
			@Pc(64) Class138_Sub1 local64 = new Class138_Sub1(arg2, arg1, arg0, this.aClass172_1, this.aClass40_2, local45, local50, true);
			this.aClass138_Sub1Array1[arg2] = local64;
			return local64;
		} else {
			return this.aClass138_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Z")
	public boolean method3185() {
		if (this.aClass11_Sub25_4 != null) {
			return true;
		}
		if (this.aClass11_Sub4_Sub1_Sub1_1 == null) {
			if (this.aClass172_1.method4571()) {
				return false;
			}
			this.aClass11_Sub4_Sub1_Sub1_1 = this.aClass172_1.method4566(255, true, (byte) 0, 255);
		}
		if (this.aClass11_Sub4_Sub1_Sub1_1.aBoolean359) {
			return false;
		} else {
			this.aClass11_Sub25_4 = new Class11_Sub25(this.aClass11_Sub4_Sub1_Sub1_1.method4696());
			this.aClass138_Sub1Array1 = new Class138_Sub1[(this.aClass11_Sub25_4.aByteArray93.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!r;BILclient!r;)Lclient!ne;")
	public Class138_Sub1 method3187(@OriginalArg(0) Class171 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class171 arg2) {
		return this.method3184(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
	public void method3189() {
		if (this.aClass138_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass138_Sub1Array1.length; local11++) {
			if (this.aClass138_Sub1Array1[local11] != null) {
				this.aClass138_Sub1Array1[local11].method3690();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass138_Sub1Array1.length; local36++) {
			if (this.aClass138_Sub1Array1[local36] != null) {
				this.aClass138_Sub1Array1[local36].method3693();
			}
		}
	}
}
