import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class258 {

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "Z")
	public boolean aBoolean489;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "Lclient!es;")
	public Class2_Sub3 aClass2_Sub3_2;

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "Lclient!vt;")
	public Class258 aClass258_1;

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "B")
	public byte aByte99;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "Lclient!so;")
	public Class2_Sub2 aClass2_Sub2_2;

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "B")
	public byte aByte100;

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "Lclient!em;")
	public Class2_Sub4 aClass2_Sub4_2;

	@OriginalMember(owner = "client!vt", name = "q", descriptor = "Lclient!jf;")
	public Class122 aClass122_3;

	@OriginalMember(owner = "client!vt", name = "r", descriptor = "B")
	public byte aByte101;

	@OriginalMember(owner = "client!vt", name = "s", descriptor = "S")
	public short aShort100;

	@OriginalMember(owner = "client!vt", name = "u", descriptor = "Lclient!vm;")
	public Class255 aClass255_2;

	@OriginalMember(owner = "client!vt", name = "v", descriptor = "B")
	public byte aByte103;

	@OriginalMember(owner = "client!vt", name = "x", descriptor = "Lclient!ed;")
	public Class2_Sub5 aClass2_Sub5_1;

	@OriginalMember(owner = "client!vt", name = "y", descriptor = "Lclient!so;")
	public Class2_Sub2 aClass2_Sub2_3;

	@OriginalMember(owner = "client!vt", name = "z", descriptor = "Lclient!em;")
	public Class2_Sub4 aClass2_Sub4_3;

	@OriginalMember(owner = "client!vt", name = "A", descriptor = "Z")
	public boolean aBoolean490;

	@OriginalMember(owner = "client!vt", name = "C", descriptor = "Z")
	public boolean aBoolean491;

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "B")
	public byte aByte97 = 0;

	@OriginalMember(owner = "client!vt", name = "t", descriptor = "B")
	public byte aByte102;

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "B")
	public byte aByte98;

	@OriginalMember(owner = "client!vt", name = "w", descriptor = "S")
	public final short aShort101;

	@OriginalMember(owner = "client!vt", name = "B", descriptor = "S")
	public final short aShort102;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(III)V")
	public Class258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte98 = this.aByte102 = (byte) arg0;
		this.aShort101 = (short) arg2;
		this.aShort102 = (short) arg1;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
	public void method5803() {
		while (this.aClass122_3 != null) {
			@Pc(11) Class122 local11 = this.aClass122_3.aClass122_1;
			this.aClass122_3.method2597();
			this.aClass122_3 = local11;
		}
		this.aByte97 = 0;
	}
}
