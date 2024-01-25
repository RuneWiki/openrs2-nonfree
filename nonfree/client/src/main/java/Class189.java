import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class189 {

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "B")
	public byte aByte54;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Lclient!si;")
	public Class3_Sub5 aClass3_Sub5_1;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "Z")
	public boolean aBoolean342;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "Lclient!uf;")
	public Class242 aClass242_2;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "S")
	public short aShort64;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "B")
	public byte aByte55;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Z")
	public boolean aBoolean343;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "Lclient!oh;")
	public Class189 aClass189_1;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "B")
	public byte aByte56;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "Lclient!jk;")
	public Class3_Sub4 aClass3_Sub4_2;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "Lclient!jk;")
	public Class3_Sub4 aClass3_Sub4_3;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "Z")
	public boolean aBoolean344;

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "Lclient!cf;")
	public Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "B")
	public byte aByte57;

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "Lclient!ab;")
	public Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!oh", name = "x", descriptor = "Lclient!ii;")
	public Class115 aClass115_2;

	@OriginalMember(owner = "client!oh", name = "B", descriptor = "Lclient!ab;")
	public Class3_Sub1 aClass3_Sub1_2;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "B")
	public byte aByte52 = 0;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "B")
	public byte aByte53;

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "B")
	public byte aByte58;

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "S")
	public final short aShort65;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "S")
	public final short aShort66;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(III)V")
	public Class189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte58 = this.aByte53 = (byte) arg0;
		this.aShort65 = (short) arg2;
		this.aShort66 = (short) arg1;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
	public void method4280() {
		while (this.aClass242_2 != null) {
			@Pc(11) Class242 local11 = this.aClass242_2.aClass242_4;
			this.aClass242_2.method5451();
			this.aClass242_2 = local11;
		}
		this.aByte52 = 0;
	}
}
