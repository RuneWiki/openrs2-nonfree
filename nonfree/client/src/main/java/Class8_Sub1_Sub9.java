import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class8_Sub1_Sub9 extends Class8_Sub1 {

	@OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
	public int anInt1022;

	@OriginalMember(owner = "client!ga", name = "Y", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!ga", name = "bb", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!ga", name = "db", descriptor = "I")
	public int anInt1026;

	@OriginalMember(owner = "client!ga", name = "mb", descriptor = "[Lclient!ic;")
	public Class34[] aClass34Array9;

	@OriginalMember(owner = "client!ga", name = "ob", descriptor = "I")
	public int anInt1033;

	@OriginalMember(owner = "client!ga", name = "jb", descriptor = "Lclient!ic;")
	public Class34 aClass34_546 = Static51.aClass34_678;

	@OriginalMember(owner = "client!ga", name = "kb", descriptor = "I")
	public int anInt1030 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!wd;B)V")
	private void method636(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt1033 = arg1.method1872();
		} else if (arg0 == 2) {
			this.anInt1022 = arg1.method1872();
		} else if (arg0 == 3) {
			this.aClass34_546 = arg1.method1892();
		} else if (arg0 == 4) {
			this.anInt1026 = arg1.method1853();
		} else {
			@Pc(63) int local63;
			if (arg0 == 5) {
				this.anInt1030 = arg1.method1839();
				this.aClass34Array9 = new Class34[this.anInt1030];
				this.anIntArray137 = new int[this.anInt1030];
				for (local63 = 0; local63 < this.anInt1030; local63++) {
					this.anIntArray137[local63] = arg1.method1853();
					this.aClass34Array9[local63] = arg1.method1892();
				}
			} else if (arg0 == 6) {
				this.anInt1030 = arg1.method1839();
				this.anIntArray137 = new int[this.anInt1030];
				this.anIntArray136 = new int[this.anInt1030];
				for (local63 = 0; local63 < this.anInt1030; local63++) {
					this.anIntArray137[local63] = arg1.method1853();
					this.anIntArray136[local63] = arg1.method1853();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!wd;)V")
	public void method640(@OriginalArg(1) Class8_Sub20 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1872();
			if (local13 == 0) {
				return;
			}
			this.method636(local13, arg0);
		}
	}
}
