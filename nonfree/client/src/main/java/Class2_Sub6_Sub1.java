import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class2_Sub6_Sub1 extends Class2_Sub6 {

	@OriginalMember(owner = "client!eb", name = "bc", descriptor = "Lclient!ka;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!eb", name = "hc", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V")
	public Class2_Sub6_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)I")
	public int method680(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1008;
	}

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "(I)V")
	public void method681() {
		this.anInt1008 = super.anInt952 * 8;
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)V")
	public void method682() {
		super.anInt952 = (this.anInt1008 + 7) / 8;
	}

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "(II)V")
	public void method684(@OriginalArg(1) int arg0) {
		super.aByteArray11[super.anInt952++] = (byte) (this.aClass27_1.method1112() + arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([II)V")
	public void method685(@OriginalArg(0) int[] arg0) {
		this.aClass27_1 = new Class27(arg0);
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(B)I")
	public int method686() {
		return super.aByteArray11[super.anInt952++] - this.aClass27_1.method1112() & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "(II)I")
	public int method687(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt1008 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt1008 & 0x7);
		this.anInt1008 += arg0;
		@Pc(26) int local26 = 0;
		while (arg0 > local18) {
			local26 += (Static8.anIntArray47[local18] & super.aByteArray11[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local26 += super.aByteArray11[local10] & Static8.anIntArray47[local18];
		} else {
			local26 += super.aByteArray11[local10] >> local18 - arg0 & Static8.anIntArray47[arg0];
		}
		return local26;
	}
}
