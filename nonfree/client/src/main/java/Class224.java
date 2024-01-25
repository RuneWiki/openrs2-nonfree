import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class224 {

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Lclient!fj;")
	public Class11_Sub3 aClass11_Sub3_1;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lclient!fj;")
	public Class11_Sub3 aClass11_Sub3_2;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!qr;")
	public Class270 aClass270_1;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Lclient!tg;")
	public Class299 aClass299_2;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Z")
	public boolean aBoolean469;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "B")
	public byte aByte67;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "Lclient!oj;")
	public Class11_Sub5 aClass11_Sub5_2;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "Lclient!as;")
	public Class11_Sub2 aClass11_Sub2_1;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "Lclient!ne;")
	public Class224 aClass224_1;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "B")
	public byte aByte70;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "Lclient!kv;")
	public Class11_Sub4 aClass11_Sub4_2;

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "B")
	public byte aByte71;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "B")
	public byte aByte72;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "Z")
	public boolean aBoolean470;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "S")
	public short aShort67;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "Z")
	public boolean aBoolean471;

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "Lclient!kv;")
	public Class11_Sub4 aClass11_Sub4_3;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "B")
	public byte aByte66 = 0;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "S")
	public final short aShort66;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "B")
	public byte aByte68;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "B")
	public byte aByte69;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "S")
	public final short aShort65;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(III)V")
	public Class224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort66 = (short) arg1;
		this.aByte69 = this.aByte68 = (byte) arg0;
		this.aShort65 = (short) arg2;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public void method5375() {
		while (this.aClass270_1 != null) {
			@Pc(11) Class270 local11 = this.aClass270_1.aClass270_2;
			this.aClass270_1.method6555();
			this.aClass270_1 = local11;
		}
		this.aByte66 = 0;
	}
}
