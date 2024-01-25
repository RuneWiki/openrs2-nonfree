import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class217 {

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "S")
	public short aShort195;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "B")
	public byte aByte88;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "Lclient!tg;")
	public Class217 aClass217_1;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "Lclient!rr;")
	public Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "Z")
	public boolean aBoolean464;

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "Lclient!mu;")
	public Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "Z")
	public boolean aBoolean465;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "Lclient!pd;")
	public Class182 aClass182_3;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "B")
	public byte aByte91;

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "Lclient!us;")
	public Class1_Sub4 aClass1_Sub4_1;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "Lclient!rr;")
	public Class1_Sub1 aClass1_Sub1_3;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "B")
	public byte aByte92;

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "Lclient!nm;")
	public Class1_Sub5 aClass1_Sub5_2;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "Lclient!iv;")
	public Class116 aClass116_1;

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Lclient!nm;")
	public Class1_Sub5 aClass1_Sub5_3;

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "B")
	public byte aByte94;

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "Z")
	public boolean aBoolean466;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "B")
	public byte aByte90 = 0;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "S")
	public final short aShort197;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "B")
	public byte aByte89;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "B")
	public byte aByte93;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "S")
	public final short aShort196;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(III)V")
	public Class217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort197 = (short) arg1;
		this.aByte93 = this.aByte89 = (byte) arg0;
		this.aShort196 = (short) arg2;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public void method5243() {
		while (this.aClass182_3 != null) {
			@Pc(17) Class182 local17 = this.aClass182_3.aClass182_2;
			this.aClass182_3.method4451();
			this.aClass182_3 = local17;
		}
		this.aByte90 = 0;
	}
}
