import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class8 {

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "B")
	public byte aByte2;

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "Lclient!oj;")
	public Class62_Sub2 aClass62_Sub2_1;

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "Lclient!mj;")
	public Class62_Sub4 aClass62_Sub4_1;

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "Lclient!ak;")
	public Class8 aClass8_1;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "S")
	public short aShort12;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "B")
	public byte aByte5;

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "Lclient!rp;")
	public Class172 aClass172_1;

	@OriginalMember(owner = "client!ak", name = "t", descriptor = "Z")
	public boolean aBoolean21;

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "B")
	public byte aByte6;

	@OriginalMember(owner = "client!ak", name = "v", descriptor = "Lclient!mj;")
	public Class62_Sub4 aClass62_Sub4_2;

	@OriginalMember(owner = "client!ak", name = "w", descriptor = "Lclient!gm;")
	public Class75 aClass75_1;

	@OriginalMember(owner = "client!ak", name = "x", descriptor = "Lclient!tn;")
	public Class62_Sub5 aClass62_Sub5_1;

	@OriginalMember(owner = "client!ak", name = "z", descriptor = "Lclient!tn;")
	public Class62_Sub5 aClass62_Sub5_2;

	@OriginalMember(owner = "client!ak", name = "C", descriptor = "Lclient!kl;")
	public Class62_Sub3 aClass62_Sub3_1;

	@OriginalMember(owner = "client!ak", name = "H", descriptor = "Z")
	public boolean aBoolean22;

	@OriginalMember(owner = "client!ak", name = "I", descriptor = "Z")
	public boolean aBoolean23;

	@OriginalMember(owner = "client!ak", name = "J", descriptor = "B")
	public byte aByte8;

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "B")
	public byte aByte3 = 0;

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "S")
	public final short aShort11;

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "S")
	public final short aShort10;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "B")
	public byte aByte4;

	@OriginalMember(owner = "client!ak", name = "B", descriptor = "B")
	public byte aByte7;

	static {
		new Class93("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(III)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort11 = (short) arg2;
		this.aShort10 = (short) arg1;
		this.aByte7 = this.aByte4 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
	public void method372() {
		while (this.aClass172_1 != null) {
			@Pc(11) Class172 local11 = this.aClass172_1.aClass172_4;
			this.aClass172_1.method5019();
			this.aClass172_1 = local11;
		}
		this.aByte3 = 0;
	}
}
