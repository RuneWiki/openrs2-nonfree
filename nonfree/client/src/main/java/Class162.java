import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class162 {

	@OriginalMember(owner = "client!te", name = "c", descriptor = "[Lclient!ti;")
	private Class153_Sub1[] aClass153_Sub1Array2;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "Lclient!p;")
	private Class4_Sub17 aClass4_Sub17_9;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!ml;")
	private Class113 aClass113_2;

	@OriginalMember(owner = "client!te", name = "w", descriptor = "Lclient!a;")
	private Class1 aClass1_5;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "Lclient!gf;")
	private Class4_Sub2_Sub4_Sub1 aClass4_Sub2_Sub4_Sub1_2;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!ml;Lclient!a;)V")
	public Class162(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class1 arg1) {
		this.aClass113_2 = arg0;
		this.aClass1_5 = arg1;
		if (!this.aClass113_2.method2672()) {
			this.aClass4_Sub2_Sub4_Sub1_2 = this.aClass113_2.method2686(255, 255, true, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Z")
	public boolean method3840() {
		if (this.aClass4_Sub17_9 != null) {
			return true;
		}
		if (this.aClass4_Sub2_Sub4_Sub1_2 == null) {
			if (this.aClass113_2.method2672()) {
				return false;
			}
			this.aClass4_Sub2_Sub4_Sub1_2 = this.aClass113_2.method2686(255, 255, true, (byte) 0);
		}
		if (this.aClass4_Sub2_Sub4_Sub1_2.aBoolean157) {
			return false;
		} else {
			this.aClass4_Sub17_9 = new Class4_Sub17(this.aClass4_Sub2_Sub4_Sub1_2.method1606());
			this.aClass153_Sub1Array2 = new Class153_Sub1[(this.aClass4_Sub17_9.aByteArray30.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZILclient!jg;ILclient!jg;)Lclient!ti;")
	private Class153_Sub1 method3841(@OriginalArg(2) Class79 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class79 arg2) {
		if (this.aClass4_Sub17_9 == null) {
			throw new RuntimeException();
		}
		this.aClass4_Sub17_9.anInt2400 = arg1 * 8 + 5;
		if (this.aClass4_Sub17_9.anInt2400 >= this.aClass4_Sub17_9.aByteArray30.length) {
			throw new RuntimeException();
		} else if (this.aClass153_Sub1Array2[arg1] == null) {
			@Pc(52) int local52 = this.aClass4_Sub17_9.method1889();
			@Pc(57) int local57 = this.aClass4_Sub17_9.method1889();
			@Pc(77) Class153_Sub1 local77 = new Class153_Sub1(arg1, arg2, arg0, this.aClass113_2, this.aClass1_5, local52, local57, true);
			this.aClass153_Sub1Array2[arg1] = local77;
			return local77;
		} else {
			return this.aClass153_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!jg;IILclient!jg;)Lclient!ti;")
	public Class153_Sub1 method3842(@OriginalArg(0) Class79 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class79 arg2) {
		return this.method3841(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public void method3844() {
		if (this.aClass153_Sub1Array2 == null) {
			return;
		}
		@Pc(13) int local13;
		for (local13 = 0; local13 < this.aClass153_Sub1Array2.length; local13++) {
			if (this.aClass153_Sub1Array2[local13] != null) {
				this.aClass153_Sub1Array2[local13].method3924();
			}
		}
		for (local13 = 0; local13 < this.aClass153_Sub1Array2.length; local13++) {
			if (this.aClass153_Sub1Array2[local13] != null) {
				this.aClass153_Sub1Array2[local13].method3919();
			}
		}
	}
}
