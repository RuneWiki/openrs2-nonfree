import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public abstract class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "Z")
	public boolean aBoolean723;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
	public int anInt10686;

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
	public int anInt10690;

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "B")
	public byte aByte139;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "Lclient!ee;")
	public Class9_Sub1 aClass9_Sub1_24;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
	public int anInt10693;

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
	public int anInt10694;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
	public int anInt10695;

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
	public int anInt10697;

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "B")
	public byte aByte140;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "Z")
	public boolean aBoolean724 = false;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	protected Class9_Sub1() {
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)Z")
	public abstract boolean method9077();

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(B)Z")
	public abstract boolean method9079();

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(ILclient!ha;)Lclient!tc;")
	public abstract Class354 method9080(@OriginalArg(1) Class22 arg0);

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(Z)I")
	public abstract int method9081();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ha;I)Z")
	public abstract boolean method9082(@OriginalArg(0) Class22 arg0);

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)Z")
	public abstract boolean method9084();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ha;)V")
	public abstract void method9085(@OriginalArg(1) Class22 arg0);

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
	public abstract void method9086();

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)I")
	public int method9088() {
		return 0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	public abstract boolean method9089(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ee;Lclient!ha;IZIIZ)V")
	public abstract void method9091(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!ha;)Lclient!nk;")
	public abstract Class9_Sub6 method9092(@OriginalArg(1) Class22 arg0);

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)Z")
	public abstract boolean method9093();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([Lclient!jw;I)I")
	public abstract int method9094(@OriginalArg(0) Class3_Sub5[] arg0);

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(B)I")
	public abstract int method9095(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZI[Lclient!jw;)I")
	protected final int method9096(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub5[] arg2) {
		@Pc(14) long local14 = Static136.aLongArrayArrayArray1[this.aByte139][arg0][arg1];
		@Pc(16) long local16 = 0L;
		@Pc(18) int local18 = 0;
		@Pc(28) int local28;
		while (local16 <= 48L) {
			local28 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local28 <= 0) {
				break;
			}
			local16 += 16L;
			arg2[local18++] = Static660.aClass8Array1[local28 - 1].aClass3_Sub5_1;
		}
		for (local28 = local18; local28 < 4; local28++) {
			arg2[local28] = null;
		}
		if (false) {
			Static135.aClass397_181 = null;
		}
		return local18;
	}
}
