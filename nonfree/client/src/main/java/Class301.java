import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class301 {

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
	private int anInt8050 = 0;

	@OriginalMember(owner = "client!sca", name = "e", descriptor = "Lclient!tj;")
	private Class51 aClass51_1 = null;

	@OriginalMember(owner = "client!sca", name = "i", descriptor = "I")
	private int anInt8052 = 0;

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
	private int anInt8049 = 0;

	@OriginalMember(owner = "client!sca", name = "h", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_38;

	@OriginalMember(owner = "client!sca", name = "j", descriptor = "Lclient!dk;")
	private final Class69 aClass69_6;

	@OriginalMember(owner = "client!sca", name = "m", descriptor = "[Lclient!ew;")
	private final Class60[] aClass60Array1;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "Lclient!vba;")
	public final Class60_Sub9 aClass60_Sub9_1;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!jaa;)V")
	public Class301(@OriginalArg(0) Class14_Sub3 arg0) {
		this.aClass14_Sub3_38 = arg0;
		this.aClass69_6 = new Class69(arg0);
		this.aClass60Array1 = new Class60[10];
		this.aClass60Array1[1] = new Class60_Sub7(arg0);
		this.aClass60Array1[2] = new Class60_Sub3(arg0, this.aClass69_6);
		this.aClass60Array1[4] = new Class60_Sub5(arg0, this.aClass69_6);
		this.aClass60Array1[5] = new Class60_Sub1(arg0, this.aClass69_6);
		this.aClass60Array1[6] = new Class60_Sub6(arg0);
		this.aClass60Array1[7] = new Class60_Sub8(arg0);
		this.aClass60Array1[3] = this.aClass60_Sub9_1 = new Class60_Sub9(arg0);
		this.aClass60Array1[8] = new Class60_Sub2(arg0, this.aClass69_6);
		this.aClass60Array1[9] = new Class60_Sub4(arg0, this.aClass69_6);
		if (!this.aClass60Array1[8].method7478()) {
			this.aClass60Array1[8] = this.aClass60Array1[4];
		}
		if (!this.aClass60Array1[9].method7478()) {
			this.aClass60Array1[9] = this.aClass60Array1[8];
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILclient!tj;B)Z")
	public boolean method6553(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		if (this.anInt8050 == 0) {
			return false;
		}
		if (this.aClass51_1 != arg1) {
			this.aClass60Array1[Integer.MAX_VALUE & this.anInt8050].method7475(arg0, arg1);
			this.aClass51_1 = arg1;
		}
		return true;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)Z")
	public boolean method6554() {
		return this.aClass60Array1[3].method7478();
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IZBIIZ)V")
	public void method6555(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(9) boolean local9 = arg4 & this.aClass14_Sub3_38.method6838();
		if (!local9 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
			if (arg3 == 4) {
				arg0 = arg2;
			}
			arg3 = 2;
		}
		if (arg3 != 0 && arg1) {
			arg3 |= Integer.MIN_VALUE;
		}
		if (this.anInt8050 != arg3) {
			if (this.anInt8050 != 0) {
				this.aClass60Array1[this.anInt8050 & Integer.MAX_VALUE].method7474();
			}
			if (arg3 != 0) {
				this.aClass60Array1[Integer.MAX_VALUE & arg3].method7476(arg1);
				this.aClass60Array1[Integer.MAX_VALUE & arg3].method7477(arg1);
				this.aClass60Array1[arg3 & Integer.MAX_VALUE].method7472(arg2, arg0);
			}
			this.anInt8052 = arg0;
			this.aClass51_1 = null;
			this.anInt8049 = arg2;
			this.anInt8050 = arg3;
		} else if (this.anInt8050 != 0) {
			this.aClass60Array1[this.anInt8050 & Integer.MAX_VALUE].method7477(arg1);
			if (arg2 != this.anInt8049 || arg0 != this.anInt8052) {
				this.aClass60Array1[Integer.MAX_VALUE & this.anInt8050].method7472(arg2, arg0);
				this.anInt8052 = arg0;
				this.anInt8049 = arg2;
			}
		}
	}
}
