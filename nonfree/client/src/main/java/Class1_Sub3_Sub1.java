import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ap", name = "fc", descriptor = "Lclient!tv;")
	private Class245 aClass245_1;

	@OriginalMember(owner = "client!ap", name = "mc", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(I)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([II)V")
	public void method314(@OriginalArg(0) int[] arg0) {
		this.aClass245_1 = new Class245(arg0);
	}

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "(I)V")
	public void method315() {
		super.anInt1710 = (this.anInt385 + 7) / 8;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[BII)V")
	public void method316(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			arg0[local5] = (byte) (super.aByteArray14[super.anInt1710++] - this.aClass245_1.method5481());
		}
	}

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "(B)Z")
	public boolean method317() {
		@Pc(22) int local22 = super.aByteArray14[super.anInt1710] - this.aClass245_1.method5478() & 0xFF;
		return local22 >= 128;
	}

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "(II)I")
	public int method318(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt385;
	}

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "(I)I")
	public int method319() {
		@Pc(27) int local27 = super.aByteArray14[super.anInt1710++] - this.aClass245_1.method5481() & 0xFF;
		return local27 < 128 ? local27 : (super.aByteArray14[super.anInt1710++] - this.aClass245_1.method5481() & 0xFF) + (local27 - 128 << 8);
	}

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "(B)V")
	public void method320() {
		this.anInt385 = super.anInt1710 * 8;
	}

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "(II)I")
	public int method321(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = this.anInt385 >> 3;
		@Pc(25) int local25 = 8 - (this.anInt385 & 0x7);
		this.anInt385 += arg0;
		@Pc(33) int local33 = 0;
		while (local25 < arg0) {
			local33 += (super.aByteArray14[local17++] & Static271.anIntArray495[local25]) << arg0 - local25;
			arg0 -= local25;
			local25 = 8;
		}
		if (arg0 == local25) {
			local33 += super.aByteArray14[local17] & Static271.anIntArray495[local25];
		} else {
			local33 += super.aByteArray14[local17] >> local25 - arg0 & Static271.anIntArray495[arg0];
		}
		return local33;
	}

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "(II)V")
	public void method322(@OriginalArg(0) int arg0) {
		super.aByteArray14[super.anInt1710++] = (byte) (this.aClass245_1.method5481() + arg0);
	}
}
