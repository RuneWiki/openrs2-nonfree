import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class1_Sub6_Sub11 extends Class1_Sub6 {

	@OriginalMember(owner = "client!lt", name = "u", descriptor = "[I")
	public static final int[] anIntArray455 = new int[99];

	@OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
	public int anInt3676;

	@OriginalMember(owner = "client!lt", name = "y", descriptor = "I")
	public int anInt3679;

	@OriginalMember(owner = "client!lt", name = "E", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!lt", name = "I", descriptor = "I")
	public int anInt3686;

	static {
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = 0; local33 < 99; local33++) {
			@Pc(38) int local38 = local33 + 1;
			@Pc(51) int local51 = (int) ((double) local38 + Math.pow(2.0D, (double) local38 / 7.0D) * 300.0D);
			local31 += local51;
			anIntArray455[local33] = local31 / 4;
		}
	}

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(II)V")
	public Class1_Sub6_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong207 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
	public void method2998() {
		super.aLong208 = Static378.method5293() + 500L | super.aLong208 & Long.MIN_VALUE;
		Static301.aClass170_7.method3690(this);
	}

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "(I)I")
	public int method2999() {
		return (int) super.aLong207;
	}

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "(I)J")
	public long method3000() {
		return super.aLong208 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)I")
	public int method3002() {
		return (int) (super.aLong207 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "(I)V")
	public void method3004() {
		super.aLong208 |= Long.MIN_VALUE;
		if ((long) 0 == this.method3000()) {
			Static286.aClass170_6.method3690(this);
		}
	}
}
