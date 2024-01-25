import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class101 {

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "Z")
	public boolean aBoolean192;

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "Z")
	public boolean aBoolean193;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "B")
	public byte aByte38;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "B")
	public byte aByte39;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "Lclient!fg;")
	public Class3_Sub5 aClass3_Sub5_1;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "Lclient!bv;")
	public Class32 aClass32_1;

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "Lclient!et;")
	public Class3_Sub3 aClass3_Sub3_1;

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "Z")
	public boolean aBoolean194;

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "Lclient!kp;")
	public Class145 aClass145_1;

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "Lclient!uf;")
	public Class3_Sub4 aClass3_Sub4_1;

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "B")
	public byte aByte42;

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "Lclient!ab;")
	public Class3_Sub1 aClass3_Sub1_2;

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "S")
	public short aShort36;

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "B")
	public byte aByte44;

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "Lclient!ab;")
	public Class3_Sub1 aClass3_Sub1_3;

	@OriginalMember(owner = "client!hg", name = "y", descriptor = "Lclient!et;")
	public Class3_Sub3 aClass3_Sub3_2;

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "Lclient!hg;")
	public Class101 aClass101_1;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "B")
	public byte aByte41 = 0;

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "B")
	public byte aByte40;

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "B")
	public byte aByte43;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "S")
	public final short aShort35;

	@OriginalMember(owner = "client!hg", name = "w", descriptor = "S")
	public final short aShort37;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(III)V")
	public Class101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte43 = this.aByte40 = (byte) arg0;
		this.aShort35 = (short) arg1;
		this.aShort37 = (short) arg2;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public void method2554() {
		while (this.aClass145_1 != null) {
			@Pc(19) Class145 local19 = this.aClass145_1.aClass145_2;
			this.aClass145_1.method3260();
			this.aClass145_1 = local19;
		}
		this.aByte41 = 0;
	}
}
