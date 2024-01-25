import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hka")
public final class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!hka", name = "p", descriptor = "Z")
	private boolean aBoolean319;

	@OriginalMember(owner = "client!hka", name = "t", descriptor = "[I")
	private int[] anIntArray386;

	@OriginalMember(owner = "client!hka", name = "u", descriptor = "B")
	public byte aByte60;

	@OriginalMember(owner = "client!hka", name = "z", descriptor = "[Lclient!wq;")
	public Class391[] aClass391Array1;

	@OriginalMember(owner = "client!hka", name = "A", descriptor = "J")
	public long aLong131;

	@OriginalMember(owner = "client!hka", name = "D", descriptor = "B")
	public byte aByte61;

	@OriginalMember(owner = "client!hka", name = "q", descriptor = "I")
	public int anInt4268 = 0;

	@OriginalMember(owner = "client!hka", name = "C", descriptor = "Ljava/lang/String;")
	public String aString39 = null;

	@OriginalMember(owner = "client!hka", name = "B", descriptor = "Z")
	private boolean aBoolean320 = true;

	@OriginalMember(owner = "client!hka", name = "<init>", descriptor = "(Lclient!jp;)V")
	public Class3_Sub30(@OriginalArg(0) Class3_Sub25 arg0) {
		this.method3898(arg0);
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(B)[I")
	public int[] method3895() {
		if (this.anIntArray386 == null) {
			@Pc(13) String[] local13 = new String[this.anInt4268];
			this.anIntArray386 = new int[this.anInt4268];
			@Pc(20) int local20 = 0;
			while (local20 < this.anInt4268) {
				local13[local20] = this.aClass391Array1[local20].aString127;
				this.anIntArray386[local20] = local20++;
			}
			Static579.method8158(this.anIntArray386, local13);
		}
		return this.anIntArray386;
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method3896(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt4268; local12++) {
			if (this.aClass391Array1[local12].aString127.equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(IZ)V")
	private void method3897(@OriginalArg(0) int arg0) {
		if (this.aClass391Array1 == null) {
			this.aClass391Array1 = new Class391[arg0];
		} else {
			Static684.method5327(this.aClass391Array1, 0, this.aClass391Array1 = new Class391[arg0], 0, this.anInt4268);
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(Lclient!jp;B)V")
	private void method3898(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(9) int local9 = arg0.method8632();
		if ((local9 & 0x1) != 0) {
			this.aBoolean319 = true;
		}
		if ((local9 & 0x2) != 0) {
			this.aBoolean320 = true;
		}
		super.aLong311 = arg0.method8600();
		this.aLong131 = arg0.method8600();
		this.aString39 = arg0.method8613();
		arg0.method8632();
		this.aByte61 = arg0.method8621();
		this.aByte60 = arg0.method8621();
		this.anInt4268 = arg0.method8593();
		if (this.anInt4268 <= 0) {
			return;
		}
		this.aClass391Array1 = new Class391[this.anInt4268];
		for (@Pc(81) int local81 = 0; local81 < this.anInt4268; local81++) {
			@Pc(87) Class391 local87 = new Class391();
			if (this.aBoolean319) {
				arg0.method8600();
			}
			if (this.aBoolean320) {
				local87.aString127 = arg0.method8613();
			}
			local87.aByte181 = arg0.method8621();
			local87.anInt10842 = arg0.method8593();
			this.aClass391Array1[local81] = local87;
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(II)V")
	public void method3900(@OriginalArg(1) int arg0) {
		this.anInt4268--;
		if (this.anInt4268 == 0) {
			this.aClass391Array1 = null;
		} else {
			Static684.method5327(this.aClass391Array1, arg0 + 1, this.aClass391Array1, arg0, this.anInt4268 - arg0);
		}
		this.anIntArray386 = null;
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(Lclient!wq;I)V")
	public void method3903(@OriginalArg(0) Class391 arg0) {
		if (this.aClass391Array1 == null || this.anInt4268 >= this.aClass391Array1.length) {
			this.method3897(this.anInt4268 + 5);
		}
		this.aClass391Array1[this.anInt4268++] = arg0;
		this.anIntArray386 = null;
	}
}
