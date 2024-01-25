import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public abstract class Class15_Sub3 extends Class15 {

	@OriginalMember(owner = "client!nfa", name = "m", descriptor = "I")
	public int anInt11022;

	@OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
	public int anInt11023;

	@OriginalMember(owner = "client!nfa", name = "o", descriptor = "B")
	public byte aByte141;

	@OriginalMember(owner = "client!nfa", name = "p", descriptor = "I")
	public int anInt11024;

	@OriginalMember(owner = "client!nfa", name = "q", descriptor = "Z")
	public boolean aBoolean790;

	@OriginalMember(owner = "client!nfa", name = "r", descriptor = "I")
	public int anInt11025;

	@OriginalMember(owner = "client!nfa", name = "u", descriptor = "I")
	public int anInt11027;

	@OriginalMember(owner = "client!nfa", name = "x", descriptor = "I")
	public int anInt11029;

	@OriginalMember(owner = "client!nfa", name = "z", descriptor = "Lclient!nfa;")
	public Class15_Sub3 aClass15_Sub3_23;

	@OriginalMember(owner = "client!nfa", name = "A", descriptor = "B")
	public byte aByte142;

	@OriginalMember(owner = "client!nfa", name = "l", descriptor = "Z")
	public boolean aBoolean789 = false;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "()V")
	protected Class15_Sub3() {
	}

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "(I)Z")
	public abstract boolean method9425();

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIILclient!ha;Lclient!nfa;ZI)V")
	public abstract void method9426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) Class15_Sub3 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!ha;I)Lclient!uh;")
	public abstract Class15_Sub9 method9427(@OriginalArg(0) Class101 arg0);

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I[Lclient!mfa;)I")
	public abstract int method9428(@OriginalArg(1) Class2_Sub13[] arg0);

	@OriginalMember(owner = "client!nfa", name = "e", descriptor = "(I)V")
	public abstract void method9429();

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "(I)I")
	public abstract int method9430();

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BIILclient!ha;)Z")
	public abstract boolean method9431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2);

	@OriginalMember(owner = "client!nfa", name = "g", descriptor = "(I)I")
	public int method9432() {
		return 0;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BLclient!ha;)Z")
	public abstract boolean method9433(@OriginalArg(1) Class101 arg0);

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "(B)Z")
	public abstract boolean method9434();

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(Z)I")
	public abstract int method9436(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!nfa", name = "g", descriptor = "(B)Z")
	public abstract boolean method9437();

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "(ILclient!ha;)V")
	public abstract void method9438(@OriginalArg(1) Class101 arg0);

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "(Z)Z")
	public abstract boolean method9439();

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "([Lclient!mfa;IBI)I")
	protected final int method9441(@OriginalArg(0) Class2_Sub13[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) long local20 = Static163.aLongArrayArrayArray1[this.aByte142][arg2][arg1];
		@Pc(22) long local22 = 0L;
		@Pc(24) int local24 = 0;
		@Pc(34) int local34;
		while (local22 <= 48L) {
			local34 = (int) (local20 >> (int) local22 & 0xFFFFL);
			if (local34 <= 0) {
				break;
			}
			arg0[local24++] = Static320.aClass84Array8[local34 - 1].aClass2_Sub13_1;
			local22 += 16L;
		}
		for (local34 = local24; local34 < 4; local34++) {
			arg0[local34] = null;
		}
		return local24;
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(BLclient!ha;)Lclient!mg;")
	public abstract Class232 method9442(@OriginalArg(1) Class101 arg0);
}
