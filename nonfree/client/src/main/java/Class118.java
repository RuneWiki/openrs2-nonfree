import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class118 {

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "Lclient!ok;")
	public Class179 aClass179_2;

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "Lclient!eh;")
	public Class7_Sub4 aClass7_Sub4_1;

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "Lclient!ag;")
	public Class7_Sub1 aClass7_Sub1_1;

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "Lclient!rl;")
	public Class7_Sub3 aClass7_Sub3_2;

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "B")
	public byte aByte64;

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "Lclient!eh;")
	public Class7_Sub4 aClass7_Sub4_2;

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "Z")
	public boolean aBoolean300;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "B")
	public byte aByte65;

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "Z")
	public boolean aBoolean301;

	@OriginalMember(owner = "client!iq", name = "s", descriptor = "B")
	public byte aByte67;

	@OriginalMember(owner = "client!iq", name = "t", descriptor = "Lclient!rl;")
	public Class7_Sub3 aClass7_Sub3_3;

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "Lclient!sh;")
	public Class227 aClass227_1;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "B")
	public byte aByte68;

	@OriginalMember(owner = "client!iq", name = "w", descriptor = "Z")
	public boolean aBoolean302;

	@OriginalMember(owner = "client!iq", name = "x", descriptor = "S")
	public short aShort60;

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "Lclient!vm;")
	public Class7_Sub5 aClass7_Sub5_1;

	@OriginalMember(owner = "client!iq", name = "C", descriptor = "Lclient!iq;")
	public Class118 aClass118_1;

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "B")
	public byte aByte62 = 0;

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "S")
	public final short aShort58;

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "B")
	public byte aByte66;

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "B")
	public byte aByte63;

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "S")
	public final short aShort59;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(III)V")
	public Class118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort58 = (short) arg2;
		this.aByte63 = this.aByte66 = (byte) arg0;
		this.aShort59 = (short) arg1;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
	public void method2820() {
		while (this.aClass179_2 != null) {
			@Pc(7) Class179 local7 = this.aClass179_2.aClass179_3;
			this.aClass179_2.method4096();
			this.aClass179_2 = local7;
		}
		this.aByte62 = 0;
	}
}
