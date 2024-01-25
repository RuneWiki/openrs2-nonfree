import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class2_Sub16_Sub2 extends Class2_Sub16 {

	@OriginalMember(owner = "client!vh", name = "Ob", descriptor = "I")
	private int anInt6180;

	@OriginalMember(owner = "client!vh", name = "Qb", descriptor = "Lclient!oh;")
	private Class178 aClass178_1;

	static {
		new Class32("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(I)V")
	public Class2_Sub16_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([II)V")
	public void method5376(@OriginalArg(0) int[] arg0) {
		this.aClass178_1 = new Class178(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([BIII)V")
	public void method5377(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			arg0[local12] = (byte) (super.aByteArray112[super.anInt6145++] - this.aClass178_1.method3918());
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(Z)V")
	public void method5378() {
		this.anInt6180 = super.anInt6145 * 8;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)I")
	public int method5380(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt6180 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt6180 & 0x7);
		@Pc(19) int local19 = 0;
		this.anInt6180 += arg0;
		while (local17 < arg0) {
			local19 += (Static160.anIntArray614[local17] & super.aByteArray112[local10++]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (local17 == arg0) {
			local19 += super.aByteArray112[local10] & Static160.anIntArray614[local17];
		} else {
			local19 += super.aByteArray112[local10] >> local17 - arg0 & Static160.anIntArray614[arg0];
		}
		return local19;
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(BI)V")
	public void method5381(@OriginalArg(1) int arg0) {
		super.aByteArray112[super.anInt6145++] = (byte) (this.aClass178_1.method3918() + arg0);
	}

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "(B)V")
	public void method5383() {
		super.anInt6145 = (this.anInt6180 + 7) / 8;
	}

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(IB)I")
	public int method5384(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt6180;
	}

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "(I)Z")
	public boolean method5385() {
		@Pc(16) int local16 = super.aByteArray112[super.anInt6145] - this.aClass178_1.method3919() & 0xFF;
		return local16 >= 128;
	}

	@OriginalMember(owner = "client!vh", name = "A", descriptor = "(I)I")
	public int method5388() {
		@Pc(30) int local30 = super.aByteArray112[super.anInt6145++] - this.aClass178_1.method3918() & 0xFF;
		return local30 < 128 ? local30 : (super.aByteArray112[super.anInt6145++] - this.aClass178_1.method3918() & 0xFF) + (local30 - 128 << 8);
	}
}
