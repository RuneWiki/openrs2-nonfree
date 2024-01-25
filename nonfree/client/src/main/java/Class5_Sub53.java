import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class5_Sub53 extends Class5 {

	@OriginalMember(owner = "client!wca", name = "v", descriptor = "[I")
	private int[] anIntArray586;

	@OriginalMember(owner = "client!wca", name = "l", descriptor = "J")
	public long aLong306;

	@OriginalMember(owner = "client!wca", name = "r", descriptor = "[Lclient!qt;")
	public Class297[] aClass297Array1;

	@OriginalMember(owner = "client!wca", name = "t", descriptor = "B")
	public byte aByte147;

	@OriginalMember(owner = "client!wca", name = "u", descriptor = "B")
	public byte aByte148;

	@OriginalMember(owner = "client!wca", name = "p", descriptor = "Z")
	private boolean aBoolean776;

	@OriginalMember(owner = "client!wca", name = "z", descriptor = "Ljava/lang/String;")
	public String aString136 = null;

	@OriginalMember(owner = "client!wca", name = "y", descriptor = "Z")
	private boolean aBoolean775 = true;

	@OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
	public int anInt10557 = 0;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lclient!ib;)V")
	public Class5_Sub53(@OriginalArg(0) Class5_Sub23 arg0) {
		this.method9059(arg0);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)V")
	public void method9053(@OriginalArg(0) int arg0) {
		this.anInt10557--;
		if (this.anInt10557 == 0) {
			this.aClass297Array1 = null;
		} else {
			Static682.method797(this.aClass297Array1, arg0 + 1, this.aClass297Array1, arg0, this.anInt10557 - arg0);
		}
		this.anIntArray586 = null;
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(II)V")
	private void method9054(@OriginalArg(1) int arg0) {
		if (this.aClass297Array1 == null) {
			this.aClass297Array1 = new Class297[arg0];
		} else {
			Static682.method797(this.aClass297Array1, 0, this.aClass297Array1 = new Class297[arg0], 0, this.anInt10557);
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILclient!qt;)V")
	public void method9056(@OriginalArg(1) Class297 arg0) {
		if (this.aClass297Array1 == null || this.anInt10557 >= this.aClass297Array1.length) {
			this.method9054(this.anInt10557 + 5);
		}
		this.aClass297Array1[this.anInt10557++] = arg0;
		this.anIntArray586 = null;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)[I")
	public int[] method9058() {
		if (this.anIntArray586 == null) {
			@Pc(15) String[] local15 = new String[this.anInt10557];
			this.anIntArray586 = new int[this.anInt10557];
			@Pc(22) int local22 = 0;
			while (this.anInt10557 > local22) {
				local15[local22] = this.aClass297Array1[local22].aString109;
				this.anIntArray586[local22] = local22++;
			}
			Static259.method3829(local15, this.anIntArray586);
		}
		return this.anIntArray586;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!ib;I)V")
	private void method9059(@OriginalArg(0) Class5_Sub23 arg0) {
		@Pc(9) int local9 = arg0.method8529();
		if ((local9 & 0x1) != 0) {
			this.aBoolean776 = true;
		}
		if ((local9 & 0x2) != 0) {
			this.aBoolean775 = true;
		}
		super.aLong314 = arg0.method8509();
		this.aLong306 = arg0.method8509();
		this.aString136 = arg0.method8497();
		arg0.method8529();
		this.aByte147 = arg0.method8488();
		this.aByte148 = arg0.method8488();
		this.anInt10557 = arg0.method8519();
		if (this.anInt10557 <= 0) {
			return;
		}
		this.aClass297Array1 = new Class297[this.anInt10557];
		for (@Pc(82) int local82 = 0; local82 < this.anInt10557; local82++) {
			@Pc(88) Class297 local88 = new Class297();
			if (this.aBoolean776) {
				arg0.method8509();
			}
			if (this.aBoolean775) {
				local88.aString109 = arg0.method8497();
			}
			local88.aByte124 = arg0.method8488();
			local88.anInt8235 = arg0.method8519();
			this.aClass297Array1[local82] = local88;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method9060(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt10557; local7++) {
			if (this.aClass297Array1[local7].aString109.equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}
}
