import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class3_Sub26_Sub1 extends Class3_Sub26 {

	@OriginalMember(owner = "client!oo", name = "Nb", descriptor = "I")
	private int anInt6947;

	@OriginalMember(owner = "client!oo", name = "Ub", descriptor = "Lclient!wba;")
	private Class353 aClass353_1;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(I)V")
	public Class3_Sub26_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "(B)V")
	public void method5547() {
		super.anInt8703 = (this.anInt6947 + 7) / 8;
	}

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "(B)I")
	public int method5548() {
		@Pc(34) int local34 = super.aByteArray213[super.anInt8703++] - this.aClass353_1.method7853() & 0xFF;
		return local34 < 128 ? local34 : (local34 - 128 << 8) + (super.aByteArray213[super.anInt8703++] - this.aClass353_1.method7853() & 0xFF);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLclient!wba;)V")
	public void method5550(@OriginalArg(1) Class353 arg0) {
		this.aClass353_1 = arg0;
	}

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "(IB)I")
	public int method5551(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt6947;
	}

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "(II)I")
	public int method5553(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt6947 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt6947 & 0x7);
		this.anInt6947 += arg0;
		@Pc(26) int local26 = 0;
		while (arg0 > local18) {
			local26 += (Static39.anIntArray29[local18] & super.aByteArray213[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local26 += super.aByteArray213[local10] & Static39.anIntArray29[local18];
		} else {
			local26 += super.aByteArray213[local10] >> local18 - arg0 & Static39.anIntArray29[arg0];
		}
		return local26;
	}

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "(Z)V")
	public void method5554() {
		this.anInt6947 = super.anInt8703 * 8;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "([BIII)V")
	public void method5555(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray213[super.anInt8703++] - this.aClass353_1.method7853());
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B[I)V")
	public void method5556(@OriginalArg(1) int[] arg0) {
		this.aClass353_1 = new Class353(arg0);
	}

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "(B)Z")
	public boolean method5557() {
		@Pc(16) int local16 = super.aByteArray213[super.anInt8703] - this.aClass353_1.method7850() & 0xFF;
		return local16 >= 128;
	}

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(BI)V")
	public void method5558(@OriginalArg(1) int arg0) {
		super.aByteArray213[super.anInt8703++] = (byte) (this.aClass353_1.method7853() + arg0);
	}
}
