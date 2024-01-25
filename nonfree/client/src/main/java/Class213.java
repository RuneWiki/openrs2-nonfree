import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class213 {

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!op;")
	public Class10_Sub1 aClass10_Sub1_1;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Lclient!we;")
	public Class213 aClass213_1;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Lclient!tk;")
	public Class10_Sub5 aClass10_Sub5_1;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "Lclient!jp;")
	public Class109 aClass109_2;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "Lclient!gr;")
	public Class81 aClass81_4;

	@OriginalMember(owner = "client!we", name = "t", descriptor = "B")
	public byte aByte69;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "Lclient!aq;")
	public Class10_Sub2 aClass10_Sub2_1;

	@OriginalMember(owner = "client!we", name = "x", descriptor = "Lclient!aq;")
	public Class10_Sub2 aClass10_Sub2_2;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "B")
	public byte aByte71;

	@OriginalMember(owner = "client!we", name = "C", descriptor = "Lclient!cb;")
	public Class10_Sub4 aClass10_Sub4_1;

	@OriginalMember(owner = "client!we", name = "F", descriptor = "B")
	public byte aByte74;

	@OriginalMember(owner = "client!we", name = "H", descriptor = "Z")
	public boolean aBoolean438;

	@OriginalMember(owner = "client!we", name = "J", descriptor = "Z")
	public boolean aBoolean439;

	@OriginalMember(owner = "client!we", name = "K", descriptor = "Z")
	public boolean aBoolean440;

	@OriginalMember(owner = "client!we", name = "L", descriptor = "S")
	public short aShort92;

	@OriginalMember(owner = "client!we", name = "N", descriptor = "Lclient!cb;")
	public Class10_Sub4 aClass10_Sub4_2;

	@OriginalMember(owner = "client!we", name = "O", descriptor = "B")
	public byte aByte75;

	@OriginalMember(owner = "client!we", name = "A", descriptor = "B")
	public byte aByte72 = 0;

	@OriginalMember(owner = "client!we", name = "E", descriptor = "S")
	public final short aShort91;

	@OriginalMember(owner = "client!we", name = "s", descriptor = "S")
	public final short aShort90;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "B")
	public byte aByte70;

	@OriginalMember(owner = "client!we", name = "D", descriptor = "B")
	public byte aByte73;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(III)V")
	public Class213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort91 = (short) arg2;
		this.aShort90 = (short) arg1;
		this.aByte73 = this.aByte70 = (byte) arg0;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public void method5873() {
		while (this.aClass81_4 != null) {
			@Pc(11) Class81 local11 = this.aClass81_4.aClass81_3;
			this.aClass81_4.method2352();
			this.aClass81_4 = local11;
		}
		this.aByte72 = 0;
	}
}
