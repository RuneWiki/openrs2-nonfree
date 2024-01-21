import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ee", name = "Ob", descriptor = "Lclient!ja;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!ee", name = "Ub", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I)V")
	public Class1_Sub5_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([II)V")
	public void method683(@OriginalArg(0) int[] arg0) {
		this.aClass39_1 = new Class39(arg0);
	}

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "(B)V")
	public void method685() {
		this.anInt818 = super.anInt792 * 8;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(IB)I")
	public int method687(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt818;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(BI)V")
	public void method688(@OriginalArg(1) int arg0) {
		super.aByteArray13[super.anInt792++] = (byte) (arg0 + this.aClass39_1.method1029());
	}

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "(B)I")
	public int method689() {
		return super.aByteArray13[super.anInt792++] - this.aClass39_1.method1029() & 0xFF;
	}

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "(B)V")
	public void method690() {
		super.anInt792 = (this.anInt818 + 7) / 8;
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(IB)I")
	public int method691(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = this.anInt818 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt818 & 0x7);
		this.anInt818 += arg0;
		@Pc(31) int local31 = 0;
		while (local23 < arg0) {
			local31 += (super.aByteArray13[local15++] & Static14.anIntArray77[local23]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (local23 == arg0) {
			local31 += Static14.anIntArray77[local23] & super.aByteArray13[local15];
		} else {
			local31 += super.aByteArray13[local15] >> local23 - arg0 & Static14.anIntArray77[arg0];
		}
		return local31;
	}
}
