import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class83 {

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "Z")
	public boolean aBoolean157;

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Lclient!je;")
	public Class10_Sub4 aClass10_Sub4_1;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "Lclient!gk;")
	public Class83 aClass83_1;

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "B")
	public byte aByte26;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "Lclient!op;")
	public Class153 aClass153_1;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "Z")
	public boolean aBoolean158;

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "B")
	public byte aByte28;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "Lclient!e;")
	public Class10_Sub2 aClass10_Sub2_1;

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "B")
	public byte aByte29;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "Lclient!e;")
	public Class10_Sub2 aClass10_Sub2_2;

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "S")
	public short aShort37;

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "B")
	public byte aByte30;

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "Lclient!el;")
	public Class59 aClass59_2;

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "Lclient!je;")
	public Class10_Sub4 aClass10_Sub4_2;

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "Z")
	public boolean aBoolean159;

	@OriginalMember(owner = "client!gk", name = "z", descriptor = "Lclient!vc;")
	public Class10_Sub5 aClass10_Sub5_1;

	@OriginalMember(owner = "client!gk", name = "B", descriptor = "Lclient!js;")
	public Class10_Sub3 aClass10_Sub3_1;

	@OriginalMember(owner = "client!gk", name = "C", descriptor = "B")
	public byte aByte32 = 0;

	@OriginalMember(owner = "client!gk", name = "D", descriptor = "S")
	public final short aShort39;

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "B")
	public byte aByte31;

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "B")
	public byte aByte27;

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "S")
	public final short aShort38;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(III)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort39 = (short) arg2;
		this.aByte27 = this.aByte31 = (byte) arg0;
		this.aShort38 = (short) arg1;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
	public void method1603() {
		while (this.aClass59_2 != null) {
			@Pc(19) Class59 local19 = this.aClass59_2.aClass59_1;
			this.aClass59_2.method1257();
			this.aClass59_2 = local19;
		}
		this.aByte32 = 0;
	}
}
