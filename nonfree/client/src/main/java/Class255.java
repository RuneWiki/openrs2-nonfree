import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class255 {

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Lclient!ck;")
	public Class49_Sub1 aClass49_Sub1_2;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Lclient!tm;")
	public Class49_Sub3 aClass49_Sub3_1;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "B")
	public byte aByte102;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "B")
	public byte aByte103;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "Lclient!tm;")
	public Class49_Sub3 aClass49_Sub3_2;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "Z")
	public boolean aBoolean523;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "Lclient!vh;")
	public Class49_Sub5 aClass49_Sub5_2;

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "Lclient!rg;")
	public Class255 aClass255_1;

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "Lclient!de;")
	public Class63 aClass63_3;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "Lclient!qh;")
	public Class49_Sub4 aClass49_Sub4_1;

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "Lclient!ck;")
	public Class49_Sub1 aClass49_Sub1_3;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "Z")
	public boolean aBoolean524;

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "B")
	public byte aByte105;

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "S")
	public short aShort125;

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "Z")
	public boolean aBoolean525;

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "Lclient!kw;")
	public Class175 aClass175_2;

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "B")
	public byte aByte106;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "B")
	public byte aByte104 = 0;

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "S")
	public final short aShort124;

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "B")
	public byte aByte107;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "B")
	public byte aByte101;

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "S")
	public final short aShort123;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(III)V")
	public Class255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort124 = (short) arg1;
		this.aByte101 = this.aByte107 = (byte) arg0;
		this.aShort123 = (short) arg2;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public void method6108() {
		while (this.aClass63_3 != null) {
			@Pc(17) Class63 local17 = this.aClass63_3.aClass63_1;
			this.aClass63_3.method1466();
			this.aClass63_3 = local17;
		}
		this.aByte104 = 0;
	}
}
