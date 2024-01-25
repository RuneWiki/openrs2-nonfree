import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class51 {

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Z")
	public boolean aBoolean98;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Z")
	public boolean aBoolean99;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "S")
	public short aShort21;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!dc;")
	public Class51 aClass51_1;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "B")
	public byte aByte8;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Lclient!kp;")
	public Class1_Sub3 aClass1_Sub3_1;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!am;")
	public Class11 aClass11_2;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "B")
	public byte aByte11;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "B")
	public byte aByte12;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "Lclient!wa;")
	public Class214 aClass214_1;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "B")
	public byte aByte13;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "Z")
	public boolean aBoolean100;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "Lclient!a;")
	public Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "Lclient!kp;")
	public Class1_Sub3 aClass1_Sub3_2;

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "Lclient!tl;")
	public Class1_Sub5 aClass1_Sub5_1;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "Lclient!o;")
	public Class1_Sub4 aClass1_Sub4_1;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "Lclient!a;")
	public Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "B")
	public byte aByte7 = 0;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "B")
	public byte aByte10;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "B")
	public byte aByte9;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "S")
	public final short aShort23;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "S")
	public final short aShort22;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte9 = this.aByte10 = (byte) arg0;
		this.aShort23 = (short) arg1;
		this.aShort22 = (short) arg2;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public void method1206() {
		while (this.aClass11_2 != null) {
			@Pc(7) Class11 local7 = this.aClass11_2.aClass11_1;
			this.aClass11_2.method190();
			this.aClass11_2 = local7;
		}
		this.aByte7 = 0;
	}
}
