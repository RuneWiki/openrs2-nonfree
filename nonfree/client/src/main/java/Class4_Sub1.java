import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!jw", name = "f", descriptor = "I")
	public int anInt8911;

	@OriginalMember(owner = "client!jw", name = "i", descriptor = "I")
	public int anInt8914;

	@OriginalMember(owner = "client!jw", name = "j", descriptor = "B")
	public byte aByte123;

	@OriginalMember(owner = "client!jw", name = "k", descriptor = "Z")
	public boolean aBoolean638;

	@OriginalMember(owner = "client!jw", name = "l", descriptor = "I")
	public int anInt8915;

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "I")
	public int anInt8916;

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "B")
	public byte aByte124;

	@OriginalMember(owner = "client!jw", name = "o", descriptor = "I")
	public int anInt8917;

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "I")
	public int anInt8918;

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "Z")
	public boolean aBoolean637 = false;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "()V")
	protected Class4_Sub1() {
	}

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "(B)I")
	public abstract int method7689(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "(I)Z")
	public abstract boolean method7690();

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I[Lclient!wh;II)I")
	protected final int method7691(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub16[] arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static207.aLongArrayArrayArray1[this.aByte123][arg0][arg2];
		@Pc(22) long local22 = 0L;
		@Pc(24) int local24 = 0;
		@Pc(34) int local34;
		while (local22 <= 48L) {
			local34 = (int) (local14 >> (int) local22 & 0xFFFFL);
			if (local34 <= 0) {
				break;
			}
			local22 += 16L;
			arg1[local24++] = Static89.aClass206Array1[local34 - 1].aClass3_Sub16_3;
		}
		for (local34 = local24; local34 < 4; local34++) {
			arg1[local34] = null;
		}
		return local24;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BLclient!ha;)Lclient!qs;")
	public abstract Class4_Sub8 method7692(@OriginalArg(1) Class5 arg0);

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "(B)Z")
	public abstract boolean method7693();

	@OriginalMember(owner = "client!jw", name = "f", descriptor = "(B)Z")
	public abstract boolean method7694();

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(Z)I")
	public int method7695() {
		return 0;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILclient!jw;Lclient!ha;BIZI)V")
	public abstract void method7696(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "(I)V")
	public abstract void method7697();

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I[Lclient!wh;)I")
	public abstract int method7698(@OriginalArg(1) Class3_Sub16[] arg0);

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(BLclient!ha;)V")
	public abstract void method7699(@OriginalArg(1) Class5 arg0);

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(BLclient!ha;)Lclient!ro;")
	public abstract Class297 method7700(@OriginalArg(1) Class5 arg0);

	@OriginalMember(owner = "client!jw", name = "f", descriptor = "(I)Z")
	public abstract boolean method7701();

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "(B)Z")
	public abstract boolean method7702();

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "(I)I")
	public abstract int method7703();

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIILclient!ha;)Z")
	public abstract boolean method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2);
}
