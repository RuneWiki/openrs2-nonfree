import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class2_Sub4_Sub10 extends Class2_Sub4 {

	@OriginalMember(owner = "client!fg", name = "O", descriptor = "[I")
	private int[] anIntArray130;

	@OriginalMember(owner = "client!fg", name = "cb", descriptor = "F")
	private float aFloat3;

	@OriginalMember(owner = "client!fg", name = "ab", descriptor = "Z")
	public boolean aBoolean75 = false;

	@OriginalMember(owner = "client!fg", name = "J", descriptor = "Lclient!jf;")
	private final Class42 aClass42_1;

	@OriginalMember(owner = "client!fg", name = "H", descriptor = "Z")
	public final boolean aBoolean73;

	@OriginalMember(owner = "client!fg", name = "Y", descriptor = "Z")
	public boolean aBoolean74;

	@OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
	public final int anInt1451;

	@OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
	public int anInt1452;

	@OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
	private int anInt1445;

	@OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
	private int anInt1448;

	@OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
	private int anInt1447;

	@OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
	private int anInt1454;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!ab;)V")
	public Class2_Sub4_Sub10(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aClass42_1 = new Class42(arg0);
		@Pc(14) int local14 = arg0.method1698();
		this.aBoolean73 = (local14 & 0x1) != 0;
		this.aBoolean74 = (local14 & 0x2) != 0;
		this.anInt1451 = arg0.method1698();
		this.anInt1452 = arg0.method1680();
		this.anInt1445 = arg0.method1698();
		if (this.anInt1445 == 255) {
			this.anInt1445 = 256;
		}
		@Pc(63) int local63 = arg0.method1698();
		@Pc(67) int local67 = arg0.method1698();
		this.anInt1448 = local63 >> 6 & 0x3;
		this.anInt1447 = (local67 & 0x3F) - 6;
		this.anInt1454 = local67 >> 6 & 0x3;
		arg0.method1698();
		arg0.method1698();
	}

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub10() {
		this.aClass42_1 = new Class42();
		this.aBoolean73 = true;
		this.anInt1451 = 1;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)V")
	public void method1000(@OriginalArg(1) int arg0) {
		if (this.anIntArray130 == null) {
			return;
		}
		@Pc(45) short local45;
		@Pc(36) int local36;
		@Pc(56) int local56;
		@Pc(69) int local69;
		@Pc(71) int local71;
		@Pc(80) int local80;
		@Pc(98) int[] local98;
		if (this.anInt1454 != 0) {
			if (Static168.anIntArray353 == null || Static168.anIntArray353.length < this.anIntArray130.length) {
				Static168.anIntArray353 = new int[this.anIntArray130.length];
			}
			local36 = this.anIntArray130.length;
			if (this.anIntArray130.length == 4096) {
				local45 = 64;
			} else {
				local45 = 128;
			}
			local56 = local45 * arg0 * this.anInt1447;
			if (this.anInt1454 == 2) {
				local56 = -local56;
			}
			local69 = local36 - 1;
			for (local71 = 0; local71 < local36; local71++) {
				local80 = local69 & local71 + local56;
				Static168.anIntArray353[local71] = this.anIntArray130[local80];
			}
			local98 = this.anIntArray130;
			this.anIntArray130 = Static168.anIntArray353;
			Static168.anIntArray353 = local98;
		}
		if (this.anInt1448 == 0) {
			return;
		}
		if (Static168.anIntArray353 == null || this.anIntArray130.length > Static168.anIntArray353.length) {
			Static168.anIntArray353 = new int[this.anIntArray130.length];
		}
		if (this.anIntArray130.length == 4096) {
			local45 = 64;
		} else {
			local45 = 128;
		}
		local36 = this.anIntArray130.length;
		local56 = arg0 * this.anInt1447;
		if (this.anInt1448 == 1) {
			local56 = -local56;
		}
		local69 = local45 - 1;
		for (local71 = 0; local71 < local36; local71 += local45) {
			for (local80 = 0; local80 < local45; local80++) {
				@Pc(166) int local166 = local71 + local80;
				@Pc(174) int local174 = local71 + (local56 + local80 & local69);
				Static168.anIntArray353[local166] = this.anIntArray130[local174];
			}
		}
		local98 = this.anIntArray130;
		this.anIntArray130 = Static168.anIntArray353;
		Static168.anIntArray353 = local98;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!jc;Lclient!wc;I)Z")
	public boolean method1001(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Interface2 arg1) {
		return this.aClass42_1.method1474(arg0, arg1);
	}

	@OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIFLclient!wc;Lclient!jc;)[I")
	public int[] method1004(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) Class40 arg3) {
		if (this.anIntArray130 == null || this.aFloat3 != arg1) {
			if (!this.aClass42_1.method1474(arg3, arg2)) {
				return null;
			}
			@Pc(42) int local42 = arg0 < this.anInt1451 ? arg0 : this.anInt1451;
			this.anIntArray130 = this.aClass42_1.method1472(arg3, local42, (double) arg1, local42, arg2, true);
			this.aFloat3 = arg1;
		}
		return this.anIntArray130;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!wc;Lclient!jc;I)[I")
	public int[] method1005(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) Class40 arg2) {
		if (this.aClass42_1.method1474(arg2, arg1)) {
			@Pc(29) int local29 = arg0 >= this.anInt1451 ? this.anInt1451 : arg0;
			return this.aClass42_1.method1472(arg2, local29, 1.0D, local29, arg1, false);
		} else {
			return null;
		}
	}
}
