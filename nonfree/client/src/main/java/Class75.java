import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class75 {

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "B")
	public byte aByte26;

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "B")
	public byte aByte27;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "Lclient!qd;")
	public Class8_Sub2 aClass8_Sub2_1;

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "Lclient!ur;")
	public Class251 aClass251_2;

	@OriginalMember(owner = "client!ev", name = "k", descriptor = "Z")
	public boolean aBoolean127;

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "Lclient!ah;")
	public Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!ev", name = "m", descriptor = "Lclient!qd;")
	public Class8_Sub2 aClass8_Sub2_2;

	@OriginalMember(owner = "client!ev", name = "n", descriptor = "Lclient!kn;")
	public Class8_Sub4 aClass8_Sub4_1;

	@OriginalMember(owner = "client!ev", name = "p", descriptor = "B")
	public byte aByte28;

	@OriginalMember(owner = "client!ev", name = "q", descriptor = "Lclient!fm;")
	public Class83 aClass83_1;

	@OriginalMember(owner = "client!ev", name = "t", descriptor = "Lclient!e;")
	public Class8_Sub5 aClass8_Sub5_1;

	@OriginalMember(owner = "client!ev", name = "u", descriptor = "Lclient!e;")
	public Class8_Sub5 aClass8_Sub5_2;

	@OriginalMember(owner = "client!ev", name = "x", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!ev", name = "y", descriptor = "Z")
	public boolean aBoolean129;

	@OriginalMember(owner = "client!ev", name = "A", descriptor = "S")
	public short aShort32;

	@OriginalMember(owner = "client!ev", name = "C", descriptor = "Lclient!ev;")
	public Class75 aClass75_1;

	@OriginalMember(owner = "client!ev", name = "D", descriptor = "B")
	public byte aByte31;

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "B")
	public byte aByte25 = 0;

	@OriginalMember(owner = "client!ev", name = "r", descriptor = "S")
	public final short aShort31;

	@OriginalMember(owner = "client!ev", name = "o", descriptor = "S")
	public final short aShort30;

	@OriginalMember(owner = "client!ev", name = "z", descriptor = "B")
	public byte aByte30;

	@OriginalMember(owner = "client!ev", name = "w", descriptor = "B")
	public byte aByte29;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(III)V")
	public Class75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort31 = (short) arg2;
		this.aShort30 = (short) arg1;
		this.aByte29 = this.aByte30 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V")
	public void method1511() {
		while (this.aClass251_2 != null) {
			@Pc(7) Class251 local7 = this.aClass251_2.aClass251_3;
			this.aClass251_2.method5637();
			this.aClass251_2 = local7;
		}
		this.aByte25 = 0;
	}
}
