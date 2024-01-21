import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!fe", name = "yc", descriptor = "Lclient!gb;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!fe", name = "Dc", descriptor = "I")
	private int anInt1214;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "(II)I")
	public int method833(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1214;
	}

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "(B)V")
	public void method834() {
		super.anInt1168 = (this.anInt1214 + 7) / 8;
	}

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "(B)I")
	public int method835() {
		return super.aByteArray7[super.anInt1168++] - this.aClass23_1.method868() & 0xFF;
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(IB)I")
	public int method838(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt1214 >> 3;
		@Pc(17) int local17 = 0;
		@Pc(24) int local24 = 8 - (this.anInt1214 & 0x7);
		this.anInt1214 += arg0;
		while (local24 < arg0) {
			local17 += (Static30.anIntArray120[local24] & super.aByteArray7[local10++]) << arg0 - local24;
			arg0 -= local24;
			local24 = 8;
		}
		if (local24 == arg0) {
			local17 += super.aByteArray7[local10] & Static30.anIntArray120[local24];
		} else {
			local17 += Static30.anIntArray120[arg0] & super.aByteArray7[local10] >> local24 - arg0;
		}
		return local17;
	}

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "(II)V")
	public void method841(@OriginalArg(1) int arg0) {
		super.aByteArray7[super.anInt1168++] = (byte) (this.aClass23_1.method868() + arg0);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[I)V")
	public void method842(@OriginalArg(1) int[] arg0) {
		this.aClass23_1 = new Class23(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "(I)V")
	public void method843() {
		this.anInt1214 = super.anInt1168 * 8;
	}
}
