import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class37 {

	@OriginalMember(owner = "client!br", name = "h", descriptor = "Lclient!nba;")
	public Class15_Sub3 aClass15_Sub3_2;

	@OriginalMember(owner = "client!br", name = "i", descriptor = "Z")
	public boolean aBoolean57;

	@OriginalMember(owner = "client!br", name = "l", descriptor = "Lclient!vj;")
	public Class15_Sub4 aClass15_Sub4_1;

	@OriginalMember(owner = "client!br", name = "m", descriptor = "S")
	public short aShort31;

	@OriginalMember(owner = "client!br", name = "o", descriptor = "B")
	public byte aByte23;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "Z")
	public boolean aBoolean58;

	@OriginalMember(owner = "client!br", name = "q", descriptor = "Lclient!kd;")
	public Class15_Sub5 aClass15_Sub5_1;

	@OriginalMember(owner = "client!br", name = "s", descriptor = "B")
	public byte aByte24;

	@OriginalMember(owner = "client!br", name = "t", descriptor = "B")
	public byte aByte25;

	@OriginalMember(owner = "client!br", name = "u", descriptor = "Lclient!ao;")
	public Class15_Sub1 aClass15_Sub1_2;

	@OriginalMember(owner = "client!br", name = "v", descriptor = "Lclient!br;")
	public Class37 aClass37_1;

	@OriginalMember(owner = "client!br", name = "x", descriptor = "Lclient!nba;")
	public Class15_Sub3 aClass15_Sub3_3;

	@OriginalMember(owner = "client!br", name = "y", descriptor = "Z")
	public boolean aBoolean59;

	@OriginalMember(owner = "client!br", name = "A", descriptor = "Lclient!ao;")
	public Class15_Sub1 aClass15_Sub1_3;

	@OriginalMember(owner = "client!br", name = "B", descriptor = "Lclient!sh;")
	public Class267 aClass267_1;

	@OriginalMember(owner = "client!br", name = "C", descriptor = "B")
	public byte aByte28;

	@OriginalMember(owner = "client!br", name = "D", descriptor = "Lclient!gaa;")
	public Class108 aClass108_1;

	@OriginalMember(owner = "client!br", name = "z", descriptor = "B")
	public byte aByte27 = 0;

	@OriginalMember(owner = "client!br", name = "k", descriptor = "B")
	public byte aByte22;

	@OriginalMember(owner = "client!br", name = "w", descriptor = "B")
	public byte aByte26;

	@OriginalMember(owner = "client!br", name = "j", descriptor = "S")
	public final short aShort30;

	@OriginalMember(owner = "client!br", name = "E", descriptor = "S")
	public final short aShort32;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(III)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte26 = this.aByte22 = (byte) arg0;
		this.aShort30 = (short) arg2;
		this.aShort32 = (short) arg1;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
	public void method1044() {
		while (this.aClass108_1 != null) {
			@Pc(7) Class108 local7 = this.aClass108_1.aClass108_3;
			this.aClass108_1.method2791();
			this.aClass108_1 = local7;
		}
		this.aByte27 = 0;
	}
}
