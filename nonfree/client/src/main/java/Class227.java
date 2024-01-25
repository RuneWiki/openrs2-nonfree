import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class227 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "B")
	public byte aByte65;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "Lclient!ui;")
	public Class227 aClass227_1;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "B")
	public byte aByte66;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "Lclient!we;")
	public Class12_Sub4 aClass12_Sub4_2;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "Z")
	public boolean aBoolean463;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "Z")
	public boolean aBoolean464;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "Z")
	public boolean aBoolean465;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "Lclient!np;")
	public Class164 aClass164_25;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "Lclient!wm;")
	public Class12_Sub3 aClass12_Sub3_1;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "B")
	public byte aByte67;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "Lclient!pi;")
	public Class12_Sub2 aClass12_Sub2_2;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "S")
	public short aShort91;

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "Lclient!of;")
	public Class12_Sub5 aClass12_Sub5_2;

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "Lclient!pi;")
	public Class12_Sub2 aClass12_Sub2_3;

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "Lclient!we;")
	public Class12_Sub4 aClass12_Sub4_3;

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "B")
	public byte aByte70;

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "Lclient!nd;")
	public Class157 aClass157_2;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "B")
	public byte aByte64 = 0;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "S")
	public final short aShort90;

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "S")
	public final short aShort92;

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "B")
	public byte aByte69;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "B")
	public byte aByte68;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(III)V")
	public Class227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort90 = (short) arg1;
		this.aShort92 = (short) arg2;
		this.aByte68 = this.aByte69 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
	public void method5357() {
		while (this.aClass164_25 != null) {
			@Pc(11) Class164 local11 = this.aClass164_25.aClass164_19;
			this.aClass164_25.method3902();
			this.aClass164_25 = local11;
		}
		this.aByte64 = 0;
	}
}
