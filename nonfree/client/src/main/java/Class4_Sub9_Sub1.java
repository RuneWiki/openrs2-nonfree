import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class4_Sub9_Sub1 extends Class4_Sub9 {

	@OriginalMember(owner = "client!cea", name = "Wb", descriptor = "I")
	private int anInt1146;

	@OriginalMember(owner = "client!cea", name = "Yb", descriptor = "Lclient!tb;")
	private Class309 aClass309_1;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(I)V")
	public Class4_Sub9_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cea", name = "u", descriptor = "(I)V")
	public void method1036() {
		super.anInt7219 = (this.anInt1146 + 7) / 8;
	}

	@OriginalMember(owner = "client!cea", name = "r", descriptor = "(B)Z")
	public boolean method1037() {
		@Pc(21) int local21 = super.aByteArray97[super.anInt7219] - this.aClass309_1.method7073() & 0xFF;
		return local21 >= 128;
	}

	@OriginalMember(owner = "client!cea", name = "o", descriptor = "(II)V")
	public void method1038(@OriginalArg(1) int arg0) {
		super.aByteArray97[super.anInt7219++] = (byte) (arg0 + this.aClass309_1.method7067());
	}

	@OriginalMember(owner = "client!cea", name = "v", descriptor = "(I)V")
	public void method1039() {
		this.anInt1146 = super.anInt7219 * 8;
	}

	@OriginalMember(owner = "client!cea", name = "w", descriptor = "(I)I")
	public int method1042() {
		@Pc(26) int local26 = super.aByteArray97[super.anInt7219++] - this.aClass309_1.method7067() & 0xFF;
		return local26 < 128 ? local26 : (local26 - 128 << 8) + (super.aByteArray97[super.anInt7219++] - this.aClass309_1.method7067() & 0xFF);
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(IB)I")
	public int method1043(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1146;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(BI[BI)V")
	public void method1044(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0; local5++) {
			arg1[local5] = (byte) (super.aByteArray97[super.anInt7219++] - this.aClass309_1.method7067());
		}
	}

	@OriginalMember(owner = "client!cea", name = "p", descriptor = "(II)I")
	public int method1046(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt1146 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt1146 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt1146 += arg0;
		while (arg0 > local18) {
			local20 += (Static90.anIntArray225[local18] & super.aByteArray97[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local20 += Static90.anIntArray225[local18] & super.aByteArray97[local10];
		} else {
			local20 += super.aByteArray97[local10] >> local18 - arg0 & Static90.anIntArray225[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!tb;Z)V")
	public void method1048(@OriginalArg(0) Class309 arg0) {
		this.aClass309_1 = arg0;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I[I)V")
	public void method1049(@OriginalArg(1) int[] arg0) {
		this.aClass309_1 = new Class309(arg0);
	}
}
