import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class5_Sub22_Sub1 extends Class5_Sub22 {

	@OriginalMember(owner = "client!gba", name = "Eb", descriptor = "Lclient!np;")
	private Class251 aClass251_1;

	@OriginalMember(owner = "client!gba", name = "Gb", descriptor = "I")
	private int anInt3033;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(I)V")
	public Class5_Sub22_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gba", name = "z", descriptor = "(I)Z")
	public boolean method2647() {
		@Pc(17) int local17 = super.aByteArray71[super.anInt6629] - this.aClass251_1.method5561() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "([BIIB)V")
	public void method2648(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray71[super.anInt6629++] - this.aClass251_1.method5562());
		}
	}

	@OriginalMember(owner = "client!gba", name = "n", descriptor = "(II)I")
	public int method2649(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3033;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(B[I)V")
	public void method2652(@OriginalArg(1) int[] arg0) {
		this.aClass251_1 = new Class251(arg0);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILclient!np;)V")
	public void method2653(@OriginalArg(1) Class251 arg0) {
		this.aClass251_1 = arg0;
	}

	@OriginalMember(owner = "client!gba", name = "o", descriptor = "(II)I")
	public int method2655(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = this.anInt3033 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt3033 & 0x7);
		this.anInt3033 += arg0;
		@Pc(31) int local31 = 0;
		while (local23 < arg0) {
			local31 += (Static633.anIntArray598[local23] & super.aByteArray71[local15++]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (arg0 == local23) {
			local31 += Static633.anIntArray598[local23] & super.aByteArray71[local15];
		} else {
			local31 += super.aByteArray71[local15] >> local23 - arg0 & Static633.anIntArray598[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!gba", name = "p", descriptor = "(II)V")
	public void method2656(@OriginalArg(0) int arg0) {
		super.aByteArray71[super.anInt6629++] = (byte) (this.aClass251_1.method5562() + arg0);
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(Z)I")
	public int method2657() {
		@Pc(22) int local22 = super.aByteArray71[super.anInt6629++] - this.aClass251_1.method5562() & 0xFF;
		return local22 < 128 ? local22 : (super.aByteArray71[super.anInt6629++] - this.aClass251_1.method5562() & 0xFF) + (local22 - 128 << 8);
	}

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "(Z)V")
	public void method2658() {
		this.anInt3033 = super.anInt6629 * 8;
	}

	@OriginalMember(owner = "client!gba", name = "n", descriptor = "(B)V")
	public void method2659() {
		super.anInt6629 = (this.anInt3033 + 7) / 8;
	}
}
