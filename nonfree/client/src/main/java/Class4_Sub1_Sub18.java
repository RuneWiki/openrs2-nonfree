import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class4_Sub1_Sub18 extends Class4_Sub1 {

	@OriginalMember(owner = "client!v", name = "K", descriptor = "[I")
	private int[] anIntArray420;

	@OriginalMember(owner = "client!v", name = "P", descriptor = "F")
	private float aFloat3;

	@OriginalMember(owner = "client!v", name = "A", descriptor = "Z")
	public boolean aBoolean160 = false;

	@OriginalMember(owner = "client!v", name = "M", descriptor = "Lclient!g;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!v", name = "O", descriptor = "Z")
	public boolean aBoolean162;

	@OriginalMember(owner = "client!v", name = "G", descriptor = "Z")
	public final boolean aBoolean161;

	@OriginalMember(owner = "client!v", name = "D", descriptor = "I")
	public final int anInt3904;

	@OriginalMember(owner = "client!v", name = "S", descriptor = "I")
	public int anInt3909;

	@OriginalMember(owner = "client!v", name = "z", descriptor = "I")
	private int anInt3901;

	@OriginalMember(owner = "client!v", name = "F", descriptor = "I")
	private int anInt3905;

	@OriginalMember(owner = "client!v", name = "X", descriptor = "I")
	private int anInt3913;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class4_Sub1_Sub18(@OriginalArg(0) Class4_Sub11 arg0) {
		this.aClass30_1 = new Class30(arg0);
		@Pc(14) int local14 = arg0.method1253();
		this.aBoolean162 = (local14 & 0x2) != 0;
		this.aBoolean161 = (local14 & 0x1) != 0;
		@Pc(45) int local45 = arg0.method1253();
		this.anInt3904 = 0x1 << (local45 & 0x7) + 1;
		this.anInt3909 = arg0.method1252();
		this.anInt3901 = arg0.method1253();
		if (this.anInt3901 == 255) {
			this.anInt3901 = 256;
		}
		this.anInt3905 = arg0.method1241();
		this.anInt3913 = arg0.method1241();
		arg0.method1253();
		arg0.method1253();
		arg0.method1253();
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub18() {
		this.aClass30_1 = new Class30();
		this.aBoolean161 = true;
		this.anInt3904 = 1;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLclient!o;Lclient!nh;)Z")
	public boolean method3002(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) Class62 arg1) {
		return this.aClass30_1.method1056(arg1, arg0);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!o;Lclient!nh;Z)[I")
	public int[] method3003(@OriginalArg(0) int arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) Class62 arg2) {
		if (this.aClass30_1.method1056(arg2, arg1)) {
			@Pc(25) int local25 = this.anInt3904 <= arg0 ? this.anInt3904 : arg0;
			return this.aClass30_1.method1055(arg2, local25, arg1, false, 1.0D, local25);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	public void method3004(@OriginalArg(0) int arg0) {
		if (this.anIntArray420 == null || this.anInt3913 == 0 && this.anInt3905 == 0) {
			return;
		}
		if (Static50.anIntArray125 == null || this.anIntArray420.length > Static50.anIntArray125.length) {
			Static50.anIntArray125 = new int[this.anIntArray420.length];
		}
		@Pc(42) int local42 = this.anIntArray420.length;
		@Pc(53) int local53 = this.anIntArray420.length == 4096 ? 64 : 128;
		@Pc(60) int local60 = this.anInt3913 * arg0 * local53;
		@Pc(64) int local64 = local53 - 1;
		@Pc(68) int local68 = local42 - 1;
		@Pc(73) int local73 = arg0 * this.anInt3905;
		for (@Pc(75) int local75 = 0; local75 < local42; local75 += local53) {
			@Pc(83) int local83 = local60 + local75 & local68;
			for (@Pc(85) int local85 = 0; local85 < local53; local85++) {
				@Pc(91) int local91 = local75 + local85;
				@Pc(99) int local99 = (local85 + local73 & local64) + local83;
				Static50.anIntArray125[local91] = this.anIntArray420[local99];
			}
		}
		@Pc(120) int[] local120 = this.anIntArray420;
		this.anIntArray420 = Static50.anIntArray125;
		Static50.anIntArray125 = local120;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!o;Lclient!nh;IFI)[I")
	public int[] method3007(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray420 == null || arg2 != this.aFloat3) {
			if (!this.aClass30_1.method1056(arg1, arg0)) {
				return null;
			}
			@Pc(41) int local41 = arg3 < this.anInt3904 ? arg3 : this.anInt3904;
			this.anIntArray420 = this.aClass30_1.method1055(arg1, local41, arg0, true, (double) arg2, local41);
			this.aFloat3 = arg2;
		}
		return this.anIntArray420;
	}

	@OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}
}
