import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class9 {

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!ia;")
	public Class29_Sub4 aClass29_Sub4_1;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!wda;")
	public Class29_Sub5 aClass29_Sub5_1;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "B")
	public byte aByte3;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "Z")
	public boolean aBoolean7;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Lclient!wda;")
	public Class29_Sub5 aClass29_Sub5_2;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "Lclient!af;")
	public Class9 aClass9_1;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "B")
	public byte aByte4;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "Lclient!ul;")
	public Class29_Sub3 aClass29_Sub3_1;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!dh;")
	public Class66 aClass66_1;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "B")
	public byte aByte5;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "Z")
	public boolean aBoolean8;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "B")
	public byte aByte6;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "Lclient!bg;")
	public Class29_Sub1 aClass29_Sub1_1;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "Z")
	public boolean aBoolean9;

	@OriginalMember(owner = "client!af", name = "w", descriptor = "Lclient!bg;")
	public Class29_Sub1 aClass29_Sub1_2;

	@OriginalMember(owner = "client!af", name = "y", descriptor = "Lclient!ob;")
	public Class222 aClass222_1;

	@OriginalMember(owner = "client!af", name = "v", descriptor = "B")
	public byte aByte7 = 0;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "S")
	public final short aShort2;

	@OriginalMember(owner = "client!af", name = "u", descriptor = "S")
	public final short aShort3;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "B")
	public byte aByte2;

	@OriginalMember(owner = "client!af", name = "x", descriptor = "B")
	public byte aByte8;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(III)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort2 = (short) arg1;
		this.aShort3 = (short) arg2;
		this.aByte8 = this.aByte2 = (byte) arg0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	public void method132() {
		while (this.aClass66_1 != null) {
			@Pc(11) Class66 local11 = this.aClass66_1.aClass66_2;
			this.aClass66_1.method1418();
			this.aClass66_1 = local11;
		}
		this.aByte7 = 0;
	}
}
