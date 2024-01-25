import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class45 {

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "Lclient!vt;")
	private Class2_Sub24 aClass2_Sub24_1;

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "[Lclient!p;")
	private Class135_Sub1[] aClass135_Sub1Array3;

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "Lclient!ua;")
	private final Class222 aClass222_1;

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "Lclient!tt;")
	private final Class221 aClass221_1;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "Lclient!wo;")
	private Class2_Sub7_Sub17_Sub2 aClass2_Sub7_Sub17_Sub2_1;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!ua;Lclient!tt;)V")
	public Class45(@OriginalArg(0) Class222 arg0, @OriginalArg(1) Class221 arg1) {
		this.aClass222_1 = arg0;
		this.aClass221_1 = arg1;
		if (!this.aClass222_1.method5520()) {
			this.aClass2_Sub7_Sub17_Sub2_1 = this.aClass222_1.method5529((byte) 0, 255, 255, true);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)Z")
	public boolean method882() {
		if (this.aClass2_Sub24_1 != null) {
			return true;
		}
		if (this.aClass2_Sub7_Sub17_Sub2_1 == null) {
			if (this.aClass222_1.method5520()) {
				return false;
			}
			this.aClass2_Sub7_Sub17_Sub2_1 = this.aClass222_1.method5529((byte) 0, 255, 255, true);
		}
		if (this.aClass2_Sub7_Sub17_Sub2_1.aBoolean502) {
			return false;
		} else {
			this.aClass2_Sub24_1 = new Class2_Sub24(this.aClass2_Sub7_Sub17_Sub2_1.method6090());
			this.aClass135_Sub1Array3 = new Class135_Sub1[(this.aClass2_Sub24_1.aByteArray100.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLclient!hc;Lclient!hc;I)Lclient!p;")
	public Class135_Sub1 method883(@OriginalArg(1) Class93 arg0, @OriginalArg(2) Class93 arg1, @OriginalArg(3) int arg2) {
		return this.method887(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V")
	public void method886() {
		if (this.aClass135_Sub1Array3 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.aClass135_Sub1Array3.length; local15++) {
			if (this.aClass135_Sub1Array3[local15] != null) {
				this.aClass135_Sub1Array3[local15].method4413();
			}
		}
		for (@Pc(40) int local40 = 0; local40 < this.aClass135_Sub1Array3.length; local40++) {
			if (this.aClass135_Sub1Array3[local40] != null) {
				this.aClass135_Sub1Array3[local40].method4415();
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZLclient!hc;ILclient!hc;I)Lclient!p;")
	private Class135_Sub1 method887(@OriginalArg(1) Class93 arg0, @OriginalArg(3) Class93 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass2_Sub24_1 == null) {
			throw new RuntimeException();
		}
		this.aClass2_Sub24_1.anInt6669 = arg2 * 8 + 5;
		if (this.aClass2_Sub24_1.aByteArray100.length <= this.aClass2_Sub24_1.anInt6669) {
			throw new RuntimeException();
		} else if (this.aClass135_Sub1Array3[arg2] == null) {
			@Pc(45) int local45 = this.aClass2_Sub24_1.method5776();
			@Pc(50) int local50 = this.aClass2_Sub24_1.method5776();
			@Pc(64) Class135_Sub1 local64 = new Class135_Sub1(arg2, arg1, arg0, this.aClass222_1, this.aClass221_1, local45, local50, true);
			this.aClass135_Sub1Array3[arg2] = local64;
			return local64;
		} else {
			return this.aClass135_Sub1Array3[arg2];
		}
	}
}
