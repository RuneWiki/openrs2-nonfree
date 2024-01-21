import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class39 {

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
	private int anInt1655 = -1;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
	private int anInt1664 = 0;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!of;")
	private Class70 aClass70_4 = new Class70();

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
	private final int anInt1662;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
	private final int anInt1661;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "[Lclient!b;")
	private Class3_Sub3[] aClass3_Sub3Array1;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(III)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1662 = arg1;
		this.anInt1661 = arg0;
		this.anIntArrayArray17 = new int[arg0][arg2];
		this.aClass3_Sub3Array1 = new Class3_Sub3[arg1];
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public void method1111() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1661; local3++) {
			this.anIntArrayArray17[local3] = null;
		}
		this.anIntArrayArray17 = null;
		this.aClass3_Sub3Array1 = null;
		this.aClass70_4.method1954();
		this.aClass70_4 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[I")
	public int[] method1114(@OriginalArg(0) int arg0) {
		if (this.anInt1662 == this.anInt1661) {
			this.aBoolean66 = this.aClass3_Sub3Array1[arg0] == null;
			this.aClass3_Sub3Array1[arg0] = Static64.aClass3_Sub3_1;
			return this.anIntArrayArray17[arg0];
		} else if (this.anInt1661 == 1) {
			this.aBoolean66 = arg0 != this.anInt1655;
			this.anInt1655 = arg0;
			return this.anIntArrayArray17[0];
		} else {
			@Pc(50) Class3_Sub3 local50 = this.aClass3_Sub3Array1[arg0];
			if (this.aBoolean66 = local50 == null) {
				if (this.anInt1664 < this.anInt1661) {
					local50 = new Class3_Sub3(arg0, this.anInt1664);
					this.anInt1664++;
				} else {
					@Pc(89) Class3_Sub3 local89 = (Class3_Sub3) this.aClass70_4.method1956();
					local50 = new Class3_Sub3(arg0, local89.anInt240);
					this.aClass3_Sub3Array1[local89.anInt241] = null;
					local89.method3159();
				}
				this.aClass3_Sub3Array1[arg0] = local50;
			}
			this.aClass70_4.method1963(local50);
			return this.anIntArrayArray17[local50.anInt240];
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)[[I")
	public int[][] method1115() {
		if (this.anInt1662 != this.anInt1661) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(31) int local31 = 0; local31 < this.anInt1661; local31++) {
			this.aClass3_Sub3Array1[local31] = Static64.aClass3_Sub3_1;
		}
		return this.anIntArrayArray17;
	}
}
