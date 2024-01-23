import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class1_Sub9_Sub1 extends Class1_Sub9 {

	@OriginalMember(owner = "client!eg", name = "Xb", descriptor = "I")
	private int anInt1227;

	@OriginalMember(owner = "client!eg", name = "gc", descriptor = "Lclient!te;")
	private Class96 aClass96_1;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I)V")
	public Class1_Sub9_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "(B)V")
	public void method948() {
		this.anInt1227 = super.anInt1192 * 8;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(IB)I")
	public int method949(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt1227 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt1227 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt1227 += arg0;
		while (local18 < arg0) {
			local20 += (Static151.anIntArray440[local18] & super.aByteArray20[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local20 += super.aByteArray20[local10] & Static151.anIntArray440[local18];
		} else {
			local20 += super.aByteArray20[local10] >> local18 - arg0 & Static151.anIntArray440[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "(I)V")
	public void method950() {
		super.anInt1192 = (this.anInt1227 + 7) / 8;
	}

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "(II)I")
	public int method951(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1227;
	}

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "(II)V")
	public void method953(@OriginalArg(0) int arg0) {
		super.aByteArray20[super.anInt1192++] = (byte) (arg0 + this.aClass96_1.method2985());
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([IB)V")
	public void method955(@OriginalArg(0) int[] arg0) {
		this.aClass96_1 = new Class96(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B[BII)V")
	public void method956(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (super.aByteArray20[super.anInt1192++] - this.aClass96_1.method2985());
		}
	}

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "(I)I")
	public int method957() {
		return super.aByteArray20[super.anInt1192++] - this.aClass96_1.method2985() & 0xFF;
	}
}
