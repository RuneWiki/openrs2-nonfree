import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!da", name = "H", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "F")
	private float aFloat2;

	@OriginalMember(owner = "client!da", name = "R", descriptor = "Z")
	public boolean aBoolean64 = false;

	@OriginalMember(owner = "client!da", name = "fb", descriptor = "Lclient!dh;")
	private final Class15 aClass15_1;

	@OriginalMember(owner = "client!da", name = "S", descriptor = "Z")
	public final boolean aBoolean65;

	@OriginalMember(owner = "client!da", name = "gb", descriptor = "Z")
	public boolean aBoolean66;

	@OriginalMember(owner = "client!da", name = "hb", descriptor = "I")
	public final int anInt1007;

	@OriginalMember(owner = "client!da", name = "V", descriptor = "I")
	public int anInt1001;

	@OriginalMember(owner = "client!da", name = "O", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!da", name = "X", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!da", name = "N", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ce;)V")
	public Class1_Sub2_Sub5(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass15_1 = new Class15(arg0);
		@Pc(14) int local14 = arg0.method1607();
		this.aBoolean65 = (local14 & 0x1) != 0;
		this.aBoolean66 = (local14 & 0x2) != 0;
		@Pc(45) int local45 = arg0.method1607();
		this.anInt1007 = 0x1 << (local45 & 0x7) + 1;
		this.anInt1001 = arg0.method1642();
		this.anInt997 = arg0.method1607();
		if (this.anInt997 == 255) {
			this.anInt997 = 256;
		}
		this.anInt1002 = arg0.method1611();
		this.anInt996 = arg0.method1611();
		arg0.method1607();
		arg0.method1607();
		arg0.method1607();
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub5() {
		this.aClass15_1 = new Class15();
		this.anInt1007 = 1;
		this.aBoolean65 = true;
	}

	@OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ag;Lclient!ph;Z)Z")
	public boolean method838(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Interface3 arg1) {
		return this.aClass15_1.method959(arg0, arg1);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ph;FLclient!ag;IB)[I")
	public int[] method841(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray113 == null || arg1 != this.aFloat2) {
			if (!this.aClass15_1.method959(arg2, arg0)) {
				return null;
			}
			@Pc(29) int local29 = arg3 < this.anInt1007 ? arg3 : this.anInt1007;
			this.anIntArray113 = this.aClass15_1.method958(arg2, local29, (double) arg1, true, arg0, local29);
			this.aFloat2 = arg1;
		}
		return this.anIntArray113;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)V")
	public void method842(@OriginalArg(1) int arg0) {
		if (this.anIntArray113 == null || this.anInt996 == 0 && this.anInt1002 == 0) {
			return;
		}
		if (Static50.anIntArray174 == null || this.anIntArray113.length > Static50.anIntArray174.length) {
			Static50.anIntArray174 = new int[this.anIntArray113.length];
		}
		@Pc(46) int local46 = this.anIntArray113.length == 4096 ? 64 : 128;
		@Pc(51) int local51 = arg0 * this.anInt1002;
		@Pc(55) int local55 = this.anIntArray113.length;
		@Pc(62) int local62 = local46 * arg0 * this.anInt996;
		@Pc(66) int local66 = local46 - 1;
		@Pc(70) int local70 = local55 - 1;
		for (@Pc(72) int local72 = 0; local72 < local55; local72 += local46) {
			@Pc(80) int local80 = local62 + local72 & local70;
			for (@Pc(82) int local82 = 0; local82 < local46; local82++) {
				@Pc(89) int local89 = local72 + local82;
				@Pc(98) int local98 = local80 + (local82 + local51 & local66);
				Static50.anIntArray174[local89] = this.anIntArray113[local98];
			}
		}
		@Pc(127) int[] local127 = this.anIntArray113;
		this.anIntArray113 = Static50.anIntArray174;
		Static50.anIntArray174 = local127;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ph;Lclient!ag;II)[I")
	public int[] method843(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass15_1.method959(arg1, arg0)) {
			@Pc(27) int local27 = arg2 < this.anInt1007 ? arg2 : this.anInt1007;
			return this.aClass15_1.method958(arg1, local27, 1.0D, false, arg0, local27);
		} else {
			return null;
		}
	}
}
