import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class1_Sub19_Sub1 extends Class1_Sub19 {

	@OriginalMember(owner = "client!wd", name = "Jb", descriptor = "Lclient!w;")
	private Class81 aClass81_1;

	@OriginalMember(owner = "client!wd", name = "Nb", descriptor = "I")
	private int anInt3155;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class1_Sub19_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(Z)V")
	public void method2095() {
		super.anInt3111 = (this.anInt3155 + 7) / 8;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(ZI)I")
	public int method2096(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt3155 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt3155 & 0x7);
		this.anInt3155 += arg0;
		@Pc(31) int local31 = 0;
		while (arg0 > local23) {
			local31 += (super.aByteArray42[local10++] & Static5.anIntArray28[local23]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (arg0 == local23) {
			local31 += Static5.anIntArray28[local23] & super.aByteArray42[local10];
		} else {
			local31 += super.aByteArray42[local10] >> local23 - arg0 & Static5.anIntArray28[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "(I)I")
	public int method2100() {
		return super.aByteArray42[super.anInt3111++] - this.aClass81_1.method1990() & 0xFF;
	}

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "(I)V")
	public void method2102() {
		this.anInt3155 = super.anInt3111 * 8;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B[I)V")
	public void method2103(@OriginalArg(1) int[] arg0) {
		this.aClass81_1 = new Class81(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(IB)I")
	public int method2104(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3155;
	}

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "(II)V")
	public void method2105(@OriginalArg(0) int arg0) {
		super.aByteArray42[super.anInt3111++] = (byte) (this.aClass81_1.method1990() + arg0);
	}
}
