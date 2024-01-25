import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class174 {

	@OriginalMember(owner = "client!r", name = "i", descriptor = "Lclient!ha;")
	public Class84 aClass84_3;

	@OriginalMember(owner = "client!r", name = "j", descriptor = "Lclient!je;")
	public Class4_Sub4 aClass4_Sub4_1;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "Z")
	public boolean aBoolean438;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "Lclient!so;")
	public Class4_Sub2 aClass4_Sub2_1;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "Z")
	public boolean aBoolean439;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Z")
	public boolean aBoolean440;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Lclient!al;")
	public Class4_Sub1 aClass4_Sub1_1;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "Lclient!al;")
	public Class4_Sub1 aClass4_Sub1_2;

	@OriginalMember(owner = "client!r", name = "r", descriptor = "B")
	public byte aByte46;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "Lclient!jk;")
	public Class4_Sub3 aClass4_Sub3_1;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "B")
	public byte aByte47;

	@OriginalMember(owner = "client!r", name = "w", descriptor = "Lclient!jk;")
	public Class4_Sub3 aClass4_Sub3_2;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "B")
	public byte aByte49;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "S")
	public short aShort73;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "Lclient!ns;")
	public Class146 aClass146_1;

	@OriginalMember(owner = "client!r", name = "B", descriptor = "B")
	public byte aByte50;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "Lclient!r;")
	public Class174 aClass174_1;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "B")
	public byte aByte45 = 0;

	@OriginalMember(owner = "client!r", name = "u", descriptor = "B")
	public byte aByte48;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "B")
	public byte aByte44;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "S")
	public final short aShort71;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "S")
	public final short aShort72;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(III)V")
	public Class174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte44 = this.aByte48 = (byte) arg0;
		this.aShort71 = (short) arg2;
		this.aShort72 = (short) arg1;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public void method4753() {
		while (this.aClass84_3 != null) {
			@Pc(13) Class84 local13 = this.aClass84_3.aClass84_2;
			this.aClass84_3.method1990();
			this.aClass84_3 = local13;
		}
		this.aByte45 = 0;
	}
}
