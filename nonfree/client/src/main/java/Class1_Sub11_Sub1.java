import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class1_Sub11_Sub1 extends Class1_Sub11 {

	@OriginalMember(owner = "client!mv", name = "Nb", descriptor = "I")
	private int anInt4178;

	@OriginalMember(owner = "client!mv", name = "Qb", descriptor = "Lclient!dc;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(I)V")
	public Class1_Sub11_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mv", name = "q", descriptor = "(II)V")
	public void method3343(@OriginalArg(1) int arg0) {
		super.aByteArray64[super.anInt5766++] = (byte) (this.aClass47_1.method990() + arg0);
	}

	@OriginalMember(owner = "client!mv", name = "r", descriptor = "(II)I")
	public int method3344(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt4178;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I[BIZ)V")
	public void method3346(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray64[super.anInt5766++] - this.aClass47_1.method990());
		}
	}

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "(BI)I")
	public int method3347(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = this.anInt4178 >> 3;
		@Pc(26) int local26 = 8 - (this.anInt4178 & 0x7);
		this.anInt4178 += arg0;
		@Pc(34) int local34 = 0;
		while (arg0 > local26) {
			local34 += (Static258.anIntArray221[local26] & super.aByteArray64[local18++]) << arg0 - local26;
			arg0 -= local26;
			local26 = 8;
		}
		if (local26 == arg0) {
			local34 += Static258.anIntArray221[local26] & super.aByteArray64[local18];
		} else {
			local34 += super.aByteArray64[local18] >> local26 - arg0 & Static258.anIntArray221[arg0];
		}
		return local34;
	}

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "(Z)V")
	public void method3348() {
		super.anInt5766 = (this.anInt4178 + 7) / 8;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "([II)V")
	public void method3349(@OriginalArg(0) int[] arg0) {
		this.aClass47_1 = new Class47(arg0);
	}

	@OriginalMember(owner = "client!mv", name = "o", descriptor = "(B)I")
	public int method3350() {
		@Pc(26) int local26 = super.aByteArray64[super.anInt5766++] - this.aClass47_1.method990() & 0xFF;
		return local26 < 128 ? local26 : (local26 - 128 << 8) + (super.aByteArray64[super.anInt5766++] - this.aClass47_1.method990() & 0xFF);
	}

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "(Z)Z")
	public boolean method3351() {
		@Pc(17) int local17 = super.aByteArray64[super.anInt5766] - this.aClass47_1.method994() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!mv", name = "t", descriptor = "(I)V")
	public void method3352() {
		this.anInt4178 = super.anInt5766 * 8;
	}
}
