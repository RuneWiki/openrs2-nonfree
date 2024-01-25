import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class1_Sub5_Sub11 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ja", name = "G", descriptor = "[I")
	public static final int[] anIntArray206;

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
	public int anInt3209;

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
	public int anInt3212;

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
	public int anInt3213;

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "Ljava/lang/String;")
	public String aString38;

	static {
		new Class119("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
		anIntArray206 = new int[99];
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 0; local32 < 99; local32++) {
			@Pc(37) int local37 = local32 + 1;
			@Pc(50) int local50 = (int) (Math.pow(2.0D, (double) local37 / 7.0D) * 300.0D + (double) local37);
			local30 += local50;
			anIntArray206[local32] = local30 / 4;
		}
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(II)V")
	public Class1_Sub5_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong230 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)V")
	public void method2661() {
		super.aLong211 |= Long.MIN_VALUE;
		if (this.method2666() == 0L) {
			Static132.aClass225_2.method4943(this);
		}
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)I")
	public int method2663() {
		return (int) super.aLong230;
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)I")
	public int method2664() {
		return (int) (super.aLong230 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)J")
	public long method2666() {
		return Long.MAX_VALUE & super.aLong211;
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)V")
	public void method2667() {
		super.aLong211 = Static27.method359() + 500L | super.aLong211 & Long.MIN_VALUE;
		Static444.aClass225_10.method4943(this);
	}
}
