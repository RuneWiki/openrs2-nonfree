import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class204 {

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "Lclient!ti;")
	public Class5_Sub1 aClass5_Sub1_1;

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "B")
	public byte aByte59;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "Z")
	public boolean aBoolean536;

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "B")
	public byte aByte60;

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "Lclient!mg;")
	public Class5_Sub4 aClass5_Sub4_1;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "S")
	public short aShort87;

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "Lclient!j;")
	public Class5_Sub2 aClass5_Sub2_1;

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "B")
	public byte aByte62;

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "Lclient!uk;")
	public Class204 aClass204_1;

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "Lclient!ba;")
	public Class17 aClass17_3;

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "Lclient!ti;")
	public Class5_Sub1 aClass5_Sub1_2;

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "Lclient!ue;")
	public Class5_Sub5 aClass5_Sub5_1;

	@OriginalMember(owner = "client!uk", name = "C", descriptor = "Z")
	public boolean aBoolean537;

	@OriginalMember(owner = "client!uk", name = "D", descriptor = "Lclient!qd;")
	public Class162 aClass162_2;

	@OriginalMember(owner = "client!uk", name = "E", descriptor = "Lclient!mg;")
	public Class5_Sub4 aClass5_Sub4_2;

	@OriginalMember(owner = "client!uk", name = "H", descriptor = "B")
	public byte aByte65;

	@OriginalMember(owner = "client!uk", name = "I", descriptor = "Z")
	public boolean aBoolean538;

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "B")
	public byte aByte61 = 0;

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "S")
	public final short aShort88;

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "B")
	public byte aByte63;

	@OriginalMember(owner = "client!uk", name = "F", descriptor = "B")
	public byte aByte64;

	@OriginalMember(owner = "client!uk", name = "G", descriptor = "S")
	public final short aShort89;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(III)V")
	public Class204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort88 = (short) arg2;
		this.aByte64 = this.aByte63 = (byte) arg0;
		this.aShort89 = (short) arg1;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
	public void method5337() {
		while (this.aClass17_3 != null) {
			@Pc(11) Class17 local11 = this.aClass17_3.aClass17_1;
			this.aClass17_3.method443();
			this.aClass17_3 = local11;
		}
		this.aByte61 = 0;
	}
}
