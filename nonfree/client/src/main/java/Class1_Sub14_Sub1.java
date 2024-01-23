import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class1_Sub14_Sub1 extends Class1_Sub14 {

	@OriginalMember(owner = "client!en", name = "Fb", descriptor = "I")
	private int anInt1482;

	@OriginalMember(owner = "client!en", name = "Kb", descriptor = "Lclient!ij;")
	private Class77 aClass77_1;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(I)V")
	public Class1_Sub14_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B[I)V")
	public void method1404(@OriginalArg(1) int[] arg0) {
		this.aClass77_1 = new Class77(arg0);
	}

	@OriginalMember(owner = "client!en", name = "s", descriptor = "(I)V")
	public void method1405() {
		this.anInt1482 = this.anInt1480 * 8;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III[B)V")
	public void method1406(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (this.aByteArray17[this.anInt1480++] - this.aClass77_1.method2142());
		}
	}

	@OriginalMember(owner = "client!en", name = "t", descriptor = "(I)V")
	public void method1407() {
		this.anInt1480 = (this.anInt1482 + 7) / 8;
	}

	@OriginalMember(owner = "client!en", name = "o", descriptor = "(II)V")
	public void method1408(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 + this.aClass77_1.method2142());
	}

	@OriginalMember(owner = "client!en", name = "i", descriptor = "(Z)I")
	public int method1410() {
		return this.aByteArray17[this.anInt1480++] - this.aClass77_1.method2142() & 0xFF;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(IZ)I")
	public int method1411(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt1482 >> 3;
		@Pc(26) int local26 = 8 - (this.anInt1482 & 0x7);
		@Pc(28) int local28 = 0;
		this.anInt1482 += arg0;
		while (local26 < arg0) {
			local28 += (Static113.anIntArray205[local26] & this.aByteArray17[local6++]) << arg0 - local26;
			arg0 -= local26;
			local26 = 8;
		}
		if (arg0 == local26) {
			local28 += this.aByteArray17[local6] & Static113.anIntArray205[local26];
		} else {
			local28 += this.aByteArray17[local6] >> local26 - arg0 & Static113.anIntArray205[arg0];
		}
		return local28;
	}

	@OriginalMember(owner = "client!en", name = "p", descriptor = "(II)I")
	public int method1412(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1482;
	}
}
