import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class1_Sub7_Sub1 extends Class1_Sub7 {

	@OriginalMember(owner = "client!bh", name = "Kb", descriptor = "Lclient!p;")
	private Class151 aClass151_1;

	@OriginalMember(owner = "client!bh", name = "Ob", descriptor = "I")
	private int anInt676;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(I)V")
	public Class1_Sub7_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(IZ)I")
	public int method726(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt676;
	}

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "(I)V")
	public void method727() {
		super.anInt3368 = (this.anInt676 + 7) / 8;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)V")
	public void method728(@OriginalArg(1) int arg0) {
		super.aByteArray58[super.anInt3368++] = (byte) (this.aClass151_1.method4159() + arg0);
	}

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "(I)V")
	public void method729() {
		this.anInt676 = super.anInt3368 * 8;
	}

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "(B)I")
	public int method730() {
		return super.aByteArray58[super.anInt3368++] - this.aClass151_1.method4159() & 0xFF;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[I)V")
	public void method731(@OriginalArg(1) int[] arg0) {
		this.aClass151_1 = new Class151(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "(II)I")
	public int method733(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = this.anInt676 >> 3;
		@Pc(24) int local24 = 8 - (this.anInt676 & 0x7);
		this.anInt676 += arg0;
		@Pc(32) int local32 = 0;
		while (local24 < arg0) {
			local32 += (Static73.anIntArray170[local24] & super.aByteArray58[local17++]) << arg0 - local24;
			arg0 -= local24;
			local24 = 8;
		}
		if (local24 == arg0) {
			local32 += super.aByteArray58[local17] & Static73.anIntArray170[local24];
		} else {
			local32 += super.aByteArray58[local17] >> local24 - arg0 & Static73.anIntArray170[arg0];
		}
		return local32;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIB[B)V")
	public void method739(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
			arg1[local15] = (byte) (super.aByteArray58[super.anInt3368++] - this.aClass151_1.method4159());
		}
	}
}
