import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class4_Sub1_Sub6 extends Class4_Sub1 {

	@OriginalMember(owner = "client!cp", name = "L", descriptor = "[B")
	public static final byte[] aByteArray12;

	@OriginalMember(owner = "client!cp", name = "z", descriptor = "I")
	public int anInt1561;

	@OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
	public int anInt1562;

	@OriginalMember(owner = "client!cp", name = "C", descriptor = "I")
	public int anInt1563;

	@OriginalMember(owner = "client!cp", name = "D", descriptor = "I")
	public int anInt1564;

	@OriginalMember(owner = "client!cp", name = "I", descriptor = "I")
	public int anInt1567;

	@OriginalMember(owner = "client!cp", name = "F", descriptor = "Lclient!il;")
	public final Class120 aClass120_1;

	@OriginalMember(owner = "client!cp", name = "E", descriptor = "Lclient!mb;")
	public final Class153 aClass153_1;

	static {
		@Pc(3) int local3 = 0;
		aByteArray12 = new byte[32896];
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			for (@Pc(11) int local11 = 0; local11 <= local8; local11++) {
				aByteArray12[local3++] = (byte) (255.0D / Math.sqrt((double) ((float) (local8 * local8 + local11 * local11 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!il;Lclient!li;)V")
	public Class4_Sub1_Sub6(@OriginalArg(0) Class120 arg0, @OriginalArg(1) Class41_Sub1 arg1) {
		this.aClass120_1 = arg0;
		this.aClass153_1 = this.aClass120_1.method2498();
		this.method1175();
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(B)V")
	public void method1175() {
		this.anInt1563 = this.aClass120_1.anInt3179;
		this.anInt1562 = this.aClass120_1.anInt3174;
		this.anInt1561 = this.aClass120_1.anInt3176;
		if (this.aClass120_1.aClass116_2 != null) {
			this.aClass120_1.aClass116_2.E(this.aClass153_1.anInt4403, this.aClass153_1.anInt4409, this.aClass153_1.anInt4413, Static422.anIntArray628);
		}
		this.anInt1564 = Static422.anIntArray628[2];
		this.anInt1567 = Static422.anIntArray628[0];
	}
}
