import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class3_Sub1_Sub5_Sub3 extends Class3_Sub1_Sub5 {

	@OriginalMember(owner = "client!ga", name = "tb", descriptor = "I")
	private int anInt1184 = 0;

	@OriginalMember(owner = "client!ga", name = "vb", descriptor = "Z")
	public boolean aBoolean65 = false;

	@OriginalMember(owner = "client!ga", name = "Jb", descriptor = "I")
	private int anInt1194 = 0;

	@OriginalMember(owner = "client!ga", name = "Gb", descriptor = "I")
	public final int anInt1193;

	@OriginalMember(owner = "client!ga", name = "yb", descriptor = "I")
	public final int anInt1187;

	@OriginalMember(owner = "client!ga", name = "Kb", descriptor = "I")
	private final int anInt1195;

	@OriginalMember(owner = "client!ga", name = "Fb", descriptor = "I")
	public final int anInt1192;

	@OriginalMember(owner = "client!ga", name = "Bb", descriptor = "I")
	public final int anInt1188;

	@OriginalMember(owner = "client!ga", name = "Cb", descriptor = "I")
	public final int anInt1189;

	@OriginalMember(owner = "client!ga", name = "Hb", descriptor = "Lclient!uc;")
	private Class3_Sub1_Sub17 aClass3_Sub1_Sub17_1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub1_Sub5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1193 = arg4;
		this.anInt1187 = arg5 + arg6;
		this.anInt1195 = arg0;
		this.anInt1192 = arg3;
		this.anInt1188 = arg2;
		this.anInt1189 = arg1;
		@Pc(36) int local36 = Static90.method1658(this.anInt1195).anInt1307;
		if (local36 == -1) {
			this.aBoolean65 = true;
		} else {
			this.aBoolean65 = false;
			this.aClass3_Sub1_Sub17_1 = Static111.method2009(local36);
		}
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(Z)Lclient!oa;")
	@Override
	public Class3_Sub1_Sub5_Sub7 method1874() {
		@Pc(13) Class3_Sub1_Sub8 local13 = Static90.method1658(this.anInt1195);
		@Pc(22) Class3_Sub1_Sub5_Sub7 local22;
		if (this.aBoolean65) {
			local22 = local13.method814(-1);
		} else {
			local22 = local13.method814(this.anInt1194);
		}
		return local22 == null ? null : local22;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)V")
	public void method731(@OriginalArg(1) int arg0) {
		if (this.aBoolean65) {
			return;
		}
		this.anInt1184 += arg0;
		while (this.anInt1184 > this.aClass3_Sub1_Sub17_1.anIntArray374[this.anInt1194]) {
			this.anInt1184 -= this.aClass3_Sub1_Sub17_1.anIntArray374[this.anInt1194];
			this.anInt1194++;
			if (this.anInt1194 >= this.aClass3_Sub1_Sub17_1.anIntArray377.length) {
				this.aBoolean65 = true;
				return;
			}
		}
	}
}
