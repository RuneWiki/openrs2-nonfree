import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class124 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!ec;")
	private Class6_Sub10 aClass6_Sub10_3;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "[Lclient!os;")
	private Class98_Sub1[] aClass98_Sub1Array2;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!ka;")
	private final Class113 aClass113_2;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!id;")
	private final Class99 aClass99_1;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "Lclient!ma;")
	private Class6_Sub2_Sub11_Sub1 aClass6_Sub2_Sub11_Sub1_2;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!ka;Lclient!id;)V")
	public Class124(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class99 arg1) {
		this.aClass113_2 = arg0;
		this.aClass99_1 = arg1;
		if (!this.aClass113_2.method3130()) {
			this.aClass6_Sub2_Sub11_Sub1_2 = this.aClass113_2.method3141((byte) 0, 255, true, 255);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public void method3321() {
		if (this.aClass98_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass98_Sub1Array2.length; local11++) {
			if (this.aClass98_Sub1Array2[local11] != null) {
				this.aClass98_Sub1Array2[local11].method4137();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass98_Sub1Array2.length; local36++) {
			if (this.aClass98_Sub1Array2[local36] != null) {
				this.aClass98_Sub1Array2[local36].method4143();
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!uf;ILclient!uf;ZI)Lclient!os;")
	private Class98_Sub1 method3322(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class197 arg2) {
		if (this.aClass6_Sub10_3 == null) {
			throw new RuntimeException();
		}
		this.aClass6_Sub10_3.anInt4188 = arg1 * 8 + 5;
		if (this.aClass6_Sub10_3.aByteArray67.length <= this.aClass6_Sub10_3.anInt4188) {
			throw new RuntimeException();
		} else if (this.aClass98_Sub1Array2[arg1] == null) {
			@Pc(53) int local53 = this.aClass6_Sub10_3.method3979();
			@Pc(58) int local58 = this.aClass6_Sub10_3.method3979();
			@Pc(72) Class98_Sub1 local72 = new Class98_Sub1(arg1, arg0, arg2, this.aClass113_2, this.aClass99_1, local53, local58, true);
			this.aClass98_Sub1Array2[arg1] = local72;
			return local72;
		} else {
			return this.aClass98_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!uf;ILclient!uf;)Lclient!os;")
	public Class98_Sub1 method3324(@OriginalArg(0) int arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(3) Class197 arg2) {
		return this.method3322(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Z")
	public boolean method3325() {
		if (this.aClass6_Sub10_3 != null) {
			return true;
		}
		if (this.aClass6_Sub2_Sub11_Sub1_2 == null) {
			if (this.aClass113_2.method3130()) {
				return false;
			}
			this.aClass6_Sub2_Sub11_Sub1_2 = this.aClass113_2.method3141((byte) 0, 255, true, 255);
		}
		if (this.aClass6_Sub2_Sub11_Sub1_2.aBoolean366) {
			return false;
		} else {
			this.aClass6_Sub10_3 = new Class6_Sub10(this.aClass6_Sub2_Sub11_Sub1_2.method4802());
			this.aClass98_Sub1Array2 = new Class98_Sub1[(this.aClass6_Sub10_3.aByteArray67.length - 5) / 8];
			return true;
		}
	}
}
