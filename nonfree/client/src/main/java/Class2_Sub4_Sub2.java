import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class2_Sub4_Sub2 extends Class2_Sub4 {

	@OriginalMember(owner = "client!qg", name = "Kb", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_112 = new Class79(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!qg", name = "Mb", descriptor = "I")
	private int anInt5328;

	@OriginalMember(owner = "client!qg", name = "Qb", descriptor = "Lclient!sq;")
	private Class217 aClass217_1;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(I)V", line = 139)
	public Class2_Sub4_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "(I)I", line = 6)
	public int method4865() {
		@Pc(22) int local22 = super.aByteArray73[super.anInt5289++] - this.aClass217_1.method5535() & 0xFF;
		return local22 < 128 ? local22 : (super.aByteArray73[super.anInt5289++] - this.aClass217_1.method5535() & 0xFF) + (local22 - 128 << 8);
	}

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "(B)V", line = 26)
	public void method4866() {
		super.anInt5289 = (this.anInt5328 + 7) / 8;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "([BIII)V", line = 38)
	public void method4867(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			arg0[local12] = (byte) (super.aByteArray73[super.anInt5289++] - this.aClass217_1.method5535());
		}
	}

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "(II)V", line = 55)
	public void method4868(@OriginalArg(0) int arg0) {
		super.aByteArray73[super.anInt5289++] = (byte) (this.aClass217_1.method5535() + arg0);
	}

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "(BI)I", line = 71)
	public int method4869(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt5328 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt5328 & 0x7);
		this.anInt5328 += arg0;
		@Pc(32) int local32 = 0;
		while (local17 < arg0) {
			local32 += (super.aByteArray73[local10++] & Class28.anIntArray39[local17]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (arg0 == local17) {
			local32 += Class28.anIntArray39[local17] & super.aByteArray73[local10];
		} else {
			local32 += super.aByteArray73[local10] >> local17 - arg0 & Class28.anIntArray39[arg0];
		}
		return local32;
	}

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "(I)V", line = 102)
	public void method4870() {
		this.anInt5328 = super.anInt5289 * 8;
	}

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "(B)Z", line = 122)
	public boolean method4871() {
		@Pc(17) int local17 = super.aByteArray73[super.anInt5289] - this.aClass217_1.method5534() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([IB)V", line = 147)
	public void method4872(@OriginalArg(0) int[] arg0) {
		this.aClass217_1 = new Class217(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "(BI)I", line = 171)
	public int method4874(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt5328;
	}
}
