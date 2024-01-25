import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public abstract class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	public int anInt10087;

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
	public int anInt10088;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
	public int anInt10089;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
	public int anInt10090;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
	public int anInt10091;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "Z")
	public boolean aBoolean737;

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "B")
	public byte aByte126;

	@OriginalMember(owner = "client!ig", name = "t", descriptor = "B")
	public byte aByte127;

	@OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
	public int anInt10097;

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "Z")
	public boolean aBoolean738 = false;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	protected Class13_Sub1() {
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)I")
	public abstract int method8397();

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[Lclient!kb;II)I")
	protected final int method8398(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub24[] arg1, @OriginalArg(2) int arg2) {
		@Pc(14) long local14 = Static478.aLongArrayArrayArray4[this.aByte127][arg2][arg0];
		@Pc(16) long local16 = 0L;
		@Pc(18) int local18 = 0;
		@Pc(28) int local28;
		while (local16 <= 48L) {
			local28 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local28 <= 0) {
				break;
			}
			arg1[local18++] = Static90.aClass367Array1[local28 - 1].aClass2_Sub24_3;
			local16 += 16L;
		}
		for (local28 = local18; local28 < 4; local28++) {
			arg1[local28] = null;
		}
		return local18;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lclient!ha;I)Lclient!jl;")
	public abstract Class13_Sub6 method8399(@OriginalArg(0) Class95 arg0);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ha;III)Z")
	public abstract boolean method8400(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[Lclient!kb;)I")
	public abstract int method8401(@OriginalArg(1) Class2_Sub24[] arg0);

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)I")
	public abstract int method8402(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)Z")
	public abstract boolean method8403();

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)Z")
	public abstract boolean method8404();

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "(I)I")
	public int method8405() {
		return 0;
	}

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "(I)Z")
	public abstract boolean method8406();

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "(I)Z")
	public abstract boolean method8408();

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBZILclient!ha;ILclient!ig;)V")
	public abstract void method8410(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13_Sub1 arg5);

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(ILclient!ha;)Lclient!gp;")
	public abstract Class128 method8412(@OriginalArg(1) Class95 arg0);

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)Z")
	public abstract boolean method8413();

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)V")
	public abstract void method8414();

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(ILclient!ha;)V")
	public abstract void method8415(@OriginalArg(1) Class95 arg0);
}
