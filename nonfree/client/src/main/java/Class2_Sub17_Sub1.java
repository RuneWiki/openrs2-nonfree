import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class2_Sub17_Sub1 extends Class2_Sub17 {

	@OriginalMember(owner = "client!tq", name = "Cb", descriptor = "Lclient!ei;")
	private Class68 aClass68_1;

	@OriginalMember(owner = "client!tq", name = "Ob", descriptor = "I")
	private int anInt6961;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(I)V")
	public Class2_Sub17_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "(II)V")
	public void method5576(@OriginalArg(0) int arg0) {
		super.aByteArray94[super.anInt7523++] = (byte) (this.aClass68_1.method1403() + arg0);
	}

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "(II)I")
	public int method5577(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = this.anInt6961 >> 3;
		@Pc(21) int local21 = 8 - (this.anInt6961 & 0x7);
		this.anInt6961 += arg0;
		@Pc(29) int local29 = 0;
		while (arg0 > local21) {
			local29 += (Static103.anIntArray457[local21] & super.aByteArray94[local8++]) << arg0 - local21;
			arg0 -= local21;
			local21 = 8;
		}
		if (local21 == arg0) {
			local29 += super.aByteArray94[local8] & Static103.anIntArray457[local21];
		} else {
			local29 += super.aByteArray94[local8] >> local21 - arg0 & Static103.anIntArray457[arg0];
		}
		return local29;
	}

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "(B)I")
	public int method5578() {
		@Pc(26) int local26 = super.aByteArray94[super.anInt7523++] - this.aClass68_1.method1403() & 0xFF;
		return local26 < 128 ? local26 : (local26 - 128 << 8) + (super.aByteArray94[super.anInt7523++] - this.aClass68_1.method1403() & 0xFF);
	}

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "(B)V")
	public void method5579() {
		super.anInt7523 = (this.anInt6961 + 7) / 8;
	}

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "(II)I")
	public int method5581(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt6961;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II[BI)V")
	public void method5582(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (super.aByteArray94[super.anInt7523++] - this.aClass68_1.method1403());
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[I)V")
	public void method5584(@OriginalArg(1) int[] arg0) {
		this.aClass68_1 = new Class68(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "(B)V")
	public void method5585() {
		this.anInt6961 = super.anInt7523 * 8;
	}

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "(B)Z")
	public boolean method5586() {
		@Pc(22) int local22 = super.aByteArray94[super.anInt7523] - this.aClass68_1.method1405() & 0xFF;
		return local22 >= 128;
	}
}
