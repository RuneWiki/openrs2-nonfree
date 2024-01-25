import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class137 {

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "B")
	public byte aByte45;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!kf;")
	public Class137 aClass137_1;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Lclient!gn;")
	public Class101 aClass101_1;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "Lclient!nh;")
	public Class47_Sub2 aClass47_Sub2_1;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "Lclient!kg;")
	public Class47_Sub4 aClass47_Sub4_1;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "B")
	public byte aByte46;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "Lclient!nh;")
	public Class47_Sub2 aClass47_Sub2_2;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "Z")
	public boolean aBoolean292;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "Lclient!qd;")
	public Class47_Sub5 aClass47_Sub5_1;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "Lclient!eb;")
	public Class47_Sub3 aClass47_Sub3_1;

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "Lclient!mo;")
	public Class167 aClass167_1;

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "B")
	public byte aByte49;

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "Z")
	public boolean aBoolean293;

	@OriginalMember(owner = "client!kf", name = "A", descriptor = "Lclient!kg;")
	public Class47_Sub4 aClass47_Sub4_2;

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "S")
	public short aShort66;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "Z")
	public boolean aBoolean294;

	@OriginalMember(owner = "client!kf", name = "D", descriptor = "B")
	public byte aByte50;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "B")
	public byte aByte47 = 0;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "B")
	public byte aByte48;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "B")
	public byte aByte44;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "S")
	public final short aShort64;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "S")
	public final short aShort65;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(III)V")
	public Class137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte44 = this.aByte48 = (byte) arg0;
		this.aShort64 = (short) arg1;
		this.aShort65 = (short) arg2;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public void method3111() {
		while (this.aClass167_1 != null) {
			@Pc(7) Class167 local7 = this.aClass167_1.aClass167_2;
			this.aClass167_1.method3611();
			this.aClass167_1 = local7;
		}
		this.aByte47 = 0;
	}
}
