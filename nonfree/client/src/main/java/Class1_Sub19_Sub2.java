import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class1_Sub19_Sub2 extends Class1_Sub19 {

	@OriginalMember(owner = "client!jp", name = "Pb", descriptor = "Lclient!oo;")
	private Class188 aClass188_1;

	@OriginalMember(owner = "client!jp", name = "Rb", descriptor = "I")
	private int anInt3759;

	static {
		new Class142("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(I)V")
	public Class1_Sub19_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "(Z)V")
	public void method2940() {
		super.anInt3698 = (this.anInt3759 + 7) / 8;
	}

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "(I)V")
	public void method2941() {
		this.anInt3759 = super.anInt3698 * 8;
	}

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "(B)Z")
	public boolean method2942() {
		@Pc(17) int local17 = super.aByteArray38[super.anInt3698] - this.aClass188_1.method4065() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "(I)I")
	public int method2944() {
		@Pc(24) int local24 = super.aByteArray38[super.anInt3698++] - this.aClass188_1.method4071() & 0xFF;
		return local24 < 128 ? local24 : (super.aByteArray38[super.anInt3698++] - this.aClass188_1.method4071() & 0xFF) + (local24 - 128 << 8);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "([IZ)V")
	public void method2945(@OriginalArg(0) int[] arg0) {
		this.aClass188_1 = new Class188(arg0);
	}

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "(II)I")
	public int method2946(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt3759 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt3759 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt3759 += arg0;
		while (local18 < arg0) {
			local20 += (Static347.anIntArray407[local18] & super.aByteArray38[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local20 += super.aByteArray38[local10] & Static347.anIntArray407[local18];
		} else {
			local20 += super.aByteArray38[local10] >> local18 - arg0 & Static347.anIntArray407[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "([BIII)V")
	public void method2947(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			arg0[local10] = (byte) (super.aByteArray38[super.anInt3698++] - this.aClass188_1.method4071());
		}
	}

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "(II)I")
	public int method2948(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt3759;
	}

	@OriginalMember(owner = "client!jp", name = "r", descriptor = "(II)V")
	public void method2949(@OriginalArg(1) int arg0) {
		super.aByteArray38[super.anInt3698++] = (byte) (arg0 + this.aClass188_1.method4071());
	}
}
