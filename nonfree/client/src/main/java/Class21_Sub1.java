import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public abstract class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
	public int anInt10550;

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
	public int anInt10551;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
	public int anInt10553;

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "B")
	public byte aByte127;

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "Z")
	public boolean aBoolean714;

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
	public int anInt10554;

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
	public int anInt10556;

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "B")
	public byte aByte128;

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
	public int anInt10557;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	protected Class21_Sub1() {
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)Z")
	public abstract boolean method8221();

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILclient!r;B)Z")
	public abstract boolean method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2);

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(ILclient!r;)Lclient!eh;")
	public abstract Class93 method8223(@OriginalArg(1) Class7 arg0);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)I")
	public abstract int method8224(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)Z")
	public abstract boolean method8225();

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)Z")
	public abstract boolean method8226();

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!r;I)Lclient!ej;")
	public abstract Class21_Sub4 method8228(@OriginalArg(0) Class7 arg0);

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "(I)Z")
	public abstract boolean method8229();

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!vj;IZLclient!r;IIB)V")
	public abstract void method8230(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "(I)I")
	public abstract int method8231();

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "(I)V")
	public abstract void method8232();

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(ILclient!r;)V")
	public abstract void method8233(@OriginalArg(1) Class7 arg0);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[Lclient!am;)I")
	public abstract int method8234(@OriginalArg(1) Class4_Sub3[] arg0);

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(Z)Z")
	public abstract boolean method8235();

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III[Lclient!am;)I")
	protected final int method8236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub3[] arg2) {
		@Pc(14) long local14 = Static358.aLongArrayArrayArray1[this.aByte127][arg1][arg0];
		@Pc(16) long local16 = 0L;
		@Pc(18) int local18 = 0;
		@Pc(28) int local28;
		while (local16 <= 48L) {
			local28 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local28 <= 0) {
				break;
			}
			arg2[local18++] = Static201.aClass85Array1[local28 - 1].aClass4_Sub3_1;
			local16 += 16L;
		}
		for (local28 = local18; local28 < 4; local28++) {
			arg2[local28] = null;
		}
		return local18;
	}
}
