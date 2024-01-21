import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "Lclient!ca;")
	public Class7 aClass7_1;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "Lclient!ma;")
	public Class51 aClass51_1;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
	public int anInt1540;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "Lclient!fc;")
	public Class1_Sub10 aClass1_Sub10_1;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
	public int anInt1544;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "Lclient!kb;")
	public Class44 aClass44_1;

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "Z")
	public boolean aBoolean112;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
	public int anInt1545;

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "Z")
	public boolean aBoolean113;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "Lclient!fe;")
	public Class21 aClass21_1;

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
	public int anInt1546;

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
	public int anInt1547;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "Lclient!nb;")
	public Class56 aClass56_1;

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "Lclient!pg;")
	public Class69 aClass69_1;

	@OriginalMember(owner = "client!fc", name = "T", descriptor = "Z")
	public boolean aBoolean114;

	@OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
	public int anInt1550;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
	public int anInt1538 = 0;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "[I")
	public final int[] anIntArray160 = new int[5];

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "[Lclient!nf;")
	public final Class59[] aClass59Array4 = new Class59[5];

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
	public final int anInt1543;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
	public int anInt1537;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
	public final int anInt1539;

	@OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
	public final int anInt1549;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(III)V")
	public Class1_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1543 = arg1;
		this.anInt1539 = this.anInt1537 = arg0;
		this.anInt1549 = arg2;
	}
}
