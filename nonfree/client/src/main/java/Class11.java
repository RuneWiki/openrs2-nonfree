import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class11 {

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "B")
	public byte aByte2;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "Lclient!ne;")
	public Class24_Sub1 aClass24_Sub1_1;

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "B")
	public byte aByte3;

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "Lclient!ne;")
	public Class24_Sub1 aClass24_Sub1_2;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "Lclient!a;")
	public Class1 aClass1_3;

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "Z")
	public boolean aBoolean9;

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "Lclient!qh;")
	public Class24_Sub5 aClass24_Sub5_1;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "Z")
	public boolean aBoolean10;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "Lclient!qh;")
	public Class24_Sub5 aClass24_Sub5_2;

	@OriginalMember(owner = "client!ak", name = "r", descriptor = "Lclient!ip;")
	public Class121 aClass121_1;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "B")
	public byte aByte5;

	@OriginalMember(owner = "client!ak", name = "t", descriptor = "Z")
	public boolean aBoolean11;

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "Lclient!se;")
	public Class24_Sub2 aClass24_Sub2_1;

	@OriginalMember(owner = "client!ak", name = "v", descriptor = "Lclient!lv;")
	public Class24_Sub4 aClass24_Sub4_1;

	@OriginalMember(owner = "client!ak", name = "x", descriptor = "Lclient!ak;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!ak", name = "y", descriptor = "B")
	public byte aByte6;

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "B")
	public byte aByte4 = 0;

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "S")
	public final short aShort3;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "S")
	public final short aShort1;

	@OriginalMember(owner = "client!ak", name = "z", descriptor = "B")
	public byte aByte7;

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "B")
	public byte aByte1;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(III)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort3 = (short) arg2;
		this.aShort1 = (short) arg1;
		this.aByte1 = this.aByte7 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
	public void method118() {
		while (this.aClass1_3 != null) {
			@Pc(7) Class1 local7 = this.aClass1_3.aClass1_1;
			this.aClass1_3.method2();
			this.aClass1_3 = local7;
		}
		this.aByte4 = 0;
	}
}
