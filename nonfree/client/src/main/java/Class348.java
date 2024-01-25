import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class348 {

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
	private int anInt9582 = 0;

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
	private int anInt9584 = 0;

	@OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
	private int anInt9586 = 0;

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_41;

	@OriginalMember(owner = "client!uu", name = "k", descriptor = "Lclient!qr;")
	private final Class282 aClass282_6;

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "[Lclient!ffa;")
	private final Class107[] aClass107Array1;

	@OriginalMember(owner = "client!uu", name = "g", descriptor = "Lclient!qh;")
	public final Class107_Sub7 aClass107_Sub7_1;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!oea;)V")
	public Class348(@OriginalArg(0) Class87_Sub2 arg0) {
		this.aClass87_Sub2_41 = arg0;
		this.aClass282_6 = new Class282(arg0);
		this.aClass107Array1 = new Class107[10];
		this.aClass107Array1[1] = new Class107_Sub9(arg0);
		this.aClass107Array1[2] = new Class107_Sub2(arg0, this.aClass282_6);
		this.aClass107Array1[4] = new Class107_Sub1(arg0, this.aClass282_6);
		this.aClass107Array1[5] = new Class107_Sub3(arg0, this.aClass282_6);
		this.aClass107Array1[6] = new Class107_Sub8(arg0);
		this.aClass107Array1[7] = new Class107_Sub4(arg0);
		this.aClass107Array1[3] = this.aClass107_Sub7_1 = new Class107_Sub7(arg0);
		this.aClass107Array1[8] = new Class107_Sub6(arg0, this.aClass282_6);
		this.aClass107Array1[9] = new Class107_Sub5(arg0, this.aClass282_6);
		if (!this.aClass107Array1[8].method7696()) {
			this.aClass107Array1[8] = this.aClass107Array1[4];
		}
		if (!this.aClass107Array1[9].method7696()) {
			this.aClass107Array1[9] = this.aClass107Array1[8];
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZIZBII)V")
	public void method8059(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) boolean local17 = arg2 & this.aClass87_Sub2_41.method7962();
		if (!local17 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			if (arg1 == 4) {
				arg3 = arg4;
			}
			arg1 = 2;
		}
		if (arg1 != 0 && arg0) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt9582) {
			if (this.anInt9582 != 0) {
				this.aClass107Array1[this.anInt9582 & Integer.MAX_VALUE].method7698();
			}
			if (arg1 != 0) {
				this.aClass107Array1[Integer.MAX_VALUE & arg1].method7702(arg0);
				this.aClass107Array1[arg1 & Integer.MAX_VALUE].method7697(arg0);
				this.aClass107Array1[Integer.MAX_VALUE & arg1].method7700(arg3, arg4);
			}
			this.anInt9582 = arg1;
			this.anInt9586 = arg4;
			this.anInt9584 = arg3;
		} else if (this.anInt9582 != 0) {
			this.aClass107Array1[this.anInt9582 & Integer.MAX_VALUE].method7697(arg0);
			if (this.anInt9586 != arg4 || arg3 != this.anInt9584) {
				this.aClass107Array1[Integer.MAX_VALUE & this.anInt9582].method7700(arg3, arg4);
				this.anInt9586 = arg4;
				this.anInt9584 = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)Z")
	public boolean method8060() {
		return this.aClass107Array1[3].method7696();
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLclient!iia;I)Z")
	public boolean method8062(@OriginalArg(1) Class88 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt9582 == 0) {
			return false;
		} else {
			this.aClass107Array1[Integer.MAX_VALUE & this.anInt9582].method7695(arg0, arg1);
			return true;
		}
	}
}
