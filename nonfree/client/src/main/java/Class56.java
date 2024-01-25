import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class56 {

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "S")
	public short aShort20;

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "Lclient!jb;")
	public Class15_Sub1_Sub4 aClass15_Sub1_Sub4_1;

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "S")
	public short aShort21;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "Lclient!jb;")
	public Class15_Sub1_Sub4 aClass15_Sub1_Sub4_2;

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "S")
	public short aShort22;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "Lclient!v;")
	public Class15_Sub1_Sub5 aClass15_Sub1_Sub5_1;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "Lclient!aha;")
	public Class15_Sub1_Sub1 aClass15_Sub1_Sub1_1;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "S")
	public short aShort23;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "Lclient!v;")
	public Class15_Sub1_Sub5 aClass15_Sub1_Sub5_2;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "Lclient!vp;")
	public Class15_Sub1_Sub3 aClass15_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "Lclient!cj;")
	public Class56 aClass56_1;

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "Lclient!jba;")
	public Class152 aClass152_2;

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "B")
	public byte aByte22;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(I)V")
	public Class56(@OriginalArg(0) int arg0) {
		this.aByte22 = (byte) arg0;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public void method1820() {
		while (this.aClass152_2 != null) {
			@Pc(7) Class152 local7 = this.aClass152_2.aClass152_3;
			this.aClass152_2.method4440();
			this.aClass152_2 = local7;
		}
	}
}
