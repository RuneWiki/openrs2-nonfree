import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class4_Sub2_Sub1_Sub2 extends Class4_Sub2_Sub1 {

	@OriginalMember(owner = "client!ga", name = "Xb", descriptor = "I")
	private final int anInt991;

	@OriginalMember(owner = "client!ga", name = "sc", descriptor = "I")
	private final int anInt1005;

	@OriginalMember(owner = "client!ga", name = "rc", descriptor = "I")
	private final int anInt1004;

	@OriginalMember(owner = "client!ga", name = "mc", descriptor = "I")
	private final int anInt999;

	@OriginalMember(owner = "client!ga", name = "ec", descriptor = "I")
	private final int anInt996;

	@OriginalMember(owner = "client!ga", name = "vc", descriptor = "I")
	private final int anInt1007;

	@OriginalMember(owner = "client!ga", name = "wc", descriptor = "I")
	private final int anInt1008;

	@OriginalMember(owner = "client!ga", name = "tc", descriptor = "Lclient!bd;")
	private Class4_Sub2_Sub2 aClass4_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ga", name = "nc", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!ga", name = "Wb", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(IIIIIIIIZLclient!uc;)V")
	public Class4_Sub2_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class4_Sub2_Sub1 arg9) {
		this.anInt991 = arg1;
		this.anInt1005 = arg5;
		this.anInt1004 = arg4;
		this.anInt999 = arg3;
		this.anInt996 = arg0;
		this.anInt1007 = arg6;
		this.anInt1008 = arg2;
		if (arg7 != -1) {
			this.aClass4_Sub2_Sub2_1 = Static116.method2017(arg7);
			this.anInt1000 = Static71.anInt1738 - 1;
			this.anInt990 = 0;
			if (this.aClass4_Sub2_Sub2_1.anInt319 == 0 && arg9 != null && arg9 instanceof Class4_Sub2_Sub1_Sub2) {
				@Pc(53) Class4_Sub2_Sub1_Sub2 local53 = (Class4_Sub2_Sub1_Sub2) arg9;
				if (local53.aClass4_Sub2_Sub2_1 == this.aClass4_Sub2_Sub2_1) {
					this.anInt1000 = local53.anInt1000;
					this.anInt990 = local53.anInt990;
					return;
				}
			}
			if (arg8 && this.aClass4_Sub2_Sub2_1.anInt320 != -1) {
				this.anInt990 = (int) ((double) this.aClass4_Sub2_Sub2_1.anIntArray33.length * Math.random());
				this.anInt1000 -= (int) ((double) this.aClass4_Sub2_Sub2_1.anIntArray35[this.anInt990] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(B)Lclient!vb;")
	@Override
	public Class4_Sub2_Sub1_Sub6 method2172() {
		if (this.aClass4_Sub2_Sub2_1 != null) {
			@Pc(10) int local10 = Static71.anInt1738 - this.anInt1000;
			if (local10 > 100 && this.aClass4_Sub2_Sub2_1.anInt320 > 0) {
				local10 = 100;
			}
			label37: {
				do {
					do {
						if (this.aClass4_Sub2_Sub2_1.anIntArray35[this.anInt990] >= local10) {
							break label37;
						}
						local10 -= this.aClass4_Sub2_Sub2_1.anIntArray35[this.anInt990];
						this.anInt990++;
					} while (this.anInt990 < this.aClass4_Sub2_Sub2_1.anIntArray33.length);
					this.anInt990 -= this.aClass4_Sub2_Sub2_1.anInt320;
				} while (this.anInt990 >= 0 && this.anInt990 < this.aClass4_Sub2_Sub2_1.anIntArray33.length);
				this.aClass4_Sub2_Sub2_1 = null;
			}
			this.anInt1000 = Static71.anInt1738 - local10;
		}
		@Pc(104) Class4_Sub2_Sub10 local104 = Static73.method1207(this.anInt996);
		if (local104.anIntArray144 != null) {
			local104 = local104.method925();
		}
		return local104 == null ? null : local104.method927(this.anInt991, this.aClass4_Sub2_Sub2_1, this.anInt1007, this.anInt1005, this.anInt1008, this.anInt999, this.anInt990, this.anInt1004);
	}
}
