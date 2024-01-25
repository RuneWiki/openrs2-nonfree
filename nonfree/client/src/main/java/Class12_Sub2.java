import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public abstract class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!je", name = "j", descriptor = "I")
	public int anInt10997;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "I")
	public int anInt10998;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "I")
	public int anInt11000;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	public int anInt11001;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "I")
	public int anInt11002;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Lclient!je;")
	public Class12_Sub2 aClass12_Sub2_22;

	@OriginalMember(owner = "client!je", name = "r", descriptor = "B")
	public byte aByte145;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "Z")
	public boolean aBoolean757;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "B")
	public byte aByte146;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "I")
	public int anInt11007;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "Z")
	public boolean aBoolean756 = false;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	protected Class12_Sub2() {
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(I)I")
	public abstract int method9149(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(I)Z")
	public abstract boolean method9150();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!ha;I)Lclient!maa;")
	public abstract Class12_Sub8 method9151(@OriginalArg(0) Class137 arg0);

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(B)I")
	public int method9153() {
		return 0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIILclient!ha;)Z")
	public abstract boolean method9154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2);

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(ILclient!ha;)Z")
	public abstract boolean method9155(@OriginalArg(1) Class137 arg0);

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Lclient!ha;I)Lclient!rn;")
	public abstract Class305 method9156(@OriginalArg(0) Class137 arg0);

	@OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
	public abstract void method9158();

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)I")
	public abstract int method9159();

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(Z)Z")
	public abstract boolean method9160();

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(Z)Z")
	public abstract boolean method9161();

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(ILclient!ha;)V")
	public abstract void method9164(@OriginalArg(1) Class137 arg0);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I[Lclient!qm;)I")
	public abstract int method9165(@OriginalArg(1) Class14_Sub37[] arg0);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLclient!je;IIILclient!ha;I)V")
	public abstract void method9166(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!je", name = "g", descriptor = "(B)Z")
	public abstract boolean method9167();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI[Lclient!qm;I)I")
	protected final int method9168(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub37[] arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static295.aLongArrayArrayArray1[this.aByte146][arg2][arg0];
		@Pc(16) long local16 = 0L;
		@Pc(18) int local18 = 0;
		@Pc(28) int local28;
		while (local16 <= 48L) {
			local28 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local28 <= 0) {
				break;
			}
			arg1[local18++] = Static260.aClass328Array1[local28 - 1].aClass14_Sub37_3;
			local16 += 16L;
		}
		for (local28 = local18; local28 < 4; local28++) {
			arg1[local28] = null;
		}
		return local18;
	}
}
