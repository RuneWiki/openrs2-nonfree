import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class1_Sub6_Sub1 extends Class1_Sub6 {

	@OriginalMember(owner = "client!d", name = "bc", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!d", name = "dc", descriptor = "Lclient!ba;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V")
	public Class1_Sub6_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!d", name = "u", descriptor = "(I)I")
	public int method552() {
		return super.aByteArray3[super.anInt839++] - this.aClass5_1.method176() & 0xFF;
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(Z)V")
	public void method554() {
		super.anInt839 = (this.anInt868 + 7) / 8;
	}

	@OriginalMember(owner = "client!d", name = "j", descriptor = "(II)V")
	public void method555(@OriginalArg(1) int arg0) {
		super.aByteArray3[super.anInt839++] = (byte) (arg0 + this.aClass5_1.method176());
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z[I)V")
	public void method556(@OriginalArg(1) int[] arg0) {
		this.aClass5_1 = new Class5(arg0);
	}

	@OriginalMember(owner = "client!d", name = "k", descriptor = "(II)I")
	public int method557(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt868;
	}

	@OriginalMember(owner = "client!d", name = "g", descriptor = "(Z)V")
	public void method559() {
		this.anInt868 = super.anInt839 * 8;
	}

	@OriginalMember(owner = "client!d", name = "m", descriptor = "(II)I")
	public int method562(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = this.anInt868 >> 3;
		@Pc(17) int local17 = 0;
		@Pc(25) int local25 = 8 - (this.anInt868 & 0x7);
		this.anInt868 += arg0;
		while (arg0 > local25) {
			local17 += (super.aByteArray3[local15++] & Static102.anIntArray269[local25]) << arg0 - local25;
			arg0 -= local25;
			local25 = 8;
		}
		if (local25 == arg0) {
			local17 += super.aByteArray3[local15] & Static102.anIntArray269[local25];
		} else {
			local17 += super.aByteArray3[local15] >> local25 - arg0 & Static102.anIntArray269[arg0];
		}
		return local17;
	}
}
