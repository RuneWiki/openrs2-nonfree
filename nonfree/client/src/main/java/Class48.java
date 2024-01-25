import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class48 {

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "Lclient!wm;")
	public Class28_Sub4 aClass28_Sub4_1;

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "B")
	public byte aByte10;

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "Lclient!d;")
	public Class50 aClass50_1;

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "B")
	public byte aByte11;

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "Lclient!sk;")
	public Class28_Sub2 aClass28_Sub2_2;

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "S")
	public short aShort16;

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "Z")
	public boolean aBoolean60;

	@OriginalMember(owner = "client!ct", name = "p", descriptor = "Lclient!uj;")
	public Class28_Sub3 aClass28_Sub3_1;

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "Lclient!cs;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!ct", name = "t", descriptor = "Lclient!uj;")
	public Class28_Sub3 aClass28_Sub3_2;

	@OriginalMember(owner = "client!ct", name = "u", descriptor = "B")
	public byte aByte15;

	@OriginalMember(owner = "client!ct", name = "v", descriptor = "Z")
	public boolean aBoolean61;

	@OriginalMember(owner = "client!ct", name = "w", descriptor = "B")
	public byte aByte16;

	@OriginalMember(owner = "client!ct", name = "x", descriptor = "Lclient!vg;")
	public Class28_Sub5 aClass28_Sub5_1;

	@OriginalMember(owner = "client!ct", name = "y", descriptor = "Lclient!wm;")
	public Class28_Sub4 aClass28_Sub4_2;

	@OriginalMember(owner = "client!ct", name = "z", descriptor = "Lclient!ct;")
	public Class48 aClass48_1;

	@OriginalMember(owner = "client!ct", name = "A", descriptor = "Z")
	public boolean aBoolean62;

	@OriginalMember(owner = "client!ct", name = "m", descriptor = "B")
	public byte aByte13 = 0;

	@OriginalMember(owner = "client!ct", name = "l", descriptor = "B")
	public byte aByte12;

	@OriginalMember(owner = "client!ct", name = "r", descriptor = "B")
	public byte aByte14;

	@OriginalMember(owner = "client!ct", name = "o", descriptor = "S")
	public final short aShort17;

	@OriginalMember(owner = "client!ct", name = "q", descriptor = "S")
	public final short aShort18;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(III)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte14 = this.aByte12 = (byte) arg0;
		this.aShort17 = (short) arg2;
		this.aShort18 = (short) arg1;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
	public void method992() {
		while (this.aClass50_1 != null) {
			@Pc(7) Class50 local7 = this.aClass50_1.aClass50_2;
			this.aClass50_1.method1009();
			this.aClass50_1 = local7;
		}
		this.aByte13 = 0;
	}
}
