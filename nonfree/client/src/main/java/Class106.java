import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class106 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Z")
	public boolean aBoolean173;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "B")
	public byte aByte24;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "S")
	public short aShort29;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Lclient!pk;")
	public Class67_Sub4 aClass67_Sub4_1;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Lclient!es;")
	public Class67_Sub1 aClass67_Sub1_1;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "Lclient!jo;")
	public Class67_Sub5 aClass67_Sub5_1;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "Lclient!mr;")
	public Class136 aClass136_2;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "B")
	public byte aByte27;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "B")
	public byte aByte29;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "B")
	public byte aByte30;

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Lclient!em;")
	public Class64 aClass64_4;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Lclient!es;")
	public Class67_Sub1 aClass67_Sub1_2;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "Z")
	public boolean aBoolean174;

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "Lclient!mk;")
	public Class67_Sub2 aClass67_Sub2_1;

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "Z")
	public boolean aBoolean175;

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "Lclient!mk;")
	public Class67_Sub2 aClass67_Sub2_2;

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "Lclient!jd;")
	public Class106 aClass106_1;

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "B")
	public byte aByte28 = 0;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "B")
	public byte aByte25;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "B")
	public byte aByte26;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "S")
	public final short aShort28;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "S")
	public final short aShort30;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(III)V")
	public Class106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte26 = this.aByte25 = (byte) arg0;
		this.aShort28 = (short) arg1;
		this.aShort30 = (short) arg2;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public void method2175() {
		while (this.aClass64_4 != null) {
			@Pc(7) Class64 local7 = this.aClass64_4.aClass64_2;
			this.aClass64_4.method1148();
			this.aClass64_4 = local7;
		}
		this.aByte28 = 0;
	}
}
