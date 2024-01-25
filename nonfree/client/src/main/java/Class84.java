import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class84 {

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "Lclient!im;")
	public Class16_Sub1_Sub4 aClass16_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "Lclient!he;")
	public Class16_Sub1_Sub2 aClass16_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "Lclient!qca;")
	public Class16_Sub1_Sub3 aClass16_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "S")
	public short aShort43;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "S")
	public short aShort44;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "Lclient!ds;")
	public Class84 aClass84_1;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "Lclient!he;")
	public Class16_Sub1_Sub2 aClass16_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "Lclient!kv;")
	public Class16_Sub1_Sub5 aClass16_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "S")
	public short aShort45;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "S")
	public short aShort46;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "Lclient!tl;")
	public Class333 aClass333_1;

	@OriginalMember(owner = "client!ds", name = "u", descriptor = "Lclient!im;")
	public Class16_Sub1_Sub4 aClass16_Sub1_Sub4_2;

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "B")
	public byte aByte42;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(I)V")
	public Class84(@OriginalArg(0) int arg0) {
		this.aByte42 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
	public void method2016() {
		while (this.aClass333_1 != null) {
			@Pc(8) Class333 local8 = this.aClass333_1.aClass333_3;
			this.aClass333_1.method7822();
			this.aClass333_1 = local8;
		}
	}
}
