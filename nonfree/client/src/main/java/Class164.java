import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class164 {

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "Lclient!rb;")
	public Class16_Sub5 aClass16_Sub5_2;

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "Lclient!ii;")
	public Class16_Sub2 aClass16_Sub2_2;

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "B")
	public byte aByte48;

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "Lclient!hr;")
	public Class16_Sub4 aClass16_Sub4_2;

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "Lclient!ua;")
	public Class16_Sub3 aClass16_Sub3_1;

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "Lclient!ii;")
	public Class16_Sub2 aClass16_Sub2_3;

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "Lclient!ag;")
	public Class7 aClass7_3;

	@OriginalMember(owner = "client!nt", name = "t", descriptor = "B")
	public byte aByte49;

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "S")
	public short aShort65;

	@OriginalMember(owner = "client!nt", name = "w", descriptor = "Lclient!nt;")
	public Class164 aClass164_1;

	@OriginalMember(owner = "client!nt", name = "x", descriptor = "Z")
	public boolean aBoolean464;

	@OriginalMember(owner = "client!nt", name = "y", descriptor = "Z")
	public boolean aBoolean465;

	@OriginalMember(owner = "client!nt", name = "A", descriptor = "B")
	public byte aByte51;

	@OriginalMember(owner = "client!nt", name = "B", descriptor = "B")
	public byte aByte52;

	@OriginalMember(owner = "client!nt", name = "C", descriptor = "Z")
	public boolean aBoolean466;

	@OriginalMember(owner = "client!nt", name = "D", descriptor = "Lclient!rb;")
	public Class16_Sub5 aClass16_Sub5_3;

	@OriginalMember(owner = "client!nt", name = "E", descriptor = "Lclient!mc;")
	public Class146 aClass146_2;

	@OriginalMember(owner = "client!nt", name = "z", descriptor = "B")
	public byte aByte50 = 0;

	@OriginalMember(owner = "client!nt", name = "o", descriptor = "S")
	public final short aShort63;

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "S")
	public final short aShort64;

	@OriginalMember(owner = "client!nt", name = "G", descriptor = "B")
	public byte aByte54;

	@OriginalMember(owner = "client!nt", name = "F", descriptor = "B")
	public byte aByte53;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(III)V")
	public Class164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort63 = (short) arg2;
		this.aShort64 = (short) arg1;
		this.aByte53 = this.aByte54 = (byte) arg0;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
	public void method3915() {
		while (this.aClass7_3 != null) {
			@Pc(11) Class7 local11 = this.aClass7_3.aClass7_1;
			this.aClass7_3.method85();
			this.aClass7_3 = local11;
		}
		this.aByte50 = 0;
	}
}
