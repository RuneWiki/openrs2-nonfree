import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class223 {

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "Z")
	public boolean aBoolean382;

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "Lclient!nu;")
	public Class26_Sub4 aClass26_Sub4_2;

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "B")
	public byte aByte65;

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "B")
	public byte aByte66;

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "B")
	public byte aByte67;

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "Lclient!lf;")
	public Class26_Sub3 aClass26_Sub3_1;

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "Z")
	public boolean aBoolean383;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "Lclient!rr;")
	public Class223 aClass223_1;

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "Lclient!oa;")
	public Class26_Sub1 aClass26_Sub1_1;

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "Lclient!pv;")
	public Class201 aClass201_2;

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "Lclient!uc;")
	public Class26_Sub5 aClass26_Sub5_1;

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "Lclient!wt;")
	public Class270 aClass270_1;

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "Z")
	public boolean aBoolean384;

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "S")
	public short aShort70;

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "Lclient!oa;")
	public Class26_Sub1 aClass26_Sub1_2;

	@OriginalMember(owner = "client!rr", name = "B", descriptor = "B")
	public byte aByte70;

	@OriginalMember(owner = "client!rr", name = "C", descriptor = "Lclient!lf;")
	public Class26_Sub3 aClass26_Sub3_2;

	@OriginalMember(owner = "client!rr", name = "z", descriptor = "B")
	public byte aByte69 = 0;

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "S")
	public final short aShort69;

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "B")
	public byte aByte64;

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "B")
	public byte aByte68;

	@OriginalMember(owner = "client!rr", name = "y", descriptor = "S")
	public final short aShort71;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(III)V")
	public Class223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort69 = (short) arg2;
		this.aByte68 = this.aByte64 = (byte) arg0;
		this.aShort71 = (short) arg1;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
	public void method4543() {
		while (this.aClass270_1 != null) {
			@Pc(16) Class270 local16 = this.aClass270_1.aClass270_3;
			this.aClass270_1.method5794();
			this.aClass270_1 = local16;
		}
		this.aByte69 = 0;
	}
}
