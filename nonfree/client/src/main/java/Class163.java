import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class163 {

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!ae;")
	private Class6_Sub1 aClass6_Sub1_4;

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "[Lclient!rr;")
	private Class68_Sub1[] aClass68_Sub1Array1;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "Lclient!t;")
	private final Class227 aClass227_1;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Lclient!qc;")
	private final Class203 aClass203_2;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "Lclient!rb;")
	private Class6_Sub2_Sub11_Sub1 aClass6_Sub2_Sub11_Sub1_1;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!t;Lclient!qc;)V")
	public Class163(@OriginalArg(0) Class227 arg0, @OriginalArg(1) Class203 arg1) {
		this.aClass227_1 = arg0;
		this.aClass203_2 = arg1;
		if (!this.aClass227_1.method5582()) {
			this.aClass6_Sub2_Sub11_Sub1_1 = this.aClass227_1.method5574(255, 255, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ek;Lclient!ek;II)Lclient!rr;")
	public Class68_Sub1 method3813(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) int arg2) {
		return this.method3815(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)Z")
	public boolean method3814() {
		if (this.aClass6_Sub1_4 != null) {
			return true;
		}
		if (this.aClass6_Sub2_Sub11_Sub1_1 == null) {
			if (this.aClass227_1.method5582()) {
				return false;
			}
			this.aClass6_Sub2_Sub11_Sub1_1 = this.aClass227_1.method5574(255, 255, (byte) 0, true);
		}
		if (this.aClass6_Sub2_Sub11_Sub1_1.aBoolean491) {
			return false;
		} else {
			this.aClass6_Sub1_4 = new Class6_Sub1(this.aClass6_Sub2_Sub11_Sub1_1.method6374());
			this.aClass68_Sub1Array1 = new Class68_Sub1[(this.aClass6_Sub1_4.aByteArray96.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ek;Lclient!ek;ZII)Lclient!rr;")
	private Class68_Sub1 method3815(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass6_Sub1_4 == null) {
			throw new RuntimeException();
		}
		this.aClass6_Sub1_4.anInt7898 = arg2 * 8 + 5;
		if (this.aClass6_Sub1_4.aByteArray96.length <= this.aClass6_Sub1_4.anInt7898) {
			throw new RuntimeException();
		} else if (this.aClass68_Sub1Array1[arg2] == null) {
			@Pc(45) int local45 = this.aClass6_Sub1_4.method6442();
			@Pc(50) int local50 = this.aClass6_Sub1_4.method6442();
			@Pc(64) Class68_Sub1 local64 = new Class68_Sub1(arg2, arg0, arg1, this.aClass227_1, this.aClass203_2, local45, local50, true);
			this.aClass68_Sub1Array1[arg2] = local64;
			return local64;
		} else {
			return this.aClass68_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
	public void method3816() {
		if (this.aClass68_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass68_Sub1Array1.length; local11++) {
			if (this.aClass68_Sub1Array1[local11] != null) {
				this.aClass68_Sub1Array1[local11].method5219();
			}
		}
		for (@Pc(38) int local38 = 0; local38 < this.aClass68_Sub1Array1.length; local38++) {
			if (this.aClass68_Sub1Array1[local38] != null) {
				this.aClass68_Sub1Array1[local38].method5218();
			}
		}
	}
}
