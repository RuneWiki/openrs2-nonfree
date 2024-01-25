import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class82 {

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "Lclient!sm;")
	public Class20_Sub2 aClass20_Sub2_1;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "Lclient!wo;")
	public Class20_Sub4 aClass20_Sub4_1;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "Lclient!wo;")
	public Class20_Sub4 aClass20_Sub4_2;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "S")
	public short aShort16;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "B")
	public byte aByte18;

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "B")
	public byte aByte19;

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "Z")
	public boolean aBoolean148;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "Lclient!lh;")
	public Class20_Sub1 aClass20_Sub1_2;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "Z")
	public boolean aBoolean149;

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "B")
	public byte aByte20;

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "Lclient!ub;")
	public Class20_Sub5 aClass20_Sub5_1;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "Lclient!po;")
	public Class194 aClass194_2;

	@OriginalMember(owner = "client!fl", name = "y", descriptor = "Z")
	public boolean aBoolean150;

	@OriginalMember(owner = "client!fl", name = "B", descriptor = "Lclient!lg;")
	public Class146 aClass146_1;

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "Lclient!lh;")
	public Class20_Sub1 aClass20_Sub1_3;

	@OriginalMember(owner = "client!fl", name = "D", descriptor = "Lclient!fl;")
	public Class82 aClass82_1;

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "B")
	public byte aByte22;

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "B")
	public byte aByte21 = 0;

	@OriginalMember(owner = "client!fl", name = "A", descriptor = "S")
	public final short aShort18;

	@OriginalMember(owner = "client!fl", name = "x", descriptor = "S")
	public final short aShort17;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "B")
	public byte aByte16;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "B")
	public byte aByte17;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(III)V")
	public Class82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort18 = (short) arg1;
		this.aShort17 = (short) arg2;
		this.aByte17 = this.aByte16 = (byte) arg0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public void method1610() {
		while (this.aClass146_1 != null) {
			@Pc(19) Class146 local19 = this.aClass146_1.aClass146_3;
			this.aClass146_1.method2997();
			this.aClass146_1 = local19;
		}
		this.aByte21 = 0;
	}
}
