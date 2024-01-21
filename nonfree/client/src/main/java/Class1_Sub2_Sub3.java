import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "F")
	private float aFloat1;

	@OriginalMember(owner = "client!bh", name = "T", descriptor = "Z")
	public boolean aBoolean11 = false;

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "Lclient!ph;")
	private final Class70 aClass70_1;

	@OriginalMember(owner = "client!bh", name = "Q", descriptor = "Z")
	public boolean aBoolean9;

	@OriginalMember(owner = "client!bh", name = "S", descriptor = "Z")
	public final boolean aBoolean10;

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
	public final int anInt474;

	@OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
	public int anInt480;

	@OriginalMember(owner = "client!bh", name = "X", descriptor = "I")
	private int anInt485;

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
	private int anInt477;

	@OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
	private int anInt479;

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
	private int anInt478;

	@OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
	private int anInt482;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!ka;)V")
	public Class1_Sub2_Sub3(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass70_1 = new Class70(arg0);
		@Pc(14) int local14 = arg0.method336();
		this.aBoolean9 = (local14 & 0x2) != 0;
		this.aBoolean10 = (local14 & 0x1) != 0;
		this.anInt474 = arg0.method336();
		this.anInt480 = arg0.method359();
		this.anInt485 = arg0.method336();
		if (this.anInt485 == 255) {
			this.anInt485 = 256;
		}
		@Pc(61) int local61 = arg0.method336();
		@Pc(65) int local65 = arg0.method336();
		this.anInt477 = (local65 & 0x3F) - 6;
		this.anInt479 = local65 >> 6 & 0x3;
		this.anInt478 = (local61 & 0x3F) - 6;
		this.anInt482 = local61 >> 6 & 0x3;
		arg0.method336();
		arg0.method336();
		arg0.method336();
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub3() {
		this.aClass70_1 = new Class70();
		this.aBoolean10 = true;
		this.anInt474 = 1;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILclient!vb;FLclient!tf;)[I")
	public int[] method389(@OriginalArg(0) int arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) float arg2, @OriginalArg(4) Interface3 arg3) {
		if (this.anIntArray18 == null || arg2 != this.aFloat1) {
			if (!this.aClass70_1.method2245(arg3, arg1)) {
				return null;
			}
			@Pc(29) int local29 = arg0 >= this.anInt474 ? this.anInt474 : arg0;
			this.anIntArray18 = this.aClass70_1.method2244(arg1, local29, (double) arg2, local29, arg3, true);
			this.aFloat1 = arg2;
		}
		return this.anIntArray18;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!tf;ILclient!vb;)[I")
	public int[] method390(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class82 arg2) {
		if (this.aClass70_1.method2245(arg0, arg2)) {
			@Pc(26) int local26 = arg1 < this.anInt474 ? arg1 : this.anInt474;
			return this.aClass70_1.method2244(arg2, local26, 1.0D, local26, arg0, false);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!tf;BLclient!vb;)Z")
	public boolean method392(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Class82 arg1) {
		return this.aClass70_1.method2245(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	public void method393(@OriginalArg(1) int arg0) {
		if (this.anIntArray18 == null || this.anInt479 == 0 && this.anInt482 == 0) {
			return;
		}
		if (Static118.anIntArray278 == null || Static118.anIntArray278.length < this.anIntArray18.length) {
			Static118.anIntArray278 = new int[this.anIntArray18.length];
		}
		@Pc(47) int local47 = this.anIntArray18.length == 4096 ? 64 : 128;
		@Pc(51) int local51 = local47 - 1;
		@Pc(58) int local58 = this.anInt477 * local47 * arg0;
		@Pc(63) int local63 = arg0 * this.anInt478;
		if (this.anInt479 == 2) {
			local58 = -local58;
		}
		@Pc(76) int local76 = this.anIntArray18.length;
		@Pc(80) int local80 = local76 - 1;
		if (this.anInt482 == 1) {
			local63 = -local63;
		}
		for (@Pc(91) int local91 = 0; local91 < local76; local91 += local47) {
			@Pc(99) int local99 = local80 & local58 + local91;
			for (@Pc(101) int local101 = 0; local101 < local47; local101++) {
				@Pc(108) int local108 = local91 + local101;
				@Pc(116) int local116 = (local51 & local101 + local63) + local99;
				Static118.anIntArray278[local108] = this.anIntArray18[local116];
			}
		}
		@Pc(137) int[] local137 = this.anIntArray18;
		this.anIntArray18 = Static118.anIntArray278;
		Static118.anIntArray278 = local137;
	}
}
