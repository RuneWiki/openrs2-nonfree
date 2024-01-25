import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class100 {

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "Lclient!l;")
	public Class10_Sub4 aClass10_Sub4_1;

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "Lclient!c;")
	public Class42 aClass42_1;

	@OriginalMember(owner = "client!fba", name = "g", descriptor = "B")
	public byte aByte33;

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "Lclient!wh;")
	public Class10_Sub3 aClass10_Sub3_1;

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "Z")
	public boolean aBoolean244;

	@OriginalMember(owner = "client!fba", name = "l", descriptor = "Lclient!dk;")
	public Class10_Sub2 aClass10_Sub2_2;

	@OriginalMember(owner = "client!fba", name = "m", descriptor = "B")
	public byte aByte35;

	@OriginalMember(owner = "client!fba", name = "n", descriptor = "Lclient!fba;")
	public Class100 aClass100_1;

	@OriginalMember(owner = "client!fba", name = "o", descriptor = "Lclient!bo;")
	public Class35 aClass35_2;

	@OriginalMember(owner = "client!fba", name = "q", descriptor = "Lclient!dk;")
	public Class10_Sub2 aClass10_Sub2_3;

	@OriginalMember(owner = "client!fba", name = "r", descriptor = "S")
	public short aShort52;

	@OriginalMember(owner = "client!fba", name = "s", descriptor = "Lclient!l;")
	public Class10_Sub4 aClass10_Sub4_2;

	@OriginalMember(owner = "client!fba", name = "w", descriptor = "B")
	public byte aByte38;

	@OriginalMember(owner = "client!fba", name = "y", descriptor = "Z")
	public boolean aBoolean245;

	@OriginalMember(owner = "client!fba", name = "z", descriptor = "B")
	public byte aByte39;

	@OriginalMember(owner = "client!fba", name = "A", descriptor = "Z")
	public boolean aBoolean246;

	@OriginalMember(owner = "client!fba", name = "B", descriptor = "Lclient!lw;")
	public Class10_Sub5 aClass10_Sub5_1;

	@OriginalMember(owner = "client!fba", name = "t", descriptor = "B")
	public byte aByte36 = 0;

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "S")
	public final short aShort51;

	@OriginalMember(owner = "client!fba", name = "v", descriptor = "B")
	public byte aByte37;

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "B")
	public byte aByte34;

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "S")
	public final short aShort50;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(III)V")
	public Class100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort51 = (short) arg2;
		this.aByte34 = this.aByte37 = (byte) arg0;
		this.aShort50 = (short) arg1;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V")
	public void method2807() {
		while (this.aClass35_2 != null) {
			@Pc(11) Class35 local11 = this.aClass35_2.aClass35_1;
			this.aClass35_2.method734();
			this.aClass35_2 = local11;
		}
		this.aByte36 = 0;
	}
}
