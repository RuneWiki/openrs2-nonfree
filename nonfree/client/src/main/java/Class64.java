import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class64 {

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Z")
	public boolean aBoolean152;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Lclient!ka;")
	public Class158 aClass158_1;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "Lclient!dg;")
	public Class64 aClass64_1;

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "Lclient!bq;")
	public Class20_Sub2 aClass20_Sub2_1;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!bq;")
	public Class20_Sub2 aClass20_Sub2_2;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "Lclient!qn;")
	public Class20_Sub4 aClass20_Sub4_1;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "Lclient!pv;")
	public Class232 aClass232_2;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "Z")
	public boolean aBoolean153;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "B")
	public byte aByte28;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "S")
	public short aShort23;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "Z")
	public boolean aBoolean154;

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "Lclient!wv;")
	public Class20_Sub5 aClass20_Sub5_1;

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "Lclient!qn;")
	public Class20_Sub4 aClass20_Sub4_2;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "B")
	public byte aByte29;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "Lclient!ig;")
	public Class20_Sub3 aClass20_Sub3_1;

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "B")
	public byte aByte30;

	@OriginalMember(owner = "client!dg", name = "x", descriptor = "B")
	public byte aByte31;

	@OriginalMember(owner = "client!dg", name = "y", descriptor = "B")
	public byte aByte32 = 0;

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "B")
	public byte aByte33;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "B")
	public byte aByte27;

	@OriginalMember(owner = "client!dg", name = "A", descriptor = "S")
	public final short aShort24;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "S")
	public final short aShort22;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(III)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte27 = this.aByte33 = (byte) arg0;
		this.aShort24 = (short) arg2;
		this.aShort22 = (short) arg1;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public void method1815() {
		while (this.aClass232_2 != null) {
			@Pc(7) Class232 local7 = this.aClass232_2.aClass232_3;
			this.aClass232_2.method6157();
			this.aClass232_2 = local7;
		}
		this.aByte32 = 0;
	}
}
