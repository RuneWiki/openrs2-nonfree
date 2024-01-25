import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class194 {

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "Lclient!sk;")
	public Class191 aClass191_2;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "B")
	public byte aByte65;

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "S")
	public short aShort86;

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "Z")
	public boolean aBoolean561;

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "Lclient!os;")
	public Class17_Sub2 aClass17_Sub2_1;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "Lclient!sl;")
	public Class17_Sub5 aClass17_Sub5_1;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "Lclient!lk;")
	public Class126 aClass126_2;

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "Lclient!qo;")
	public Class17_Sub3 aClass17_Sub3_1;

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "B")
	public byte aByte66;

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "Z")
	public boolean aBoolean562;

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "Lclient!qo;")
	public Class17_Sub3 aClass17_Sub3_2;

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "Z")
	public boolean aBoolean563;

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "Lclient!qc;")
	public Class17_Sub4 aClass17_Sub4_1;

	@OriginalMember(owner = "client!sq", name = "y", descriptor = "Lclient!qc;")
	public Class17_Sub4 aClass17_Sub4_2;

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "B")
	public byte aByte69;

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "Lclient!sq;")
	public Class194 aClass194_1;

	@OriginalMember(owner = "client!sq", name = "B", descriptor = "B")
	public byte aByte70;

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "B")
	public byte aByte67 = 0;

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "S")
	public final short aShort87;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "S")
	public final short aShort88;

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "B")
	public byte aByte68;

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "B")
	public byte aByte64;

	static {
		new Class34(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(III)V")
	public Class194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort87 = (short) arg2;
		this.aShort88 = (short) arg1;
		this.aByte64 = this.aByte68 = (byte) arg0;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	public void method4981() {
		while (this.aClass126_2 != null) {
			@Pc(7) Class126 local7 = this.aClass126_2.aClass126_1;
			this.aClass126_2.method3468();
			this.aClass126_2 = local7;
		}
		this.aByte67 = 0;
	}
}
