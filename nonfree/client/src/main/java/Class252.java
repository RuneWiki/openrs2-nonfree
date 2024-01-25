import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class252 {

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "B")
	public byte aByte96;

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "B")
	public byte aByte97;

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "Lclient!qk;")
	public Class208 aClass208_3;

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "Lclient!hc;")
	public Class30_Sub3 aClass30_Sub3_2;

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "Z")
	public boolean aBoolean478;

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "B")
	public byte aByte99;

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "Lclient!f;")
	public Class30_Sub2 aClass30_Sub2_2;

	@OriginalMember(owner = "client!ut", name = "p", descriptor = "S")
	public short aShort100;

	@OriginalMember(owner = "client!ut", name = "q", descriptor = "Lclient!hc;")
	public Class30_Sub3 aClass30_Sub3_3;

	@OriginalMember(owner = "client!ut", name = "r", descriptor = "Lclient!f;")
	public Class30_Sub2 aClass30_Sub2_3;

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "Lclient!ql;")
	public Class30_Sub5 aClass30_Sub5_1;

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "Lclient!d;")
	public Class51 aClass51_2;

	@OriginalMember(owner = "client!ut", name = "v", descriptor = "Lclient!ut;")
	public Class252 aClass252_1;

	@OriginalMember(owner = "client!ut", name = "w", descriptor = "Lclient!hh;")
	public Class30_Sub4 aClass30_Sub4_2;

	@OriginalMember(owner = "client!ut", name = "B", descriptor = "B")
	public byte aByte101;

	@OriginalMember(owner = "client!ut", name = "C", descriptor = "Z")
	public boolean aBoolean479;

	@OriginalMember(owner = "client!ut", name = "D", descriptor = "Z")
	public boolean aBoolean480;

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "B")
	public byte aByte98 = 0;

	@OriginalMember(owner = "client!ut", name = "i", descriptor = "S")
	public final short aShort99;

	@OriginalMember(owner = "client!ut", name = "x", descriptor = "S")
	public final short aShort101;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "B")
	public byte aByte95;

	@OriginalMember(owner = "client!ut", name = "z", descriptor = "B")
	public byte aByte100;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(III)V")
	public Class252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort99 = (short) arg2;
		this.aShort101 = (short) arg1;
		this.aByte100 = this.aByte95 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	public void method5680() {
		while (this.aClass208_3 != null) {
			@Pc(12) Class208 local12 = this.aClass208_3.aClass208_2;
			this.aClass208_3.method4675();
			this.aClass208_3 = local12;
		}
		this.aByte98 = 0;
	}
}
