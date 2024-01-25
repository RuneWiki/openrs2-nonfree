import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class6_Sub2_Sub14 extends Class6_Sub2 {

	@OriginalMember(owner = "client!mm", name = "H", descriptor = "I")
	public int anInt6587;

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
	public int anInt6588;

	@OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
	public int anInt6592;

	@OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
	public int anInt6593;

	@OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
	public int anInt6594;

	@OriginalMember(owner = "client!mm", name = "E", descriptor = "Lclient!iia;")
	public final Class173 aClass173_2;

	@OriginalMember(owner = "client!mm", name = "G", descriptor = "Lclient!el;")
	public final Class100 aClass100_1;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!iia;Lclient!it;)V")
	public Class6_Sub2_Sub14(@OriginalArg(0) Class173 arg0, @OriginalArg(1) Class60_Sub4 arg1) {
		this.aClass173_2 = arg0;
		this.aClass100_1 = this.aClass173_2.method4483();
		this.method5860();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public void method5860() {
		this.anInt6588 = this.aClass173_2.anInt4949;
		this.anInt6587 = this.aClass173_2.anInt4954;
		this.anInt6592 = this.aClass173_2.anInt4955;
		if (this.aClass173_2.aClass109_4 != null) {
			this.aClass173_2.aClass109_4.method4600(this.aClass100_1.anInt2666, this.aClass100_1.anInt2665, this.aClass100_1.anInt2667, Static385.anIntArray382);
		}
		this.anInt6593 = Static385.anIntArray382[2];
		this.anInt6594 = Static385.anIntArray382[0];
	}
}
