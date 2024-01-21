import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class1_Sub8_Sub1 extends Class1_Sub8 {

	@OriginalMember(owner = "client!oa", name = "Kb", descriptor = "I")
	private int anInt1741;

	@OriginalMember(owner = "client!oa", name = "Qb", descriptor = "Lclient!jb;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I)V")
	public Class1_Sub8_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(I)V")
	public void method1231() {
		super.anInt1692 = (this.anInt1741 + 7) / 8;
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "(II)I")
	public int method1234(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1741;
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "(II)V")
	public void method1236(@OriginalArg(1) int arg0) {
		super.aByteArray24[super.anInt1692++] = (byte) (arg0 + this.aClass34_1.method852());
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z[I)V")
	public void method1237(@OriginalArg(1) int[] arg0) {
		this.aClass34_1 = new Class34(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "(II)I")
	public int method1238(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = this.anInt1741 >> 3;
		@Pc(21) int local21 = 8 - (this.anInt1741 & 0x7);
		this.anInt1741 += arg0;
		@Pc(29) int local29 = 0;
		while (arg0 > local21) {
			local29 += (Static38.anIntArray130[local21] & super.aByteArray24[local13++]) << arg0 - local21;
			arg0 -= local21;
			local21 = 8;
		}
		if (arg0 == local21) {
			local29 += Static38.anIntArray130[local21] & super.aByteArray24[local13];
		} else {
			local29 += super.aByteArray24[local13] >> local21 - arg0 & Static38.anIntArray130[arg0];
		}
		return local29;
	}

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "(I)V")
	public void method1240() {
		this.anInt1741 = super.anInt1692 * 8;
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "(B)I")
	public int method1243() {
		return super.aByteArray24[super.anInt1692++] - this.aClass34_1.method852() & 0xFF;
	}
}
