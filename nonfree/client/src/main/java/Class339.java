import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class339 {

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
	private int anInt8939 = 0;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
	private int anInt8940 = 0;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
	private int anInt8942 = 0;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_35;

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "Lclient!au;")
	private final Class26 aClass26_5;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "[Lclient!gma;")
	private final Class63[] aClass63Array1;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Lclient!fa;")
	public final Class63_Sub2 aClass63_Sub2_1;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class339(@OriginalArg(0) Class22_Sub1 arg0) {
		this.aClass22_Sub1_35 = arg0;
		this.aClass26_5 = new Class26(arg0);
		this.aClass63Array1 = new Class63[10];
		this.aClass63Array1[1] = new Class63_Sub9(arg0);
		this.aClass63Array1[2] = new Class63_Sub4(arg0, this.aClass26_5);
		this.aClass63Array1[4] = new Class63_Sub5(arg0, this.aClass26_5);
		this.aClass63Array1[5] = new Class63_Sub3(arg0, this.aClass26_5);
		this.aClass63Array1[6] = new Class63_Sub1(arg0);
		this.aClass63Array1[7] = new Class63_Sub7(arg0);
		this.aClass63Array1[3] = this.aClass63_Sub2_1 = new Class63_Sub2(arg0);
		this.aClass63Array1[8] = new Class63_Sub8(arg0, this.aClass26_5);
		this.aClass63Array1[9] = new Class63_Sub6(arg0, this.aClass26_5);
		if (!this.aClass63Array1[8].method9538()) {
			this.aClass63Array1[8] = this.aClass63Array1[4];
		}
		if (!this.aClass63Array1[9].method9538()) {
			this.aClass63Array1[9] = this.aClass63Array1[8];
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!rha;IB)Z")
	public boolean method7581(@OriginalArg(0) Class125 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt8939 == 0) {
			return false;
		} else {
			this.aClass63Array1[Integer.MAX_VALUE & this.anInt8939].method9535(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZZIII)V")
	public void method7583(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) boolean local10 = arg2 & this.aClass22_Sub1_35.method9342();
		if (!local10 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg3 = arg4;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg1) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt8939 != arg0) {
			if (this.anInt8939 != 0) {
				this.aClass63Array1[Integer.MAX_VALUE & this.anInt8939].method9536();
			}
			if (arg0 != 0) {
				this.aClass63Array1[Integer.MAX_VALUE & arg0].method9539(arg1);
				this.aClass63Array1[arg0 & Integer.MAX_VALUE].method9540(arg1);
				this.aClass63Array1[arg0 & Integer.MAX_VALUE].method9534(arg3, arg4);
			}
			this.anInt8939 = arg0;
			this.anInt8942 = arg4;
			this.anInt8940 = arg3;
		} else if (this.anInt8939 != 0) {
			this.aClass63Array1[this.anInt8939 & Integer.MAX_VALUE].method9540(arg1);
			if (this.anInt8942 != arg4 || this.anInt8940 != arg3) {
				this.aClass63Array1[Integer.MAX_VALUE & this.anInt8939].method9534(arg3, arg4);
				this.anInt8940 = arg3;
				this.anInt8942 = arg4;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)Z")
	public boolean method7584() {
		return this.aClass63Array1[3].method9538();
	}
}
