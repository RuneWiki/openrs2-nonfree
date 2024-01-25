import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class3_Sub7_Sub1 extends Class3_Sub7 {

	@OriginalMember(owner = "client!ck", name = "Cb", descriptor = "Lclient!kg;")
	private Class129 aClass129_1;

	@OriginalMember(owner = "client!ck", name = "Gb", descriptor = "I")
	private int anInt1362;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(B[I)V")
	public void method1054(@OriginalArg(1) int[] arg0) {
		this.aClass129_1 = new Class129(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(IZ)V")
	public void method1057(@OriginalArg(0) int arg0) {
		super.aByteArray46[super.anInt3235++] = (byte) (this.aClass129_1.method3190() + arg0);
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "(IB)I")
	public int method1059(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1362;
	}

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "(I)Z")
	public boolean method1060() {
		@Pc(23) int local23 = super.aByteArray46[super.anInt3235] - this.aClass129_1.method3195() & 0xFF;
		return local23 >= 128;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I[BII)V")
	public void method1061(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (super.aByteArray46[super.anInt3235++] - this.aClass129_1.method3190());
		}
	}

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "(B)I")
	public int method1062() {
		@Pc(22) int local22 = super.aByteArray46[super.anInt3235++] - this.aClass129_1.method3190() & 0xFF;
		return local22 < 128 ? local22 : (local22 - 128 << 8) + (super.aByteArray46[super.anInt3235++] - this.aClass129_1.method3190() & 0xFF);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(BI)I")
	public int method1063(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = this.anInt1362 >> 3;
		@Pc(16) int local16 = 8 - (this.anInt1362 & 0x7);
		this.anInt1362 += arg0;
		@Pc(30) int local30 = 0;
		while (local16 < arg0) {
			local30 += (Static123.anIntArray155[local16] & super.aByteArray46[local8++]) << arg0 - local16;
			arg0 -= local16;
			local16 = 8;
		}
		if (local16 == arg0) {
			local30 += super.aByteArray46[local8] & Static123.anIntArray155[local16];
		} else {
			local30 += super.aByteArray46[local8] >> local16 - arg0 & Static123.anIntArray155[arg0];
		}
		return local30;
	}

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "(I)V")
	public void method1064() {
		this.anInt1362 = super.anInt3235 * 8;
	}

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "(I)V")
	public void method1065() {
		super.anInt3235 = (this.anInt1362 + 7) / 8;
	}
}
