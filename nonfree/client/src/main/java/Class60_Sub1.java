import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public abstract class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!rfa", name = "u", descriptor = "I")
	public int anInt9048;

	@OriginalMember(owner = "client!rfa", name = "s", descriptor = "I")
	public int anInt9049;

	@OriginalMember(owner = "client!rfa", name = "z", descriptor = "B")
	public byte aByte134;

	@OriginalMember(owner = "client!rfa", name = "y", descriptor = "I")
	public int anInt9050;

	@OriginalMember(owner = "client!rfa", name = "v", descriptor = "I")
	public int anInt9051;

	@OriginalMember(owner = "client!rfa", name = "w", descriptor = "Z")
	public boolean aBoolean684;

	@OriginalMember(owner = "client!rfa", name = "r", descriptor = "Lclient!rfa;")
	public Class60_Sub1 aClass60_Sub1_23;

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "B")
	public byte aByte135;

	@OriginalMember(owner = "client!rfa", name = "j", descriptor = "I")
	public int anInt9055;

	@OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
	public int anInt9057;

	@OriginalMember(owner = "client!rfa", name = "q", descriptor = "Z")
	public boolean aBoolean683 = false;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
	protected Class60_Sub1() {
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!ha;I)V")
	public abstract void method7909(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II[Lclient!ta;I)I")
	protected final int method7910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub10[] arg2) {
		@Pc(14) long local14 = Static191.aLongArrayArrayArray1[this.aByte135][arg0][arg1];
		@Pc(16) long local16 = 0L;
		@Pc(18) int local18 = 0;
		@Pc(28) int local28;
		while (local16 <= 48L) {
			local28 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local28 <= 0) {
				break;
			}
			local16 += 16L;
			arg2[local18++] = Static483.aClass256Array1[local28 - 1].aClass6_Sub10_3;
		}
		for (local28 = local18; local28 < 4; local28++) {
			arg2[local28] = null;
		}
		if (16 != 16) {
			this.anInt9048 = -103;
		}
		return local18;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(ZLclient!ha;)Lclient!rs;")
	public abstract Class60_Sub9 method7911(@OriginalArg(1) Class75 arg0);

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)Z")
	public abstract boolean method7912();

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "(I)Z")
	public abstract boolean method7914();

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IBILclient!rfa;ZILclient!ha;)V")
	public abstract void method7915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5);

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "(I)I")
	public int method7916() {
		return 0;
	}

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "(B)V")
	public abstract void method7917();

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "(Z)Z")
	public abstract boolean method7918();

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "(Z)Z")
	public abstract boolean method7919();

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "(B)I")
	public abstract int method7921(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "(Z)I")
	public abstract int method7922();

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B[Lclient!ta;)I")
	public abstract int method7923(@OriginalArg(1) Class6_Sub10[] arg0);

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!ha;B)Lclient!sba;")
	public abstract Class323 method7924(@OriginalArg(0) Class75 arg0);

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(Lclient!ha;B)Z")
	public abstract boolean method7925(@OriginalArg(0) Class75 arg0);

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!ha;III)Z")
	public abstract boolean method7927(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);
}
