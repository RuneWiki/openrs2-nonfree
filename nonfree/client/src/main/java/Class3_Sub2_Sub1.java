import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!cc", name = "ic", descriptor = "Lclient!qa;")
	private Class62 aClass62_1;

	@OriginalMember(owner = "client!cc", name = "rc", descriptor = "I")
	private int anInt430;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "(I)V")
	public void method318() {
		super.anInt413 = (this.anInt430 + 7) / 8;
	}

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "(B)I")
	public int method319() {
		return super.aByteArray7[super.anInt413++] - this.aClass62_1.method1625() & 0xFF;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(Z)V")
	public void method322() {
		this.anInt430 = super.anInt413 * 8;
	}

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "(II)I")
	public int method323(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt430 >> 3;
		@Pc(12) int local12 = 0;
		@Pc(20) int local20 = 8 - (this.anInt430 & 0x7);
		this.anInt430 += arg0;
		while (arg0 > local20) {
			local12 += (super.aByteArray7[local10++] & Static57.anIntArray119[local20]) << arg0 - local20;
			arg0 -= local20;
			local20 = 8;
		}
		if (local20 == arg0) {
			local12 += Static57.anIntArray119[local20] & super.aByteArray7[local10];
		} else {
			local12 += super.aByteArray7[local10] >> local20 - arg0 & Static57.anIntArray119[arg0];
		}
		return local12;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[I)V")
	public void method324(@OriginalArg(1) int[] arg0) {
		this.aClass62_1 = new Class62(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "(II)V")
	public void method325(@OriginalArg(1) int arg0) {
		super.aByteArray7[super.anInt413++] = (byte) (arg0 + this.aClass62_1.method1625());
	}

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "(II)I")
	public int method326(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt430;
	}
}
