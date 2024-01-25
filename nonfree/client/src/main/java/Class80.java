import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class80 {

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "B")
	public byte aByte48;

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Lclient!fq;")
	public Class80 aClass80_1;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "Lclient!rp;")
	public Class31_Sub5 aClass31_Sub5_1;

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "Z")
	public boolean aBoolean141;

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "Lclient!qv;")
	public Class31_Sub3 aClass31_Sub3_2;

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "Lclient!se;")
	public Class31_Sub1 aClass31_Sub1_2;

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "Lclient!sr;")
	public Class31_Sub4 aClass31_Sub4_1;

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "Z")
	public boolean aBoolean142;

	@OriginalMember(owner = "client!fq", name = "o", descriptor = "B")
	public byte aByte49;

	@OriginalMember(owner = "client!fq", name = "q", descriptor = "Lclient!kp;")
	public Class140 aClass140_1;

	@OriginalMember(owner = "client!fq", name = "r", descriptor = "Z")
	public boolean aBoolean143;

	@OriginalMember(owner = "client!fq", name = "s", descriptor = "S")
	public short aShort39;

	@OriginalMember(owner = "client!fq", name = "u", descriptor = "Lclient!qv;")
	public Class31_Sub3 aClass31_Sub3_3;

	@OriginalMember(owner = "client!fq", name = "v", descriptor = "Lclient!sr;")
	public Class31_Sub4 aClass31_Sub4_2;

	@OriginalMember(owner = "client!fq", name = "w", descriptor = "B")
	public byte aByte51;

	@OriginalMember(owner = "client!fq", name = "y", descriptor = "Lclient!bg;")
	public Class22 aClass22_2;

	@OriginalMember(owner = "client!fq", name = "B", descriptor = "B")
	public byte aByte53;

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "B")
	public byte aByte50 = 0;

	@OriginalMember(owner = "client!fq", name = "x", descriptor = "S")
	public final short aShort41;

	@OriginalMember(owner = "client!fq", name = "t", descriptor = "S")
	public final short aShort40;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "B")
	public byte aByte47;

	@OriginalMember(owner = "client!fq", name = "z", descriptor = "B")
	public byte aByte52;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(III)V")
	public Class80(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort41 = (short) arg1;
		this.aShort40 = (short) arg2;
		this.aByte52 = this.aByte47 = (byte) arg0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
	public void method2142() {
		while (this.aClass22_2 != null) {
			@Pc(8) Class22 local8 = this.aClass22_2.aClass22_1;
			this.aClass22_2.method579();
			this.aClass22_2 = local8;
		}
		this.aByte50 = 0;
	}
}
