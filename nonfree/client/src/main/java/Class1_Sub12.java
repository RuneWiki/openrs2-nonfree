import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "Z")
	public boolean aBoolean70;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)I")
	public final int method1086() {
		return 1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "()I")
	public int method1087() {
		return 0;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	public abstract void method1089(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "()V")
	public abstract void method1090();

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)Z")
	public final boolean method1091() {
		return false;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
	public abstract void method1092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)Z")
	public final boolean method1093() {
		return false;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "()Z")
	public abstract boolean method1095();

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V")
	public abstract void method1097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)Z")
	public final boolean method1099() {
		return this.aBoolean70;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "()Z")
	public abstract boolean method1101();
}
