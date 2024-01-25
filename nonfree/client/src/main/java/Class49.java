import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class49 {

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "Lclient!gl;")
	public Class22_Sub4 aClass22_Sub4_1;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "Z")
	public boolean aBoolean116;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "Lclient!gb;")
	public Class22_Sub3 aClass22_Sub3_1;

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "Z")
	public boolean aBoolean117;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "Lclient!bg;")
	public Class24 aClass24_1;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "Lclient!dg;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "B")
	public byte aByte26;

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "Lclient!f;")
	public Class22_Sub5 aClass22_Sub5_1;

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "Z")
	public boolean aBoolean118;

	@OriginalMember(owner = "client!dg", name = "v", descriptor = "Lclient!f;")
	public Class22_Sub5 aClass22_Sub5_2;

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "B")
	public byte aByte28;

	@OriginalMember(owner = "client!dg", name = "y", descriptor = "Lclient!be;")
	public Class22_Sub1 aClass22_Sub1_1;

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "Lclient!gl;")
	public Class22_Sub4 aClass22_Sub4_2;

	@OriginalMember(owner = "client!dg", name = "A", descriptor = "B")
	public byte aByte29;

	@OriginalMember(owner = "client!dg", name = "B", descriptor = "B")
	public byte aByte30;

	@OriginalMember(owner = "client!dg", name = "C", descriptor = "S")
	public short aShort36;

	@OriginalMember(owner = "client!dg", name = "D", descriptor = "Lclient!db;")
	public Class47 aClass47_3;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "B")
	public byte aByte27 = 0;

	@OriginalMember(owner = "client!dg", name = "x", descriptor = "S")
	public final short aShort35;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "S")
	public final short aShort34;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "B")
	public byte aByte25;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "B")
	public byte aByte24;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(III)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort35 = (short) arg1;
		this.aShort34 = (short) arg2;
		this.aByte24 = this.aByte25 = (byte) arg0;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
	public void method1173() {
		while (this.aClass47_3 != null) {
			@Pc(4) Class47 local4 = this.aClass47_3.aClass47_2;
			this.aClass47_3.method1120();
			this.aClass47_3 = local4;
		}
		this.aByte27 = 0;
	}
}
