import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class163 {

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "Lclient!bg;")
	private Class1_Sub8 aClass1_Sub8_5;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "[Lclient!s;")
	private Class51_Sub1[] aClass51_Sub1Array5;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "Lclient!sa;")
	private final Class186 aClass186_1;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "Lclient!vm;")
	private final Class211 aClass211_2;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "Lclient!rb;")
	private Class1_Sub4_Sub5_Sub2 aClass1_Sub4_Sub5_Sub2_1;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!sa;Lclient!vm;)V")
	public Class163(@OriginalArg(0) Class186 arg0, @OriginalArg(1) Class211 arg1) {
		this.aClass186_1 = arg0;
		this.aClass211_2 = arg1;
		if (!this.aClass186_1.method4899()) {
			this.aClass1_Sub4_Sub5_Sub2_1 = this.aClass186_1.method4893(255, (byte) 0, 255, true);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)Z")
	public boolean method4341() {
		if (this.aClass1_Sub8_5 != null) {
			return true;
		}
		if (this.aClass1_Sub4_Sub5_Sub2_1 == null) {
			if (this.aClass186_1.method4899()) {
				return false;
			}
			this.aClass1_Sub4_Sub5_Sub2_1 = this.aClass186_1.method4893(255, (byte) 0, 255, true);
		}
		if (this.aClass1_Sub4_Sub5_Sub2_1.aBoolean519) {
			return false;
		} else {
			this.aClass1_Sub8_5 = new Class1_Sub8(this.aClass1_Sub4_Sub5_Sub2_1.method4679());
			this.aClass51_Sub1Array5 = new Class51_Sub1[(this.aClass1_Sub8_5.aByteArray81.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!pp;Lclient!pp;B)Lclient!s;")
	public Class51_Sub1 method4343(@OriginalArg(0) int arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(2) Class166 arg2) {
		return this.method4347(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	public void method4344() {
		if (this.aClass51_Sub1Array5 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass51_Sub1Array5.length; local11++) {
			if (this.aClass51_Sub1Array5[local11] != null) {
				this.aClass51_Sub1Array5[local11].method4870();
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.aClass51_Sub1Array5.length; local44++) {
			if (this.aClass51_Sub1Array5[local44] != null) {
				this.aClass51_Sub1Array5[local44].method4872();
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIILclient!pp;Lclient!pp;)Lclient!s;")
	private Class51_Sub1 method4347(@OriginalArg(2) int arg0, @OriginalArg(3) Class166 arg1, @OriginalArg(4) Class166 arg2) {
		if (this.aClass1_Sub8_5 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub8_5.anInt5182 = arg0 * 8 + 5;
		if (this.aClass1_Sub8_5.aByteArray81.length <= this.aClass1_Sub8_5.anInt5182) {
			throw new RuntimeException();
		} else if (this.aClass51_Sub1Array5[arg0] == null) {
			@Pc(49) int local49 = this.aClass1_Sub8_5.method4545();
			@Pc(54) int local54 = this.aClass1_Sub8_5.method4545();
			@Pc(68) Class51_Sub1 local68 = new Class51_Sub1(arg0, arg1, arg2, this.aClass186_1, this.aClass211_2, local49, local54, true);
			this.aClass51_Sub1Array5[arg0] = local68;
			return local68;
		} else {
			return this.aClass51_Sub1Array5[arg0];
		}
	}
}
