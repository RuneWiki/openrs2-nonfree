import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kja")
public final class Class2_Sub8_Sub2 extends Class2_Sub8 {

	@OriginalMember(owner = "client!kja", name = "Mb", descriptor = "I")
	private int anInt5769;

	@OriginalMember(owner = "client!kja", name = "Ob", descriptor = "Lclient!jf;")
	private Class179 aClass179_2;

	@OriginalMember(owner = "client!kja", name = "<init>", descriptor = "(I)V")
	public Class2_Sub8_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kja", name = "q", descriptor = "(B)V")
	public void method5231() {
		this.anInt5769 = super.anInt5725 * 8;
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(BLclient!jf;)V")
	public void method5232(@OriginalArg(1) Class179 arg0) {
		this.aClass179_2 = arg0;
	}

	@OriginalMember(owner = "client!kja", name = "j", descriptor = "(II)I")
	public int method5233(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt5769 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt5769 & 0x7);
		this.anInt5769 += arg0;
		@Pc(26) int local26 = 0;
		while (local18 < arg0) {
			local26 += (super.lb[local10++] & Static401.anIntArray356[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local26 += Static401.anIntArray356[local18] & super.lb[local10];
		} else {
			local26 += super.lb[local10] >> local18 - arg0 & Static401.anIntArray356[arg0];
		}
		return local26;
	}

	@OriginalMember(owner = "client!kja", name = "c", descriptor = "(Z)V")
	public void method5234() {
		super.anInt5725 = (this.anInt5769 + 7) / 8;
	}

	@OriginalMember(owner = "client!kja", name = "w", descriptor = "(I)Z")
	public boolean method5235() {
		@Pc(22) int local22 = super.lb[super.anInt5725] - this.aClass179_2.method4710() & 0xFF;
		return local22 >= 128;
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(I[I)V")
	public void method5236(@OriginalArg(1) int[] arg0) {
		this.aClass179_2 = new Class179(arg0);
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(II[BI)V")
	public void method5237(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.lb[super.anInt5725++] - this.aClass179_2.method4712());
		}
	}

	@OriginalMember(owner = "client!kja", name = "r", descriptor = "(B)I")
	public int method5239() {
		@Pc(29) int local29 = super.lb[super.anInt5725++] - this.aClass179_2.method4712() & 0xFF;
		return local29 < 128 ? local29 : (local29 - 128 << 8) + (super.lb[super.anInt5725++] - this.aClass179_2.method4712() & 0xFF);
	}

	@OriginalMember(owner = "client!kja", name = "g", descriptor = "(BI)I")
	public int method5240(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt5769;
	}

	@OriginalMember(owner = "client!kja", name = "h", descriptor = "(BI)V")
	public void method5241(@OriginalArg(1) int arg0) {
		super.lb[super.anInt5725++] = (byte) (arg0 + this.aClass179_2.method4712());
	}
}
