import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class2_Sub18_Sub1 extends Class2_Sub18 {

	@OriginalMember(owner = "client!rg", name = "Ob", descriptor = "I")
	private int anInt3450;

	@OriginalMember(owner = "client!rg", name = "Tb", descriptor = "Lclient!le;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
	public Class2_Sub18_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(IB)V")
	public void method2398(@OriginalArg(0) int arg0) {
		super.aByteArray39[super.anInt3423++] = (byte) (this.aClass47_1.method1673() + arg0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[I)V")
	public void method2400(@OriginalArg(1) int[] arg0) {
		this.aClass47_1 = new Class47(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "(II)I")
	public int method2401(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt3450;
	}

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "(I)V")
	public void method2403() {
		super.anInt3423 = (this.anInt3450 + 7) / 8;
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(IB)I")
	public int method2405(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt3450 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt3450 & 0x7);
		this.anInt3450 += arg0;
		@Pc(23) int local23 = 0;
		while (arg0 > local15) {
			local23 += (Static107.anIntArray416[local15] & super.aByteArray39[local8++]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (arg0 == local15) {
			local23 += super.aByteArray39[local8] & Static107.anIntArray416[local15];
		} else {
			local23 += super.aByteArray39[local8] >> local15 - arg0 & Static107.anIntArray416[arg0];
		}
		return local23;
	}

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "(I)I")
	public int method2406() {
		return super.aByteArray39[super.anInt3423++] - this.aClass47_1.method1673() & 0xFF;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(Z)V")
	public void method2407() {
		this.anInt3450 = super.anInt3423 * 8;
	}
}
