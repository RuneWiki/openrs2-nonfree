import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class12_Sub8_Sub2 extends Class12_Sub8 {

	@OriginalMember(owner = "client!nj", name = "Eb", descriptor = "Lclient!bb;")
	private Class24 aClass24_1;

	@OriginalMember(owner = "client!nj", name = "Hb", descriptor = "I")
	private int anInt6237;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(I)V")
	public Class12_Sub8_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "(B)I")
	public int method5233() {
		@Pc(27) int local27 = super.aByteArray82[super.anInt6217++] - this.aClass24_1.method556() & 0xFF;
		return local27 < 128 ? local27 : (local27 - 128 << 8) + (super.aByteArray82[super.anInt6217++] - this.aClass24_1.method556() & 0xFF);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([II)V")
	public void method5234(@OriginalArg(0) int[] arg0) {
		this.aClass24_1 = new Class24(arg0);
	}

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "(I)Z")
	public boolean method5235() {
		@Pc(17) int local17 = super.aByteArray82[super.anInt6217] - this.aClass24_1.method555() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(IB)I")
	public int method5236(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt6237;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(ZI)V")
	public void method5237(@OriginalArg(1) int arg0) {
		super.aByteArray82[super.anInt6217++] = (byte) (arg0 + this.aClass24_1.method556());
	}

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "(II)I")
	public int method5238(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = this.anInt6237 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt6237 & 0x7);
		@Pc(25) int local25 = 0;
		this.anInt6237 += arg0;
		while (local23 < arg0) {
			local25 += (Static502.anIntArray670[local23] & super.aByteArray82[local15++]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (local23 == arg0) {
			local25 += Static502.anIntArray670[local23] & super.aByteArray82[local15];
		} else {
			local25 += super.aByteArray82[local15] >> local23 - arg0 & Static502.anIntArray670[arg0];
		}
		return local25;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "([BIII)V")
	public void method5239(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1; local8++) {
			arg0[local8] = (byte) (super.aByteArray82[super.anInt6217++] - this.aClass24_1.method556());
		}
	}

	@OriginalMember(owner = "client!nj", name = "y", descriptor = "(I)V")
	public void method5240() {
		super.anInt6217 = (this.anInt6237 + 7) / 8;
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(Z)V")
	public void method5241() {
		this.anInt6237 = super.anInt6217 * 8;
	}
}
