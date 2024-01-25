import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class162 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "Z")
	public boolean aBoolean329;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!bl;")
	public Class11_Sub2 aClass11_Sub2_1;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Lclient!og;")
	public Class11_Sub4 aClass11_Sub4_1;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "B")
	public byte aByte56;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "Lclient!pl;")
	public Class11_Sub3 aClass11_Sub3_1;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "Lclient!ib;")
	public Class11_Sub1 aClass11_Sub1_2;

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "Z")
	public boolean aBoolean330;

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "Z")
	public boolean aBoolean331;

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "B")
	public byte aByte57;

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "B")
	public byte aByte58;

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "Lclient!bl;")
	public Class11_Sub2 aClass11_Sub2_2;

	@OriginalMember(owner = "client!mm", name = "q", descriptor = "B")
	public byte aByte60;

	@OriginalMember(owner = "client!mm", name = "r", descriptor = "Lclient!wg;")
	public Class270 aClass270_1;

	@OriginalMember(owner = "client!mm", name = "s", descriptor = "S")
	public short aShort54;

	@OriginalMember(owner = "client!mm", name = "w", descriptor = "Lclient!mm;")
	public Class162 aClass162_1;

	@OriginalMember(owner = "client!mm", name = "x", descriptor = "Lclient!pr;")
	public Class199 aClass199_1;

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "Lclient!pl;")
	public Class11_Sub3 aClass11_Sub3_2;

	@OriginalMember(owner = "client!mm", name = "v", descriptor = "B")
	public byte aByte62 = 0;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "S")
	public final short aShort52;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "S")
	public final short aShort53;

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "B")
	public byte aByte61;

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "B")
	public byte aByte59;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(III)V")
	public Class162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort52 = (short) arg1;
		this.aShort53 = (short) arg2;
		this.aByte59 = this.aByte61 = (byte) arg0;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)V")
	public void method4082() {
		while (this.aClass199_1 != null) {
			@Pc(7) Class199 local7 = this.aClass199_1.aClass199_2;
			this.aClass199_1.method4767();
			this.aClass199_1 = local7;
		}
		this.aByte62 = 0;
	}
}
