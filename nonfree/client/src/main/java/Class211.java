import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class211 {

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!fq;")
	public Class26_Sub1 aClass26_Sub1_2;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!fk;")
	public Class26_Sub3 aClass26_Sub3_2;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Z")
	public boolean aBoolean397;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "B")
	public byte aByte72;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!jc;")
	public Class125 aClass125_3;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "Lclient!qb;")
	public Class185 aClass185_1;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "S")
	public short aShort75;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "Lclient!gf;")
	public Class26_Sub4 aClass26_Sub4_2;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "Lclient!fk;")
	public Class26_Sub3 aClass26_Sub3_3;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "Z")
	public boolean aBoolean398;

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "B")
	public byte aByte75;

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "B")
	public byte aByte76;

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "B")
	public byte aByte77;

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "Lclient!fq;")
	public Class26_Sub1 aClass26_Sub1_3;

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "Z")
	public boolean aBoolean399;

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "Lclient!sd;")
	public Class211 aClass211_1;

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "Lclient!os;")
	public Class26_Sub5 aClass26_Sub5_1;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "B")
	public byte aByte74 = 0;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "B")
	public byte aByte73;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "B")
	public byte aByte78;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "S")
	public final short aShort73;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "S")
	public final short aShort74;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(III)V")
	public Class211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte78 = this.aByte73 = (byte) arg0;
		this.aShort73 = (short) arg1;
		this.aShort74 = (short) arg2;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public void method4953() {
		while (this.aClass125_3 != null) {
			@Pc(7) Class125 local7 = this.aClass125_3.aClass125_1;
			this.aClass125_3.method2893();
			this.aClass125_3 = local7;
		}
		this.aByte74 = 0;
	}
}
