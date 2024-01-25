import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class57 {

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Z")
	public boolean aBoolean116;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "S")
	public short aShort32;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "B")
	public byte aByte26;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "B")
	public byte aByte27;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Lclient!hs;")
	public Class2_Sub3 aClass2_Sub3_1;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "B")
	public byte aByte28;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!aa;")
	public Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Lclient!hc;")
	public Class88 aClass88_2;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Lclient!sn;")
	public Class2_Sub4 aClass2_Sub4_1;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "B")
	public byte aByte29;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Lclient!hr;")
	public Class95 aClass95_2;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Z")
	public boolean aBoolean117;

	@OriginalMember(owner = "client!e", name = "u", descriptor = "Lclient!nk;")
	public Class2_Sub5 aClass2_Sub5_1;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "Lclient!sn;")
	public Class2_Sub4 aClass2_Sub4_2;

	@OriginalMember(owner = "client!e", name = "y", descriptor = "Lclient!e;")
	public Class57 aClass57_1;

	@OriginalMember(owner = "client!e", name = "z", descriptor = "Lclient!aa;")
	public Class2_Sub1 aClass2_Sub1_2;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "Z")
	public boolean aBoolean118;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "B")
	public byte aByte30 = 0;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "S")
	public final short aShort34;

	@OriginalMember(owner = "client!e", name = "A", descriptor = "B")
	public byte aByte32;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "B")
	public byte aByte31;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "S")
	public final short aShort33;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(III)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort34 = (short) arg2;
		this.aByte31 = this.aByte32 = (byte) arg0;
		this.aShort33 = (short) arg1;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public void method1098() {
		while (this.aClass95_2 != null) {
			@Pc(17) Class95 local17 = this.aClass95_2.aClass95_3;
			this.aClass95_2.method2463();
			this.aClass95_2 = local17;
		}
		this.aByte30 = 0;
	}
}
