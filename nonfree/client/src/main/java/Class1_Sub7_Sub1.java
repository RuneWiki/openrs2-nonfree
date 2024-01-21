import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class1_Sub7_Sub1 extends Class1_Sub7 {

	@OriginalMember(owner = "client!rh", name = "Gb", descriptor = "Lclient!ta;")
	private Class90 aClass90_1;

	@OriginalMember(owner = "client!rh", name = "Kb", descriptor = "I")
	private int anInt3656;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I)V")
	public Class1_Sub7_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "(I)I")
	public int method2802() {
		return super.aByteArray38[super.anInt3592++] - this.aClass90_1.method3025() & 0xFF;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([BBII)V")
	public void method2803(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray38[super.anInt3592++] - this.aClass90_1.method3025());
		}
	}

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "(B)V")
	public void method2804() {
		super.anInt3592 = (this.anInt3656 + 7) / 8;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)I")
	public int method2807(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt3656;
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(IB)V")
	public void method2808(@OriginalArg(0) int arg0) {
		super.aByteArray38[super.anInt3592++] = (byte) (arg0 + this.aClass90_1.method3025());
	}

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "(I)V")
	public void method2809() {
		this.anInt3656 = super.anInt3592 * 8;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([IB)V")
	public void method2810(@OriginalArg(0) int[] arg0) {
		this.aClass90_1 = new Class90(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "(II)I")
	public int method2811(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = 8 - (this.anInt3656 & 0x7);
		@Pc(18) int local18 = 0;
		@Pc(23) int local23 = this.anInt3656 >> 3;
		this.anInt3656 += arg0;
		while (local16 < arg0) {
			local18 += (Static118.anIntArray210[local16] & super.aByteArray38[local23++]) << arg0 - local16;
			arg0 -= local16;
			local16 = 8;
		}
		if (arg0 == local16) {
			local18 += Static118.anIntArray210[local16] & super.aByteArray38[local23];
		} else {
			local18 += super.aByteArray38[local23] >> local16 - arg0 & Static118.anIntArray210[arg0];
		}
		return local18;
	}
}
