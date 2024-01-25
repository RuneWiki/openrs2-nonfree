import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class155 {

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "[I")
	public static final int[] anIntArray341 = new int[16384];

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "[I")
	public static final int[] anIntArray342 = new int[16384];

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
	public int anInt3976;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
	public int anInt3977;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
	public int anInt3978;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	public int anInt3980;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "Lclient!mf;")
	public Class155 aClass155_2;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
	public int anInt3985;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
	public int anInt3986;

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
	public int anInt3987;

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
	public int anInt3989;

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
	public int anInt3991;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	private final int anInt3979;

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
	public final int anInt3981;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
	public final int anInt3982;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	public final int anInt3983;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "B")
	public final byte aByte41;

	static {
		@Pc(10) double local10 = 3.834951969714103E-4D;
		for (@Pc(12) int local12 = 0; local12 < 16384; local12++) {
			anIntArray342[local12] = (int) (Math.sin((double) local12 * local10) * 32768.0D);
			anIntArray341[local12] = (int) (Math.cos((double) local12 * local10) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(IIIIB)V")
	public Class155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt3979 = arg0;
		this.anInt3981 = arg1;
		this.anInt3982 = arg2;
		this.anInt3983 = arg3;
		this.aByte41 = arg4;
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!mf;I)V")
	public Class155(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1) {
		this.aClass155_2 = arg0;
		this.anInt3983 = arg1 + this.aClass155_2.anInt3983;
		this.aByte41 = this.aClass155_2.aByte41;
		this.anInt3981 = arg1 + this.aClass155_2.anInt3981;
		this.anInt3982 = arg1 + this.aClass155_2.anInt3982;
		this.anInt3979 = this.aClass155_2.anInt3979;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)Lclient!mf;")
	public Class155 method3146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class155(this.anInt3979, arg2, arg0, arg1, this.aByte41);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)Lclient!lv;")
	public Class152 method3147() {
		return Static68.method4011(this.anInt3979);
	}
}
