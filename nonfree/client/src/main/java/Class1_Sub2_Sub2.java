import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public abstract class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
	protected int anInt203;

	@OriginalMember(owner = "client!tg", name = "Y", descriptor = "I")
	public int anInt205;

	@OriginalMember(owner = "client!tg", name = "bb", descriptor = "I")
	protected int anInt206;

	@OriginalMember(owner = "client!tg", name = "eb", descriptor = "I")
	public int anInt208;

	@OriginalMember(owner = "client!tg", name = "fb", descriptor = "I")
	public int anInt209;

	@OriginalMember(owner = "client!tg", name = "gb", descriptor = "I")
	public int anInt210;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	protected Class1_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZIII)V")
	public final void method183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anInt205 << 3;
		@Pc(21) int local21 = (arg1 << 4) + (local8 & 0xF);
		@Pc(26) int local26 = this.anInt210 << 3;
		@Pc(35) int local35 = (arg3 << 4) + (local26 & 0xF);
		this.method193(local8, local26, local21, local35, arg2, arg0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V")
	public abstract void method186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V")
	public abstract void method188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V")
	public abstract void method189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V")
	public abstract void method190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIII)V")
	public abstract void method194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)V")
	public abstract void method195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
