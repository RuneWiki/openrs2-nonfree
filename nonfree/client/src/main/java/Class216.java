import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class216 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "B")
	public byte aByte78;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!gq;")
	public Class11_Sub4 aClass11_Sub4_1;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Z")
	public boolean aBoolean507;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!dj;")
	public Class11_Sub3 aClass11_Sub3_2;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!gq;")
	public Class11_Sub4 aClass11_Sub4_2;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "B")
	public byte aByte80;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Z")
	public boolean aBoolean508;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!vb;")
	public Class259 aClass259_1;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "Lclient!rb;")
	public Class216 aClass216_1;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "B")
	public byte aByte82;

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "Lclient!dj;")
	public Class11_Sub3 aClass11_Sub3_3;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "S")
	public short aShort82;

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "B")
	public byte aByte84;

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "Z")
	public boolean aBoolean509;

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "Lclient!sj;")
	public Class232 aClass232_2;

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "Lclient!na;")
	public Class11_Sub2 aClass11_Sub2_2;

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "Lclient!hr;")
	public Class11_Sub5 aClass11_Sub5_1;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "B")
	public byte aByte83 = 0;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "B")
	public byte aByte81;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "B")
	public byte aByte79;

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "S")
	public final short aShort83;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "S")
	public final short aShort81;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(III)V")
	public Class216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte79 = this.aByte81 = (byte) arg0;
		this.aShort83 = (short) arg1;
		this.aShort81 = (short) arg2;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public void method4559() {
		while (this.aClass259_1 != null) {
			@Pc(11) Class259 local11 = this.aClass259_1.aClass259_4;
			this.aClass259_1.method5413();
			this.aClass259_1 = local11;
		}
		this.aByte83 = 0;
	}
}
