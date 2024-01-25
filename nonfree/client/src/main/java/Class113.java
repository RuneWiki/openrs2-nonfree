import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class113 {

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "B")
	public byte aByte28;

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "Lclient!gv;")
	public Class4_Sub4 aClass4_Sub4_1;

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "B")
	public byte aByte30;

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "B")
	public byte aByte31;

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "B")
	public byte aByte32;

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "Lclient!ht;")
	public Class113 aClass113_1;

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "Z")
	public boolean aBoolean270;

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "Lclient!pe;")
	public Class4_Sub3 aClass4_Sub3_1;

	@OriginalMember(owner = "client!ht", name = "p", descriptor = "S")
	public short aShort38;

	@OriginalMember(owner = "client!ht", name = "r", descriptor = "Lclient!pm;")
	public Class192 aClass192_1;

	@OriginalMember(owner = "client!ht", name = "s", descriptor = "Lclient!jv;")
	public Class4_Sub5 aClass4_Sub5_1;

	@OriginalMember(owner = "client!ht", name = "t", descriptor = "Lclient!vl;")
	public Class4_Sub1 aClass4_Sub1_2;

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "Z")
	public boolean aBoolean271;

	@OriginalMember(owner = "client!ht", name = "v", descriptor = "Lclient!gv;")
	public Class4_Sub4 aClass4_Sub4_2;

	@OriginalMember(owner = "client!ht", name = "w", descriptor = "Lclient!vl;")
	public Class4_Sub1 aClass4_Sub1_3;

	@OriginalMember(owner = "client!ht", name = "x", descriptor = "Z")
	public boolean aBoolean272;

	@OriginalMember(owner = "client!ht", name = "y", descriptor = "Lclient!kf;")
	public Class134 aClass134_1;

	@OriginalMember(owner = "client!ht", name = "q", descriptor = "B")
	public byte aByte34 = 0;

	@OriginalMember(owner = "client!ht", name = "n", descriptor = "S")
	public final short aShort37;

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "B")
	public byte aByte29;

	@OriginalMember(owner = "client!ht", name = "o", descriptor = "B")
	public byte aByte33;

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "S")
	public final short aShort36;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(III)V")
	public Class113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort37 = (short) arg1;
		this.aByte33 = this.aByte29 = (byte) arg0;
		this.aShort36 = (short) arg2;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V")
	public void method2567() {
		while (this.aClass134_1 != null) {
			@Pc(7) Class134 local7 = this.aClass134_1.aClass134_2;
			this.aClass134_1.method3169();
			this.aClass134_1 = local7;
		}
		this.aByte34 = 0;
	}
}
