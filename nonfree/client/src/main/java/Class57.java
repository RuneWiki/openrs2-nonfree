import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class57 {

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
	public int anInt2126;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "[I")
	public int[] anIntArray193;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "[Lclient!sb;")
	public Class2_Sub8_Sub21[] aClass2_Sub8_Sub21Array1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I)V")
	public Class57(@OriginalArg(0) int arg0) {
		this.anInt2126 = arg0;
		this.anIntArray193 = new int[this.anInt2126];
		this.aClass2_Sub8_Sub21Array1 = new Class2_Sub8_Sub21[this.anInt2126];
	}
}
