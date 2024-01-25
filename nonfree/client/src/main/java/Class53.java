import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class53 {

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "Lclient!lf;")
	public Class6_Sub4 aClass6_Sub4_1;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Lclient!mj;")
	public Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "Lclient!vo;")
	public Class256 aClass256_1;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "B")
	public byte aByte35;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "Z")
	public boolean aBoolean127;

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "Lclient!kq;")
	public Class6_Sub5 aClass6_Sub5_1;

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "Z")
	public boolean aBoolean129;

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "Lclient!mj;")
	public Class6_Sub1 aClass6_Sub1_2;

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "Lclient!np;")
	public Class165 aClass165_1;

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "Lclient!dr;")
	public Class53 aClass53_1;

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "B")
	public byte aByte38;

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "Lclient!jo;")
	public Class6_Sub3 aClass6_Sub3_1;

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "B")
	public byte aByte39;

	@OriginalMember(owner = "client!dr", name = "w", descriptor = "S")
	public short aShort40;

	@OriginalMember(owner = "client!dr", name = "y", descriptor = "B")
	public byte aByte40;

	@OriginalMember(owner = "client!dr", name = "A", descriptor = "Lclient!jo;")
	public Class6_Sub3 aClass6_Sub3_2;

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "B")
	public byte aByte34 = 0;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "S")
	public final short aShort39;

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "B")
	public byte aByte36;

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "B")
	public byte aByte37;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "S")
	public final short aShort38;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(III)V")
	public Class53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort39 = (short) arg1;
		this.aByte37 = this.aByte36 = (byte) arg0;
		this.aShort38 = (short) arg2;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	public void method1418() {
		while (this.aClass165_1 != null) {
			@Pc(15) Class165 local15 = this.aClass165_1.aClass165_2;
			this.aClass165_1.method3654();
			this.aClass165_1 = local15;
		}
		this.aByte34 = 0;
	}
}
