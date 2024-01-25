import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class133 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Lclient!hfa;")
	public Class127 aClass127_1;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "B")
	public byte aByte44;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "Lclient!ti;")
	public Class15_Sub4 aClass15_Sub4_1;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "Lclient!ti;")
	public Class15_Sub4 aClass15_Sub4_2;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "Z")
	public boolean aBoolean302;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "B")
	public byte aByte45;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "B")
	public byte aByte47;

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "B")
	public byte aByte48;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "Z")
	public boolean aBoolean303;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "Lclient!al;")
	public Class15_Sub1 aClass15_Sub1_1;

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "Z")
	public boolean aBoolean304;

	@OriginalMember(owner = "client!hl", name = "r", descriptor = "Lclient!wv;")
	public Class15_Sub5 aClass15_Sub5_1;

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "Lclient!hl;")
	public Class133 aClass133_1;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "Lclient!es;")
	public Class15_Sub3 aClass15_Sub3_2;

	@OriginalMember(owner = "client!hl", name = "x", descriptor = "S")
	public short aShort60;

	@OriginalMember(owner = "client!hl", name = "y", descriptor = "Lclient!al;")
	public Class15_Sub1 aClass15_Sub1_2;

	@OriginalMember(owner = "client!hl", name = "z", descriptor = "Lclient!ub;")
	public Class315 aClass315_1;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "B")
	public byte aByte46 = 0;

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "B")
	public byte aByte50;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "B")
	public byte aByte49;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "S")
	public final short aShort58;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "S")
	public final short aShort59;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(III)V")
	public Class133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte49 = this.aByte50 = (byte) arg0;
		this.aShort58 = (short) arg2;
		this.aShort59 = (short) arg1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	public void method3333() {
		while (this.aClass315_1 != null) {
			@Pc(11) Class315 local11 = this.aClass315_1.aClass315_3;
			this.aClass315_1.method7058();
			this.aClass315_1 = local11;
		}
		this.aByte46 = 0;
	}
}
