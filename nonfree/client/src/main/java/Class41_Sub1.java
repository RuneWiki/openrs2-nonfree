import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public abstract class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "B")
	public byte aByte149;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "B")
	public byte aByte150;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
	public int anInt10363;

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "Lclient!sf;")
	public Class41_Sub1 aClass41_Sub1_23;

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
	public int anInt10365;

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
	public int anInt10366;

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
	public int anInt10367;

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "Z")
	public boolean aBoolean763;

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
	public int anInt10369;

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
	public int anInt10370;

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "Z")
	public boolean aBoolean762 = false;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	protected Class41_Sub1() {
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)Z")
	public abstract boolean method8647();

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ha;B)Lclient!hq;")
	public abstract Class41_Sub3 method8648(@OriginalArg(0) Class143 arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z[Lclient!jw;)I")
	public abstract int method8649(@OriginalArg(1) Class5_Sub3[] arg0);

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)Z")
	public abstract boolean method8650();

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(ILclient!ha;)Z")
	public abstract boolean method8651(@OriginalArg(1) Class143 arg0);

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)I")
	public abstract int method8652();

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "(I)Z")
	public abstract boolean method8653();

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "(I)V")
	public abstract void method8654();

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Lclient!ha;B)Lclient!pw;")
	public abstract Class280 method8656(@OriginalArg(0) Class143 arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([Lclient!jw;BII)I")
	protected final int method8657(@OriginalArg(0) Class5_Sub3[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static98.aLongArrayArrayArray1[this.aByte149][arg2][arg1];
		@Pc(16) long local16 = 0L;
		@Pc(18) int local18 = 0;
		@Pc(28) int local28;
		while (local16 <= 48L) {
			local28 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local28 <= 0) {
				break;
			}
			local16 += 16L;
			arg0[local18++] = Static602.aClass371Array5[local28 - 1].aClass5_Sub3_3;
		}
		for (local28 = local18; local28 < 4; local28++) {
			arg0[local28] = null;
		}
		return local18;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!sf;Lclient!ha;BIIZ)V")
	public abstract void method8658(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "(I)I")
	public abstract int method8660(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZLclient!ha;I)Z")
	public abstract boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ha;I)V")
	public abstract void method8662(@OriginalArg(0) Class143 arg0);

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "(I)I")
	public int method8663() {
		return 0;
	}

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "(I)Z")
	public abstract boolean method8664();
}
